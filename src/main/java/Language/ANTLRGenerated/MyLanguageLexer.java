// Generated from /home/yan/IdeaProjects/OwnLanguageTest/src/main/java/Language/MyLanguage.g4 by ANTLR 4.8
package Language.ANTLRGenerated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STANDARD_FUNC=3, DEF=4, RETURN=5, OP_BR_ORD=6, CL_BR_ORD=7, 
		OP_BR_ARR=8, CL_BR_ARR=9, OP_BR_FIG=10, CL_BR_FIG=11, COMMA=12, MUL=13, 
		DIV=14, ADD=15, SUB=16, EQU=17, EQU_OP=18, WS=19, NL=20, ID=21, INT=22, 
		DOUBLE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "STANDARD_FUNC", "DEF", "RETURN", "OP_BR_ORD", "CL_BR_ORD", 
			"OP_BR_ARR", "CL_BR_ARR", "OP_BR_FIG", "CL_BR_FIG", "COMMA", "MUL", "DIV", 
			"ADD", "SUB", "EQU", "EQU_OP", "WS", "NL", "ID", "INT", "DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'!'", null, "'def'", "'return'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "','", "'*'", "'/'", "'+'", "'-'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "STANDARD_FUNC", "DEF", "RETURN", "OP_BR_ORD", "CL_BR_ORD", 
			"OP_BR_ARR", "CL_BR_ARR", "OP_BR_FIG", "CL_BR_FIG", "COMMA", "MUL", "DIV", 
			"ADD", "SUB", "EQU", "EQU_OP", "WS", "NL", "ID", "INT", "DOUBLE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4f"+
		"\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0093\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\5\25\u009a\n\25\3\25\3\25\3\26\3\26\7\26\u00a0"+
		"\n\26\f\26\16\26\u00a3\13\26\3\27\5\27\u00a6\n\27\3\27\6\27\u00a9\n\27"+
		"\r\27\16\27\u00aa\3\30\5\30\u00ae\n\30\3\30\6\30\u00b1\n\30\r\30\16\30"+
		"\u00b2\3\30\3\30\6\30\u00b7\n\30\r\30\16\30\u00b8\2\2\31\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\3\2\7\4\2\13\13\"\"\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\4\2--//\3\2\62;\2\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7e\3\2\2\2\tg\3\2"+
		"\2\2\13k\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3\2\2\2\25z\3"+
		"\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u0092\3\2\2\2\'\u0094\3\2\2\2"+
		")\u0099\3\2\2\2+\u009d\3\2\2\2-\u00a5\3\2\2\2/\u00ad\3\2\2\2\61\62\7~"+
		"\2\2\62\4\3\2\2\2\63\64\7#\2\2\64\6\3\2\2\2\65\66\7c\2\2\66\67\7d\2\2"+
		"\67f\7u\2\289\7h\2\29:\7c\2\2:;\7e\2\2;<\7v\2\2<=\7q\2\2=>\7t\2\2>?\7"+
		"k\2\2?@\7c\2\2@f\7n\2\2AB\7u\2\2BC\7k\2\2Cf\7p\2\2DE\7e\2\2EF\7q\2\2F"+
		"f\7u\2\2GH\7v\2\2HI\7c\2\2If\7p\2\2JK\7e\2\2KL\7q\2\2Lf\7v\2\2MN\7c\2"+
		"\2NO\7t\2\2OP\7e\2\2PQ\7u\2\2QR\7k\2\2Rf\7p\2\2ST\7c\2\2TU\7t\2\2UV\7"+
		"e\2\2VW\7e\2\2WX\7q\2\2Xf\7u\2\2YZ\7c\2\2Z[\7t\2\2[\\\7e\2\2\\]\7v\2\2"+
		"]^\7c\2\2^f\7p\2\2_`\7c\2\2`a\7t\2\2ab\7e\2\2bc\7e\2\2cd\7q\2\2df\7v\2"+
		"\2e\65\3\2\2\2e8\3\2\2\2eA\3\2\2\2eD\3\2\2\2eG\3\2\2\2eJ\3\2\2\2eM\3\2"+
		"\2\2eS\3\2\2\2eY\3\2\2\2e_\3\2\2\2f\b\3\2\2\2gh\7f\2\2hi\7g\2\2ij\7h\2"+
		"\2j\n\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\f"+
		"\3\2\2\2rs\7*\2\2s\16\3\2\2\2tu\7+\2\2u\20\3\2\2\2vw\7]\2\2w\22\3\2\2"+
		"\2xy\7_\2\2y\24\3\2\2\2z{\7}\2\2{\26\3\2\2\2|}\7\177\2\2}\30\3\2\2\2~"+
		"\177\7.\2\2\177\32\3\2\2\2\u0080\u0081\7,\2\2\u0081\34\3\2\2\2\u0082\u0083"+
		"\7\61\2\2\u0083\36\3\2\2\2\u0084\u0085\7-\2\2\u0085 \3\2\2\2\u0086\u0087"+
		"\7/\2\2\u0087\"\3\2\2\2\u0088\u0089\7?\2\2\u0089$\3\2\2\2\u008a\u008b"+
		"\7-\2\2\u008b\u0093\7?\2\2\u008c\u008d\7/\2\2\u008d\u0093\7?\2\2\u008e"+
		"\u008f\7,\2\2\u008f\u0093\7?\2\2\u0090\u0091\7\61\2\2\u0091\u0093\7?\2"+
		"\2\u0092\u008a\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093&\3\2\2\2\u0094\u0095\t\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\24\2\2\u0097(\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2"+
		"\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c*"+
		"\3\2\2\2\u009d\u00a1\t\3\2\2\u009e\u00a0\t\4\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2,\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a4\u00a6\t\5\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\t\6\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab.\3\2\2\2"+
		"\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00b1\t\6\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\7\60"+
		"\2\2\u00b5\u00b7\t\6\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\60\3\2\2\2\f\2e\u0092\u0099\u00a1"+
		"\u00a5\u00aa\u00ad\u00b2\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}