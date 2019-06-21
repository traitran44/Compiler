// Generated from Tiger.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TigerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DECLARATION_SEGMENT=6, VAR_DECLARATION_LIST=7, 
		VAR_DECLARATION=8, FUNCT_DECLARATION_LIST=9, FUNCT_DECLARATION=10, TYPE=11, 
		TYPE_ID=12, ID_LIST=13, OPTIONAL_INIT=14, PARAM_LIST=15, PARAM_LIST_TAIL=16, 
		RET_TYPE=17, PARAM=18, STAT_SEQ=19, STAT=20, OPT_PREFIX=21, EXPR=22, EXPR_BEGIN=23, 
		CONST=24, BINARY_OPERATOR=25, EXPR_LIST=26, EXPR_LIST_TAIL=27, LVALUE=28, 
		LVALUE_TAIL=29, RESERVED_WORD=30, ID=31, INTLIT=32, FLOATLIT=33, PUNCTUATION=34, 
		COMMENT=35, COMMENT_BODY=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "DECLARATION_SEGMENT", "VAR_DECLARATION_LIST", 
		"VAR_DECLARATION", "FUNCT_DECLARATION_LIST", "FUNCT_DECLARATION", "TYPE", 
		"TYPE_ID", "ID_LIST", "OPTIONAL_INIT", "PARAM_LIST", "PARAM_LIST_TAIL", 
		"RET_TYPE", "PARAM", "STAT_SEQ", "STAT", "OPT_PREFIX", "EXPR", "EXPR_BEGIN", 
		"CONST", "BINARY_OPERATOR", "EXPR_LIST", "EXPR_LIST_TAIL", "LVALUE", "LVALUE_TAIL", 
		"RESERVED_WORD", "ID", "INTLIT", "FLOATLIT", "PUNCTUATION", "COMMENT", 
		"COMMENT_BODY", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'let'", "'in'", "'begin'", "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DECLARATION_SEGMENT", "VAR_DECLARATION_LIST", 
		"VAR_DECLARATION", "FUNCT_DECLARATION_LIST", "FUNCT_DECLARATION", "TYPE", 
		"TYPE_ID", "ID_LIST", "OPTIONAL_INIT", "PARAM_LIST", "PARAM_LIST_TAIL", 
		"RET_TYPE", "PARAM", "STAT_SEQ", "STAT", "OPT_PREFIX", "EXPR", "EXPR_BEGIN", 
		"CONST", "BINARY_OPERATOR", "EXPR_LIST", "EXPR_LIST_TAIL", "LVALUE", "LVALUE_TAIL", 
		"RESERVED_WORD", "ID", "INTLIT", "FLOATLIT", "PUNCTUATION", "COMMENT", 
		"COMMENT_BODY", "WS"
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


	public TigerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiger.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u020d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7i\n\7\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tw\n"+
		"\t\3\t\3\t\3\n\3\n\5\n}\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u008b\n\13\3\13\3\13\5\13\u008f\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00bc\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00c5\n\20\3\21\3\21\3\21\5\21"+
		"\u00ca\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u00d7\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0137"+
		"\n\25\3\25\3\25\3\25\5\25\u013c\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u015f"+
		"\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u016a\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0172\n\30\3\31\3\31\5\31\u0176\n\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0181\n\32\3\33\3\33"+
		"\5\33\u0185\n\33\3\34\3\34\3\34\5\34\u018a\n\34\3\35\3\35\5\35\u018e\n"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e2"+
		"\n\37\3 \3 \7 \u01e6\n \f \16 \u01e9\13 \3!\6!\u01ec\n!\r!\16!\u01ed\3"+
		"\"\3\"\3\"\7\"\u01f3\n\"\f\"\16\"\u01f6\13\"\3#\3#\3$\3$\3$\3$\5$\u01fe"+
		"\n$\3$\3$\3$\3%\3%\5%\u0205\n%\3&\6&\u0208\n&\r&\16&\u0209\3&\3&\2\2\'"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'\3\2\n\6\2,-//\61\61??\4\2>>@@\4\2((~~\4\2C\\c|\6\2"+
		"\62;C\\aac|\3\2\62;\7\2*+..<=]]__\5\2\13\f\17\17\"\"\2\u0248\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\3M\3\2\2\2\5R\3\2\2\2\7V\3\2\2\2\tY\3\2\2\2\13_\3\2\2\2"+
		"\rh\3\2\2\2\17j\3\2\2\2\21n\3\2\2\2\23z\3\2\2\2\25~\3\2\2\2\27\u00aa\3"+
		"\2\2\2\31\u00b4\3\2\2\2\33\u00bb\3\2\2\2\35\u00bd\3\2\2\2\37\u00c2\3\2"+
		"\2\2!\u00c6\3\2\2\2#\u00cb\3\2\2\2%\u00ce\3\2\2\2\'\u00d6\3\2\2\2)\u015e"+
		"\3\2\2\2+\u0160\3\2\2\2-\u0169\3\2\2\2/\u0171\3\2\2\2\61\u0175\3\2\2\2"+
		"\63\u0180\3\2\2\2\65\u0182\3\2\2\2\67\u0186\3\2\2\29\u018b\3\2\2\2;\u018f"+
		"\3\2\2\2=\u01e1\3\2\2\2?\u01e3\3\2\2\2A\u01eb\3\2\2\2C\u01ef\3\2\2\2E"+
		"\u01f7\3\2\2\2G\u01f9\3\2\2\2I\u0202\3\2\2\2K\u0207\3\2\2\2MN\7o\2\2N"+
		"O\7c\2\2OP\7k\2\2PQ\7p\2\2Q\4\3\2\2\2RS\7n\2\2ST\7g\2\2TU\7v\2\2U\6\3"+
		"\2\2\2VW\7k\2\2WX\7p\2\2X\b\3\2\2\2YZ\7d\2\2Z[\7g\2\2[\\\7i\2\2\\]\7k"+
		"\2\2]^\7p\2\2^\n\3\2\2\2_`\7g\2\2`a\7p\2\2ab\7f\2\2b\f\3\2\2\2cd\5\17"+
		"\b\2de\5\23\n\2ei\3\2\2\2fi\5\17\b\2gi\5\23\n\2hc\3\2\2\2hf\3\2\2\2hg"+
		"\3\2\2\2i\16\3\2\2\2jl\5\21\t\2km\5\17\b\2lk\3\2\2\2lm\3\2\2\2m\20\3\2"+
		"\2\2no\7x\2\2op\7c\2\2pq\7t\2\2qr\3\2\2\2rs\5\33\16\2st\7<\2\2tv\5\27"+
		"\f\2uw\5\35\17\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7=\2\2y\22\3\2\2\2z|"+
		"\5\25\13\2{}\5\23\n\2|{\3\2\2\2|}\3\2\2\2}\24\3\2\2\2~\177\7h\2\2\177"+
		"\u0080\7w\2\2\u0080\u0081\7p\2\2\u0081\u0082\7e\2\2\u0082\u0083\7v\2\2"+
		"\u0083\u0084\7k\2\2\u0084\u0085\7q\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\5? \2\u0088\u008a\7*\2\2\u0089\u008b\5\37\20\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7+"+
		"\2\2\u008d\u008f\5#\22\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092\7g\2\2\u0092\u0093\7i\2"+
		"\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\5\'\24\2\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u009a\7f\2\2\u009a"+
		"\26\3\2\2\2\u009b\u00ab\5\31\r\2\u009c\u009d\7c\2\2\u009d\u009e\7t\2\2"+
		"\u009e\u009f\7t\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7{\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\7]\2\2\u00a3\u00a4\5A!\2\u00a4\u00a5\7_\2\2\u00a5"+
		"\u00a6\7q\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\31"+
		"\r\2\u00a9\u00ab\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009c\3\2\2\2\u00ab"+
		"\30\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00b5\7v\2\2\u00af"+
		"\u00b0\7h\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7c\2\2"+
		"\u00b3\u00b5\7v\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\32\3"+
		"\2\2\2\u00b6\u00bc\5? \2\u00b7\u00b8\5? \2\u00b8\u00b9\7.\2\2\u00b9\u00ba"+
		"\5\33\16\2\u00ba\u00bc\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2"+
		"\u00bc\34\3\2\2\2\u00bd\u00be\7<\2\2\u00be\u00bf\7?\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c1\5\61\31\2\u00c1\36\3\2\2\2\u00c2\u00c4\5%\23\2\u00c3"+
		"\u00c5\5!\21\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5 \3\2\2\2"+
		"\u00c6\u00c7\7.\2\2\u00c7\u00c9\5%\23\2\u00c8\u00ca\5!\21\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\"\3\2\2\2\u00cb\u00cc\7<\2\2\u00cc"+
		"\u00cd\5\27\f\2\u00cd$\3\2\2\2\u00ce\u00cf\5? \2\u00cf\u00d0\7<\2\2\u00d0"+
		"\u00d1\5\27\f\2\u00d1&\3\2\2\2\u00d2\u00d7\5)\25\2\u00d3\u00d4\5)\25\2"+
		"\u00d4\u00d5\5\'\24\2\u00d5\u00d7\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d7(\3\2\2\2\u00d8\u00d9\59\35\2\u00d9\u00da\7<\2\2\u00da\u00db"+
		"\7?\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5-\27\2\u00dd\u00de\7=\2\2\u00de"+
		"\u015f\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\3\2\2"+
		"\2\u00e2\u00e3\5-\27\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5\'\24\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7k\2\2"+
		"\u00ed\u00ee\7h\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7=\2\2\u00f0\u015f"+
		"\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\5-\27\2\u00f5\u00f6\7v\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7g\2"+
		"\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5\'\24\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\5\'\24\2\u0101\u0102\7g\2\2\u0102\u0103\7p"+
		"\2\2\u0103\u0104\7f\2\2\u0104\u0105\7k\2\2\u0105\u0106\7h\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0108\7=\2\2\u0108\u015f\3\2\2\2\u0109\u010a\7y\2\2\u010a"+
		"\u010b\7j\2\2\u010b\u010c\7k\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u0110\5-\27\2\u0110\u0111\7f\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5\'\24\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7p\2\2\u0116\u0117\7f\2\2\u0117\u0118\7f\2\2\u0118\u0119\7q\2\2"+
		"\u0119\u011a\3\2\2\2\u011a\u011b\7=\2\2\u011b\u015f\3\2\2\2\u011c\u011d"+
		"\7h\2\2\u011d\u011e\7q\2\2\u011e\u011f\7t\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\5? \2\u0121\u0122\7<\2\2\u0122\u0123\7?\2\2\u0123\u0124\3\2\2\2"+
		"\u0124\u0125\5-\27\2\u0125\u0126\7v\2\2\u0126\u0127\7q\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\5-\27\2\u0129\u012a\7f\2\2\u012a\u012b\7q\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\5\'\24\2\u012d\u012e\7g\2\2\u012e\u012f\7p"+
		"\2\2\u012f\u0130\7f\2\2\u0130\u0131\7f\2\2\u0131\u0132\7q\2\2\u0132\u0133"+
		"\3\2\2\2\u0133\u0134\7=\2\2\u0134\u015f\3\2\2\2\u0135\u0137\5+\26\2\u0136"+
		"\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\5?"+
		" \2\u0139\u013b\7*\2\2\u013a\u013c\5\65\33\2\u013b\u013a\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7+\2\2\u013e\u013f\7=\2"+
		"\2\u013f\u015f\3\2\2\2\u0140\u0141\7d\2\2\u0141\u0142\7t\2\2\u0142\u0143"+
		"\7g\2\2\u0143\u0144\7c\2\2\u0144\u0145\7m\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u015f\7=\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7v\2\2"+
		"\u014a\u014b\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7p\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\5-\27\2\u014f\u0150\7=\2\2\u0150\u015f\3\2\2\2\u0151"+
		"\u0152\7n\2\2\u0152\u0153\7g\2\2\u0153\u0154\7v\2\2\u0154\u0155\3\2\2"+
		"\2\u0155\u0156\5\r\7\2\u0156\u0157\7k\2\2\u0157\u0158\7p\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015a\5\'\24\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7f\2\2\u015d\u015f\3\2\2\2\u015e\u00d8\3\2\2\2\u015e\u00df\3\2"+
		"\2\2\u015e\u00f1\3\2\2\2\u015e\u0109\3\2\2\2\u015e\u011c\3\2\2\2\u015e"+
		"\u0136\3\2\2\2\u015e\u0140\3\2\2\2\u015e\u0147\3\2\2\2\u015e\u0151\3\2"+
		"\2\2\u015f*\3\2\2\2\u0160\u0161\59\35\2\u0161\u0162\7<\2\2\u0162\u0163"+
		"\7?\2\2\u0163,\3\2\2\2\u0164\u016a\5/\30\2\u0165\u0166\5/\30\2\u0166\u0167"+
		"\5\63\32\2\u0167\u0168\5-\27\2\u0168\u016a\3\2\2\2\u0169\u0164\3\2\2\2"+
		"\u0169\u0165\3\2\2\2\u016a.\3\2\2\2\u016b\u0172\5\61\31\2\u016c\u0172"+
		"\59\35\2\u016d\u016e\7*\2\2\u016e\u016f\5-\27\2\u016f\u0170\7+\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u016b\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2"+
		"\2\2\u0172\60\3\2\2\2\u0173\u0176\5A!\2\u0174\u0176\5C\"\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0174\3\2\2\2\u0176\62\3\2\2\2\u0177\u0181\t\2\2\2\u0178"+
		"\u0179\7>\2\2\u0179\u0181\7@\2\2\u017a\u0181\t\3\2\2\u017b\u017c\7>\2"+
		"\2\u017c\u0181\7?\2\2\u017d\u017e\7@\2\2\u017e\u0181\7?\2\2\u017f\u0181"+
		"\t\4\2\2\u0180\u0177\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u017a\3\2\2\2\u0180"+
		"\u017b\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u017f\3\2\2\2\u0181\64\3\2\2"+
		"\2\u0182\u0184\5-\27\2\u0183\u0185\5\67\34\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\66\3\2\2\2\u0186\u0187\7.\2\2\u0187\u0189\5-\27\2"+
		"\u0188\u018a\5\67\34\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a8"+
		"\3\2\2\2\u018b\u018d\5? \2\u018c\u018e\5;\36\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e:\3\2\2\2\u018f\u0190\7]\2\2\u0190\u0191\5-\27\2\u0191"+
		"\u0192\7_\2\2\u0192<\3\2\2\2\u0193\u0194\7o\2\2\u0194\u0195\7c\2\2\u0195"+
		"\u0196\7k\2\2\u0196\u01e2\7p\2\2\u0197\u0198\7c\2\2\u0198\u0199\7t\2\2"+
		"\u0199\u019a\7t\2\2\u019a\u019b\7c\2\2\u019b\u01e2\7{\2\2\u019c\u019d"+
		"\7d\2\2\u019d\u019e\7t\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7c\2\2\u01a0"+
		"\u01e2\7m\2\2\u01a1\u01a2\7f\2\2\u01a2\u01e2\7q\2\2\u01a3\u01a4\7k\2\2"+
		"\u01a4\u01e2\7h\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7n\2\2\u01a7\u01a8"+
		"\7u\2\2\u01a8\u01e2\7g\2\2\u01a9\u01aa\7h\2\2\u01aa\u01ab\7q\2\2\u01ab"+
		"\u01e2\7t\2\2\u01ac\u01ad\7h\2\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7p\2\2"+
		"\u01af\u01b0\7e\2\2\u01b0\u01b1\7v\2\2\u01b1\u01b2\7k\2\2\u01b2\u01b3"+
		"\7q\2\2\u01b3\u01e2\7p\2\2\u01b4\u01b5\7n\2\2\u01b5\u01b6\7g\2\2\u01b6"+
		"\u01e2\7v\2\2\u01b7\u01b8\7k\2\2\u01b8\u01e2\7p\2\2\u01b9\u01ba\7q\2\2"+
		"\u01ba\u01e2\7h\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7j\2\2\u01bd\u01be"+
		"\7g\2\2\u01be\u01e2\7p\2\2\u01bf\u01c0\7v\2\2\u01c0\u01e2\7q\2\2\u01c1"+
		"\u01c2\7x\2\2\u01c2\u01c3\7c\2\2\u01c3\u01e2\7t\2\2\u01c4\u01c5\7y\2\2"+
		"\u01c5\u01c6\7j\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7n\2\2\u01c8\u01e2"+
		"\7g\2\2\u01c9\u01ca\7g\2\2\u01ca\u01cb\7p\2\2\u01cb\u01cc\7f\2\2\u01cc"+
		"\u01cd\7k\2\2\u01cd\u01e2\7h\2\2\u01ce\u01cf\7d\2\2\u01cf\u01d0\7g\2\2"+
		"\u01d0\u01d1\7i\2\2\u01d1\u01d2\7k\2\2\u01d2\u01e2\7p\2\2\u01d3\u01d4"+
		"\7g\2\2\u01d4\u01d5\7p\2\2\u01d5\u01e2\7f\2\2\u01d6\u01d7\7g\2\2\u01d7"+
		"\u01d8\7p\2\2\u01d8\u01d9\7f\2\2\u01d9\u01da\7f\2\2\u01da\u01e2\7q\2\2"+
		"\u01db\u01dc\7t\2\2\u01dc\u01dd\7g\2\2\u01dd\u01de\7v\2\2\u01de\u01df"+
		"\7w\2\2\u01df\u01e0\7t\2\2\u01e0\u01e2\7p\2\2\u01e1\u0193\3\2\2\2\u01e1"+
		"\u0197\3\2\2\2\u01e1\u019c\3\2\2\2\u01e1\u01a1\3\2\2\2\u01e1\u01a3\3\2"+
		"\2\2\u01e1\u01a5\3\2\2\2\u01e1\u01a9\3\2\2\2\u01e1\u01ac\3\2\2\2\u01e1"+
		"\u01b4\3\2\2\2\u01e1\u01b7\3\2\2\2\u01e1\u01b9\3\2\2\2\u01e1\u01bb\3\2"+
		"\2\2\u01e1\u01bf\3\2\2\2\u01e1\u01c1\3\2\2\2\u01e1\u01c4\3\2\2\2\u01e1"+
		"\u01c9\3\2\2\2\u01e1\u01ce\3\2\2\2\u01e1\u01d3\3\2\2\2\u01e1\u01d6\3\2"+
		"\2\2\u01e1\u01db\3\2\2\2\u01e2>\3\2\2\2\u01e3\u01e7\t\5\2\2\u01e4\u01e6"+
		"\t\6\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8@\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ec\t\7\2\2"+
		"\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01eeB\3\2\2\2\u01ef\u01f0\5A!\2\u01f0\u01f4\7\60\2\2\u01f1\u01f3"+
		"\t\7\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5D\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\t\b\2\2"+
		"\u01f8F\3\2\2\2\u01f9\u01fa\7\61\2\2\u01fa\u01fb\7,\2\2\u01fb\u01fd\3"+
		"\2\2\2\u01fc\u01fe\5I%\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff\u0200\7,\2\2\u0200\u0201\7\61\2\2\u0201H\3\2\2\2"+
		"\u0202\u0204\13\2\2\2\u0203\u0205\5I%\2\u0204\u0203\3\2\2\2\u0204\u0205"+
		"\3\2\2\2\u0205J\3\2\2\2\u0206\u0208\t\t\2\2\u0207\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\b&\2\2\u020cL\3\2\2\2 \2hlv|\u008a\u008e\u00aa\u00b4"+
		"\u00bb\u00c4\u00c9\u00d6\u0136\u013b\u015e\u0169\u0171\u0175\u0180\u0184"+
		"\u0189\u018d\u01e1\u01e7\u01ed\u01f4\u01fd\u0204\u0209\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}