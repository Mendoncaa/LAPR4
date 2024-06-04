// Generated from /Users/mendonca/PROJETO_LAPR4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
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
		BEGIN_SECTION=1, END_SECTION=2, HEADER_BEGIN=3, HEADER_END=4, QUESTION_BEGIN=5, 
		QUESTION_END=6, SINGLE_QUESTION_BEGIN=7, SINGLE_QUESTION_END=8, CHOICE_QUESTION_BEGIN=9, 
		CHOICE_QUESTION_END=10, MULTIPLE_CHOICE_QUESTION_BEGIN=11, MULTIPLE_CHOICE_QUESTION_END=12, 
		TRUE_FALSE_BEGIN=13, TRUE_FALSE_END=14, SHORT_TEXT_BEGIN=15, SHORT_TEXT_END=16, 
		CHOICE_OPTION_BEGIN=17, CHOICE_OPTION_END=18, INTEGER_ANSWER_BEGIN=19, 
		INTEGER_ANSWER_END=20, MULTIPLE_INTEGER_ANSWER_BEGIN=21, MULTIPLE_INTEGER_ANSWER_END=22, 
		DECIMAL_ANSWER_BEGIN=23, DECIMAL_ANSWER_END=24, DATE_ANSWER_BEGIN=25, 
		DATE_ANSWER_END=26, TIME_ANSWER_BEGIN=27, TIME_ANSWER_END=28, RANGE_QUESTION_BEGIN=29, 
		RANGE_QUESTION_END=30, RANGE_START_BEGIN=31, RANGE_START_END=32, RANGE_END_BEGIN=33, 
		RANGE_END_END=34, VALUE_BEGIN=35, VALUE_END=36, WS=37, BOOLEAN_VALUE=38, 
		DATE_FORMAT=39, TIME_FORMAT=40, INTEGER=41, DECIMAL=42, TEXT=43;
	public static final int
		RULE_interviewMod = 0, RULE_headerSec = 1, RULE_questionSec = 2, RULE_questionValue = 3, 
		RULE_singleQ = 4, RULE_answerSec = 5, RULE_choiceQ = 6, RULE_multiChoiceQ = 7, 
		RULE_rangeQ = 8, RULE_integerAnswer = 9, RULE_choiceIntAnswer = 10, RULE_multiIntAnswer = 11, 
		RULE_decimalAnswer = 12, RULE_dateAnswer = 13, RULE_timeAnswer = 14, RULE_choiceOption = 15, 
		RULE_trueFalseAnswer = 16, RULE_shortTextAnswer = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"interviewMod", "headerSec", "questionSec", "questionValue", "singleQ", 
			"answerSec", "choiceQ", "multiChoiceQ", "rangeQ", "integerAnswer", "choiceIntAnswer", 
			"multiIntAnswer", "decimalAnswer", "dateAnswer", "timeAnswer", "choiceOption", 
			"trueFalseAnswer", "shortTextAnswer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<BEGIN_SECTION>'", "'<END_SECTION>'", "'<HEADER_BEGIN>'", "'<HEADER_END>'", 
			"'<QUESTION_BEGIN>'", "'<QUESTION_END>'", "'<SINGLE_QUESTION_BEGIN>'", 
			"'<SINGLE_QUESTION_END>'", "'<CHOICE_QUESTION_BEGIN>'", "'<CHOICE_QUESTION_END>'", 
			"'<MULTIPLE_CHOICE_QUESTION_BEGIN>'", "'<MULTIPLE_CHOICE_QUESTION_END>'", 
			"'<TRUE_FALSE_BEGIN>'", "'<TRUE_FALSE_END>'", "'<SHORT_TEXT_BEGIN>'", 
			"'<SHORT_TEXT_END>'", "'<CHOICE_OPTION_BEGIN>'", "'<CHOICE_OPTION_END>'", 
			"'<INTEGER_ANSWER_BEGIN>'", "'<INTEGER_ANSWER_END>'", "'<MULTIPLE_INTEGER_ANSWER_BEGIN>'", 
			"'<MULTIPLE_INTEGER_ANSWER_END>'", "'<DECIMAL_ANSWER_BEGIN>'", "'<DECIMAL_ANSWER_END>'", 
			"'<DATE_ANSWER_BEGIN>'", "'<DATE_ANSWER_END>'", "'<TIME_ANSWER_BEGIN>'", 
			"'<TIME_ANSWER_END>'", "'<RANGE_QUESTION_BEGIN>'", "'<RANGE_QUESTION_END>'", 
			"'<RANGE_START_BEGIN>'", "'<RANGE_START_END>'", "'<RANGE_END_BEGIN>'", 
			"'<RANGE_END_END>'", "'<VALUE_BEGIN>'", "'<VALUE_END>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BEGIN_SECTION", "END_SECTION", "HEADER_BEGIN", "HEADER_END", "QUESTION_BEGIN", 
			"QUESTION_END", "SINGLE_QUESTION_BEGIN", "SINGLE_QUESTION_END", "CHOICE_QUESTION_BEGIN", 
			"CHOICE_QUESTION_END", "MULTIPLE_CHOICE_QUESTION_BEGIN", "MULTIPLE_CHOICE_QUESTION_END", 
			"TRUE_FALSE_BEGIN", "TRUE_FALSE_END", "SHORT_TEXT_BEGIN", "SHORT_TEXT_END", 
			"CHOICE_OPTION_BEGIN", "CHOICE_OPTION_END", "INTEGER_ANSWER_BEGIN", "INTEGER_ANSWER_END", 
			"MULTIPLE_INTEGER_ANSWER_BEGIN", "MULTIPLE_INTEGER_ANSWER_END", "DECIMAL_ANSWER_BEGIN", 
			"DECIMAL_ANSWER_END", "DATE_ANSWER_BEGIN", "DATE_ANSWER_END", "TIME_ANSWER_BEGIN", 
			"TIME_ANSWER_END", "RANGE_QUESTION_BEGIN", "RANGE_QUESTION_END", "RANGE_START_BEGIN", 
			"RANGE_START_END", "RANGE_END_BEGIN", "RANGE_END_END", "VALUE_BEGIN", 
			"VALUE_END", "WS", "BOOLEAN_VALUE", "DATE_FORMAT", "TIME_FORMAT", "INTEGER", 
			"DECIMAL", "TEXT"
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
	public static class InterviewModContext extends ParserRuleContext {
		public TerminalNode BEGIN_SECTION() { return getToken(InterviewQuestionsParser.BEGIN_SECTION, 0); }
		public HeaderSecContext headerSec() {
			return getRuleContext(HeaderSecContext.class,0);
		}
		public TerminalNode END_SECTION() { return getToken(InterviewQuestionsParser.END_SECTION, 0); }
		public List<QuestionSecContext> questionSec() {
			return getRuleContexts(QuestionSecContext.class);
		}
		public QuestionSecContext questionSec(int i) {
			return getRuleContext(QuestionSecContext.class,i);
		}
		public InterviewModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interviewMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterInterviewMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitInterviewMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitInterviewMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterviewModContext interviewMod() throws RecognitionException {
		InterviewModContext _localctx = new InterviewModContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_interviewMod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(BEGIN_SECTION);
			setState(37);
			headerSec();
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				questionSec();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==QUESTION_BEGIN );
			setState(43);
			match(END_SECTION);
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
	public static class HeaderSecContext extends ParserRuleContext {
		public TerminalNode HEADER_BEGIN() { return getToken(InterviewQuestionsParser.HEADER_BEGIN, 0); }
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode HEADER_END() { return getToken(InterviewQuestionsParser.HEADER_END, 0); }
		public HeaderSecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerSec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterHeaderSec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitHeaderSec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitHeaderSec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderSecContext headerSec() throws RecognitionException {
		HeaderSecContext _localctx = new HeaderSecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headerSec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(HEADER_BEGIN);
			setState(46);
			match(TEXT);
			setState(47);
			match(HEADER_END);
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
	public static class QuestionSecContext extends ParserRuleContext {
		public TerminalNode QUESTION_BEGIN() { return getToken(InterviewQuestionsParser.QUESTION_BEGIN, 0); }
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public TerminalNode QUESTION_END() { return getToken(InterviewQuestionsParser.QUESTION_END, 0); }
		public SingleQContext singleQ() {
			return getRuleContext(SingleQContext.class,0);
		}
		public ChoiceQContext choiceQ() {
			return getRuleContext(ChoiceQContext.class,0);
		}
		public MultiChoiceQContext multiChoiceQ() {
			return getRuleContext(MultiChoiceQContext.class,0);
		}
		public RangeQContext rangeQ() {
			return getRuleContext(RangeQContext.class,0);
		}
		public QuestionSecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionSec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterQuestionSec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitQuestionSec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitQuestionSec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionSecContext questionSec() throws RecognitionException {
		QuestionSecContext _localctx = new QuestionSecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionSec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(QUESTION_BEGIN);
			setState(50);
			questionValue();
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUESTION_BEGIN:
				{
				setState(51);
				singleQ();
				}
				break;
			case CHOICE_QUESTION_BEGIN:
				{
				setState(52);
				choiceQ();
				}
				break;
			case MULTIPLE_CHOICE_QUESTION_BEGIN:
				{
				setState(53);
				multiChoiceQ();
				}
				break;
			case RANGE_QUESTION_BEGIN:
				{
				setState(54);
				rangeQ();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(57);
			match(QUESTION_END);
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
	public static class QuestionValueContext extends ParserRuleContext {
		public Token values;
		public TerminalNode VALUE_BEGIN() { return getToken(InterviewQuestionsParser.VALUE_BEGIN, 0); }
		public TerminalNode VALUE_END() { return getToken(InterviewQuestionsParser.VALUE_END, 0); }
		public TerminalNode DECIMAL() { return getToken(InterviewQuestionsParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(InterviewQuestionsParser.INTEGER, 0); }
		public QuestionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterQuestionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitQuestionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitQuestionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionValueContext questionValue() throws RecognitionException {
		QuestionValueContext _localctx = new QuestionValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_questionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VALUE_BEGIN);
			setState(60);
			((QuestionValueContext)_localctx).values = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
				((QuestionValueContext)_localctx).values = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			match(VALUE_END);
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
	public static class SingleQContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUESTION_BEGIN() { return getToken(InterviewQuestionsParser.SINGLE_QUESTION_BEGIN, 0); }
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode SINGLE_QUESTION_END() { return getToken(InterviewQuestionsParser.SINGLE_QUESTION_END, 0); }
		public AnswerSecContext answerSec() {
			return getRuleContext(AnswerSecContext.class,0);
		}
		public SingleQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterSingleQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitSingleQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitSingleQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleQContext singleQ() throws RecognitionException {
		SingleQContext _localctx = new SingleQContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(SINGLE_QUESTION_BEGIN);
			setState(64);
			match(TEXT);
			setState(65);
			match(SINGLE_QUESTION_END);
			setState(66);
			answerSec();
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
	public static class AnswerSecContext extends ParserRuleContext {
		public TrueFalseAnswerContext trueFalseAnswer() {
			return getRuleContext(TrueFalseAnswerContext.class,0);
		}
		public ShortTextAnswerContext shortTextAnswer() {
			return getRuleContext(ShortTextAnswerContext.class,0);
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
		public AnswerSecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerSec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterAnswerSec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitAnswerSec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitAnswerSec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerSecContext answerSec() throws RecognitionException {
		AnswerSecContext _localctx = new AnswerSecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_answerSec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_FALSE_BEGIN:
				{
				setState(68);
				trueFalseAnswer();
				}
				break;
			case SHORT_TEXT_BEGIN:
				{
				setState(69);
				shortTextAnswer();
				}
				break;
			case INTEGER_ANSWER_BEGIN:
				{
				setState(70);
				integerAnswer();
				}
				break;
			case DECIMAL_ANSWER_BEGIN:
				{
				setState(71);
				decimalAnswer();
				}
				break;
			case DATE_ANSWER_BEGIN:
				{
				setState(72);
				dateAnswer();
				}
				break;
			case TIME_ANSWER_BEGIN:
				{
				setState(73);
				timeAnswer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ChoiceQContext extends ParserRuleContext {
		public TerminalNode CHOICE_QUESTION_BEGIN() { return getToken(InterviewQuestionsParser.CHOICE_QUESTION_BEGIN, 0); }
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode CHOICE_QUESTION_END() { return getToken(InterviewQuestionsParser.CHOICE_QUESTION_END, 0); }
		public ChoiceIntAnswerContext choiceIntAnswer() {
			return getRuleContext(ChoiceIntAnswerContext.class,0);
		}
		public List<ChoiceOptionContext> choiceOption() {
			return getRuleContexts(ChoiceOptionContext.class);
		}
		public ChoiceOptionContext choiceOption(int i) {
			return getRuleContext(ChoiceOptionContext.class,i);
		}
		public ChoiceQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterChoiceQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitChoiceQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitChoiceQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceQContext choiceQ() throws RecognitionException {
		ChoiceQContext _localctx = new ChoiceQContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_choiceQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CHOICE_QUESTION_BEGIN);
			setState(77);
			match(TEXT);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				choiceOption();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHOICE_OPTION_BEGIN );
			setState(83);
			match(CHOICE_QUESTION_END);
			setState(84);
			choiceIntAnswer();
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
	public static class MultiChoiceQContext extends ParserRuleContext {
		public TerminalNode MULTIPLE_CHOICE_QUESTION_BEGIN() { return getToken(InterviewQuestionsParser.MULTIPLE_CHOICE_QUESTION_BEGIN, 0); }
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode MULTIPLE_CHOICE_QUESTION_END() { return getToken(InterviewQuestionsParser.MULTIPLE_CHOICE_QUESTION_END, 0); }
		public MultiIntAnswerContext multiIntAnswer() {
			return getRuleContext(MultiIntAnswerContext.class,0);
		}
		public List<ChoiceOptionContext> choiceOption() {
			return getRuleContexts(ChoiceOptionContext.class);
		}
		public ChoiceOptionContext choiceOption(int i) {
			return getRuleContext(ChoiceOptionContext.class,i);
		}
		public MultiChoiceQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiChoiceQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterMultiChoiceQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitMultiChoiceQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitMultiChoiceQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiChoiceQContext multiChoiceQ() throws RecognitionException {
		MultiChoiceQContext _localctx = new MultiChoiceQContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multiChoiceQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(MULTIPLE_CHOICE_QUESTION_BEGIN);
			setState(87);
			match(TEXT);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				choiceOption();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CHOICE_OPTION_BEGIN );
			setState(93);
			match(MULTIPLE_CHOICE_QUESTION_END);
			setState(94);
			multiIntAnswer();
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
	public static class RangeQContext extends ParserRuleContext {
		public Token finalRangeStart;
		public Token finalRangeEnd;
		public TerminalNode RANGE_QUESTION_BEGIN() { return getToken(InterviewQuestionsParser.RANGE_QUESTION_BEGIN, 0); }
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode RANGE_START_BEGIN() { return getToken(InterviewQuestionsParser.RANGE_START_BEGIN, 0); }
		public TerminalNode RANGE_START_END() { return getToken(InterviewQuestionsParser.RANGE_START_END, 0); }
		public TerminalNode RANGE_END_BEGIN() { return getToken(InterviewQuestionsParser.RANGE_END_BEGIN, 0); }
		public TerminalNode RANGE_END_END() { return getToken(InterviewQuestionsParser.RANGE_END_END, 0); }
		public TerminalNode RANGE_QUESTION_END() { return getToken(InterviewQuestionsParser.RANGE_QUESTION_END, 0); }
		public AnswerSecContext answerSec() {
			return getRuleContext(AnswerSecContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public RangeQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterRangeQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitRangeQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitRangeQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeQContext rangeQ() throws RecognitionException {
		RangeQContext _localctx = new RangeQContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rangeQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(RANGE_QUESTION_BEGIN);
			setState(97);
			match(TEXT);
			setState(98);
			match(RANGE_START_BEGIN);
			setState(99);
			((RangeQContext)_localctx).finalRangeStart = match(INTEGER);
			setState(100);
			match(RANGE_START_END);
			setState(101);
			match(RANGE_END_BEGIN);
			setState(102);
			((RangeQContext)_localctx).finalRangeEnd = match(INTEGER);
			setState(103);
			match(RANGE_END_END);
			setState(104);
			match(RANGE_QUESTION_END);
			setState(105);
			answerSec();
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
		public TerminalNode INTEGER_ANSWER_BEGIN() { return getToken(InterviewQuestionsParser.INTEGER_ANSWER_BEGIN, 0); }
		public TerminalNode INTEGER() { return getToken(InterviewQuestionsParser.INTEGER, 0); }
		public TerminalNode INTEGER_ANSWER_END() { return getToken(InterviewQuestionsParser.INTEGER_ANSWER_END, 0); }
		public IntegerAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterIntegerAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitIntegerAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitIntegerAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerAnswerContext integerAnswer() throws RecognitionException {
		IntegerAnswerContext _localctx = new IntegerAnswerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_integerAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(INTEGER_ANSWER_BEGIN);
			setState(108);
			match(INTEGER);
			setState(109);
			match(INTEGER_ANSWER_END);
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
	public static class ChoiceIntAnswerContext extends ParserRuleContext {
		public TerminalNode INTEGER_ANSWER_BEGIN() { return getToken(InterviewQuestionsParser.INTEGER_ANSWER_BEGIN, 0); }
		public TerminalNode INTEGER() { return getToken(InterviewQuestionsParser.INTEGER, 0); }
		public TerminalNode INTEGER_ANSWER_END() { return getToken(InterviewQuestionsParser.INTEGER_ANSWER_END, 0); }
		public ChoiceIntAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceIntAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterChoiceIntAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitChoiceIntAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitChoiceIntAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceIntAnswerContext choiceIntAnswer() throws RecognitionException {
		ChoiceIntAnswerContext _localctx = new ChoiceIntAnswerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_choiceIntAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(INTEGER_ANSWER_BEGIN);
			setState(112);
			match(INTEGER);
			setState(113);
			match(INTEGER_ANSWER_END);
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
	public static class MultiIntAnswerContext extends ParserRuleContext {
		public TerminalNode MULTIPLE_INTEGER_ANSWER_BEGIN() { return getToken(InterviewQuestionsParser.MULTIPLE_INTEGER_ANSWER_BEGIN, 0); }
		public TerminalNode MULTIPLE_INTEGER_ANSWER_END() { return getToken(InterviewQuestionsParser.MULTIPLE_INTEGER_ANSWER_END, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(InterviewQuestionsParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(InterviewQuestionsParser.INTEGER, i);
		}
		public MultiIntAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiIntAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterMultiIntAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitMultiIntAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitMultiIntAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiIntAnswerContext multiIntAnswer() throws RecognitionException {
		MultiIntAnswerContext _localctx = new MultiIntAnswerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiIntAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(MULTIPLE_INTEGER_ANSWER_BEGIN);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(INTEGER);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER );
			setState(121);
			match(MULTIPLE_INTEGER_ANSWER_END);
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
		public Token decimalValue;
		public TerminalNode DECIMAL_ANSWER_BEGIN() { return getToken(InterviewQuestionsParser.DECIMAL_ANSWER_BEGIN, 0); }
		public TerminalNode DECIMAL_ANSWER_END() { return getToken(InterviewQuestionsParser.DECIMAL_ANSWER_END, 0); }
		public TerminalNode DECIMAL() { return getToken(InterviewQuestionsParser.DECIMAL, 0); }
		public TerminalNode INTEGER() { return getToken(InterviewQuestionsParser.INTEGER, 0); }
		public DecimalAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterDecimalAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitDecimalAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDecimalAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalAnswerContext decimalAnswer() throws RecognitionException {
		DecimalAnswerContext _localctx = new DecimalAnswerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decimalAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(DECIMAL_ANSWER_BEGIN);
			setState(124);
			((DecimalAnswerContext)_localctx).decimalValue = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
				((DecimalAnswerContext)_localctx).decimalValue = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			match(DECIMAL_ANSWER_END);
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
		public TerminalNode DATE_ANSWER_BEGIN() { return getToken(InterviewQuestionsParser.DATE_ANSWER_BEGIN, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(InterviewQuestionsParser.DATE_FORMAT, 0); }
		public TerminalNode DATE_ANSWER_END() { return getToken(InterviewQuestionsParser.DATE_ANSWER_END, 0); }
		public DateAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterDateAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitDateAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDateAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateAnswerContext dateAnswer() throws RecognitionException {
		DateAnswerContext _localctx = new DateAnswerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dateAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(DATE_ANSWER_BEGIN);
			setState(128);
			match(DATE_FORMAT);
			setState(129);
			match(DATE_ANSWER_END);
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
		public TerminalNode TIME_ANSWER_BEGIN() { return getToken(InterviewQuestionsParser.TIME_ANSWER_BEGIN, 0); }
		public TerminalNode TIME_FORMAT() { return getToken(InterviewQuestionsParser.TIME_FORMAT, 0); }
		public TerminalNode TIME_ANSWER_END() { return getToken(InterviewQuestionsParser.TIME_ANSWER_END, 0); }
		public TimeAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterTimeAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitTimeAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTimeAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeAnswerContext timeAnswer() throws RecognitionException {
		TimeAnswerContext _localctx = new TimeAnswerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_timeAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(TIME_ANSWER_BEGIN);
			setState(132);
			match(TIME_FORMAT);
			setState(133);
			match(TIME_ANSWER_END);
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
	public static class ChoiceOptionContext extends ParserRuleContext {
		public TerminalNode CHOICE_OPTION_BEGIN() { return getToken(InterviewQuestionsParser.CHOICE_OPTION_BEGIN, 0); }
		public QuestionValueContext questionValue() {
			return getRuleContext(QuestionValueContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode CHOICE_OPTION_END() { return getToken(InterviewQuestionsParser.CHOICE_OPTION_END, 0); }
		public ChoiceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterChoiceOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitChoiceOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitChoiceOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceOptionContext choiceOption() throws RecognitionException {
		ChoiceOptionContext _localctx = new ChoiceOptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_choiceOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CHOICE_OPTION_BEGIN);
			setState(136);
			questionValue();
			setState(137);
			match(TEXT);
			setState(138);
			match(CHOICE_OPTION_END);
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
		public TerminalNode TRUE_FALSE_BEGIN() { return getToken(InterviewQuestionsParser.TRUE_FALSE_BEGIN, 0); }
		public TerminalNode BOOLEAN_VALUE() { return getToken(InterviewQuestionsParser.BOOLEAN_VALUE, 0); }
		public TerminalNode TRUE_FALSE_END() { return getToken(InterviewQuestionsParser.TRUE_FALSE_END, 0); }
		public TrueFalseAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterTrueFalseAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitTrueFalseAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTrueFalseAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseAnswerContext trueFalseAnswer() throws RecognitionException {
		TrueFalseAnswerContext _localctx = new TrueFalseAnswerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trueFalseAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(TRUE_FALSE_BEGIN);
			setState(141);
			match(BOOLEAN_VALUE);
			setState(142);
			match(TRUE_FALSE_END);
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
		public TerminalNode SHORT_TEXT_BEGIN() { return getToken(InterviewQuestionsParser.SHORT_TEXT_BEGIN, 0); }
		public TerminalNode TEXT() { return getToken(InterviewQuestionsParser.TEXT, 0); }
		public TerminalNode SHORT_TEXT_END() { return getToken(InterviewQuestionsParser.SHORT_TEXT_END, 0); }
		public ShortTextAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortTextAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).enterShortTextAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InterviewQuestionsListener ) ((InterviewQuestionsListener)listener).exitShortTextAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitShortTextAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortTextAnswerContext shortTextAnswer() throws RecognitionException {
		ShortTextAnswerContext _localctx = new ShortTextAnswerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_shortTextAnswer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SHORT_TEXT_BEGIN);
			setState(145);
			match(TEXT);
			setState(146);
			match(SHORT_TEXT_END);
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
		"\u0004\u0001+\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006P\b\u0006"+
		"\u000b\u0006\f\u0006Q\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007Z\b\u0007\u000b\u0007\f\u0007[\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0004"+
		"\u000bv\b\u000b\u000b\u000b\f\u000bw\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"\u0000\u0001\u0001\u0000)*\u008e\u0000$\u0001\u0000\u0000\u0000"+
		"\u0002-\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006;"+
		"\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000"+
		"\u0000\fL\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000\u0000\u0010"+
		"`\u0001\u0000\u0000\u0000\u0012k\u0001\u0000\u0000\u0000\u0014o\u0001"+
		"\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018{\u0001\u0000\u0000"+
		"\u0000\u001a\u007f\u0001\u0000\u0000\u0000\u001c\u0083\u0001\u0000\u0000"+
		"\u0000\u001e\u0087\u0001\u0000\u0000\u0000 \u008c\u0001\u0000\u0000\u0000"+
		"\"\u0090\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%\'\u0003\u0002"+
		"\u0001\u0000&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+,\u0005\u0002\u0000\u0000,\u0001\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0005+\u0000\u0000/0\u0005\u0004"+
		"\u0000\u00000\u0003\u0001\u0000\u0000\u000012\u0005\u0005\u0000\u0000"+
		"27\u0003\u0006\u0003\u000038\u0003\b\u0004\u000048\u0003\f\u0006\u0000"+
		"58\u0003\u000e\u0007\u000068\u0003\u0010\b\u000073\u0001\u0000\u0000\u0000"+
		"74\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0005\u0006\u0000\u0000:\u0005\u0001"+
		"\u0000\u0000\u0000;<\u0005#\u0000\u0000<=\u0007\u0000\u0000\u0000=>\u0005"+
		"$\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\u0007\u0000\u0000"+
		"@A\u0005+\u0000\u0000AB\u0005\b\u0000\u0000BC\u0003\n\u0005\u0000C\t\u0001"+
		"\u0000\u0000\u0000DK\u0003 \u0010\u0000EK\u0003\"\u0011\u0000FK\u0003"+
		"\u0012\t\u0000GK\u0003\u0018\f\u0000HK\u0003\u001a\r\u0000IK\u0003\u001c"+
		"\u000e\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001"+
		"\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0005\t\u0000"+
		"\u0000MO\u0005+\u0000\u0000NP\u0003\u001e\u000f\u0000ON\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\n\u0000\u0000TU\u0003\u0014"+
		"\n\u0000U\r\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000WY\u0005"+
		"+\u0000\u0000XZ\u0003\u001e\u000f\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]^\u0005\f\u0000\u0000^_\u0003\u0016\u000b"+
		"\u0000_\u000f\u0001\u0000\u0000\u0000`a\u0005\u001d\u0000\u0000ab\u0005"+
		"+\u0000\u0000bc\u0005\u001f\u0000\u0000cd\u0005)\u0000\u0000de\u0005 "+
		"\u0000\u0000ef\u0005!\u0000\u0000fg\u0005)\u0000\u0000gh\u0005\"\u0000"+
		"\u0000hi\u0005\u001e\u0000\u0000ij\u0003\n\u0005\u0000j\u0011\u0001\u0000"+
		"\u0000\u0000kl\u0005\u0013\u0000\u0000lm\u0005)\u0000\u0000mn\u0005\u0014"+
		"\u0000\u0000n\u0013\u0001\u0000\u0000\u0000op\u0005\u0013\u0000\u0000"+
		"pq\u0005)\u0000\u0000qr\u0005\u0014\u0000\u0000r\u0015\u0001\u0000\u0000"+
		"\u0000su\u0005\u0015\u0000\u0000tv\u0005)\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005\u0016\u0000\u0000z\u0017"+
		"\u0001\u0000\u0000\u0000{|\u0005\u0017\u0000\u0000|}\u0007\u0000\u0000"+
		"\u0000}~\u0005\u0018\u0000\u0000~\u0019\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u0019\u0000\u0000\u0080\u0081\u0005\'\u0000\u0000\u0081\u0082"+
		"\u0005\u001a\u0000\u0000\u0082\u001b\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\u001b\u0000\u0000\u0084\u0085\u0005(\u0000\u0000\u0085\u0086\u0005"+
		"\u001c\u0000\u0000\u0086\u001d\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"\u0011\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008a\u0005"+
		"+\u0000\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b\u001f\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\r\u0000\u0000\u008d\u008e\u0005&\u0000"+
		"\u0000\u008e\u008f\u0005\u000e\u0000\u0000\u008f!\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005\u000f\u0000\u0000\u0091\u0092\u0005+\u0000\u0000\u0092"+
		"\u0093\u0005\u0010\u0000\u0000\u0093#\u0001\u0000\u0000\u0000\u0006)7"+
		"JQ[w";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}