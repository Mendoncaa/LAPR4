// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewAnswers.g4 by ANTLR 4.13.1
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
public class InterviewAnswersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TEXT=19, NUMBER=20, RANGE=21, DATE=22, TIME=23, END=24, WS=25;
	public static final int
		RULE_interview = 0, RULE_questionAnswer = 1, RULE_trueFalseAnswer = 2, 
		RULE_shortTextAnswer = 3, RULE_singleChoiceAnswer = 4, RULE_multipleChoiceAnswer = 5, 
		RULE_integerAnswer = 6, RULE_decimalAnswer = 7, RULE_dateAnswer = 8, RULE_timeAnswer = 9, 
		RULE_numericScaleAnswer = 10, RULE_text = 11, RULE_weight = 12, RULE_choice = 13, 
		RULE_scale = 14, RULE_answerTrueFalse = 15, RULE_answerShort = 16, RULE_answerSingle = 17, 
		RULE_answerMultiple = 18, RULE_answerInteger = 19, RULE_answerDecimal = 20, 
		RULE_answerDate = 21, RULE_answerTime = 22, RULE_answerScale = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"interview", "questionAnswer", "trueFalseAnswer", "shortTextAnswer", 
			"singleChoiceAnswer", "multipleChoiceAnswer", "integerAnswer", "decimalAnswer", 
			"dateAnswer", "timeAnswer", "numericScaleAnswer", "text", "weight", "choice", 
			"scale", "answerTrueFalse", "answerShort", "answerSingle", "answerMultiple", 
			"answerInteger", "answerDecimal", "answerDate", "answerTime", "answerScale"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Q:'", "'T/F'", "'W:'", "'Choices:'", "'True, False'", "'A:'", 
			"'Short'", "'Single'", "','", "'Multiple'", "'Integer'", "'Decimal'", 
			"'Date'", "'Time'", "'Scale'", "'Scale:'", "'True'", "'False'", null, 
			null, null, null, null, "'EndInterview'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "TEXT", "NUMBER", "RANGE", 
			"DATE", "TIME", "END", "WS"
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
	public String getGrammarFileName() { return "InterviewAnswers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InterviewAnswersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterviewContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(InterviewAnswersParser.END, 0); }
		public List<QuestionAnswerContext> questionAnswer() {
			return getRuleContexts(QuestionAnswerContext.class);
		}
		public QuestionAnswerContext questionAnswer(int i) {
			return getRuleContext(QuestionAnswerContext.class,i);
		}
		public InterviewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interview; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterInterview(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitInterview(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitInterview(this);
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				questionAnswer();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(53);
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
	public static class QuestionAnswerContext extends ParserRuleContext {
		public TrueFalseAnswerContext trueFalseAnswer() {
			return getRuleContext(TrueFalseAnswerContext.class,0);
		}
		public ShortTextAnswerContext shortTextAnswer() {
			return getRuleContext(ShortTextAnswerContext.class,0);
		}
		public SingleChoiceAnswerContext singleChoiceAnswer() {
			return getRuleContext(SingleChoiceAnswerContext.class,0);
		}
		public MultipleChoiceAnswerContext multipleChoiceAnswer() {
			return getRuleContext(MultipleChoiceAnswerContext.class,0);
		}
		public IntegerAnswerContext integerAnswer() {
			return getRuleContext(IntegerAnswerContext.class,0);
		}
		public DecimalAnswerContext decimalAnswer() {
			return getRuleContext(DecimalAnswerContext.class,0);
		}
		public DateAnswerContext dateAnswer() {
			return getRuleContext(DateAnswerContext.class,0);
		}
		public TimeAnswerContext timeAnswer() {
			return getRuleContext(TimeAnswerContext.class,0);
		}
		public NumericScaleAnswerContext numericScaleAnswer() {
			return getRuleContext(NumericScaleAnswerContext.class,0);
		}
		public QuestionAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterQuestionAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitQuestionAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitQuestionAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionAnswerContext questionAnswer() throws RecognitionException {
		QuestionAnswerContext _localctx = new QuestionAnswerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_questionAnswer);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				trueFalseAnswer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				shortTextAnswer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				singleChoiceAnswer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				multipleChoiceAnswer();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				integerAnswer();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				decimalAnswer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				dateAnswer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				timeAnswer();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				numericScaleAnswer();
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
	public static class TrueFalseAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public AnswerTrueFalseContext answerTrueFalse() {
			return getRuleContext(AnswerTrueFalseContext.class,0);
		}
		public TrueFalseAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterTrueFalseAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitTrueFalseAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitTrueFalseAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseAnswerContext trueFalseAnswer() throws RecognitionException {
		TrueFalseAnswerContext _localctx = new TrueFalseAnswerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trueFalseAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			text();
			setState(68);
			match(T__1);
			setState(69);
			match(T__2);
			setState(70);
			weight();
			setState(71);
			match(T__3);
			setState(72);
			match(T__4);
			setState(73);
			match(T__5);
			setState(74);
			answerTrueFalse();
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
	public static class ShortTextAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public AnswerShortContext answerShort() {
			return getRuleContext(AnswerShortContext.class,0);
		}
		public ShortTextAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortTextAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterShortTextAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitShortTextAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitShortTextAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortTextAnswerContext shortTextAnswer() throws RecognitionException {
		ShortTextAnswerContext _localctx = new ShortTextAnswerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shortTextAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			text();
			setState(78);
			match(T__6);
			setState(79);
			match(T__2);
			setState(80);
			weight();
			setState(81);
			match(T__5);
			setState(82);
			answerShort();
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
	public static class SingleChoiceAnswerContext extends ParserRuleContext {
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
		public AnswerSingleContext answerSingle() {
			return getRuleContext(AnswerSingleContext.class,0);
		}
		public SingleChoiceAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleChoiceAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterSingleChoiceAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitSingleChoiceAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitSingleChoiceAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleChoiceAnswerContext singleChoiceAnswer() throws RecognitionException {
		SingleChoiceAnswerContext _localctx = new SingleChoiceAnswerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleChoiceAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			text();
			setState(86);
			match(T__7);
			setState(87);
			match(T__2);
			setState(88);
			weight();
			setState(89);
			match(T__3);
			setState(90);
			choice();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(91);
				match(T__8);
				setState(92);
				choice();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__5);
			setState(99);
			answerSingle();
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
	public static class MultipleChoiceAnswerContext extends ParserRuleContext {
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
		public AnswerMultipleContext answerMultiple() {
			return getRuleContext(AnswerMultipleContext.class,0);
		}
		public MultipleChoiceAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterMultipleChoiceAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitMultipleChoiceAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitMultipleChoiceAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceAnswerContext multipleChoiceAnswer() throws RecognitionException {
		MultipleChoiceAnswerContext _localctx = new MultipleChoiceAnswerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multipleChoiceAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__0);
			setState(102);
			text();
			setState(103);
			match(T__9);
			setState(104);
			match(T__2);
			setState(105);
			weight();
			setState(106);
			match(T__3);
			setState(107);
			choice();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(108);
				match(T__8);
				setState(109);
				choice();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__5);
			setState(116);
			answerMultiple();
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
	public static class IntegerAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public AnswerIntegerContext answerInteger() {
			return getRuleContext(AnswerIntegerContext.class,0);
		}
		public IntegerAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterIntegerAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitIntegerAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitIntegerAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerAnswerContext integerAnswer() throws RecognitionException {
		IntegerAnswerContext _localctx = new IntegerAnswerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__0);
			setState(119);
			text();
			setState(120);
			match(T__10);
			setState(121);
			match(T__2);
			setState(122);
			weight();
			setState(123);
			match(T__5);
			setState(124);
			answerInteger();
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
	public static class DecimalAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public AnswerDecimalContext answerDecimal() {
			return getRuleContext(AnswerDecimalContext.class,0);
		}
		public DecimalAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterDecimalAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitDecimalAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitDecimalAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalAnswerContext decimalAnswer() throws RecognitionException {
		DecimalAnswerContext _localctx = new DecimalAnswerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decimalAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__0);
			setState(127);
			text();
			setState(128);
			match(T__11);
			setState(129);
			match(T__2);
			setState(130);
			weight();
			setState(131);
			match(T__5);
			setState(132);
			answerDecimal();
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
	public static class DateAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public AnswerDateContext answerDate() {
			return getRuleContext(AnswerDateContext.class,0);
		}
		public DateAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterDateAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitDateAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitDateAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateAnswerContext dateAnswer() throws RecognitionException {
		DateAnswerContext _localctx = new DateAnswerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dateAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__0);
			setState(135);
			text();
			setState(136);
			match(T__12);
			setState(137);
			match(T__2);
			setState(138);
			weight();
			setState(139);
			match(T__5);
			setState(140);
			answerDate();
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
	public static class TimeAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public AnswerTimeContext answerTime() {
			return getRuleContext(AnswerTimeContext.class,0);
		}
		public TimeAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterTimeAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitTimeAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitTimeAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeAnswerContext timeAnswer() throws RecognitionException {
		TimeAnswerContext _localctx = new TimeAnswerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timeAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__0);
			setState(143);
			text();
			setState(144);
			match(T__13);
			setState(145);
			match(T__2);
			setState(146);
			weight();
			setState(147);
			match(T__5);
			setState(148);
			answerTime();
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
	public static class NumericScaleAnswerContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public AnswerScaleContext answerScale() {
			return getRuleContext(AnswerScaleContext.class,0);
		}
		public NumericScaleAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericScaleAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterNumericScaleAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitNumericScaleAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitNumericScaleAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericScaleAnswerContext numericScaleAnswer() throws RecognitionException {
		NumericScaleAnswerContext _localctx = new NumericScaleAnswerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numericScaleAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__0);
			setState(151);
			text();
			setState(152);
			match(T__14);
			setState(153);
			match(T__2);
			setState(154);
			weight();
			setState(155);
			match(T__15);
			setState(156);
			scale();
			setState(157);
			match(T__5);
			setState(158);
			answerScale();
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
		public TerminalNode TEXT() { return getToken(InterviewAnswersParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		public TerminalNode NUMBER() { return getToken(InterviewAnswersParser.NUMBER, 0); }
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitWeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitWeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_weight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public TerminalNode TEXT() { return getToken(InterviewAnswersParser.TEXT, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
		public TerminalNode RANGE() { return getToken(InterviewAnswersParser.RANGE, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnswerTrueFalseContext extends ParserRuleContext {
		public AnswerTrueFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerTrueFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerTrueFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerTrueFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerTrueFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerTrueFalseContext answerTrueFalse() throws RecognitionException {
		AnswerTrueFalseContext _localctx = new AnswerTrueFalseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_answerTrueFalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class AnswerShortContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(InterviewAnswersParser.TEXT, 0); }
		public AnswerShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerShort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerShortContext answerShort() throws RecognitionException {
		AnswerShortContext _localctx = new AnswerShortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_answerShort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
	public static class AnswerSingleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(InterviewAnswersParser.TEXT, 0); }
		public AnswerSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerSingleContext answerSingle() throws RecognitionException {
		AnswerSingleContext _localctx = new AnswerSingleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_answerSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
	public static class AnswerMultipleContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(InterviewAnswersParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(InterviewAnswersParser.TEXT, i);
		}
		public AnswerMultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerMultiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerMultipleContext answerMultiple() throws RecognitionException {
		AnswerMultipleContext _localctx = new AnswerMultipleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_answerMultiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(TEXT);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(175);
				match(T__8);
				setState(176);
				match(TEXT);
				}
				}
				setState(181);
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
	public static class AnswerIntegerContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterviewAnswersParser.NUMBER, 0); }
		public AnswerIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerIntegerContext answerInteger() throws RecognitionException {
		AnswerIntegerContext _localctx = new AnswerIntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_answerInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
	public static class AnswerDecimalContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterviewAnswersParser.NUMBER, 0); }
		public AnswerDecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerDecimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerDecimalContext answerDecimal() throws RecognitionException {
		AnswerDecimalContext _localctx = new AnswerDecimalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_answerDecimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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
	public static class AnswerDateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(InterviewAnswersParser.DATE, 0); }
		public AnswerDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerDateContext answerDate() throws RecognitionException {
		AnswerDateContext _localctx = new AnswerDateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_answerDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(DATE);
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
	public static class AnswerTimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(InterviewAnswersParser.TIME, 0); }
		public AnswerTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerTimeContext answerTime() throws RecognitionException {
		AnswerTimeContext _localctx = new AnswerTimeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_answerTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(TIME);
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
	public static class AnswerScaleContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(InterviewAnswersParser.NUMBER, 0); }
		public AnswerScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerScale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).enterAnswerScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewAnswersListener ) ((InterviewAnswersListener)listener).exitAnswerScale(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswerScale(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerScaleContext answerScale() throws RecognitionException {
		AnswerScaleContext _localctx = new AnswerScaleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_answerScale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0004"+
		"\u00002\b\u0000\u000b\u0000\f\u00003\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004^\b\u0004\n\u0004\f\u0004a\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"o\b\u0005\n\u0005\f\u0005r\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00b2\b\u0012\n\u0012\f\u0012\u00b5\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.\u0000\u0001\u0001\u0000\u0011\u0012\u00b4\u0000"+
		"1\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004B\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000"+
		"\u0000\ne\u0001\u0000\u0000\u0000\fv\u0001\u0000\u0000\u0000\u000e~\u0001"+
		"\u0000\u0000\u0000\u0010\u0086\u0001\u0000\u0000\u0000\u0012\u008e\u0001"+
		"\u0000\u0000\u0000\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u00a0\u0001"+
		"\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00a4\u0001"+
		"\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00a8\u0001"+
		"\u0000\u0000\u0000 \u00aa\u0001\u0000\u0000\u0000\"\u00ac\u0001\u0000"+
		"\u0000\u0000$\u00ae\u0001\u0000\u0000\u0000&\u00b6\u0001\u0000\u0000\u0000"+
		"(\u00b8\u0001\u0000\u0000\u0000*\u00ba\u0001\u0000\u0000\u0000,\u00bc"+
		"\u0001\u0000\u0000\u0000.\u00be\u0001\u0000\u0000\u000002\u0003\u0002"+
		"\u0001\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0005\u0018\u0000\u00006\u0001\u0001\u0000\u0000\u00007A\u0003\u0004"+
		"\u0002\u00008A\u0003\u0006\u0003\u00009A\u0003\b\u0004\u0000:A\u0003\n"+
		"\u0005\u0000;A\u0003\f\u0006\u0000<A\u0003\u000e\u0007\u0000=A\u0003\u0010"+
		"\b\u0000>A\u0003\u0012\t\u0000?A\u0003\u0014\n\u0000@7\u0001\u0000\u0000"+
		"\u0000@8\u0001\u0000\u0000\u0000@9\u0001\u0000\u0000\u0000@:\u0001\u0000"+
		"\u0000\u0000@;\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001"+
		"\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000"+
		"A\u0003\u0001\u0000\u0000\u0000BC\u0005\u0001\u0000\u0000CD\u0003\u0016"+
		"\u000b\u0000DE\u0005\u0002\u0000\u0000EF\u0005\u0003\u0000\u0000FG\u0003"+
		"\u0018\f\u0000GH\u0005\u0004\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0005"+
		"\u0006\u0000\u0000JK\u0003\u001e\u000f\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0001\u0000\u0000MN\u0003\u0016\u000b\u0000NO\u0005\u0007"+
		"\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0003\u0018\f\u0000QR\u0005\u0006"+
		"\u0000\u0000RS\u0003 \u0010\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0005"+
		"\u0001\u0000\u0000UV\u0003\u0016\u000b\u0000VW\u0005\b\u0000\u0000WX\u0005"+
		"\u0003\u0000\u0000XY\u0003\u0018\f\u0000YZ\u0005\u0004\u0000\u0000Z_\u0003"+
		"\u001a\r\u0000[\\\u0005\t\u0000\u0000\\^\u0003\u001a\r\u0000][\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0006\u0000\u0000cd\u0003\"\u0011\u0000d\t\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0001\u0000\u0000fg\u0003\u0016\u000b\u0000gh\u0005\n\u0000"+
		"\u0000hi\u0005\u0003\u0000\u0000ij\u0003\u0018\f\u0000jk\u0005\u0004\u0000"+
		"\u0000kp\u0003\u001a\r\u0000lm\u0005\t\u0000\u0000mo\u0003\u001a\r\u0000"+
		"nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0005\u0006\u0000\u0000tu\u0003$\u0012\u0000u\u000b\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0001\u0000\u0000wx\u0003\u0016\u000b\u0000"+
		"xy\u0005\u000b\u0000\u0000yz\u0005\u0003\u0000\u0000z{\u0003\u0018\f\u0000"+
		"{|\u0005\u0006\u0000\u0000|}\u0003&\u0013\u0000}\r\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0001\u0000\u0000\u007f\u0080\u0003\u0016\u000b\u0000\u0080"+
		"\u0081\u0005\f\u0000\u0000\u0081\u0082\u0005\u0003\u0000\u0000\u0082\u0083"+
		"\u0003\u0018\f\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085\u0003"+
		"(\u0014\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0001"+
		"\u0000\u0000\u0087\u0088\u0003\u0016\u000b\u0000\u0088\u0089\u0005\r\u0000"+
		"\u0000\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0003\u0018\f\u0000"+
		"\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008d\u0003*\u0015\u0000\u008d"+
		"\u0011\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0001\u0000\u0000\u008f"+
		"\u0090\u0003\u0016\u000b\u0000\u0090\u0091\u0005\u000e\u0000\u0000\u0091"+
		"\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0003\u0018\f\u0000\u0093\u0094"+
		"\u0005\u0006\u0000\u0000\u0094\u0095\u0003,\u0016\u0000\u0095\u0013\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097\u0098\u0003"+
		"\u0016\u000b\u0000\u0098\u0099\u0005\u000f\u0000\u0000\u0099\u009a\u0005"+
		"\u0003\u0000\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009c\u0005\u0010"+
		"\u0000\u0000\u009c\u009d\u0003\u001c\u000e\u0000\u009d\u009e\u0005\u0006"+
		"\u0000\u0000\u009e\u009f\u0003.\u0017\u0000\u009f\u0015\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u0017\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0014\u0000\u0000\u00a3\u0019\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0013\u0000\u0000\u00a5\u001b\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u001d\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0007\u0000\u0000\u0000\u00a9\u001f\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0013\u0000\u0000\u00ab!\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0013\u0000\u0000\u00ad#\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b3\u0005\u0013\u0000\u0000\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u00b2"+
		"\u0005\u0013\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4%\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u0014\u0000\u0000\u00b7\'\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u0014\u0000\u0000\u00b9)\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0016\u0000\u0000\u00bb+\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd-\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0014\u0000\u0000\u00bf/\u0001\u0000\u0000\u0000\u00053@"+
		"_p\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}