// Generated from /Users/mendonca/PROJETO_LAPR4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class InterviewQuestionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, STRING=13, BOOLEAN=14, INTEGER=15, DATE_FORMAT=16, 
		TIME_FORMAT=17, DECIMAL_VALUE=18, WS=19;
	public static final int
		RULE_start = 0, RULE_header = 1, RULE_requirement = 2, RULE_reqType = 3, 
		RULE_trueFalseReq = 4, RULE_shortAReq = 5, RULE_intReq = 6, RULE_multiChoiceReq = 7, 
		RULE_choiceReq = 8, RULE_dateReq = 9, RULE_timeReq = 10, RULE_decimalReq = 11, 
		RULE_answer1 = 12, RULE_answer2 = 13, RULE_answer3 = 14, RULE_answer4 = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "header", "requirement", "reqType", "trueFalseReq", "shortAReq", 
			"intReq", "multiChoiceReq", "choiceReq", "dateReq", "timeReq", "decimalReq", 
			"answer1", "answer2", "answer3", "answer4"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'RQ: '", "'[TrueOrFalse] '", "'[value: '", "'] '", "'RA: '", "'[ShortAnswer] '", 
			"'[Integer] '", "'[MultiChoice] '", "'[Choice] '", "'[Date] '", "'[Time] '", 
			"'[Decimal] '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "BOOLEAN", "INTEGER", "DATE_FORMAT", "TIME_FORMAT", "DECIMAL_VALUE", 
			"WS"
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
	public String getGrammarFileName() { return "InterviewQuestions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterviewQuestionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(InterviewQuestionsParser.EOF, 0); }
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
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitStart(this);
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
			setState(32);
			header();
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				requirement();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER );
			setState(38);
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
		public TerminalNode STRING() { return getToken(InterviewQuestionsParser.STRING, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
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
		public TerminalNode INTEGER() { return getToken(InterviewQuestionsParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(InterviewQuestionsParser.STRING, 0); }
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((RequirementContext)_localctx).id = match(INTEGER);
			setState(43);
			match(T__0);
			setState(44);
			((RequirementContext)_localctx).requirementContent = match(STRING);
			setState(45);
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
		public MultiChoiceReqContext multiChoiceReq() {
			return getRuleContext(MultiChoiceReqContext.class,0);
		}
		public DateReqContext dateReq() {
			return getRuleContext(DateReqContext.class,0);
		}
		public TimeReqContext timeReq() {
			return getRuleContext(TimeReqContext.class,0);
		}
		public DecimalReqContext decimalReq() {
			return getRuleContext(DecimalReqContext.class,0);
		}
		public ReqTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reqType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterReqType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitReqType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitReqType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReqTypeContext reqType() throws RecognitionException {
		ReqTypeContext _localctx = new ReqTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reqType);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				trueFalseReq();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				shortAReq();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				intReq();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				choiceReq();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				multiChoiceReq();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				dateReq();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				timeReq();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				decimalReq();
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
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public TerminalNode BOOLEAN() { return getToken(InterviewQuestionsParser.BOOLEAN, 0); }
		public TrueFalseReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterTrueFalseReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitTrueFalseReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTrueFalseReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseReqContext trueFalseReq() throws RecognitionException {
		TrueFalseReqContext _localctx = new TrueFalseReqContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_trueFalseReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			match(T__2);
			setState(59);
			((TrueFalseReqContext)_localctx).value = match(INTEGER);
			setState(60);
			match(T__3);
			setState(61);
			((TrueFalseReqContext)_localctx).id = match(INTEGER);
			setState(62);
			match(T__4);
			setState(63);
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
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public TerminalNode STRING() { return getToken(InterviewQuestionsParser.STRING, 0); }
		public ShortAReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterShortAReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitShortAReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitShortAReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAReqContext shortAReq() throws RecognitionException {
		ShortAReqContext _localctx = new ShortAReqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shortAReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__5);
			setState(66);
			match(T__2);
			setState(67);
			((ShortAReqContext)_localctx).value = match(INTEGER);
			setState(68);
			match(T__3);
			setState(69);
			((ShortAReqContext)_localctx).id = match(INTEGER);
			setState(70);
			match(T__4);
			setState(71);
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
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public IntReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterIntReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitIntReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitIntReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntReqContext intReq() throws RecognitionException {
		IntReqContext _localctx = new IntReqContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(74);
			match(T__2);
			setState(75);
			((IntReqContext)_localctx).value = match(INTEGER);
			setState(76);
			match(T__3);
			setState(77);
			((IntReqContext)_localctx).id = match(INTEGER);
			setState(78);
			match(T__4);
			setState(79);
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
	public static class MultiChoiceReqContext extends ParserRuleContext {
		public Token value;
		public Token id;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public Answer1Context answer1() {
			return getRuleContext(Answer1Context.class,0);
		}
		public Answer2Context answer2() {
			return getRuleContext(Answer2Context.class,0);
		}
		public Answer3Context answer3() {
			return getRuleContext(Answer3Context.class,0);
		}
		public Answer4Context answer4() {
			return getRuleContext(Answer4Context.class,0);
		}
		public MultiChoiceReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiChoiceReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterMultiChoiceReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitMultiChoiceReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitMultiChoiceReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiChoiceReqContext multiChoiceReq() throws RecognitionException {
		MultiChoiceReqContext _localctx = new MultiChoiceReqContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiChoiceReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__7);
			setState(82);
			match(T__2);
			setState(83);
			((MultiChoiceReqContext)_localctx).value = match(INTEGER);
			setState(84);
			match(T__3);
			setState(85);
			((MultiChoiceReqContext)_localctx).id = match(INTEGER);
			setState(86);
			match(T__4);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(87);
				answer1();
				}
				break;
			case 2:
				{
				setState(88);
				answer2();
				}
				break;
			case 3:
				{
				setState(89);
				answer3();
				}
				break;
			case 4:
				{
				setState(90);
				answer4();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceReqContext extends ParserRuleContext {
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public TerminalNode STRING() { return getToken(InterviewQuestionsParser.STRING, 0); }
		public ChoiceReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterChoiceReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitChoiceReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitChoiceReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceReqContext choiceReq() throws RecognitionException {
		ChoiceReqContext _localctx = new ChoiceReqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choiceReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__8);
			setState(94);
			match(T__2);
			setState(95);
			((ChoiceReqContext)_localctx).value = match(INTEGER);
			setState(96);
			match(T__3);
			setState(97);
			((ChoiceReqContext)_localctx).id = match(INTEGER);
			setState(98);
			match(T__4);
			setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DateReqContext extends ParserRuleContext {
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public TerminalNode DATE_FORMAT() { return getToken(InterviewQuestionsParser.DATE_FORMAT, 0); }
		public DateReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterDateReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitDateReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDateReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateReqContext dateReq() throws RecognitionException {
		DateReqContext _localctx = new DateReqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dateReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__9);
			setState(102);
			match(T__2);
			setState(103);
			((DateReqContext)_localctx).value = match(INTEGER);
			setState(104);
			match(T__3);
			setState(105);
			((DateReqContext)_localctx).id = match(INTEGER);
			setState(106);
			match(T__4);
			setState(107);
			((DateReqContext)_localctx).answer = match(DATE_FORMAT);
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
	public static class TimeReqContext extends ParserRuleContext {
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public TerminalNode TIME_FORMAT() { return getToken(InterviewQuestionsParser.TIME_FORMAT, 0); }
		public TimeReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterTimeReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitTimeReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTimeReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeReqContext timeReq() throws RecognitionException {
		TimeReqContext _localctx = new TimeReqContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_timeReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__10);
			setState(110);
			match(T__2);
			setState(111);
			((TimeReqContext)_localctx).value = match(INTEGER);
			setState(112);
			match(T__3);
			setState(113);
			((TimeReqContext)_localctx).id = match(INTEGER);
			setState(114);
			match(T__4);
			setState(115);
			((TimeReqContext)_localctx).answer = match(TIME_FORMAT);
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
	public static class DecimalReqContext extends ParserRuleContext {
		public Token value;
		public Token id;
		public Token answer;
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(InterviewQuestionsParser.DECIMAL_VALUE, 0); }
		public DecimalReqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalReq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterDecimalReq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitDecimalReq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDecimalReq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalReqContext decimalReq() throws RecognitionException {
		DecimalReqContext _localctx = new DecimalReqContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decimalReq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__11);
			setState(118);
			match(T__2);
			setState(119);
			((DecimalReqContext)_localctx).value = match(INTEGER);
			setState(120);
			match(T__3);
			setState(121);
			((DecimalReqContext)_localctx).id = match(INTEGER);
			setState(122);
			match(T__4);
			setState(123);
			((DecimalReqContext)_localctx).answer = match(DECIMAL_VALUE);
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
	public static class Answer1Context extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(InterviewQuestionsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(InterviewQuestionsParser.STRING, i);
		}
		public Answer1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterAnswer1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitAnswer1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitAnswer1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer1Context answer1() throws RecognitionException {
		Answer1Context _localctx = new Answer1Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_answer1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(STRING);
			setState(126);
			match(STRING);
			setState(127);
			match(STRING);
			setState(128);
			match(STRING);
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
	public static class Answer2Context extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(InterviewQuestionsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(InterviewQuestionsParser.STRING, i);
		}
		public Answer2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterAnswer2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitAnswer2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitAnswer2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer2Context answer2() throws RecognitionException {
		Answer2Context _localctx = new Answer2Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_answer2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(STRING);
			setState(131);
			match(STRING);
			setState(132);
			match(STRING);
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
	public static class Answer3Context extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(InterviewQuestionsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(InterviewQuestionsParser.STRING, i);
		}
		public Answer3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterAnswer3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitAnswer3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitAnswer3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer3Context answer3() throws RecognitionException {
		Answer3Context _localctx = new Answer3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_answer3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(STRING);
			setState(135);
			match(STRING);
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
	public static class Answer4Context extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(InterviewQuestionsParser.STRING, 0); }
		public Answer4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).enterAnswer4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener) ((InterviewQuestionsListener)listener).exitAnswer4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitAnswer4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer4Context answer4() throws RecognitionException {
		Answer4Context _localctx = new Answer4Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_answer4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(STRING);
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
		"\u0004\u0001\u0013\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"8\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\\\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u0086\u0000 \u0001"+
		"\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000"+
		"\u0000\u00067\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nA\u0001"+
		"\u0000\u0000\u0000\fI\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000"+
		"\u0000\u0010]\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000\u0014"+
		"m\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000\u0000\u0018}\u0001"+
		"\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000\u0000\u001c\u0086\u0001"+
		"\u0000\u0000\u0000\u001e\u0089\u0001\u0000\u0000\u0000 \"\u0003\u0002"+
		"\u0001\u0000!#\u0003\u0004\u0002\u0000\"!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&\'\u0005\u0000\u0000\u0001\'\u0001\u0001\u0000"+
		"\u0000\u0000()\u0005\r\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005"+
		"\u000f\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\r\u0000\u0000-.\u0003"+
		"\u0006\u0003\u0000.\u0005\u0001\u0000\u0000\u0000/8\u0003\b\u0004\u0000"+
		"08\u0003\n\u0005\u000018\u0003\f\u0006\u000028\u0003\u0010\b\u000038\u0003"+
		"\u000e\u0007\u000048\u0003\u0012\t\u000058\u0003\u0014\n\u000068\u0003"+
		"\u0016\u000b\u00007/\u0001\u0000\u0000\u000070\u0001\u0000\u0000\u0000"+
		"71\u0001\u0000\u0000\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000"+
		"\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008\u0007\u0001\u0000\u0000\u00009:\u0005\u0002\u0000\u0000"+
		":;\u0005\u0003\u0000\u0000;<\u0005\u000f\u0000\u0000<=\u0005\u0004\u0000"+
		"\u0000=>\u0005\u000f\u0000\u0000>?\u0005\u0005\u0000\u0000?@\u0005\u000e"+
		"\u0000\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u0006\u0000\u0000BC\u0005"+
		"\u0003\u0000\u0000CD\u0005\u000f\u0000\u0000DE\u0005\u0004\u0000\u0000"+
		"EF\u0005\u000f\u0000\u0000FG\u0005\u0005\u0000\u0000GH\u0005\r\u0000\u0000"+
		"H\u000b\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0005\u0003"+
		"\u0000\u0000KL\u0005\u000f\u0000\u0000LM\u0005\u0004\u0000\u0000MN\u0005"+
		"\u000f\u0000\u0000NO\u0005\u0005\u0000\u0000OP\u0005\u000f\u0000\u0000"+
		"P\r\u0001\u0000\u0000\u0000QR\u0005\b\u0000\u0000RS\u0005\u0003\u0000"+
		"\u0000ST\u0005\u000f\u0000\u0000TU\u0005\u0004\u0000\u0000UV\u0005\u000f"+
		"\u0000\u0000V[\u0005\u0005\u0000\u0000W\\\u0003\u0018\f\u0000X\\\u0003"+
		"\u001a\r\u0000Y\\\u0003\u001c\u000e\u0000Z\\\u0003\u001e\u000f\u0000["+
		"W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]^\u0005"+
		"\t\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0005\u000f\u0000\u0000`a\u0005"+
		"\u0004\u0000\u0000ab\u0005\u000f\u0000\u0000bc\u0005\u0005\u0000\u0000"+
		"cd\u0005\r\u0000\u0000d\u0011\u0001\u0000\u0000\u0000ef\u0005\n\u0000"+
		"\u0000fg\u0005\u0003\u0000\u0000gh\u0005\u000f\u0000\u0000hi\u0005\u0004"+
		"\u0000\u0000ij\u0005\u000f\u0000\u0000jk\u0005\u0005\u0000\u0000kl\u0005"+
		"\u0010\u0000\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0005\u000b\u0000"+
		"\u0000no\u0005\u0003\u0000\u0000op\u0005\u000f\u0000\u0000pq\u0005\u0004"+
		"\u0000\u0000qr\u0005\u000f\u0000\u0000rs\u0005\u0005\u0000\u0000st\u0005"+
		"\u0011\u0000\u0000t\u0015\u0001\u0000\u0000\u0000uv\u0005\f\u0000\u0000"+
		"vw\u0005\u0003\u0000\u0000wx\u0005\u000f\u0000\u0000xy\u0005\u0004\u0000"+
		"\u0000yz\u0005\u000f\u0000\u0000z{\u0005\u0005\u0000\u0000{|\u0005\u0012"+
		"\u0000\u0000|\u0017\u0001\u0000\u0000\u0000}~\u0005\r\u0000\u0000~\u007f"+
		"\u0005\r\u0000\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0081\u0005"+
		"\r\u0000\u0000\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083\u0005\r"+
		"\u0000\u0000\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0005\r\u0000"+
		"\u0000\u0085\u001b\u0001\u0000\u0000\u0000\u0086\u0087\u0005\r\u0000\u0000"+
		"\u0087\u0088\u0005\r\u0000\u0000\u0088\u001d\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\r\u0000\u0000\u008a\u001f\u0001\u0000\u0000\u0000\u0003$"+
		"7[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}