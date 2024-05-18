// Generated from CostumerRequirements.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CostumerRequirementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, String=13, Decimal=14, COMA_TOKEN=15, MAY_BE=16, 
		WS=17;
	public static final int
		RULE_requirements = 0, RULE_requirement = 1, RULE_requirementsType = 2, 
		RULE_arr = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"requirements", "requirement", "requirementsType", "arr"
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

	@Override
	public String getGrammarFileName() { return "CostumerRequirements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CostumerRequirementsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementsContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public RequirementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitRequirements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsContext requirements() throws RecognitionException {
		RequirementsContext _localctx = new RequirementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_requirements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				requirement();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementContext extends ParserRuleContext {
		public Token requirementName;
		public RequirementsTypeContext requirementsType() {
			return getRuleContext(RequirementsTypeContext.class,0);
		}
		public TerminalNode String() { return getToken(CostumerRequirementsParser.String, 0); }
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(T__0);
			setState(14);
			((RequirementContext)_localctx).requirementName = match(String);
			setState(15);
			match(T__1);
			setState(16);
			requirementsType();
			setState(17);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementsTypeContext extends ParserRuleContext {
		public TerminalNode MAY_BE() { return getToken(CostumerRequirementsParser.MAY_BE, 0); }
		public TerminalNode String() { return getToken(CostumerRequirementsParser.String, 0); }
		public TerminalNode Decimal() { return getToken(CostumerRequirementsParser.Decimal, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public RequirementsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementsType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitRequirementsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsTypeContext requirementsType() throws RecognitionException {
		RequirementsTypeContext _localctx = new RequirementsTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_requirementsType);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__3);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MAY_BE) {
					{
					setState(20);
					match(MAY_BE);
					setState(21);
					match(String);
					}
				}

				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(T__4);
				setState(25);
				match(MAY_BE);
				setState(26);
				match(Decimal);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(T__5);
				setState(28);
				match(T__6);
				setState(29);
				match(T__7);
				setState(30);
				arr();
				setState(31);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(T__9);
				setState(34);
				match(MAY_BE);
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(CostumerRequirementsParser.String); }
		public TerminalNode String(int i) {
			return getToken(CostumerRequirementsParser.String, i);
		}
		public List<TerminalNode> COMA_TOKEN() { return getTokens(CostumerRequirementsParser.COMA_TOKEN); }
		public TerminalNode COMA_TOKEN(int i) {
			return getToken(CostumerRequirementsParser.COMA_TOKEN, i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(String);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA_TOKEN) {
				{
				{
				setState(39);
				match(COMA_TOKEN);
				setState(40);
				match(String);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011/\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0017\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003*\b\u0003\n\u0003\f\u0003-\t\u0003\u0001\u0003\u0000"+
		"\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0001\u0001\u0000\u000b\f0"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000\u0000\u0000\u0004"+
		"$\u0001\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b\n\u0003\u0002"+
		"\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000"+
		"\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u0001"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005"+
		"\r\u0000\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0003\u0004"+
		"\u0002\u0000\u0011\u0012\u0005\u0003\u0000\u0000\u0012\u0003\u0001\u0000"+
		"\u0000\u0000\u0013\u0016\u0005\u0004\u0000\u0000\u0014\u0015\u0005\u0010"+
		"\u0000\u0000\u0015\u0017\u0005\r\u0000\u0000\u0016\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017%\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0005\u0005\u0000\u0000\u0019\u001a\u0005\u0010\u0000\u0000"+
		"\u001a%\u0005\u000e\u0000\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c"+
		"\u001d\u0005\u0007\u0000\u0000\u001d\u001e\u0005\b\u0000\u0000\u001e\u001f"+
		"\u0003\u0006\u0003\u0000\u001f \u0005\t\u0000\u0000 %\u0001\u0000\u0000"+
		"\u0000!\"\u0005\n\u0000\u0000\"#\u0005\u0010\u0000\u0000#%\u0007\u0000"+
		"\u0000\u0000$\u0013\u0001\u0000\u0000\u0000$\u0018\u0001\u0000\u0000\u0000"+
		"$\u001b\u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000%\u0005\u0001"+
		"\u0000\u0000\u0000&+\u0005\r\u0000\u0000\'(\u0005\u000f\u0000\u0000(*"+
		"\u0005\r\u0000\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0007\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000\u0004\u000b\u0016$+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}