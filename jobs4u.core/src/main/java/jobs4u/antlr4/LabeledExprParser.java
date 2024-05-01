// Generated from C:/Users/USER/IdeaProjects/sem4pi-23-24-2dj4/jobs4u.core/src/main/resources/grammar/LabeledExpr.g4 by ANTLR 4.13.1
package jobs4u.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, FOOTER=14, INTERVIEW=15, REQUIREMENTS=16, 
		CREATE=17, PASSING=18, QUESTION=19, AND=20, AS=21, AWARDING=22, BEING=23, 
		BETWEEN=24, CONDUCTED=25, DIFFICULTY=26, FALSE=27, FOLLOWS=28, FOR_JOB=29, 
		FROM=30, IN=31, INTERVIEW_MODEL=32, IS_DEFINED=33, ITS_VALIDATION=34, 
		MAY_BE=35, MUST_SCORE=36, OF=37, OUTSTANDING=38, ORDER=39, RESULTS=40, 
		SHOULD_BE=41, TRUE=42, TYPE=43, WITH=44, TOPIC_TOKEN=45, COMA_TOKEN=46, 
		ENTRY_TOKEN=47, END_SATEMENT=48, String=49, Decimal=50, Real=51, ORDER_TYPE=52, 
		ORDER_METHOD=53, COMMENT=54, WS=55, TRUE_FALSE=56, SHORT_TEXT=57, SINGLE_CHOICE=58, 
		MULTIPLE_CHOICE=59, INTEGER_NUMBER=60, REAL_NUMBER=61, DATE=62, TIME=63, 
		SCALE=64, ID=65;
	public static final int
		RULE_start = 0, RULE_footer = 1, RULE_interview_conduct = 2, RULE_order = 3, 
		RULE_order_atomic = 4, RULE_score_definition = 5, RULE_outstandingClause = 6, 
		RULE_requirements = 7, RULE_requirements_body = 8, RULE_requirements_atomic = 9, 
		RULE_requirementsType = 10, RULE_arr = 11, RULE_interview = 12, RULE_interview_body = 13, 
		RULE_interview_atomic = 14, RULE_true_false = 15, RULE_short = 16, RULE_single_choice = 17, 
		RULE_multiple_choice = 18, RULE_c_choices = 19, RULE_choice = 20, RULE_int_q = 21, 
		RULE_real_q = 22, RULE_date_q = 23, RULE_time_q = 24, RULE_scale_q = 25, 
		RULE_header = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "footer", "interview_conduct", "order", "order_atomic", "score_definition", 
			"outstandingClause", "requirements", "requirements_body", "requirements_atomic", 
			"requirementsType", "arr", "interview", "interview_body", "interview_atomic", 
			"true_false", "short", "single_choice", "multiple_choice", "c_choices", 
			"choice", "int_q", "real_q", "date_q", "time_q", "scale_q", "header"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'text'", "'number'", "'multiple'", "'into'", "'['", "']'", "'yes/no'", 
			"'yes'", "'no'", "'literal'", "'regex'", "'('", "')'", "'footer'", "'interview'", 
			"'requirements'", "'create'", "'passing'", "'question'", "'and'", "'as'", 
			"'awarding'", "'being'", "'between'", "'conducted'", "'difficulty'", 
			"'false'", "'follows'", "'for job opening'", "'from'", "'in'", "'interview model'", 
			"'is defined'", "'its validation'", "'may be'", "'must score'", "'of'", 
			"'outstanding'", "'order'", "'results'", "'should be'", "'true'", "'type'", 
			"'with'", "'-'", "','", "'->'", "';'", null, null, null, null, null, 
			null, null, "'true/false'", "'short text'", "'single choice'", "'multiple choice'", 
			"'integer number'", "'real number'", "'date'", "'time'", "'scale'", "'id'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "FOOTER", "INTERVIEW", "REQUIREMENTS", "CREATE", "PASSING", 
			"QUESTION", "AND", "AS", "AWARDING", "BEING", "BETWEEN", "CONDUCTED", 
			"DIFFICULTY", "FALSE", "FOLLOWS", "FOR_JOB", "FROM", "IN", "INTERVIEW_MODEL", 
			"IS_DEFINED", "ITS_VALIDATION", "MAY_BE", "MUST_SCORE", "OF", "OUTSTANDING", 
			"ORDER", "RESULTS", "SHOULD_BE", "TRUE", "TYPE", "WITH", "TOPIC_TOKEN", 
			"COMA_TOKEN", "ENTRY_TOKEN", "END_SATEMENT", "String", "Decimal", "Real", 
			"ORDER_TYPE", "ORDER_METHOD", "COMMENT", "WS", "TRUE_FALSE", "SHORT_TEXT", 
			"SINGLE_CHOICE", "MULTIPLE_CHOICE", "INTEGER_NUMBER", "REAL_NUMBER", 
			"DATE", "TIME", "SCALE", "ID"
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public InterviewContext interview() {
			return getRuleContext(InterviewContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public RequirementsContext requirements() {
			return getRuleContext(RequirementsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			header();
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(55);
				requirements();
				}
				break;
			}
			setState(58);
			interview();
			setState(59);
			footer();
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
	public static class FooterContext extends ParserRuleContext {
		public TerminalNode TOPIC_TOKEN() { return getToken(LabeledExprParser.TOPIC_TOKEN, 0); }
		public TerminalNode FOOTER() { return getToken(LabeledExprParser.FOOTER, 0); }
		public Score_definitionContext score_definition() {
			return getRuleContext(Score_definitionContext.class,0);
		}
		public List<TerminalNode> END_SATEMENT() { return getTokens(LabeledExprParser.END_SATEMENT); }
		public TerminalNode END_SATEMENT(int i) {
			return getToken(LabeledExprParser.END_SATEMENT, i);
		}
		public Interview_conductContext interview_conduct() {
			return getRuleContext(Interview_conductContext.class,0);
		}
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(TOPIC_TOKEN);
			setState(62);
			match(FOOTER);
			setState(63);
			score_definition();
			setState(64);
			match(END_SATEMENT);
			setState(65);
			interview_conduct();
			setState(66);
			match(END_SATEMENT);
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
	public static class Interview_conductContext extends ParserRuleContext {
		public TerminalNode INTERVIEW() { return getToken(LabeledExprParser.INTERVIEW, 0); }
		public TerminalNode SHOULD_BE() { return getToken(LabeledExprParser.SHOULD_BE, 0); }
		public TerminalNode CONDUCTED() { return getToken(LabeledExprParser.CONDUCTED, 0); }
		public TerminalNode IN() { return getToken(LabeledExprParser.IN, 0); }
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(LabeledExprParser.ORDER, 0); }
		public Interview_conductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interview_conduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInterview_conduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInterview_conduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInterview_conduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interview_conductContext interview_conduct() throws RecognitionException {
		Interview_conductContext _localctx = new Interview_conductContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interview_conduct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INTERVIEW);
			setState(69);
			match(SHOULD_BE);
			setState(70);
			match(CONDUCTED);
			setState(71);
			match(IN);
			setState(72);
			order();
			setState(73);
			match(ORDER);
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
	public static class OrderContext extends ParserRuleContext {
		public Order_atomicContext order_atomic() {
			return getRuleContext(Order_atomicContext.class,0);
		}
		public TerminalNode COMA_TOKEN() { return getToken(LabeledExprParser.COMA_TOKEN, 0); }
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_order);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				order_atomic();
				setState(76);
				match(COMA_TOKEN);
				setState(77);
				order();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				order_atomic();
				}
				break;
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
	public static class Order_atomicContext extends ParserRuleContext {
		public TerminalNode ORDER_TYPE() { return getToken(LabeledExprParser.ORDER_TYPE, 0); }
		public TerminalNode ORDER_METHOD() { return getToken(LabeledExprParser.ORDER_METHOD, 0); }
		public Order_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterOrder_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitOrder_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitOrder_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_atomicContext order_atomic() throws RecognitionException {
		Order_atomicContext _localctx = new Order_atomicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_order_atomic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ORDER_TYPE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_METHOD) {
				{
				setState(83);
				match(ORDER_METHOD);
				}
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
	public static class Score_definitionContext extends ParserRuleContext {
		public Token passingScore;
		public TerminalNode PASSING() { return getToken(LabeledExprParser.PASSING, 0); }
		public TerminalNode RESULTS() { return getToken(LabeledExprParser.RESULTS, 0); }
		public TerminalNode MUST_SCORE() { return getToken(LabeledExprParser.MUST_SCORE, 0); }
		public TerminalNode Decimal() { return getToken(LabeledExprParser.Decimal, 0); }
		public OutstandingClauseContext outstandingClause() {
			return getRuleContext(OutstandingClauseContext.class,0);
		}
		public Score_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterScore_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitScore_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitScore_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Score_definitionContext score_definition() throws RecognitionException {
		Score_definitionContext _localctx = new Score_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_score_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(PASSING);
			setState(87);
			match(RESULTS);
			setState(88);
			match(MUST_SCORE);
			setState(89);
			((Score_definitionContext)_localctx).passingScore = match(Decimal);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA_TOKEN) {
				{
				setState(90);
				outstandingClause();
				}
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
	public static class OutstandingClauseContext extends ParserRuleContext {
		public Token outstandingResults;
		public TerminalNode COMA_TOKEN() { return getToken(LabeledExprParser.COMA_TOKEN, 0); }
		public TerminalNode OUTSTANDING() { return getToken(LabeledExprParser.OUTSTANDING, 0); }
		public TerminalNode RESULTS() { return getToken(LabeledExprParser.RESULTS, 0); }
		public TerminalNode MUST_SCORE() { return getToken(LabeledExprParser.MUST_SCORE, 0); }
		public TerminalNode Decimal() { return getToken(LabeledExprParser.Decimal, 0); }
		public OutstandingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outstandingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterOutstandingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitOutstandingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitOutstandingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutstandingClauseContext outstandingClause() throws RecognitionException {
		OutstandingClauseContext _localctx = new OutstandingClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_outstandingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(COMA_TOKEN);
			setState(94);
			match(OUTSTANDING);
			setState(95);
			match(RESULTS);
			setState(96);
			match(MUST_SCORE);
			setState(97);
			((OutstandingClauseContext)_localctx).outstandingResults = match(Decimal);
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
	public static class RequirementsContext extends ParserRuleContext {
		public TerminalNode TOPIC_TOKEN() { return getToken(LabeledExprParser.TOPIC_TOKEN, 0); }
		public TerminalNode REQUIREMENTS() { return getToken(LabeledExprParser.REQUIREMENTS, 0); }
		public Requirements_bodyContext requirements_body() {
			return getRuleContext(Requirements_bodyContext.class,0);
		}
		public RequirementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRequirements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRequirements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRequirements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsContext requirements() throws RecognitionException {
		RequirementsContext _localctx = new RequirementsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_requirements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(TOPIC_TOKEN);
			setState(100);
			match(REQUIREMENTS);
			setState(101);
			requirements_body();
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
	public static class Requirements_bodyContext extends ParserRuleContext {
		public Requirements_atomicContext requirements_atomic() {
			return getRuleContext(Requirements_atomicContext.class,0);
		}
		public Requirements_bodyContext requirements_body() {
			return getRuleContext(Requirements_bodyContext.class,0);
		}
		public Requirements_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirements_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRequirements_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRequirements_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRequirements_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirements_bodyContext requirements_body() throws RecognitionException {
		Requirements_bodyContext _localctx = new Requirements_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_requirements_body);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				requirements_atomic();
				setState(104);
				requirements_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				requirements_atomic();
				}
				break;
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
	public static class Requirements_atomicContext extends ParserRuleContext {
		public Token requirementName;
		public TerminalNode ENTRY_TOKEN() { return getToken(LabeledExprParser.ENTRY_TOKEN, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public RequirementsTypeContext requirementsType() {
			return getRuleContext(RequirementsTypeContext.class,0);
		}
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode String() { return getToken(LabeledExprParser.String, 0); }
		public Requirements_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirements_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRequirements_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRequirements_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRequirements_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirements_atomicContext requirements_atomic() throws RecognitionException {
		Requirements_atomicContext _localctx = new Requirements_atomicContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_requirements_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ENTRY_TOKEN);
			setState(110);
			((Requirements_atomicContext)_localctx).requirementName = match(String);
			setState(111);
			match(AS);
			setState(112);
			requirementsType();
			setState(113);
			match(END_SATEMENT);
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
		public TerminalNode MAY_BE() { return getToken(LabeledExprParser.MAY_BE, 0); }
		public TerminalNode String() { return getToken(LabeledExprParser.String, 0); }
		public TerminalNode Decimal() { return getToken(LabeledExprParser.Decimal, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public RequirementsTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementsType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterRequirementsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitRequirementsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitRequirementsType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsTypeContext requirementsType() throws RecognitionException {
		RequirementsTypeContext _localctx = new RequirementsTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_requirementsType);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__0);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MAY_BE) {
					{
					setState(116);
					match(MAY_BE);
					setState(117);
					match(String);
					}
				}

				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__1);
				setState(121);
				match(MAY_BE);
				setState(122);
				match(Decimal);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__2);
				setState(124);
				match(MAY_BE);
				setState(125);
				match(T__3);
				setState(126);
				match(T__4);
				setState(127);
				arr(0);
				setState(128);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(T__6);
				setState(131);
				match(MAY_BE);
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
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
		public TerminalNode String() { return getToken(LabeledExprParser.String, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode COMA_TOKEN() { return getToken(LabeledExprParser.COMA_TOKEN, 0); }
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		return arr(0);
	}

	private ArrContext arr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArrContext _localctx = new ArrContext(_ctx, _parentState);
		ArrContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			match(String);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arr);
					setState(138);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(139);
					match(COMA_TOKEN);
					setState(140);
					match(String);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterviewContext extends ParserRuleContext {
		public TerminalNode TOPIC_TOKEN() { return getToken(LabeledExprParser.TOPIC_TOKEN, 0); }
		public TerminalNode INTERVIEW() { return getToken(LabeledExprParser.INTERVIEW, 0); }
		public Interview_bodyContext interview_body() {
			return getRuleContext(Interview_bodyContext.class,0);
		}
		public InterviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInterview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInterview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInterview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterviewContext interview() throws RecognitionException {
		InterviewContext _localctx = new InterviewContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interview);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(TOPIC_TOKEN);
			setState(147);
			match(INTERVIEW);
			setState(148);
			interview_body();
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
	public static class Interview_bodyContext extends ParserRuleContext {
		public Interview_atomicContext interview_atomic() {
			return getRuleContext(Interview_atomicContext.class,0);
		}
		public Interview_bodyContext interview_body() {
			return getRuleContext(Interview_bodyContext.class,0);
		}
		public Interview_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interview_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInterview_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInterview_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInterview_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interview_bodyContext interview_body() throws RecognitionException {
		Interview_bodyContext _localctx = new Interview_bodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interview_body);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				interview_atomic();
				setState(151);
				interview_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				interview_atomic();
				}
				break;
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
	public static class Interview_atomicContext extends ParserRuleContext {
		public TerminalNode ENTRY_TOKEN() { return getToken(LabeledExprParser.ENTRY_TOKEN, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public True_falseContext true_false() {
			return getRuleContext(True_falseContext.class,0);
		}
		public ShortContext short_() {
			return getRuleContext(ShortContext.class,0);
		}
		public Single_choiceContext single_choice() {
			return getRuleContext(Single_choiceContext.class,0);
		}
		public Multiple_choiceContext multiple_choice() {
			return getRuleContext(Multiple_choiceContext.class,0);
		}
		public Int_qContext int_q() {
			return getRuleContext(Int_qContext.class,0);
		}
		public Real_qContext real_q() {
			return getRuleContext(Real_qContext.class,0);
		}
		public Date_qContext date_q() {
			return getRuleContext(Date_qContext.class,0);
		}
		public Time_qContext time_q() {
			return getRuleContext(Time_qContext.class,0);
		}
		public Scale_qContext scale_q() {
			return getRuleContext(Scale_qContext.class,0);
		}
		public Interview_atomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interview_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInterview_atomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInterview_atomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInterview_atomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interview_atomicContext interview_atomic() throws RecognitionException {
		Interview_atomicContext _localctx = new Interview_atomicContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_interview_atomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ENTRY_TOKEN);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_FALSE:
				{
				setState(157);
				true_false();
				}
				break;
			case SHORT_TEXT:
				{
				setState(158);
				short_();
				}
				break;
			case SINGLE_CHOICE:
				{
				setState(159);
				single_choice();
				}
				break;
			case MULTIPLE_CHOICE:
				{
				setState(160);
				multiple_choice();
				}
				break;
			case INTEGER_NUMBER:
				{
				setState(161);
				int_q();
				}
				break;
			case REAL_NUMBER:
				{
				setState(162);
				real_q();
				}
				break;
			case DATE:
				{
				setState(163);
				date_q();
				}
				break;
			case TIME:
				{
				setState(164);
				time_q();
				}
				break;
			case SCALE:
				{
				setState(165);
				scale_q();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
			match(END_SATEMENT);
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
	public static class True_falseContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionPoints;
		public TerminalNode TRUE_FALSE() { return getToken(LabeledExprParser.TRUE_FALSE, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(LabeledExprParser.OF, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public TerminalNode TRUE() { return getToken(LabeledExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LabeledExprParser.FALSE, 0); }
		public True_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTrue_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTrue_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTrue_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_falseContext true_false() throws RecognitionException {
		True_falseContext _localctx = new True_falseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_true_false);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(TRUE_FALSE);
			setState(171);
			match(QUESTION);
			setState(172);
			match(WITH);
			setState(173);
			match(ID);
			setState(174);
			((True_falseContext)_localctx).questionId = match(String);
			setState(175);
			match(BEING);
			setState(176);
			((True_falseContext)_localctx).questionPrompt = match(String);
			setState(177);
			match(WITH);
			setState(178);
			match(DIFFICULTY);
			setState(179);
			match(OF);
			setState(180);
			((True_falseContext)_localctx).questionDifficulty = match(Decimal);
			setState(181);
			match(END_SATEMENT);
			setState(182);
			match(ITS_VALIDATION);
			setState(183);
			match(IS_DEFINED);
			setState(184);
			match(AS);
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(186);
			match(AWARDING);
			setState(187);
			((True_falseContext)_localctx).questionPoints = match(Decimal);
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
	public static class ShortContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionCorrection;
		public Token questionPoints;
		public TerminalNode SHORT_TEXT() { return getToken(LabeledExprParser.SHORT_TEXT, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public List<TerminalNode> OF() { return getTokens(LabeledExprParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(LabeledExprParser.OF, i);
		}
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(LabeledExprParser.TYPE, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(SHORT_TEXT);
			setState(190);
			match(QUESTION);
			setState(191);
			match(WITH);
			setState(192);
			match(ID);
			setState(193);
			((ShortContext)_localctx).questionId = match(String);
			setState(194);
			match(BEING);
			setState(195);
			((ShortContext)_localctx).questionPrompt = match(String);
			setState(196);
			match(WITH);
			setState(197);
			match(DIFFICULTY);
			setState(198);
			match(OF);
			setState(199);
			((ShortContext)_localctx).questionDifficulty = match(Decimal);
			setState(200);
			match(END_SATEMENT);
			setState(201);
			match(ITS_VALIDATION);
			setState(202);
			match(IS_DEFINED);
			setState(203);
			match(AS);
			setState(204);
			((ShortContext)_localctx).questionCorrection = match(String);
			setState(205);
			match(OF);
			setState(206);
			match(TYPE);
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
			match(AWARDING);
			setState(209);
			((ShortContext)_localctx).questionPoints = match(Decimal);
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
	public static class Single_choiceContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token correctChoice;
		public Token choices;
		public Token questionPoints;
		public TerminalNode SINGLE_CHOICE() { return getToken(LabeledExprParser.SINGLE_CHOICE, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(LabeledExprParser.OF, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode FROM() { return getToken(LabeledExprParser.FROM, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public Single_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSingle_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSingle_choice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSingle_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_choiceContext single_choice() throws RecognitionException {
		Single_choiceContext _localctx = new Single_choiceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_single_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(SINGLE_CHOICE);
			setState(212);
			match(QUESTION);
			setState(213);
			match(WITH);
			setState(214);
			match(ID);
			setState(215);
			((Single_choiceContext)_localctx).questionId = match(String);
			setState(216);
			match(BEING);
			setState(217);
			((Single_choiceContext)_localctx).questionPrompt = match(String);
			setState(218);
			match(WITH);
			setState(219);
			match(DIFFICULTY);
			setState(220);
			match(OF);
			setState(221);
			((Single_choiceContext)_localctx).questionDifficulty = match(Decimal);
			setState(222);
			match(END_SATEMENT);
			setState(223);
			match(ITS_VALIDATION);
			setState(224);
			match(IS_DEFINED);
			setState(225);
			match(AS);
			setState(226);
			((Single_choiceContext)_localctx).correctChoice = match(String);
			setState(227);
			match(FROM);
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				((Single_choiceContext)_localctx).choices = match(String);
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==String );
			setState(233);
			match(AWARDING);
			setState(234);
			((Single_choiceContext)_localctx).questionPoints = match(Decimal);
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
	public static class Multiple_choiceContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public C_choicesContext correctChoices;
		public Token choices;
		public Token questionPoints;
		public TerminalNode MULTIPLE_CHOICE() { return getToken(LabeledExprParser.MULTIPLE_CHOICE, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(LabeledExprParser.OF, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode FROM() { return getToken(LabeledExprParser.FROM, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public C_choicesContext c_choices() {
			return getRuleContext(C_choicesContext.class,0);
		}
		public Multiple_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterMultiple_choice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitMultiple_choice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMultiple_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choiceContext multiple_choice() throws RecognitionException {
		Multiple_choiceContext _localctx = new Multiple_choiceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiple_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(MULTIPLE_CHOICE);
			setState(237);
			match(QUESTION);
			setState(238);
			match(WITH);
			setState(239);
			match(ID);
			setState(240);
			((Multiple_choiceContext)_localctx).questionId = match(String);
			setState(241);
			match(BEING);
			setState(242);
			((Multiple_choiceContext)_localctx).questionPrompt = match(String);
			setState(243);
			match(WITH);
			setState(244);
			match(DIFFICULTY);
			setState(245);
			match(OF);
			setState(246);
			((Multiple_choiceContext)_localctx).questionDifficulty = match(Decimal);
			setState(247);
			match(END_SATEMENT);
			setState(248);
			match(ITS_VALIDATION);
			setState(249);
			match(IS_DEFINED);
			setState(250);
			match(AS);
			setState(251);
			((Multiple_choiceContext)_localctx).correctChoices = c_choices();
			setState(252);
			match(FROM);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				((Multiple_choiceContext)_localctx).choices = match(String);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==String );
			setState(258);
			match(AWARDING);
			setState(259);
			((Multiple_choiceContext)_localctx).questionPoints = match(Decimal);
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
	public static class C_choicesContext extends ParserRuleContext {
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public C_choicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_choices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterC_choices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitC_choices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitC_choices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_choicesContext c_choices() throws RecognitionException {
		C_choicesContext _localctx = new C_choicesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_c_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			choice();
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				choice();
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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
	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(LabeledExprParser.String, 0); }
		public TerminalNode COMA_TOKEN() { return getToken(LabeledExprParser.COMA_TOKEN, 0); }
		public TerminalNode Decimal() { return getToken(LabeledExprParser.Decimal, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__11);
			setState(268);
			match(String);
			setState(269);
			match(COMA_TOKEN);
			setState(270);
			match(Decimal);
			setState(271);
			match(T__12);
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
	public static class Int_qContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionCorrection;
		public Token questionPoints;
		public TerminalNode INTEGER_NUMBER() { return getToken(LabeledExprParser.INTEGER_NUMBER, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(LabeledExprParser.OF, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public Int_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInt_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInt_q(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInt_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_qContext int_q() throws RecognitionException {
		Int_qContext _localctx = new Int_qContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_int_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(INTEGER_NUMBER);
			setState(274);
			match(QUESTION);
			setState(275);
			match(WITH);
			setState(276);
			match(ID);
			setState(277);
			((Int_qContext)_localctx).questionId = match(String);
			setState(278);
			match(BEING);
			setState(279);
			((Int_qContext)_localctx).questionPrompt = match(String);
			setState(280);
			match(WITH);
			setState(281);
			match(DIFFICULTY);
			setState(282);
			match(OF);
			setState(283);
			((Int_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(284);
			match(END_SATEMENT);
			setState(285);
			match(ITS_VALIDATION);
			setState(286);
			match(IS_DEFINED);
			setState(287);
			match(AS);
			setState(288);
			((Int_qContext)_localctx).questionCorrection = match(Decimal);
			setState(289);
			match(AWARDING);
			setState(290);
			((Int_qContext)_localctx).questionPoints = match(Decimal);
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
	public static class Real_qContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionCorrection;
		public Token questionPoints;
		public TerminalNode REAL_NUMBER() { return getToken(LabeledExprParser.REAL_NUMBER, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(LabeledExprParser.OF, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public TerminalNode Real() { return getToken(LabeledExprParser.Real, 0); }
		public Real_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterReal_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitReal_q(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitReal_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_qContext real_q() throws RecognitionException {
		Real_qContext _localctx = new Real_qContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_real_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(REAL_NUMBER);
			setState(293);
			match(QUESTION);
			setState(294);
			match(WITH);
			setState(295);
			match(ID);
			setState(296);
			((Real_qContext)_localctx).questionId = match(String);
			setState(297);
			match(BEING);
			setState(298);
			((Real_qContext)_localctx).questionPrompt = match(String);
			setState(299);
			match(WITH);
			setState(300);
			match(DIFFICULTY);
			setState(301);
			match(OF);
			setState(302);
			((Real_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(303);
			match(END_SATEMENT);
			setState(304);
			match(ITS_VALIDATION);
			setState(305);
			match(IS_DEFINED);
			setState(306);
			match(AS);
			setState(307);
			((Real_qContext)_localctx).questionCorrection = match(Real);
			setState(308);
			match(AWARDING);
			setState(309);
			((Real_qContext)_localctx).questionPoints = match(Decimal);
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
	public static class Date_qContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionCorrection;
		public Token format;
		public Token questionPoints;
		public TerminalNode DATE() { return getToken(LabeledExprParser.DATE, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public List<TerminalNode> OF() { return getTokens(LabeledExprParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(LabeledExprParser.OF, i);
		}
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(LabeledExprParser.TYPE, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public Date_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDate_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDate_q(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDate_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_qContext date_q() throws RecognitionException {
		Date_qContext _localctx = new Date_qContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_date_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(DATE);
			setState(312);
			match(QUESTION);
			setState(313);
			match(WITH);
			setState(314);
			match(ID);
			setState(315);
			((Date_qContext)_localctx).questionId = match(String);
			setState(316);
			match(BEING);
			setState(317);
			((Date_qContext)_localctx).questionPrompt = match(String);
			setState(318);
			match(WITH);
			setState(319);
			match(DIFFICULTY);
			setState(320);
			match(OF);
			setState(321);
			((Date_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(322);
			match(END_SATEMENT);
			setState(323);
			match(ITS_VALIDATION);
			setState(324);
			match(IS_DEFINED);
			setState(325);
			match(AS);
			setState(326);
			((Date_qContext)_localctx).questionCorrection = match(String);
			setState(327);
			match(OF);
			setState(328);
			match(TYPE);
			setState(329);
			((Date_qContext)_localctx).format = match(String);
			setState(330);
			match(AWARDING);
			setState(331);
			((Date_qContext)_localctx).questionPoints = match(Decimal);
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
	public static class Time_qContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionCorrection;
		public Token format;
		public Token questionPoints;
		public TerminalNode TIME() { return getToken(LabeledExprParser.TIME, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public List<TerminalNode> OF() { return getTokens(LabeledExprParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(LabeledExprParser.OF, i);
		}
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(LabeledExprParser.TYPE, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public Time_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterTime_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitTime_q(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitTime_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_qContext time_q() throws RecognitionException {
		Time_qContext _localctx = new Time_qContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_time_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(TIME);
			setState(334);
			match(QUESTION);
			setState(335);
			match(WITH);
			setState(336);
			match(ID);
			setState(337);
			((Time_qContext)_localctx).questionId = match(String);
			setState(338);
			match(BEING);
			setState(339);
			((Time_qContext)_localctx).questionPrompt = match(String);
			setState(340);
			match(WITH);
			setState(341);
			match(DIFFICULTY);
			setState(342);
			match(OF);
			setState(343);
			((Time_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(344);
			match(END_SATEMENT);
			setState(345);
			match(ITS_VALIDATION);
			setState(346);
			match(IS_DEFINED);
			setState(347);
			match(AS);
			setState(348);
			((Time_qContext)_localctx).questionCorrection = match(String);
			setState(349);
			match(OF);
			setState(350);
			match(TYPE);
			setState(351);
			((Time_qContext)_localctx).format = match(String);
			setState(352);
			match(AWARDING);
			setState(353);
			((Time_qContext)_localctx).questionPoints = match(Decimal);
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
	public static class Scale_qContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionCorrection;
		public Token lowerBound;
		public Token higherBound;
		public Token questionPoints;
		public TerminalNode SCALE() { return getToken(LabeledExprParser.SCALE, 0); }
		public TerminalNode QUESTION() { return getToken(LabeledExprParser.QUESTION, 0); }
		public List<TerminalNode> WITH() { return getTokens(LabeledExprParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(LabeledExprParser.WITH, i);
		}
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode BEING() { return getToken(LabeledExprParser.BEING, 0); }
		public TerminalNode DIFFICULTY() { return getToken(LabeledExprParser.DIFFICULTY, 0); }
		public TerminalNode OF() { return getToken(LabeledExprParser.OF, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public TerminalNode ITS_VALIDATION() { return getToken(LabeledExprParser.ITS_VALIDATION, 0); }
		public TerminalNode IS_DEFINED() { return getToken(LabeledExprParser.IS_DEFINED, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(LabeledExprParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(LabeledExprParser.AND, 0); }
		public TerminalNode AWARDING() { return getToken(LabeledExprParser.AWARDING, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(LabeledExprParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(LabeledExprParser.Decimal, i);
		}
		public Scale_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterScale_q(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitScale_q(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitScale_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale_qContext scale_q() throws RecognitionException {
		Scale_qContext _localctx = new Scale_qContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scale_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(SCALE);
			setState(356);
			match(QUESTION);
			setState(357);
			match(WITH);
			setState(358);
			match(ID);
			setState(359);
			((Scale_qContext)_localctx).questionId = match(String);
			setState(360);
			match(BEING);
			setState(361);
			((Scale_qContext)_localctx).questionPrompt = match(String);
			setState(362);
			match(WITH);
			setState(363);
			match(DIFFICULTY);
			setState(364);
			match(OF);
			setState(365);
			((Scale_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(366);
			match(END_SATEMENT);
			setState(367);
			match(ITS_VALIDATION);
			setState(368);
			match(IS_DEFINED);
			setState(369);
			match(AS);
			setState(370);
			((Scale_qContext)_localctx).questionCorrection = match(Decimal);
			setState(371);
			match(BETWEEN);
			setState(372);
			((Scale_qContext)_localctx).lowerBound = match(Decimal);
			setState(373);
			match(AND);
			setState(374);
			((Scale_qContext)_localctx).higherBound = match(Decimal);
			setState(375);
			match(AWARDING);
			setState(376);
			((Scale_qContext)_localctx).questionPoints = match(Decimal);
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
		public Token interviewName;
		public Token jobOpeningReference;
		public TerminalNode CREATE() { return getToken(LabeledExprParser.CREATE, 0); }
		public TerminalNode INTERVIEW_MODEL() { return getToken(LabeledExprParser.INTERVIEW_MODEL, 0); }
		public TerminalNode FOR_JOB() { return getToken(LabeledExprParser.FOR_JOB, 0); }
		public TerminalNode AS() { return getToken(LabeledExprParser.AS, 0); }
		public TerminalNode FOLLOWS() { return getToken(LabeledExprParser.FOLLOWS, 0); }
		public TerminalNode END_SATEMENT() { return getToken(LabeledExprParser.END_SATEMENT, 0); }
		public List<TerminalNode> String() { return getTokens(LabeledExprParser.String); }
		public TerminalNode String(int i) {
			return getToken(LabeledExprParser.String, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(CREATE);
			setState(379);
			match(INTERVIEW_MODEL);
			setState(380);
			((HeaderContext)_localctx).interviewName = match(String);
			setState(381);
			match(FOR_JOB);
			setState(382);
			((HeaderContext)_localctx).jobOpeningReference = match(String);
			setState(383);
			match(AS);
			setState(384);
			match(FOLLOWS);
			setState(385);
			match(END_SATEMENT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return arr_sempred((ArrContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arr_sempred(ArrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u0184\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0003\u00009\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003Q\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\\\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\bl\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0003\nw\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008e\b\u000b\n\u000b\f\u000b"+
		"\u0091\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u009b\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00a7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00e6\b\u0011\u000b\u0011"+
		"\f\u0011\u00e7\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00ff\b\u0012"+
		"\u000b\u0012\f\u0012\u0100\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u0108\b\u0013\u000b\u0013\f\u0013\u0109\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0001\u0016\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0003\u0001"+
		"\u0000\b\t\u0002\u0000\u001b\u001b**\u0001\u0000\n\u000b\u017e\u00006"+
		"\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0004D\u0001\u0000"+
		"\u0000\u0000\u0006P\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000\u0000"+
		"\nV\u0001\u0000\u0000\u0000\f]\u0001\u0000\u0000\u0000\u000ec\u0001\u0000"+
		"\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000"+
		"\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0087\u0001\u0000\u0000\u0000"+
		"\u0018\u0092\u0001\u0000\u0000\u0000\u001a\u009a\u0001\u0000\u0000\u0000"+
		"\u001c\u009c\u0001\u0000\u0000\u0000\u001e\u00aa\u0001\u0000\u0000\u0000"+
		" \u00bd\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00ec"+
		"\u0001\u0000\u0000\u0000&\u0105\u0001\u0000\u0000\u0000(\u010b\u0001\u0000"+
		"\u0000\u0000*\u0111\u0001\u0000\u0000\u0000,\u0124\u0001\u0000\u0000\u0000"+
		".\u0137\u0001\u0000\u0000\u00000\u014d\u0001\u0000\u0000\u00002\u0163"+
		"\u0001\u0000\u0000\u00004\u017a\u0001\u0000\u0000\u000068\u00034\u001a"+
		"\u000079\u0003\u000e\u0007\u000087\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0003\u0018\f\u0000;<\u0003\u0002"+
		"\u0001\u0000<\u0001\u0001\u0000\u0000\u0000=>\u0005-\u0000\u0000>?\u0005"+
		"\u000e\u0000\u0000?@\u0003\n\u0005\u0000@A\u00050\u0000\u0000AB\u0003"+
		"\u0004\u0002\u0000BC\u00050\u0000\u0000C\u0003\u0001\u0000\u0000\u0000"+
		"DE\u0005\u000f\u0000\u0000EF\u0005)\u0000\u0000FG\u0005\u0019\u0000\u0000"+
		"GH\u0005\u001f\u0000\u0000HI\u0003\u0006\u0003\u0000IJ\u0005\'\u0000\u0000"+
		"J\u0005\u0001\u0000\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005.\u0000\u0000"+
		"MN\u0003\u0006\u0003\u0000NQ\u0001\u0000\u0000\u0000OQ\u0003\b\u0004\u0000"+
		"PK\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0007\u0001\u0000"+
		"\u0000\u0000RT\u00054\u0000\u0000SU\u00055\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u0012"+
		"\u0000\u0000WX\u0005(\u0000\u0000XY\u0005$\u0000\u0000Y[\u00052\u0000"+
		"\u0000Z\\\u0003\f\u0006\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0005.\u0000\u0000^_\u0005"+
		"&\u0000\u0000_`\u0005(\u0000\u0000`a\u0005$\u0000\u0000ab\u00052\u0000"+
		"\u0000b\r\u0001\u0000\u0000\u0000cd\u0005-\u0000\u0000de\u0005\u0010\u0000"+
		"\u0000ef\u0003\u0010\b\u0000f\u000f\u0001\u0000\u0000\u0000gh\u0003\u0012"+
		"\t\u0000hi\u0003\u0010\b\u0000il\u0001\u0000\u0000\u0000jl\u0003\u0012"+
		"\t\u0000kg\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0011\u0001"+
		"\u0000\u0000\u0000mn\u0005/\u0000\u0000no\u00051\u0000\u0000op\u0005\u0015"+
		"\u0000\u0000pq\u0003\u0014\n\u0000qr\u00050\u0000\u0000r\u0013\u0001\u0000"+
		"\u0000\u0000sv\u0005\u0001\u0000\u0000tu\u0005#\u0000\u0000uw\u00051\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0086\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0002\u0000\u0000yz\u0005#\u0000\u0000z\u0086"+
		"\u00052\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005#\u0000\u0000}~\u0005"+
		"\u0004\u0000\u0000~\u007f\u0005\u0005\u0000\u0000\u007f\u0080\u0003\u0016"+
		"\u000b\u0000\u0080\u0081\u0005\u0006\u0000\u0000\u0081\u0086\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083\u0084\u0005#\u0000"+
		"\u0000\u0084\u0086\u0007\u0000\u0000\u0000\u0085s\u0001\u0000\u0000\u0000"+
		"\u0085x\u0001\u0000\u0000\u0000\u0085{\u0001\u0000\u0000\u0000\u0085\u0082"+
		"\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0006\u000b\uffff\uffff\u0000\u0088\u0089\u00051\u0000\u0000\u0089\u008f"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\n\u0002\u0000\u0000\u008b\u008c\u0005"+
		".\u0000\u0000\u008c\u008e\u00051\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0017\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005-\u0000\u0000"+
		"\u0093\u0094\u0005\u000f\u0000\u0000\u0094\u0095\u0003\u001a\r\u0000\u0095"+
		"\u0019\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u001c\u000e\u0000\u0097"+
		"\u0098\u0003\u001a\r\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0003\u001c\u000e\u0000\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u001b\u0001\u0000\u0000\u0000\u009c\u00a6"+
		"\u0005/\u0000\u0000\u009d\u00a7\u0003\u001e\u000f\u0000\u009e\u00a7\u0003"+
		" \u0010\u0000\u009f\u00a7\u0003\"\u0011\u0000\u00a0\u00a7\u0003$\u0012"+
		"\u0000\u00a1\u00a7\u0003*\u0015\u0000\u00a2\u00a7\u0003,\u0016\u0000\u00a3"+
		"\u00a7\u0003.\u0017\u0000\u00a4\u00a7\u00030\u0018\u0000\u00a5\u00a7\u0003"+
		"2\u0019\u0000\u00a6\u009d\u0001\u0000\u0000\u0000\u00a6\u009e\u0001\u0000"+
		"\u0000\u0000\u00a6\u009f\u0001\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a1\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9\u001d\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u00058\u0000\u0000\u00ab\u00ac\u0005\u0013\u0000\u0000"+
		"\u00ac\u00ad\u0005,\u0000\u0000\u00ad\u00ae\u0005A\u0000\u0000\u00ae\u00af"+
		"\u00051\u0000\u0000\u00af\u00b0\u0005\u0017\u0000\u0000\u00b0\u00b1\u0005"+
		"1\u0000\u0000\u00b1\u00b2\u0005,\u0000\u0000\u00b2\u00b3\u0005\u001a\u0000"+
		"\u0000\u00b3\u00b4\u0005%\u0000\u0000\u00b4\u00b5\u00052\u0000\u0000\u00b5"+
		"\u00b6\u00050\u0000\u0000\u00b6\u00b7\u0005\"\u0000\u0000\u00b7\u00b8"+
		"\u0005!\u0000\u0000\u00b8\u00b9\u0005\u0015\u0000\u0000\u00b9\u00ba\u0007"+
		"\u0001\u0000\u0000\u00ba\u00bb\u0005\u0016\u0000\u0000\u00bb\u00bc\u0005"+
		"2\u0000\u0000\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd\u00be\u00059\u0000"+
		"\u0000\u00be\u00bf\u0005\u0013\u0000\u0000\u00bf\u00c0\u0005,\u0000\u0000"+
		"\u00c0\u00c1\u0005A\u0000\u0000\u00c1\u00c2\u00051\u0000\u0000\u00c2\u00c3"+
		"\u0005\u0017\u0000\u0000\u00c3\u00c4\u00051\u0000\u0000\u00c4\u00c5\u0005"+
		",\u0000\u0000\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c7\u0005%\u0000"+
		"\u0000\u00c7\u00c8\u00052\u0000\u0000\u00c8\u00c9\u00050\u0000\u0000\u00c9"+
		"\u00ca\u0005\"\u0000\u0000\u00ca\u00cb\u0005!\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0015\u0000\u0000\u00cc\u00cd\u00051\u0000\u0000\u00cd\u00ce\u0005"+
		"%\u0000\u0000\u00ce\u00cf\u0005+\u0000\u0000\u00cf\u00d0\u0007\u0002\u0000"+
		"\u0000\u00d0\u00d1\u0005\u0016\u0000\u0000\u00d1\u00d2\u00052\u0000\u0000"+
		"\u00d2!\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005:\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0013\u0000\u0000\u00d5\u00d6\u0005,\u0000\u0000\u00d6\u00d7\u0005"+
		"A\u0000\u0000\u00d7\u00d8\u00051\u0000\u0000\u00d8\u00d9\u0005\u0017\u0000"+
		"\u0000\u00d9\u00da\u00051\u0000\u0000\u00da\u00db\u0005,\u0000\u0000\u00db"+
		"\u00dc\u0005\u001a\u0000\u0000\u00dc\u00dd\u0005%\u0000\u0000\u00dd\u00de"+
		"\u00052\u0000\u0000\u00de\u00df\u00050\u0000\u0000\u00df\u00e0\u0005\""+
		"\u0000\u0000\u00e0\u00e1\u0005!\u0000\u0000\u00e1\u00e2\u0005\u0015\u0000"+
		"\u0000\u00e2\u00e3\u00051\u0000\u0000\u00e3\u00e5\u0005\u001e\u0000\u0000"+
		"\u00e4\u00e6\u00051\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005\u0016\u0000\u0000\u00ea\u00eb\u00052\u0000\u0000\u00eb#\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005;\u0000\u0000\u00ed\u00ee\u0005\u0013"+
		"\u0000\u0000\u00ee\u00ef\u0005,\u0000\u0000\u00ef\u00f0\u0005A\u0000\u0000"+
		"\u00f0\u00f1\u00051\u0000\u0000\u00f1\u00f2\u0005\u0017\u0000\u0000\u00f2"+
		"\u00f3\u00051\u0000\u0000\u00f3\u00f4\u0005,\u0000\u0000\u00f4\u00f5\u0005"+
		"\u001a\u0000\u0000\u00f5\u00f6\u0005%\u0000\u0000\u00f6\u00f7\u00052\u0000"+
		"\u0000\u00f7\u00f8\u00050\u0000\u0000\u00f8\u00f9\u0005\"\u0000\u0000"+
		"\u00f9\u00fa\u0005!\u0000\u0000\u00fa\u00fb\u0005\u0015\u0000\u0000\u00fb"+
		"\u00fc\u0003&\u0013\u0000\u00fc\u00fe\u0005\u001e\u0000\u0000\u00fd\u00ff"+
		"\u00051\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005"+
		"\u0016\u0000\u0000\u0103\u0104\u00052\u0000\u0000\u0104%\u0001\u0000\u0000"+
		"\u0000\u0105\u0107\u0003(\u0014\u0000\u0106\u0108\u0003(\u0014\u0000\u0107"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\'\u0001\u0000\u0000\u0000\u010b\u010c\u0005\f\u0000\u0000\u010c\u010d"+
		"\u00051\u0000\u0000\u010d\u010e\u0005.\u0000\u0000\u010e\u010f\u00052"+
		"\u0000\u0000\u010f\u0110\u0005\r\u0000\u0000\u0110)\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005<\u0000\u0000\u0112\u0113\u0005\u0013\u0000\u0000"+
		"\u0113\u0114\u0005,\u0000\u0000\u0114\u0115\u0005A\u0000\u0000\u0115\u0116"+
		"\u00051\u0000\u0000\u0116\u0117\u0005\u0017\u0000\u0000\u0117\u0118\u0005"+
		"1\u0000\u0000\u0118\u0119\u0005,\u0000\u0000\u0119\u011a\u0005\u001a\u0000"+
		"\u0000\u011a\u011b\u0005%\u0000\u0000\u011b\u011c\u00052\u0000\u0000\u011c"+
		"\u011d\u00050\u0000\u0000\u011d\u011e\u0005\"\u0000\u0000\u011e\u011f"+
		"\u0005!\u0000\u0000\u011f\u0120\u0005\u0015\u0000\u0000\u0120\u0121\u0005"+
		"2\u0000\u0000\u0121\u0122\u0005\u0016\u0000\u0000\u0122\u0123\u00052\u0000"+
		"\u0000\u0123+\u0001\u0000\u0000\u0000\u0124\u0125\u0005=\u0000\u0000\u0125"+
		"\u0126\u0005\u0013\u0000\u0000\u0126\u0127\u0005,\u0000\u0000\u0127\u0128"+
		"\u0005A\u0000\u0000\u0128\u0129\u00051\u0000\u0000\u0129\u012a\u0005\u0017"+
		"\u0000\u0000\u012a\u012b\u00051\u0000\u0000\u012b\u012c\u0005,\u0000\u0000"+
		"\u012c\u012d\u0005\u001a\u0000\u0000\u012d\u012e\u0005%\u0000\u0000\u012e"+
		"\u012f\u00052\u0000\u0000\u012f\u0130\u00050\u0000\u0000\u0130\u0131\u0005"+
		"\"\u0000\u0000\u0131\u0132\u0005!\u0000\u0000\u0132\u0133\u0005\u0015"+
		"\u0000\u0000\u0133\u0134\u00053\u0000\u0000\u0134\u0135\u0005\u0016\u0000"+
		"\u0000\u0135\u0136\u00052\u0000\u0000\u0136-\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005>\u0000\u0000\u0138\u0139\u0005\u0013\u0000\u0000\u0139\u013a"+
		"\u0005,\u0000\u0000\u013a\u013b\u0005A\u0000\u0000\u013b\u013c\u00051"+
		"\u0000\u0000\u013c\u013d\u0005\u0017\u0000\u0000\u013d\u013e\u00051\u0000"+
		"\u0000\u013e\u013f\u0005,\u0000\u0000\u013f\u0140\u0005\u001a\u0000\u0000"+
		"\u0140\u0141\u0005%\u0000\u0000\u0141\u0142\u00052\u0000\u0000\u0142\u0143"+
		"\u00050\u0000\u0000\u0143\u0144\u0005\"\u0000\u0000\u0144\u0145\u0005"+
		"!\u0000\u0000\u0145\u0146\u0005\u0015\u0000\u0000\u0146\u0147\u00051\u0000"+
		"\u0000\u0147\u0148\u0005%\u0000\u0000\u0148\u0149\u0005+\u0000\u0000\u0149"+
		"\u014a\u00051\u0000\u0000\u014a\u014b\u0005\u0016\u0000\u0000\u014b\u014c"+
		"\u00052\u0000\u0000\u014c/\u0001\u0000\u0000\u0000\u014d\u014e\u0005?"+
		"\u0000\u0000\u014e\u014f\u0005\u0013\u0000\u0000\u014f\u0150\u0005,\u0000"+
		"\u0000\u0150\u0151\u0005A\u0000\u0000\u0151\u0152\u00051\u0000\u0000\u0152"+
		"\u0153\u0005\u0017\u0000\u0000\u0153\u0154\u00051\u0000\u0000\u0154\u0155"+
		"\u0005,\u0000\u0000\u0155\u0156\u0005\u001a\u0000\u0000\u0156\u0157\u0005"+
		"%\u0000\u0000\u0157\u0158\u00052\u0000\u0000\u0158\u0159\u00050\u0000"+
		"\u0000\u0159\u015a\u0005\"\u0000\u0000\u015a\u015b\u0005!\u0000\u0000"+
		"\u015b\u015c\u0005\u0015\u0000\u0000\u015c\u015d\u00051\u0000\u0000\u015d"+
		"\u015e\u0005%\u0000\u0000\u015e\u015f\u0005+\u0000\u0000\u015f\u0160\u0005"+
		"1\u0000\u0000\u0160\u0161\u0005\u0016\u0000\u0000\u0161\u0162\u00052\u0000"+
		"\u0000\u01621\u0001\u0000\u0000\u0000\u0163\u0164\u0005@\u0000\u0000\u0164"+
		"\u0165\u0005\u0013\u0000\u0000\u0165\u0166\u0005,\u0000\u0000\u0166\u0167"+
		"\u0005A\u0000\u0000\u0167\u0168\u00051\u0000\u0000\u0168\u0169\u0005\u0017"+
		"\u0000\u0000\u0169\u016a\u00051\u0000\u0000\u016a\u016b\u0005,\u0000\u0000"+
		"\u016b\u016c\u0005\u001a\u0000\u0000\u016c\u016d\u0005%\u0000\u0000\u016d"+
		"\u016e\u00052\u0000\u0000\u016e\u016f\u00050\u0000\u0000\u016f\u0170\u0005"+
		"\"\u0000\u0000\u0170\u0171\u0005!\u0000\u0000\u0171\u0172\u0005\u0015"+
		"\u0000\u0000\u0172\u0173\u00052\u0000\u0000\u0173\u0174\u0005\u0018\u0000"+
		"\u0000\u0174\u0175\u00052\u0000\u0000\u0175\u0176\u0005\u0014\u0000\u0000"+
		"\u0176\u0177\u00052\u0000\u0000\u0177\u0178\u0005\u0016\u0000\u0000\u0178"+
		"\u0179\u00052\u0000\u0000\u01793\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"\u0011\u0000\u0000\u017b\u017c\u0005 \u0000\u0000\u017c\u017d\u00051\u0000"+
		"\u0000\u017d\u017e\u0005\u001d\u0000\u0000\u017e\u017f\u00051\u0000\u0000"+
		"\u017f\u0180\u0005\u0015\u0000\u0000\u0180\u0181\u0005\u001c\u0000\u0000"+
		"\u0181\u0182\u00050\u0000\u0000\u01825\u0001\u0000\u0000\u0000\r8PT[k"+
		"v\u0085\u008f\u009a\u00a6\u00e7\u0100\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}