// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class InterviewQuestionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TEXT=16, NUMBER=17, 
		RANGE=18, END=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "TEXT", "NUMBER", 
			"RANGE", "END", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Q:'", "'T/F'", "'W:'", "'Choices:'", "'True, False'", "'Short'", 
			"'Single'", "','", "'Multiple'", "'Integer'", "'Decimal'", "'Date'", 
			"'Time'", "'Scale'", "'Scale:'", null, null, null, "'EndInterview'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TEXT", "NUMBER", "RANGE", "END", "WS"
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


	public InterviewQuestionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "InterviewQuestions.g4"; }

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
		"\u0004\u0000\u0014\u00b0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u0089\b\u000f\u000b"+
		"\u000f\f\u000f\u008a\u0001\u0010\u0004\u0010\u008e\b\u0010\u000b\u0010"+
		"\f\u0010\u008f\u0001\u0011\u0004\u0011\u0093\b\u0011\u000b\u0011\f\u0011"+
		"\u0094\u0001\u0011\u0001\u0011\u0004\u0011\u0099\b\u0011\u000b\u0011\f"+
		"\u0011\u009a\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u00ab\b\u0013\u000b\u0013"+
		"\f\u0013\u00ac\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0003\u0003\u0000\n\n\r\r??"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u00b4\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000"+
		"\u00050\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t<\u0001"+
		"\u0000\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000"+
		"\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013"+
		"`\u0001\u0000\u0000\u0000\u0015h\u0001\u0000\u0000\u0000\u0017p\u0001"+
		"\u0000\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000"+
		"\u0000\u001d\u0080\u0001\u0000\u0000\u0000\u001f\u0088\u0001\u0000\u0000"+
		"\u0000!\u008d\u0001\u0000\u0000\u0000#\u0092\u0001\u0000\u0000\u0000%"+
		"\u009c\u0001\u0000\u0000\u0000\'\u00aa\u0001\u0000\u0000\u0000)*\u0005"+
		"Q\u0000\u0000*+\u0005:\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005"+
		"T\u0000\u0000-.\u0005/\u0000\u0000./\u0005F\u0000\u0000/\u0004\u0001\u0000"+
		"\u0000\u000001\u0005W\u0000\u000012\u0005:\u0000\u00002\u0006\u0001\u0000"+
		"\u0000\u000034\u0005C\u0000\u000045\u0005h\u0000\u000056\u0005o\u0000"+
		"\u000067\u0005i\u0000\u000078\u0005c\u0000\u000089\u0005e\u0000\u0000"+
		"9:\u0005s\u0000\u0000:;\u0005:\u0000\u0000;\b\u0001\u0000\u0000\u0000"+
		"<=\u0005T\u0000\u0000=>\u0005r\u0000\u0000>?\u0005u\u0000\u0000?@\u0005"+
		"e\u0000\u0000@A\u0005,\u0000\u0000AB\u0005 \u0000\u0000BC\u0005F\u0000"+
		"\u0000CD\u0005a\u0000\u0000DE\u0005l\u0000\u0000EF\u0005s\u0000\u0000"+
		"FG\u0005e\u0000\u0000G\n\u0001\u0000\u0000\u0000HI\u0005S\u0000\u0000"+
		"IJ\u0005h\u0000\u0000JK\u0005o\u0000\u0000KL\u0005r\u0000\u0000LM\u0005"+
		"t\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005S\u0000\u0000OP\u0005"+
		"i\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005g\u0000\u0000RS\u0005l\u0000"+
		"\u0000ST\u0005e\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005,\u0000"+
		"\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005M\u0000\u0000XY\u0005u\u0000"+
		"\u0000YZ\u0005l\u0000\u0000Z[\u0005t\u0000\u0000[\\\u0005i\u0000\u0000"+
		"\\]\u0005p\u0000\u0000]^\u0005l\u0000\u0000^_\u0005e\u0000\u0000_\u0012"+
		"\u0001\u0000\u0000\u0000`a\u0005I\u0000\u0000ab\u0005n\u0000\u0000bc\u0005"+
		"t\u0000\u0000cd\u0005e\u0000\u0000de\u0005g\u0000\u0000ef\u0005e\u0000"+
		"\u0000fg\u0005r\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hi\u0005D\u0000"+
		"\u0000ij\u0005e\u0000\u0000jk\u0005c\u0000\u0000kl\u0005i\u0000\u0000"+
		"lm\u0005m\u0000\u0000mn\u0005a\u0000\u0000no\u0005l\u0000\u0000o\u0016"+
		"\u0001\u0000\u0000\u0000pq\u0005D\u0000\u0000qr\u0005a\u0000\u0000rs\u0005"+
		"t\u0000\u0000st\u0005e\u0000\u0000t\u0018\u0001\u0000\u0000\u0000uv\u0005"+
		"T\u0000\u0000vw\u0005i\u0000\u0000wx\u0005m\u0000\u0000xy\u0005e\u0000"+
		"\u0000y\u001a\u0001\u0000\u0000\u0000z{\u0005S\u0000\u0000{|\u0005c\u0000"+
		"\u0000|}\u0005a\u0000\u0000}~\u0005l\u0000\u0000~\u007f\u0005e\u0000\u0000"+
		"\u007f\u001c\u0001\u0000\u0000\u0000\u0080\u0081\u0005S\u0000\u0000\u0081"+
		"\u0082\u0005c\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005"+
		"l\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u0086\u0005:\u0000"+
		"\u0000\u0086\u001e\u0001\u0000\u0000\u0000\u0087\u0089\b\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b \u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0001\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\"\u0001\u0000\u0000\u0000\u0091\u0093\u0007\u0001\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0005-\u0000\u0000\u0097\u0099\u0007"+
		"\u0001\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b$\u0001\u0000\u0000\u0000\u009c\u009d\u0005E\u0000"+
		"\u0000\u009d\u009e\u0005n\u0000\u0000\u009e\u009f\u0005d\u0000\u0000\u009f"+
		"\u00a0\u0005I\u0000\u0000\u00a0\u00a1\u0005n\u0000\u0000\u00a1\u00a2\u0005"+
		"t\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005r\u0000"+
		"\u0000\u00a4\u00a5\u0005v\u0000\u0000\u00a5\u00a6\u0005i\u0000\u0000\u00a6"+
		"\u00a7\u0005e\u0000\u0000\u00a7\u00a8\u0005w\u0000\u0000\u00a8&\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0007\u0002\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0006\u0013\u0000\u0000\u00af(\u0001\u0000"+
		"\u0000\u0000\u0006\u0000\u008a\u008f\u0094\u009a\u00ac\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}