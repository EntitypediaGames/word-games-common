package org.entitypedia.games.common.service.filter;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.entitypedia.games.common.exceptions.OrderParsingException;
import org.entitypedia.games.common.service.filter.parser.FilterLexer;
import org.entitypedia.games.common.service.filter.parser.FilterParser;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;

/**
 * Parses filter expressions for Hibernate Criteria. Example:
 * <pre>
 * (columnCount eq 21 and rowCount eq 21) and not published isNull and (title like 'space-rug' or title like 'home \'rug\'')
 * </pre>
 * In URL instead of space dash is used. To use dash itself, double it.
 * <pre>
 * (columnCount-eq-21-and-rowCount-eq-21)-and-not-published-isNull-and-(title-like-'space--rug'-or-title-like-'home-\'rug\'')
 * </pre>
 * <p>
 * Supports integer, float, boolean, date and string constants. Date constants should follow the ('yyyymmdd') pattern.
 * String constants should be enclosed in single quotes. Any single quotes inside the string should be escaped with \.
 * </p>
 * <p>
 * Supported boolean operators: not, and, or.
 * </p>
 * <p>
 * Supported operators: eq, eqP, ge, geP, gt, gtP, like, ilike, le, leP, lt, ltP, ne, neP, seq, sge, sgt, sle, slt, sne, isEmpty, isNotEmpty, isNotNull, isNull.
 * For details on the operators see {@link org.hibernate.criterion.Restrictions} class. xxProperty operators are abbreviated as xxP. sizexx operators are abbreviated as sxx
 * </p>
 *
 * @author <a rel="author" href="http://autayeu.com/">Aliaksandr Autayeu</a>
 */
public class FilterCriteriaParser {

    private static final ANTLRErrorListener errorListener = new ThrowingErrorListener();
    private static final Order[] EMPTY_ORDER = new Order[0];

    public static Criterion parse(String filter) {
        ANTLRInputStream input = new ANTLRInputStream(unescape(filter));
        FilterLexer lexer = new FilterLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FilterParser parser = new FilterParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree parseTree = parser.init();
        FilterCriterionVisitor filterCriterionVisitor = new FilterCriterionVisitor();
        return filterCriterionVisitor.visit(parseTree);
    }

    public static Order[] order(String order) {
        if (null == order) {
            return EMPTY_ORDER;
        }
        String[] orders = order.split("-");
        if (0 == order.length()) {
            throw new OrderParsingException("Order expression is empty");
        }
        Order[] result = new Order[orders.length];
        for (int i = 0; i < orders.length; i++) {
            String o = orders[i];
            if (o.length() < 2) {
                throw new OrderParsingException("Order expression part too short: " + o);
            }
            if (o.charAt(0) == 'D' || o.charAt(0) == 'A') {
                switch (o.charAt(0)) {
                    case 'D': {
                        result[i] = Order.desc(o.substring(1));
                        break;
                    }
                    case 'A': {
                        result[i] = Order.asc(o.substring(1));
                        break;
                    }
                    default: {
                        throw new OrderParsingException("Order expression parts should start with D or A: " + o);
                    }
                }
            } else {
                throw new OrderParsingException("Order expression parts should start with D or A: " + o);
            }
        }
        return result;
    }

    private static String unescape(String filter) {
        return filter.replaceAll("--", "\t").replace('-', ' ').replace('\t', '-');
    }
}
