// Generated from Filter.g4 by ANTLR 4.5

package org.entitypedia.games.common.repository.hibernateimpl.filter.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LRB=4, RRB=5, EQ=6, EQP=7, GE=8, GEP=9, GT=10, 
		GTP=11, LIKE=12, ILIKE=13, LE=14, LEP=15, LT=16, LTP=17, NE=18, NEP=19, 
		SEQ=20, SGE=21, SGT=22, SLE=23, SLT=24, SNE=25, ISEMPTY=26, ISNOTEMPTY=27, 
		ISNOTNULL=28, ISNULL=29, AND=30, OR=31, NOT=32, Identifier=33, DateLiteral=34, 
		FloatingPointLiteral=35, DecimalLiteral=36, StringLiteral=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LRB", "RRB", "EQ", "EQP", "GE", "GEP", "GT", 
		"GTP", "LIKE", "ILIKE", "LE", "LEP", "LT", "LTP", "NE", "NEP", "SEQ", 
		"SGE", "SGT", "SLE", "SLT", "SNE", "ISEMPTY", "ISNOTEMPTY", "ISNOTNULL", 
		"ISNULL", "AND", "OR", "NOT", "Identifier", "DateLiteral", "FloatingPointLiteral", 
		"DecimalLiteral", "StringLiteral", "EscapeSequence", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'true'", "'false'", "'('", "')'", "'eq'", "'eqP'", "'ge'", 
		"'geP'", "'gt'", "'gtP'", "'like'", "'ilike'", "'le'", "'leP'", "'lt'", 
		"'ltP'", "'ne'", "'neP'", "'sizeEq'", "'sizeGe'", "'sizeGt'", "'sizeLe'", 
		"'sizeLt'", "'sizeNe'", "'isEmpty'", "'isNotEmpty'", "'isNotNull'", "'isNull'", 
		"'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "LRB", "RRB", "EQ", "EQP", "GE", "GEP", "GT", 
		"GTP", "LIKE", "ILIKE", "LE", "LEP", "LT", "LTP", "NE", "NEP", "SEQ", 
		"SGE", "SGT", "SLE", "SLT", "SNE", "ISEMPTY", "ISNOTEMPTY", "ISNOTNULL", 
		"ISNULL", "AND", "OR", "NOT", "Identifier", "DateLiteral", "FloatingPointLiteral", 
		"DecimalLiteral", "StringLiteral", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Filter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\7\"\u00f3\n\"\f\"\16\"\u00f6\13\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u0101\n#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u010b\n#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0117\n#\3#\3#\3#\3#\3#\3#\3#\3#\5#"+
		"\u0121\n#\3#\3#\3#\3#\5#\u0127\n#\3#\3#\3#\3#\3#\5#\u012e\n#\3$\6$\u0131"+
		"\n$\r$\16$\u0132\3$\3$\7$\u0137\n$\f$\16$\u013a\13$\3%\3%\3%\7%\u013f"+
		"\n%\f%\16%\u0142\13%\5%\u0144\n%\3&\3&\3&\7&\u0149\n&\f&\16&\u014c\13"+
		"&\3&\3&\3\'\3\'\3\'\3(\6(\u0154\n(\r(\16(\u0155\3(\3(\2\2)\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M\2O(\3\2\6\4\2C\\c|\5\2\62;C\\c|\4\2))^^\3\2\"\"\u0169\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7X\3\2\2\2\t^\3\2\2"+
		"\2\13`\3\2\2\2\rb\3\2\2\2\17e\3\2\2\2\21i\3\2\2\2\23l\3\2\2\2\25p\3\2"+
		"\2\2\27s\3\2\2\2\31w\3\2\2\2\33|\3\2\2\2\35\u0082\3\2\2\2\37\u0085\3\2"+
		"\2\2!\u0089\3\2\2\2#\u008c\3\2\2\2%\u0090\3\2\2\2\'\u0093\3\2\2\2)\u0097"+
		"\3\2\2\2+\u009e\3\2\2\2-\u00a5\3\2\2\2/\u00ac\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00ba\3\2\2\2\65\u00c1\3\2\2\2\67\u00c9\3\2\2\29\u00d4\3\2\2\2;\u00de"+
		"\3\2\2\2=\u00e5\3\2\2\2?\u00e9\3\2\2\2A\u00ec\3\2\2\2C\u00f0\3\2\2\2E"+
		"\u012d\3\2\2\2G\u0130\3\2\2\2I\u0143\3\2\2\2K\u0145\3\2\2\2M\u014f\3\2"+
		"\2\2O\u0153\3\2\2\2QR\7\60\2\2R\4\3\2\2\2ST\7v\2\2TU\7t\2\2UV\7w\2\2V"+
		"W\7g\2\2W\6\3\2\2\2XY\7h\2\2YZ\7c\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\b"+
		"\3\2\2\2^_\7*\2\2_\n\3\2\2\2`a\7+\2\2a\f\3\2\2\2bc\7g\2\2cd\7s\2\2d\16"+
		"\3\2\2\2ef\7g\2\2fg\7s\2\2gh\7R\2\2h\20\3\2\2\2ij\7i\2\2jk\7g\2\2k\22"+
		"\3\2\2\2lm\7i\2\2mn\7g\2\2no\7R\2\2o\24\3\2\2\2pq\7i\2\2qr\7v\2\2r\26"+
		"\3\2\2\2st\7i\2\2tu\7v\2\2uv\7R\2\2v\30\3\2\2\2wx\7n\2\2xy\7k\2\2yz\7"+
		"m\2\2z{\7g\2\2{\32\3\2\2\2|}\7k\2\2}~\7n\2\2~\177\7k\2\2\177\u0080\7m"+
		"\2\2\u0080\u0081\7g\2\2\u0081\34\3\2\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7g\2\2\u0084\36\3\2\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7R\2\2\u0088 \3\2\2\2\u0089\u008a\7n\2\2\u008a\u008b\7v\2\2\u008b\"\3"+
		"\2\2\2\u008c\u008d\7n\2\2\u008d\u008e\7v\2\2\u008e\u008f\7R\2\2\u008f"+
		"$\3\2\2\2\u0090\u0091\7p\2\2\u0091\u0092\7g\2\2\u0092&\3\2\2\2\u0093\u0094"+
		"\7p\2\2\u0094\u0095\7g\2\2\u0095\u0096\7R\2\2\u0096(\3\2\2\2\u0097\u0098"+
		"\7u\2\2\u0098\u0099\7k\2\2\u0099\u009a\7|\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7G\2\2\u009c\u009d\7s\2\2\u009d*\3\2\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7|\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7I\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7k\2"+
		"\2\u00a7\u00a8\7|\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7I\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af"+
		"\7|\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7N\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\60\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7|\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7N\2\2\u00b8\u00b9\7v\2\2\u00b9\62\3\2\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7|\2\2\u00bd\u00be\7g\2\2"+
		"\u00be\u00bf\7P\2\2\u00bf\u00c0\7g\2\2\u00c0\64\3\2\2\2\u00c1\u00c2\7"+
		"k\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6"+
		"\7r\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7{\2\2\u00c8\66\3\2\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\u00cf\7G\2\2\u00cf\u00d0\7o\2\2\u00d0\u00d1\7r\2\2"+
		"\u00d1\u00d2\7v\2\2\u00d2\u00d3\7{\2\2\u00d38\3\2\2\2\u00d4\u00d5\7k\2"+
		"\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7P\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\u00dd\7n\2\2\u00dd:\3\2\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7u\2\2\u00e0"+
		"\u00e1\7P\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4<\3\2\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7f\2"+
		"\2\u00e8>\3\2\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7t\2\2\u00eb@\3\2\2\2"+
		"\u00ec\u00ed\7p\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7v\2\2\u00efB\3\2\2"+
		"\2\u00f0\u00f4\t\2\2\2\u00f1\u00f3\t\3\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5D\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\7)\2\2\u00f8\u00f9\4\63\64\2\u00f9\u00fa\4"+
		"\62;\2\u00fa\u00fb\4\62;\2\u00fb\u0100\4\62;\2\u00fc\u00fd\7\62\2\2\u00fd"+
		"\u0101\4\63;\2\u00fe\u00ff\7\63\2\2\u00ff\u0101\4\62\64\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u010a\3\2\2\2\u0102\u0103\7\62\2\2"+
		"\u0103\u010b\4\63;\2\u0104\u0105\7\63\2\2\u0105\u010b\4\62;\2\u0106\u0107"+
		"\7\64\2\2\u0107\u010b\4\62;\2\u0108\u0109\7\65\2\2\u0109\u010b\4\62\63"+
		"\2\u010a\u0102\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u012e\7)\2\2\u010d\u010e\7)\2\2\u010e"+
		"\u010f\4\63\64\2\u010f\u0110\4\62;\2\u0110\u0111\4\62;\2\u0111\u0116\4"+
		"\62;\2\u0112\u0113\7\62\2\2\u0113\u0117\4\63;\2\u0114\u0115\7\63\2\2\u0115"+
		"\u0117\4\62\64\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0120\3"+
		"\2\2\2\u0118\u0119\7\62\2\2\u0119\u0121\4\63;\2\u011a\u011b\7\63\2\2\u011b"+
		"\u0121\4\62;\2\u011c\u011d\7\64\2\2\u011d\u0121\4\62;\2\u011e\u011f\7"+
		"\65\2\2\u011f\u0121\4\62\63\2\u0120\u0118\3\2\2\2\u0120\u011a\3\2\2\2"+
		"\u0120\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\3\2\2\2\u0122\u0123"+
		"\4\62\63\2\u0123\u0127\4\62;\2\u0124\u0125\7\64\2\2\u0125\u0127\4\62\65"+
		"\2\u0126\u0122\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129"+
		"\4\62\67\2\u0129\u012a\4\62;\2\u012a\u012b\4\62\67\2\u012b\u012c\4\62"+
		";\2\u012c\u012e\7)\2\2\u012d\u00f7\3\2\2\2\u012d\u010d\3\2\2\2\u012eF"+
		"\3\2\2\2\u012f\u0131\4\62;\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0138\7\60"+
		"\2\2\u0135\u0137\4\62;\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139H\3\2\2\2\u013a\u0138\3\2\2\2"+
		"\u013b\u0144\7\62\2\2\u013c\u0140\4\63;\2\u013d\u013f\4\62;\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u013b\3\2\2\2\u0143\u013c\3\2"+
		"\2\2\u0144J\3\2\2\2\u0145\u014a\7)\2\2\u0146\u0149\5M\'\2\u0147\u0149"+
		"\n\4\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014d\u014e\7)\2\2\u014eL\3\2\2\2\u014f\u0150\7^\2\2\u0150\u0151"+
		"\t\4\2\2\u0151N\3\2\2\2\u0152\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0158\b(\2\2\u0158P\3\2\2\2\22\2\u00f2\u00f4\u0100\u010a\u0116"+
		"\u0120\u0126\u012d\u0132\u0138\u0140\u0143\u0148\u014a\u0155\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}