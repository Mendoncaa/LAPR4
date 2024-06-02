// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
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
public class InterviewQuestionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TEXT=16, NUMBER=17, 
		RANGE=18, END=19, WS=20;
	public static final int
		RULE_interview = 0, RULE_question = 1, RULE_trueFalseQuestion = 2, RULE_shortTextQuestion = 3, 
		RULE_singleChoiceQuestion = 4, RULE_multipleChoiceQuestion = 5, RULE_integerQuestion = 6, 
		RULE_decimalQuestion = 7, RULE_dateQuestion = 8, RULE_timeQuestion = 9, 
		RULE_numericScaleQuestion = 10, RULE_text = 11, RULE_weight = 12, RULE_choice = 13, 
		RULE_scale = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"interview", "question", "trueFalseQuestion", "shortTextQuestion", "singleChoiceQuestion", 
			"multipleChoiceQuestion", "integerQuestion", "decimalQuestion", "dateQuestion", 
			"timeQuestion", "numericScaleQuestion", "text", "weight", "choice", "scale"
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
	public static class InterviewContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(InterviewQuestionsParser.END, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public InterviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterInterview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitInterview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitInterview(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterviewContext interview() throws RecognitionException {
		InterviewContext _localctx = new InterviewContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_interview);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				question();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(35);
			match(END);
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
	public static class QuestionContext extends ParserRuleContext {
		public TrueFalseQuestionContext trueFalseQuestion() {
			return getRuleContext(TrueFalseQuestionContext.class,0);
		}
		public ShortTextQuestionContext shortTextQuestion() {
			return getRuleContext(ShortTextQuestionContext.class,0);
		}
		public SingleChoiceQuestionContext singleChoiceQuestion() {
			return getRuleContext(SingleChoiceQuestionContext.class,0);
		}
		public MultipleChoiceQuestionContext multipleChoiceQuestion() {
			return getRuleContext(MultipleChoiceQuestionContext.class,0);
		}
		public IntegerQuestionContext integerQuestion() {
			return getRuleContext(IntegerQuestionContext.class,0);
		}
		public DecimalQuestionContext decimalQuestion() {
			return getRuleContext(DecimalQuestionContext.class,0);
		}
		public DateQuestionContext dateQuestion() {
			return getRuleContext(DateQuestionContext.class,0);
		}
		public TimeQuestionContext timeQuestion() {
			return getRuleContext(TimeQuestionContext.class,0);
		}
		public NumericScaleQuestionContext numericScaleQuestion() {
			return getRuleContext(NumericScaleQuestionContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_question);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				trueFalseQuestion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				shortTextQuestion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				singleChoiceQuestion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				multipleChoiceQuestion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				integerQuestion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				decimalQuestion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				dateQuestion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(44);
				timeQuestion();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(45);
				numericScaleQuestion();
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
	public static class TrueFalseQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public TrueFalseQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			text();
			setState(50);
			match(T__1);
			setState(51);
			match(T__2);
			setState(52);
			weight();
			setState(53);
			match(T__3);
			setState(54);
			match(T__4);
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
	public static class ShortTextQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public ShortTextQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortTextQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterShortTextQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitShortTextQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitShortTextQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortTextQuestionContext shortTextQuestion() throws RecognitionException {
		ShortTextQuestionContext _localctx = new ShortTextQuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shortTextQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			text();
			setState(58);
			match(T__5);
			setState(59);
			match(T__2);
			setState(60);
			weight();
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
	public static class SingleChoiceQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public SingleChoiceQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleChoiceQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterSingleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitSingleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitSingleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleChoiceQuestionContext singleChoiceQuestion() throws RecognitionException {
		SingleChoiceQuestionContext _localctx = new SingleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleChoiceQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			text();
			setState(64);
			match(T__6);
			setState(65);
			match(T__2);
			setState(66);
			weight();
			setState(67);
			match(T__3);
			setState(68);
			choice();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(69);
				match(T__7);
				setState(70);
				choice();
				}
				}
				setState(75);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleChoiceQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public MultipleChoiceQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterMultipleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitMultipleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitMultipleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestionContext multipleChoiceQuestion() throws RecognitionException {
		MultipleChoiceQuestionContext _localctx = new MultipleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleChoiceQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			text();
			setState(78);
			match(T__8);
			setState(79);
			match(T__2);
			setState(80);
			weight();
			setState(81);
			match(T__3);
			setState(82);
			choice();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(83);
				match(T__7);
				setState(84);
				choice();
				}
				}
				setState(89);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IntegerQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public IntegerQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterIntegerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitIntegerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitIntegerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerQuestionContext integerQuestion() throws RecognitionException {
		IntegerQuestionContext _localctx = new IntegerQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__0);
			setState(91);
			text();
			setState(92);
			match(T__9);
			setState(93);
			match(T__2);
			setState(94);
			weight();
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
	public static class DecimalQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public DecimalQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterDecimalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitDecimalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDecimalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalQuestionContext decimalQuestion() throws RecognitionException {
		DecimalQuestionContext _localctx = new DecimalQuestionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
			text();
			setState(98);
			match(T__10);
			setState(99);
			match(T__2);
			setState(100);
			weight();
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
	public static class DateQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public DateQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterDateQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitDateQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDateQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateQuestionContext dateQuestion() throws RecognitionException {
		DateQuestionContext _localctx = new DateQuestionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dateQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__0);
			setState(103);
			text();
			setState(104);
			match(T__11);
			setState(105);
			match(T__2);
			setState(106);
			weight();
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
	public static class TimeQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public TimeQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterTimeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitTimeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTimeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeQuestionContext timeQuestion() throws RecognitionException {
		TimeQuestionContext _localctx = new TimeQuestionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timeQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__0);
			setState(109);
			text();
			setState(110);
			match(T__12);
			setState(111);
			match(T__2);
			setState(112);
			weight();
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
	public static class NumericScaleQuestionContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public NumericScaleQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericScaleQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterNumericScaleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitNumericScaleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitNumericScaleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericScaleQuestionContext numericScaleQuestion() throws RecognitionException {
		NumericScaleQuestionContext _localctx = new NumericScaleQuestionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numericScaleQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			setState(115);
			text();
			setState(116);
			match(T__13);
			setState(117);
			match(T__2);
			setState(118);
			weight();
			setState(119);
			match(T__14);
			setState(120);
			scale();
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TEXT);
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
	public static class WeightContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterviewQuestionsParser.NUMBER, 0); }
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitWeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitWeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_weight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NUMBER);
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
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TEXT);
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
	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(InterviewQuestionsParser.RANGE, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(RANGE);
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
		"\u0004\u0001\u0014\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004"+
		"\u0000 \b\u0000\u000b\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004H\b\u0004\n\u0004\f\u0004"+
		"K\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005V\b\u0005"+
		"\n\u0005\f\u0005Y\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000"+
		"\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u0000\u0000~\u0000\u001f\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000"+
		"\u0000\b>\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fZ\u0001"+
		"\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000"+
		"\u0000\u0012l\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016"+
		"z\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a~\u0001"+
		"\u0000\u0000\u0000\u001c\u0080\u0001\u0000\u0000\u0000\u001e \u0003\u0002"+
		"\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0013\u0000\u0000$\u0001\u0001\u0000\u0000\u0000"+
		"%/\u0003\u0004\u0002\u0000&/\u0003\u0006\u0003\u0000\'/\u0003\b\u0004"+
		"\u0000(/\u0003\n\u0005\u0000)/\u0003\f\u0006\u0000*/\u0003\u000e\u0007"+
		"\u0000+/\u0003\u0010\b\u0000,/\u0003\u0012\t\u0000-/\u0003\u0014\n\u0000"+
		".%\u0001\u0000\u0000\u0000.&\u0001\u0000\u0000\u0000.\'\u0001\u0000\u0000"+
		"\u0000.(\u0001\u0000\u0000\u0000.)\u0001\u0000\u0000\u0000.*\u0001\u0000"+
		"\u0000\u0000.+\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000.-\u0001"+
		"\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u000001\u0005\u0001\u0000"+
		"\u000012\u0003\u0016\u000b\u000023\u0005\u0002\u0000\u000034\u0005\u0003"+
		"\u0000\u000045\u0003\u0018\f\u000056\u0005\u0004\u0000\u000067\u0005\u0005"+
		"\u0000\u00007\u0005\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u0000"+
		"9:\u0003\u0016\u000b\u0000:;\u0005\u0006\u0000\u0000;<\u0005\u0003\u0000"+
		"\u0000<=\u0003\u0018\f\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0001"+
		"\u0000\u0000?@\u0003\u0016\u000b\u0000@A\u0005\u0007\u0000\u0000AB\u0005"+
		"\u0003\u0000\u0000BC\u0003\u0018\f\u0000CD\u0005\u0004\u0000\u0000DI\u0003"+
		"\u001a\r\u0000EF\u0005\b\u0000\u0000FH\u0003\u001a\r\u0000GE\u0001\u0000"+
		"\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\t\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0001\u0000\u0000MN\u0003\u0016\u000b\u0000NO\u0005\t\u0000\u0000"+
		"OP\u0005\u0003\u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005\u0004\u0000\u0000"+
		"RW\u0003\u001a\r\u0000ST\u0005\b\u0000\u0000TV\u0003\u001a\r\u0000US\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000X\u000b\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0001\u0000\u0000[\\\u0003\u0016\u000b\u0000\\]\u0005"+
		"\n\u0000\u0000]^\u0005\u0003\u0000\u0000^_\u0003\u0018\f\u0000_\r\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0001\u0000\u0000ab\u0003\u0016\u000b\u0000"+
		"bc\u0005\u000b\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0003\u0018\f\u0000"+
		"e\u000f\u0001\u0000\u0000\u0000fg\u0005\u0001\u0000\u0000gh\u0003\u0016"+
		"\u000b\u0000hi\u0005\f\u0000\u0000ij\u0005\u0003\u0000\u0000jk\u0003\u0018"+
		"\f\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0005\u0001\u0000\u0000mn\u0003"+
		"\u0016\u000b\u0000no\u0005\r\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0003"+
		"\u0018\f\u0000q\u0013\u0001\u0000\u0000\u0000rs\u0005\u0001\u0000\u0000"+
		"st\u0003\u0016\u000b\u0000tu\u0005\u000e\u0000\u0000uv\u0005\u0003\u0000"+
		"\u0000vw\u0003\u0018\f\u0000wx\u0005\u000f\u0000\u0000xy\u0003\u001c\u000e"+
		"\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0005\u0010\u0000\u0000{\u0017"+
		"\u0001\u0000\u0000\u0000|}\u0005\u0011\u0000\u0000}\u0019\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u001b\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u001d\u0001\u0000\u0000"+
		"\u0000\u0004!.IW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}