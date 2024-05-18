// Generated from InterviewAnswers.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, String=6, Decimal=7, Real=8, COMA_TOKEN=9, 
		WS=10;
	public static final int
		RULE_answers = 0, RULE_answer = 1, RULE_true_false = 2, RULE_short = 3, 
		RULE_single_choice = 4, RULE_multiple_choice = 5, RULE_int_q = 6, RULE_real_q = 7, 
		RULE_date_q = 8, RULE_time_q = 9, RULE_scale_q = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"answers", "answer", "true_false", "short", "single_choice", "multiple_choice", 
			"int_q", "real_q", "date_q", "time_q", "scale_q"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'A:'", "':'", "'TRUE'", "'FALSE'", "'\\n'", null, null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "String", "Decimal", "Real", "COMA_TOKEN", 
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
	public static class AnswersContext extends ParserRuleContext {
		public List<AnswerContext> answer() {
			return getRuleContexts(AnswerContext.class);
		}
		public AnswerContext answer(int i) {
			return getRuleContext(AnswerContext.class,i);
		}
		public AnswersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswersContext answers() throws RecognitionException {
		AnswersContext _localctx = new AnswersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_answers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				answer();
				}
				}
				setState(25); 
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
	public static class AnswerContext extends ParserRuleContext {
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
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_answer);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				true_false();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				short_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				single_choice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				multiple_choice();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				int_q();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				real_q();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(33);
				date_q();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(34);
				time_q();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(35);
				scale_q();
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
	public static class True_falseContext extends ParserRuleContext {
		public Token questionId;
		public Token tfAnswer;
		public TerminalNode String() { return getToken(InterviewAnswersParser.String, 0); }
		public True_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitTrue_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_falseContext true_false() throws RecognitionException {
		True_falseContext _localctx = new True_falseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_true_false);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			((True_falseContext)_localctx).questionId = match(String);
			setState(40);
			match(T__1);
			setState(41);
			((True_falseContext)_localctx).tfAnswer = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((True_falseContext)_localctx).tfAnswer = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
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
	public static class ShortContext extends ParserRuleContext {
		public Token questionId;
		public Token shortAnswer;
		public List<TerminalNode> String() { return getTokens(InterviewAnswersParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewAnswersParser.String, i);
		}
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			((ShortContext)_localctx).questionId = match(String);
			setState(46);
			match(T__1);
			setState(47);
			((ShortContext)_localctx).shortAnswer = match(String);
			setState(48);
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
	public static class Single_choiceContext extends ParserRuleContext {
		public Token questionId;
		public Token singleChoiceAnswer;
		public List<TerminalNode> String() { return getTokens(InterviewAnswersParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewAnswersParser.String, i);
		}
		public Single_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_choice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitSingle_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_choiceContext single_choice() throws RecognitionException {
		Single_choiceContext _localctx = new Single_choiceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_single_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			((Single_choiceContext)_localctx).questionId = match(String);
			setState(52);
			match(T__1);
			setState(53);
			((Single_choiceContext)_localctx).singleChoiceAnswer = match(String);
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
	public static class Multiple_choiceContext extends ParserRuleContext {
		public Token questionId;
		public Token multipleChoiceAnswers;
		public List<TerminalNode> String() { return getTokens(InterviewAnswersParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewAnswersParser.String, i);
		}
		public List<TerminalNode> COMA_TOKEN() { return getTokens(InterviewAnswersParser.COMA_TOKEN); }
		public TerminalNode COMA_TOKEN(int i) {
			return getToken(InterviewAnswersParser.COMA_TOKEN, i);
		}
		public Multiple_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitMultiple_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiple_choiceContext multiple_choice() throws RecognitionException {
		Multiple_choiceContext _localctx = new Multiple_choiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiple_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			((Multiple_choiceContext)_localctx).questionId = match(String);
			setState(58);
			match(T__1);
			setState(59);
			((Multiple_choiceContext)_localctx).multipleChoiceAnswers = match(String);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA_TOKEN) {
				{
				{
				setState(60);
				match(COMA_TOKEN);
				setState(61);
				((Multiple_choiceContext)_localctx).multipleChoiceAnswers = match(String);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
	public static class Int_qContext extends ParserRuleContext {
		public Token questionId;
		public Token intAnswer;
		public TerminalNode String() { return getToken(InterviewAnswersParser.String, 0); }
		public TerminalNode Decimal() { return getToken(InterviewAnswersParser.Decimal, 0); }
		public Int_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitInt_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_qContext int_q() throws RecognitionException {
		Int_qContext _localctx = new Int_qContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_int_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
			setState(70);
			((Int_qContext)_localctx).questionId = match(String);
			setState(71);
			match(T__1);
			setState(72);
			((Int_qContext)_localctx).intAnswer = match(Decimal);
			setState(73);
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
	public static class Real_qContext extends ParserRuleContext {
		public Token questionId;
		public Token realAnswer;
		public TerminalNode String() { return getToken(InterviewAnswersParser.String, 0); }
		public TerminalNode Real() { return getToken(InterviewAnswersParser.Real, 0); }
		public Real_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitReal_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_qContext real_q() throws RecognitionException {
		Real_qContext _localctx = new Real_qContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_real_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__0);
			setState(76);
			((Real_qContext)_localctx).questionId = match(String);
			setState(77);
			match(T__1);
			setState(78);
			((Real_qContext)_localctx).realAnswer = match(Real);
			setState(79);
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
	public static class Date_qContext extends ParserRuleContext {
		public Token questionId;
		public Token dateAnswer;
		public List<TerminalNode> String() { return getTokens(InterviewAnswersParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewAnswersParser.String, i);
		}
		public Date_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitDate_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_qContext date_q() throws RecognitionException {
		Date_qContext _localctx = new Date_qContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_date_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			((Date_qContext)_localctx).questionId = match(String);
			setState(83);
			match(T__1);
			setState(84);
			((Date_qContext)_localctx).dateAnswer = match(String);
			setState(85);
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
	public static class Time_qContext extends ParserRuleContext {
		public Token questionId;
		public Token timeAnswer;
		public List<TerminalNode> String() { return getTokens(InterviewAnswersParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewAnswersParser.String, i);
		}
		public Time_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitTime_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_qContext time_q() throws RecognitionException {
		Time_qContext _localctx = new Time_qContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_time_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			((Time_qContext)_localctx).questionId = match(String);
			setState(89);
			match(T__1);
			setState(90);
			((Time_qContext)_localctx).timeAnswer = match(String);
			setState(91);
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
	public static class Scale_qContext extends ParserRuleContext {
		public Token questionId;
		public Token scaleAnswer;
		public TerminalNode String() { return getToken(InterviewAnswersParser.String, 0); }
		public TerminalNode Decimal() { return getToken(InterviewAnswersParser.Decimal, 0); }
		public Scale_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewAnswersVisitor ) return ((InterviewAnswersVisitor<? extends T>)visitor).visitScale_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale_qContext scale_q() throws RecognitionException {
		Scale_qContext _localctx = new Scale_qContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_scale_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__0);
			setState(94);
			((Scale_qContext)_localctx).questionId = match(String);
			setState(95);
			match(T__1);
			setState(96);
			((Scale_qContext)_localctx).scaleAnswer = match(Decimal);
			setState(97);
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

	public static final String _serializedATN =
		"\u0004\u0001\nd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005?\b\u0005\n\u0005\f\u0005B\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\u0003\u0004"+
		"b\u0000\u0017\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"&\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b2\u0001\u0000"+
		"\u0000\u0000\n8\u0001\u0000\u0000\u0000\fE\u0001\u0000\u0000\u0000\u000e"+
		"K\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012W\u0001"+
		"\u0000\u0000\u0000\u0014]\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b%\u0003\u0004\u0002"+
		"\u0000\u001c%\u0003\u0006\u0003\u0000\u001d%\u0003\b\u0004\u0000\u001e"+
		"%\u0003\n\u0005\u0000\u001f%\u0003\f\u0006\u0000 %\u0003\u000e\u0007\u0000"+
		"!%\u0003\u0010\b\u0000\"%\u0003\u0012\t\u0000#%\u0003\u0014\n\u0000$\u001b"+
		"\u0001\u0000\u0000\u0000$\u001c\u0001\u0000\u0000\u0000$\u001d\u0001\u0000"+
		"\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000"+
		"$ \u0001\u0000\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\'(\u0005\u0006\u0000\u0000()\u0005\u0002\u0000\u0000"+
		")*\u0007\u0000\u0000\u0000*+\u0005\u0005\u0000\u0000+\u0005\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0001\u0000\u0000-.\u0005\u0006\u0000\u0000./\u0005"+
		"\u0002\u0000\u0000/0\u0005\u0006\u0000\u000001\u0005\u0005\u0000\u0000"+
		"1\u0007\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0005\u0006"+
		"\u0000\u000045\u0005\u0002\u0000\u000056\u0005\u0006\u0000\u000067\u0005"+
		"\u0005\u0000\u00007\t\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u0000"+
		"9:\u0005\u0006\u0000\u0000:;\u0005\u0002\u0000\u0000;@\u0005\u0006\u0000"+
		"\u0000<=\u0005\t\u0000\u0000=?\u0005\u0006\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0005\u0000\u0000D\u000b\u0001\u0000\u0000\u0000EF\u0005\u0001\u0000"+
		"\u0000FG\u0005\u0006\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0005\u0007"+
		"\u0000\u0000IJ\u0005\u0005\u0000\u0000J\r\u0001\u0000\u0000\u0000KL\u0005"+
		"\u0001\u0000\u0000LM\u0005\u0006\u0000\u0000MN\u0005\u0002\u0000\u0000"+
		"NO\u0005\b\u0000\u0000OP\u0005\u0005\u0000\u0000P\u000f\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0001\u0000\u0000RS\u0005\u0006\u0000\u0000ST\u0005\u0002"+
		"\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\u0005\u0000\u0000V\u0011"+
		"\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0005\u0006\u0000"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z[\u0005\u0006\u0000\u0000[\\\u0005\u0005"+
		"\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0005\u0001\u0000\u0000"+
		"^_\u0005\u0006\u0000\u0000_`\u0005\u0002\u0000\u0000`a\u0005\u0007\u0000"+
		"\u0000ab\u0005\u0005\u0000\u0000b\u0015\u0001\u0000\u0000\u0000\u0003"+
		"\u0019$@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}