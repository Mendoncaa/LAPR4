// Generated from CostumerRequirements.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, String=13, Decimal=14, COMA_TOKEN=15, MAY_BE=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "String", "Decimal", "COMA_TOKEN", "MAY_BE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'R:'", "'AS'", "'\\n'", "'text'", "'number'", "'multiple'", "'into'", 
			"'['", "']'", "'yes/no'", "'yes'", "'no'", null, null, "','", "'may be'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "String", "Decimal", "COMA_TOKEN", "MAY_BE", "WS"
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
		"\u0004\u0000\u0011y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0004\fZ\b\f\u000b"+
		"\f\f\f[\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\rc\b\r\n\r\f\rf"+
		"\t\r\u0003\rh\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004"+
		"\u0010t\b\u0010\u000b\u0010\f\u0010u\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0001\u0000\"\"\u0001"+
		"\u000019\u0001\u000009\u0003\u0000\t\n\r\r  |\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005)\u0001"+
		"\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000"+
		"\u0000\u000b7\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000\u0000\u000f"+
		"E\u0001\u0000\u0000\u0000\u0011G\u0001\u0000\u0000\u0000\u0013I\u0001"+
		"\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000"+
		"\u0000\u0019W\u0001\u0000\u0000\u0000\u001bg\u0001\u0000\u0000\u0000\u001d"+
		"i\u0001\u0000\u0000\u0000\u001fk\u0001\u0000\u0000\u0000!s\u0001\u0000"+
		"\u0000\u0000#$\u0005R\u0000\u0000$%\u0005:\u0000\u0000%\u0002\u0001\u0000"+
		"\u0000\u0000&\'\u0005A\u0000\u0000\'(\u0005S\u0000\u0000(\u0004\u0001"+
		"\u0000\u0000\u0000)*\u0005\n\u0000\u0000*\u0006\u0001\u0000\u0000\u0000"+
		"+,\u0005t\u0000\u0000,-\u0005e\u0000\u0000-.\u0005x\u0000\u0000./\u0005"+
		"t\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005n\u0000\u000012\u0005"+
		"u\u0000\u000023\u0005m\u0000\u000034\u0005b\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005r\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005m\u0000"+
		"\u000089\u0005u\u0000\u00009:\u0005l\u0000\u0000:;\u0005t\u0000\u0000"+
		";<\u0005i\u0000\u0000<=\u0005p\u0000\u0000=>\u0005l\u0000\u0000>?\u0005"+
		"e\u0000\u0000?\f\u0001\u0000\u0000\u0000@A\u0005i\u0000\u0000AB\u0005"+
		"n\u0000\u0000BC\u0005t\u0000\u0000CD\u0005o\u0000\u0000D\u000e\u0001\u0000"+
		"\u0000\u0000EF\u0005[\u0000\u0000F\u0010\u0001\u0000\u0000\u0000GH\u0005"+
		"]\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005y\u0000\u0000JK\u0005"+
		"e\u0000\u0000KL\u0005s\u0000\u0000LM\u0005/\u0000\u0000MN\u0005n\u0000"+
		"\u0000NO\u0005o\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005y\u0000"+
		"\u0000QR\u0005e\u0000\u0000RS\u0005s\u0000\u0000S\u0016\u0001\u0000\u0000"+
		"\u0000TU\u0005n\u0000\u0000UV\u0005o\u0000\u0000V\u0018\u0001\u0000\u0000"+
		"\u0000WY\u0005\"\u0000\u0000XZ\b\u0000\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\"\u0000\u0000^\u001a\u0001"+
		"\u0000\u0000\u0000_h\u00050\u0000\u0000`d\u0007\u0001\u0000\u0000ac\u0007"+
		"\u0002\u0000\u0000ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000g_\u0001\u0000\u0000\u0000g`\u0001\u0000"+
		"\u0000\u0000h\u001c\u0001\u0000\u0000\u0000ij\u0005,\u0000\u0000j\u001e"+
		"\u0001\u0000\u0000\u0000kl\u0005m\u0000\u0000lm\u0005a\u0000\u0000mn\u0005"+
		"y\u0000\u0000no\u0005 \u0000\u0000op\u0005b\u0000\u0000pq\u0005e\u0000"+
		"\u0000q \u0001\u0000\u0000\u0000rt\u0007\u0003\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0006\u0010\u0000\u0000"+
		"x\"\u0001\u0000\u0000\u0000\u0005\u0000[dgu\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}