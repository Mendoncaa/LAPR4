// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CostumerRequirements.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, BOOLEAN=8, INTEGER=9, 
		REAL=10, WS=11;
	public static final int
		RULE_start = 0, RULE_header = 1, RULE_requirement = 2, RULE_reqType = 3, 
		RULE_trueFalseReq = 4, RULE_shortAReq = 5, RULE_intReq = 6, RULE_choiceReq = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "header", "requirement", "reqType", "trueFalseReq", "shortAReq", 
			"intReq", "choiceReq"
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
	public static class StartContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CostumerRequirementsParser.EOF, 0); }
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			header();
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				requirement();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER );
			setState(22);
			match(EOF);
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
	public static class HeaderContext extends ParserRuleContext {
		public Token text;
		public TerminalNode STRING() { return getToken(CostumerRequirementsParser.STRING, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((HeaderContext)_localctx).text = match(STRING);
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
		public Token id;
		public Token requirementContent;
		public ReqTypeContext reqType() {
			return getRuleContext(ReqTypeContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CostumerRequirementsParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CostumerRequirementsParser.STRING, 0); }
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((RequirementContext)_localctx).id = match(INTEGER);
			setState(27);
			match(T__0);
			setState(28);
			((RequirementContext)_localctx).requirementContent = match(STRING);
			setState(29);
			reqType();
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
	public static class ReqTypeContext extends ParserRuleContext {
		public TrueFalseReqContext trueFalseReq() {
			return getRuleContext(TrueFalseReqContext.class,0);
		}
		public ShortAReqContext shortAReq() {
			return getRuleContext(ShortAReqContext.class,0);
		}
		public IntReqContext intReq() {
			return getRuleContext(IntReqContext.class,0);
		}
		public ChoiceReqContext choiceReq() {
			return getRuleContext(ChoiceReqContext.class,0);
		}
		public ReqTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterReqType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitReqType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitReqType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReqTypeContext reqType() throws RecognitionException {
		ReqTypeContext _localctx = new ReqTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reqType);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				trueFalseReq();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				shortAReq();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				intReq();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				choiceReq();
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
	public static class TrueFalseReqContext extends ParserRuleContext {
		public Token id;
		public Token answer;
		public TerminalNode INTEGER() { return getToken(CostumerRequirementsParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(CostumerRequirementsParser.BOOLEAN, 0); }
		public TrueFalseReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterTrueFalseReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitTrueFalseReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitTrueFalseReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseReqContext trueFalseReq() throws RecognitionException {
		TrueFalseReqContext _localctx = new TrueFalseReqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_trueFalseReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__1);
			setState(38);
			((TrueFalseReqContext)_localctx).id = match(INTEGER);
			setState(39);
			match(T__2);
			setState(40);
			((TrueFalseReqContext)_localctx).answer = match(BOOLEAN);
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
	public static class ShortAReqContext extends ParserRuleContext {
		public Token id;
		public Token answer;
		public TerminalNode INTEGER() { return getToken(CostumerRequirementsParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CostumerRequirementsParser.STRING, 0); }
		public ShortAReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterShortAReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitShortAReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitShortAReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAReqContext shortAReq() throws RecognitionException {
		ShortAReqContext _localctx = new ShortAReqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shortAReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__3);
			setState(43);
			((ShortAReqContext)_localctx).id = match(INTEGER);
			setState(44);
			match(T__2);
			setState(45);
			((ShortAReqContext)_localctx).answer = match(STRING);
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
	public static class IntReqContext extends ParserRuleContext {
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(CostumerRequirementsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(CostumerRequirementsParser.INTEGER, i);
		}
		public IntReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterIntReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitIntReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitIntReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntReqContext intReq() throws RecognitionException {
		IntReqContext _localctx = new IntReqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(48);
			((IntReqContext)_localctx).id = match(INTEGER);
			setState(49);
			match(T__2);
			setState(50);
			((IntReqContext)_localctx).answer = match(INTEGER);
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
	public static class ChoiceReqContext extends ParserRuleContext {
		public Token id;
		public Token answer;
		public TerminalNode INTEGER() { return getToken(CostumerRequirementsParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CostumerRequirementsParser.STRING, 0); }
		public ChoiceReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).enterChoiceReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CostumerRequirementsListener ) ((CostumerRequirementsListener)listener).exitChoiceReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CostumerRequirementsVisitor ) return ((CostumerRequirementsVisitor<? extends T>)visitor).visitChoiceReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceReqContext choiceReq() throws RecognitionException {
		ChoiceReqContext _localctx = new ChoiceReqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choiceReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__5);
			setState(53);
			((ChoiceReqContext)_localctx).id = match(INTEGER);
			setState(54);
			match(T__2);
			setState(55);
			((ChoiceReqContext)_localctx).answer = match(STRING);
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
		"\u0004\u0001\u000b:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003$\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u00005\u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u0004"+
		"\u001a\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b%\u0001"+
		"\u0000\u0000\u0000\n*\u0001\u0000\u0000\u0000\f/\u0001\u0000\u0000\u0000"+
		"\u000e4\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011"+
		"\u0013\u0003\u0004\u0002\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0005\u0007\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0005\t\u0000\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001d"+
		"\u0005\u0007\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e\u0005"+
		"\u0001\u0000\u0000\u0000\u001f$\u0003\b\u0004\u0000 $\u0003\n\u0005\u0000"+
		"!$\u0003\f\u0006\u0000\"$\u0003\u000e\u0007\u0000#\u001f\u0001\u0000\u0000"+
		"\u0000# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000"+
		"\u0000\u0000$\u0007\u0001\u0000\u0000\u0000%&\u0005\u0002\u0000\u0000"+
		"&\'\u0005\t\u0000\u0000\'(\u0005\u0003\u0000\u0000()\u0005\b\u0000\u0000"+
		")\t\u0001\u0000\u0000\u0000*+\u0005\u0004\u0000\u0000+,\u0005\t\u0000"+
		"\u0000,-\u0005\u0003\u0000\u0000-.\u0005\u0007\u0000\u0000.\u000b\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0005\u0000\u000001\u0005\t\u0000\u000012\u0005"+
		"\u0003\u0000\u000023\u0005\t\u0000\u00003\r\u0001\u0000\u0000\u000045"+
		"\u0005\u0006\u0000\u000056\u0005\t\u0000\u000067\u0005\u0003\u0000\u0000"+
		"78\u0005\u0007\u0000\u00008\u000f\u0001\u0000\u0000\u0000\u0002\u0014"+
		"#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}