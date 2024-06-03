// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CostumerRequirements.g4 by ANTLR 4.13.1
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
public class CostumerRequirementsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, BOOLEAN=8, INTEGER=9, 
		REAL=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STRING", "BOOLEAN", 
			"INTEGER", "REAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'RQ: '", "'[TrueOrFalse] '", "'RA: '", "'[ShortAnswer] '", "'[Integer] '", 
			"'[Choice] '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "STRING", "BOOLEAN", "INTEGER", 
			"REAL", "WS"
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


	public CostumerRequirementsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CostumerRequirements.g4"; }

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
		"\u0004\u0000\u000b\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006Y\b"+
		"\u0006\n\u0006\f\u0006\\\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\bn\b\b\n\b\f\bq\t\b\u0003\bs\b\b\u0001\t\u0004\tv\b\t\u000b\t\f\tw\u0001"+
		"\t\u0001\t\u0004\t|\b\t\u000b\t\f\t}\u0001\n\u0004\n\u0081\b\n\u000b\n"+
		"\f\n\u0082\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0001\u0000\u0004\u0002\u0000\"\"\\\\\u0001\u000019\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u008d\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0001\u0017"+
		"\u0001\u0000\u0000\u0000\u0003\u001c\u0001\u0000\u0000\u0000\u0005+\u0001"+
		"\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000"+
		"\u0000\u000bJ\u0001\u0000\u0000\u0000\rT\u0001\u0000\u0000\u0000\u000f"+
		"h\u0001\u0000\u0000\u0000\u0011r\u0001\u0000\u0000\u0000\u0013u\u0001"+
		"\u0000\u0000\u0000\u0015\u0080\u0001\u0000\u0000\u0000\u0017\u0018\u0005"+
		"R\u0000\u0000\u0018\u0019\u0005Q\u0000\u0000\u0019\u001a\u0005:\u0000"+
		"\u0000\u001a\u001b\u0005 \u0000\u0000\u001b\u0002\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005[\u0000\u0000\u001d\u001e\u0005T\u0000\u0000\u001e\u001f"+
		"\u0005r\u0000\u0000\u001f \u0005u\u0000\u0000 !\u0005e\u0000\u0000!\""+
		"\u0005O\u0000\u0000\"#\u0005r\u0000\u0000#$\u0005F\u0000\u0000$%\u0005"+
		"a\u0000\u0000%&\u0005l\u0000\u0000&\'\u0005s\u0000\u0000\'(\u0005e\u0000"+
		"\u0000()\u0005]\u0000\u0000)*\u0005 \u0000\u0000*\u0004\u0001\u0000\u0000"+
		"\u0000+,\u0005R\u0000\u0000,-\u0005A\u0000\u0000-.\u0005:\u0000\u0000"+
		"./\u0005 \u0000\u0000/\u0006\u0001\u0000\u0000\u000001\u0005[\u0000\u0000"+
		"12\u0005S\u0000\u000023\u0005h\u0000\u000034\u0005o\u0000\u000045\u0005"+
		"r\u0000\u000056\u0005t\u0000\u000067\u0005A\u0000\u000078\u0005n\u0000"+
		"\u000089\u0005s\u0000\u00009:\u0005w\u0000\u0000:;\u0005e\u0000\u0000"+
		";<\u0005r\u0000\u0000<=\u0005]\u0000\u0000=>\u0005 \u0000\u0000>\b\u0001"+
		"\u0000\u0000\u0000?@\u0005[\u0000\u0000@A\u0005I\u0000\u0000AB\u0005n"+
		"\u0000\u0000BC\u0005t\u0000\u0000CD\u0005e\u0000\u0000DE\u0005g\u0000"+
		"\u0000EF\u0005e\u0000\u0000FG\u0005r\u0000\u0000GH\u0005]\u0000\u0000"+
		"HI\u0005 \u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005[\u0000\u0000"+
		"KL\u0005C\u0000\u0000LM\u0005h\u0000\u0000MN\u0005o\u0000\u0000NO\u0005"+
		"i\u0000\u0000OP\u0005c\u0000\u0000PQ\u0005e\u0000\u0000QR\u0005]\u0000"+
		"\u0000RS\u0005 \u0000\u0000S\f\u0001\u0000\u0000\u0000TZ\u0005\"\u0000"+
		"\u0000UY\b\u0000\u0000\u0000VW\u0005\\\u0000\u0000WY\t\u0000\u0000\u0000"+
		"XU\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\"\u0000\u0000^\u000e\u0001"+
		"\u0000\u0000\u0000_`\u0005t\u0000\u0000`a\u0005r\u0000\u0000ab\u0005u"+
		"\u0000\u0000bi\u0005e\u0000\u0000cd\u0005f\u0000\u0000de\u0005a\u0000"+
		"\u0000ef\u0005l\u0000\u0000fg\u0005s\u0000\u0000gi\u0005e\u0000\u0000"+
		"h_\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000\u0000i\u0010\u0001\u0000"+
		"\u0000\u0000js\u00050\u0000\u0000ko\u0007\u0001\u0000\u0000ln\u0007\u0002"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000"+
		"\u0000s\u0012\u0001\u0000\u0000\u0000tv\u0007\u0002\u0000\u0000ut\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0005.\u0000\u0000"+
		"z|\u0007\u0002\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0014\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0007\u0003\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0006\n\u0000\u0000\u0085\u0016\u0001\u0000"+
		"\u0000\u0000\t\u0000XZhorw}\u0082\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}