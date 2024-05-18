// Generated from InterviewQuestions.g4 by ANTLR 4.13.1
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, String=31, 
		Decimal=32, Real=33, COMA_TOKEN=34, WS=35;
	public static final int
		RULE_questions = 0, RULE_question = 1, RULE_true_false = 2, RULE_short = 3, 
		RULE_single_choice = 4, RULE_multiple_choice = 5, RULE_c_choices = 6, 
		RULE_choice = 7, RULE_int_q = 8, RULE_real_q = 9, RULE_date_q = 10, RULE_time_q = 11, 
		RULE_scale_q = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"questions", "question", "true_false", "short", "single_choice", "multiple_choice", 
			"c_choices", "choice", "int_q", "real_q", "date_q", "time_q", "scale_q"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TRUE_FALSE'", "'QUESTION'", "'WITH'", "'ID'", "'BEING'", "'DIFFICULTY'", 
			"'OF'", "'END_STATEMENT'", "'ITS_VALIDATION'", "'IS_DEFINED'", "'AS'", 
			"'TRUE'", "'FALSE'", "'AWARDING'", "'SHORT_TEXT'", "'TYPE'", "'literal'", 
			"'regex'", "'SINGLE_CHOICE'", "'FROM'", "'MULTIPLE_CHOICE'", "'('", "')'", 
			"'INTEGER_NUMBER'", "'REAL_NUMBER'", "'DATE'", "'TIME'", "'SCALE'", "'BETWEEN'", 
			"'AND'", null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "String", "Decimal", "Real", 
			"COMA_TOKEN", "WS"
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
	public static class QuestionsContext extends ParserRuleContext {
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_questions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				question();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 522747906L) != 0) );
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
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				true_false();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				short_();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				single_choice();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				multiple_choice();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				int_q();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				real_q();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				date_q();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 8);
				{
				setState(38);
				time_q();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 9);
				{
				setState(39);
				scale_q();
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
	public static class True_falseContext extends ParserRuleContext {
		public Token questionId;
		public Token questionPrompt;
		public Token questionDifficulty;
		public Token questionPoints;
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public True_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_false; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTrue_false(this);
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
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);
			setState(44);
			match(T__2);
			setState(45);
			match(T__3);
			setState(46);
			((True_falseContext)_localctx).questionId = match(String);
			setState(47);
			match(T__4);
			setState(48);
			((True_falseContext)_localctx).questionPrompt = match(String);
			setState(49);
			match(T__2);
			setState(50);
			match(T__5);
			setState(51);
			match(T__6);
			setState(52);
			((True_falseContext)_localctx).questionDifficulty = match(Decimal);
			setState(53);
			match(T__7);
			setState(54);
			match(T__8);
			setState(55);
			match(T__9);
			setState(56);
			match(T__10);
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			match(T__13);
			setState(59);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public ShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_short; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortContext short_() throws RecognitionException {
		ShortContext _localctx = new ShortContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__14);
			setState(62);
			match(T__1);
			setState(63);
			match(T__2);
			setState(64);
			match(T__3);
			setState(65);
			((ShortContext)_localctx).questionId = match(String);
			setState(66);
			match(T__4);
			setState(67);
			((ShortContext)_localctx).questionPrompt = match(String);
			setState(68);
			match(T__2);
			setState(69);
			match(T__5);
			setState(70);
			match(T__6);
			setState(71);
			((ShortContext)_localctx).questionDifficulty = match(Decimal);
			setState(72);
			match(T__7);
			setState(73);
			match(T__8);
			setState(74);
			match(T__9);
			setState(75);
			match(T__10);
			setState(76);
			((ShortContext)_localctx).questionCorrection = match(String);
			setState(77);
			match(T__6);
			setState(78);
			match(T__15);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(T__13);
			setState(81);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public Single_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_choice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitSingle_choice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_choiceContext single_choice() throws RecognitionException {
		Single_choiceContext _localctx = new Single_choiceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_single_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__18);
			setState(84);
			match(T__1);
			setState(85);
			match(T__2);
			setState(86);
			match(T__3);
			setState(87);
			((Single_choiceContext)_localctx).questionId = match(String);
			setState(88);
			match(T__4);
			setState(89);
			((Single_choiceContext)_localctx).questionPrompt = match(String);
			setState(90);
			match(T__2);
			setState(91);
			match(T__5);
			setState(92);
			match(T__6);
			setState(93);
			((Single_choiceContext)_localctx).questionDifficulty = match(Decimal);
			setState(94);
			match(T__7);
			setState(95);
			match(T__8);
			setState(96);
			match(T__9);
			setState(97);
			match(T__10);
			setState(98);
			((Single_choiceContext)_localctx).correctChoice = match(String);
			setState(99);
			match(T__19);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				((Single_choiceContext)_localctx).choices = match(String);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==String );
			setState(105);
			match(T__13);
			setState(106);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public C_choicesContext c_choices() {
			return getRuleContext(C_choicesContext.class,0);
		}
		public Multiple_choiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_choice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitMultiple_choice(this);
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
			setState(108);
			match(T__20);
			setState(109);
			match(T__1);
			setState(110);
			match(T__2);
			setState(111);
			match(T__3);
			setState(112);
			((Multiple_choiceContext)_localctx).questionId = match(String);
			setState(113);
			match(T__4);
			setState(114);
			((Multiple_choiceContext)_localctx).questionPrompt = match(String);
			setState(115);
			match(T__2);
			setState(116);
			match(T__5);
			setState(117);
			match(T__6);
			setState(118);
			((Multiple_choiceContext)_localctx).questionDifficulty = match(Decimal);
			setState(119);
			match(T__7);
			setState(120);
			match(T__8);
			setState(121);
			match(T__9);
			setState(122);
			match(T__10);
			setState(123);
			((Multiple_choiceContext)_localctx).correctChoices = c_choices();
			setState(124);
			match(T__19);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				((Multiple_choiceContext)_localctx).choices = match(String);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==String );
			setState(130);
			match(T__13);
			setState(131);
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
		public List<TerminalNode> COMA_TOKEN() { return getTokens(InterviewQuestionsParser.COMA_TOKEN); }
		public TerminalNode COMA_TOKEN(int i) {
			return getToken(InterviewQuestionsParser.COMA_TOKEN, i);
		}
		public C_choicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_choices; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitC_choices(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_choicesContext c_choices() throws RecognitionException {
		C_choicesContext _localctx = new C_choicesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_c_choices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			choice();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA_TOKEN) {
				{
				{
				setState(134);
				match(COMA_TOKEN);
				setState(135);
				choice();
				}
				}
				setState(140);
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
	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(InterviewQuestionsParser.String, 0); }
		public TerminalNode COMA_TOKEN() { return getToken(InterviewQuestionsParser.COMA_TOKEN, 0); }
		public TerminalNode Decimal() { return getToken(InterviewQuestionsParser.Decimal, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__21);
			setState(142);
			match(String);
			setState(143);
			match(COMA_TOKEN);
			setState(144);
			match(Decimal);
			setState(145);
			match(T__22);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public Int_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitInt_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_qContext int_q() throws RecognitionException {
		Int_qContext _localctx = new Int_qContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_int_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__23);
			setState(148);
			match(T__1);
			setState(149);
			match(T__2);
			setState(150);
			match(T__3);
			setState(151);
			((Int_qContext)_localctx).questionId = match(String);
			setState(152);
			match(T__4);
			setState(153);
			((Int_qContext)_localctx).questionPrompt = match(String);
			setState(154);
			match(T__2);
			setState(155);
			match(T__5);
			setState(156);
			match(T__6);
			setState(157);
			((Int_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(158);
			match(T__7);
			setState(159);
			match(T__8);
			setState(160);
			match(T__9);
			setState(161);
			match(T__10);
			setState(162);
			((Int_qContext)_localctx).questionCorrection = match(Decimal);
			setState(163);
			match(T__13);
			setState(164);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public TerminalNode Real() { return getToken(InterviewQuestionsParser.Real, 0); }
		public Real_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitReal_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_qContext real_q() throws RecognitionException {
		Real_qContext _localctx = new Real_qContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_real_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__24);
			setState(167);
			match(T__1);
			setState(168);
			match(T__2);
			setState(169);
			match(T__3);
			setState(170);
			((Real_qContext)_localctx).questionId = match(String);
			setState(171);
			match(T__4);
			setState(172);
			((Real_qContext)_localctx).questionPrompt = match(String);
			setState(173);
			match(T__2);
			setState(174);
			match(T__5);
			setState(175);
			match(T__6);
			setState(176);
			((Real_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(177);
			match(T__7);
			setState(178);
			match(T__8);
			setState(179);
			match(T__9);
			setState(180);
			match(T__10);
			setState(181);
			((Real_qContext)_localctx).questionCorrection = match(Real);
			setState(182);
			match(T__13);
			setState(183);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public Date_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitDate_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_qContext date_q() throws RecognitionException {
		Date_qContext _localctx = new Date_qContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_date_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__25);
			setState(186);
			match(T__1);
			setState(187);
			match(T__2);
			setState(188);
			match(T__3);
			setState(189);
			((Date_qContext)_localctx).questionId = match(String);
			setState(190);
			match(T__4);
			setState(191);
			((Date_qContext)_localctx).questionPrompt = match(String);
			setState(192);
			match(T__2);
			setState(193);
			match(T__5);
			setState(194);
			match(T__6);
			setState(195);
			((Date_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(196);
			match(T__7);
			setState(197);
			match(T__8);
			setState(198);
			match(T__9);
			setState(199);
			match(T__10);
			setState(200);
			((Date_qContext)_localctx).questionCorrection = match(String);
			setState(201);
			match(T__6);
			setState(202);
			match(T__15);
			setState(203);
			((Date_qContext)_localctx).format = match(String);
			setState(204);
			match(T__13);
			setState(205);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public Time_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitTime_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_qContext time_q() throws RecognitionException {
		Time_qContext _localctx = new Time_qContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_time_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__26);
			setState(208);
			match(T__1);
			setState(209);
			match(T__2);
			setState(210);
			match(T__3);
			setState(211);
			((Time_qContext)_localctx).questionId = match(String);
			setState(212);
			match(T__4);
			setState(213);
			((Time_qContext)_localctx).questionPrompt = match(String);
			setState(214);
			match(T__2);
			setState(215);
			match(T__5);
			setState(216);
			match(T__6);
			setState(217);
			((Time_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(218);
			match(T__7);
			setState(219);
			match(T__8);
			setState(220);
			match(T__9);
			setState(221);
			match(T__10);
			setState(222);
			((Time_qContext)_localctx).questionCorrection = match(String);
			setState(223);
			match(T__6);
			setState(224);
			match(T__15);
			setState(225);
			((Time_qContext)_localctx).format = match(String);
			setState(226);
			match(T__13);
			setState(227);
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
		public List<TerminalNode> String() { return getTokens(InterviewQuestionsParser.String); }
		public TerminalNode String(int i) {
			return getToken(InterviewQuestionsParser.String, i);
		}
		public List<TerminalNode> Decimal() { return getTokens(InterviewQuestionsParser.Decimal); }
		public TerminalNode Decimal(int i) {
			return getToken(InterviewQuestionsParser.Decimal, i);
		}
		public Scale_qContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_q; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof InterviewQuestionsVisitor ) return ((InterviewQuestionsVisitor<? extends T>)visitor).visitScale_q(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scale_qContext scale_q() throws RecognitionException {
		Scale_qContext _localctx = new Scale_qContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scale_q);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__27);
			setState(230);
			match(T__1);
			setState(231);
			match(T__2);
			setState(232);
			match(T__3);
			setState(233);
			((Scale_qContext)_localctx).questionId = match(String);
			setState(234);
			match(T__4);
			setState(235);
			((Scale_qContext)_localctx).questionPrompt = match(String);
			setState(236);
			match(T__2);
			setState(237);
			match(T__5);
			setState(238);
			match(T__6);
			setState(239);
			((Scale_qContext)_localctx).questionDifficulty = match(Decimal);
			setState(240);
			match(T__7);
			setState(241);
			match(T__8);
			setState(242);
			match(T__9);
			setState(243);
			match(T__10);
			setState(244);
			((Scale_qContext)_localctx).questionCorrection = match(Decimal);
			setState(245);
			match(T__28);
			setState(246);
			((Scale_qContext)_localctx).lowerBound = match(Decimal);
			setState(247);
			match(T__29);
			setState(248);
			((Scale_qContext)_localctx).higherBound = match(Decimal);
			setState(249);
			match(T__13);
			setState(250);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u00fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004f\b\u0004"+
		"\u000b\u0004\f\u0004g\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"\u007f\b\u0005\u000b\u0005\f\u0005\u0080\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0089\b\u0006\n"+
		"\u0006\f\u0006\u008c\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000\f\r"+
		"\u0001\u0000\u0011\u0012\u00fb\u0000\u001b\u0001\u0000\u0000\u0000\u0002"+
		"(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006=\u0001"+
		"\u0000\u0000\u0000\bS\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000"+
		"\f\u0085\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010"+
		"\u0093\u0001\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014"+
		"\u00b9\u0001\u0000\u0000\u0000\u0016\u00cf\u0001\u0000\u0000\u0000\u0018"+
		"\u00e5\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u0001\u0001\u0000\u0000\u0000\u001f)\u0003\u0004\u0002\u0000 )\u0003"+
		"\u0006\u0003\u0000!)\u0003\b\u0004\u0000\")\u0003\n\u0005\u0000#)\u0003"+
		"\u0010\b\u0000$)\u0003\u0012\t\u0000%)\u0003\u0014\n\u0000&)\u0003\u0016"+
		"\u000b\u0000\')\u0003\u0018\f\u0000(\u001f\u0001\u0000\u0000\u0000( \u0001"+
		"\u0000\u0000\u0000(!\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000"+
		"(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001"+
		"\u0000\u0000\u0000*+\u0005\u0001\u0000\u0000+,\u0005\u0002\u0000\u0000"+
		",-\u0005\u0003\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005\u001f\u0000"+
		"\u0000/0\u0005\u0005\u0000\u000001\u0005\u001f\u0000\u000012\u0005\u0003"+
		"\u0000\u000023\u0005\u0006\u0000\u000034\u0005\u0007\u0000\u000045\u0005"+
		" \u0000\u000056\u0005\b\u0000\u000067\u0005\t\u0000\u000078\u0005\n\u0000"+
		"\u000089\u0005\u000b\u0000\u00009:\u0007\u0000\u0000\u0000:;\u0005\u000e"+
		"\u0000\u0000;<\u0005 \u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005"+
		"\u000f\u0000\u0000>?\u0005\u0002\u0000\u0000?@\u0005\u0003\u0000\u0000"+
		"@A\u0005\u0004\u0000\u0000AB\u0005\u001f\u0000\u0000BC\u0005\u0005\u0000"+
		"\u0000CD\u0005\u001f\u0000\u0000DE\u0005\u0003\u0000\u0000EF\u0005\u0006"+
		"\u0000\u0000FG\u0005\u0007\u0000\u0000GH\u0005 \u0000\u0000HI\u0005\b"+
		"\u0000\u0000IJ\u0005\t\u0000\u0000JK\u0005\n\u0000\u0000KL\u0005\u000b"+
		"\u0000\u0000LM\u0005\u001f\u0000\u0000MN\u0005\u0007\u0000\u0000NO\u0005"+
		"\u0010\u0000\u0000OP\u0007\u0001\u0000\u0000PQ\u0005\u000e\u0000\u0000"+
		"QR\u0005 \u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0005\u0013\u0000"+
		"\u0000TU\u0005\u0002\u0000\u0000UV\u0005\u0003\u0000\u0000VW\u0005\u0004"+
		"\u0000\u0000WX\u0005\u001f\u0000\u0000XY\u0005\u0005\u0000\u0000YZ\u0005"+
		"\u001f\u0000\u0000Z[\u0005\u0003\u0000\u0000[\\\u0005\u0006\u0000\u0000"+
		"\\]\u0005\u0007\u0000\u0000]^\u0005 \u0000\u0000^_\u0005\b\u0000\u0000"+
		"_`\u0005\t\u0000\u0000`a\u0005\n\u0000\u0000ab\u0005\u000b\u0000\u0000"+
		"bc\u0005\u001f\u0000\u0000ce\u0005\u0014\u0000\u0000df\u0005\u001f\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005"+
		"\u000e\u0000\u0000jk\u0005 \u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0015\u0000\u0000mn\u0005\u0002\u0000\u0000no\u0005\u0003\u0000\u0000"+
		"op\u0005\u0004\u0000\u0000pq\u0005\u001f\u0000\u0000qr\u0005\u0005\u0000"+
		"\u0000rs\u0005\u001f\u0000\u0000st\u0005\u0003\u0000\u0000tu\u0005\u0006"+
		"\u0000\u0000uv\u0005\u0007\u0000\u0000vw\u0005 \u0000\u0000wx\u0005\b"+
		"\u0000\u0000xy\u0005\t\u0000\u0000yz\u0005\n\u0000\u0000z{\u0005\u000b"+
		"\u0000\u0000{|\u0003\f\u0006\u0000|~\u0005\u0014\u0000\u0000}\u007f\u0005"+
		"\u001f\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u000e\u0000\u0000"+
		"\u0083\u0084\u0005 \u0000\u0000\u0084\u000b\u0001\u0000\u0000\u0000\u0085"+
		"\u008a\u0003\u000e\u0007\u0000\u0086\u0087\u0005\"\u0000\u0000\u0087\u0089"+
		"\u0003\u000e\u0007\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u0016\u0000\u0000\u008e\u008f\u0005"+
		"\u001f\u0000\u0000\u008f\u0090\u0005\"\u0000\u0000\u0090\u0091\u0005 "+
		"\u0000\u0000\u0091\u0092\u0005\u0017\u0000\u0000\u0092\u000f\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0018\u0000\u0000\u0094\u0095\u0005\u0002"+
		"\u0000\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u0005\u0004"+
		"\u0000\u0000\u0097\u0098\u0005\u001f\u0000\u0000\u0098\u0099\u0005\u0005"+
		"\u0000\u0000\u0099\u009a\u0005\u001f\u0000\u0000\u009a\u009b\u0005\u0003"+
		"\u0000\u0000\u009b\u009c\u0005\u0006\u0000\u0000\u009c\u009d\u0005\u0007"+
		"\u0000\u0000\u009d\u009e\u0005 \u0000\u0000\u009e\u009f\u0005\b\u0000"+
		"\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a1\u0005\n\u0000\u0000"+
		"\u00a1\u00a2\u0005\u000b\u0000\u0000\u00a2\u00a3\u0005 \u0000\u0000\u00a3"+
		"\u00a4\u0005\u000e\u0000\u0000\u00a4\u00a5\u0005 \u0000\u0000\u00a5\u0011"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0019\u0000\u0000\u00a7\u00a8"+
		"\u0005\u0002\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0004\u0000\u0000\u00aa\u00ab\u0005\u001f\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0005\u0000\u0000\u00ac\u00ad\u0005\u001f\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0003\u0000\u0000\u00ae\u00af\u0005\u0006\u0000\u0000\u00af\u00b0"+
		"\u0005\u0007\u0000\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u0005"+
		"\b\u0000\u0000\u00b2\u00b3\u0005\t\u0000\u0000\u00b3\u00b4\u0005\n\u0000"+
		"\u0000\u00b4\u00b5\u0005\u000b\u0000\u0000\u00b5\u00b6\u0005!\u0000\u0000"+
		"\u00b6\u00b7\u0005\u000e\u0000\u0000\u00b7\u00b8\u0005 \u0000\u0000\u00b8"+
		"\u0013\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u001a\u0000\u0000\u00ba"+
		"\u00bb\u0005\u0002\u0000\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0004\u0000\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be"+
		"\u00bf\u0005\u0005\u0000\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000\u00c0"+
		"\u00c1\u0005\u0003\u0000\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0007\u0000\u0000\u00c3\u00c4\u0005 \u0000\u0000\u00c4\u00c5"+
		"\u0005\b\u0000\u0000\u00c5\u00c6\u0005\t\u0000\u0000\u00c6\u00c7\u0005"+
		"\n\u0000\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000\u00c8\u00c9\u0005\u001f"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0007\u0000\u0000\u00ca\u00cb\u0005\u0010"+
		"\u0000\u0000\u00cb\u00cc\u0005\u001f\u0000\u0000\u00cc\u00cd\u0005\u000e"+
		"\u0000\u0000\u00cd\u00ce\u0005 \u0000\u0000\u00ce\u0015\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u001b\u0000\u0000\u00d0\u00d1\u0005\u0002\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u00d3\u0005\u0004\u0000"+
		"\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d5\u0005\u0005\u0000"+
		"\u0000\u00d5\u00d6\u0005\u001f\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000"+
		"\u0000\u00d7\u00d8\u0005\u0006\u0000\u0000\u00d8\u00d9\u0005\u0007\u0000"+
		"\u0000\u00d9\u00da\u0005 \u0000\u0000\u00da\u00db\u0005\b\u0000\u0000"+
		"\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00dd\u0005\n\u0000\u0000\u00dd"+
		"\u00de\u0005\u000b\u0000\u0000\u00de\u00df\u0005\u001f\u0000\u0000\u00df"+
		"\u00e0\u0005\u0007\u0000\u0000\u00e0\u00e1\u0005\u0010\u0000\u0000\u00e1"+
		"\u00e2\u0005\u001f\u0000\u0000\u00e2\u00e3\u0005\u000e\u0000\u0000\u00e3"+
		"\u00e4\u0005 \u0000\u0000\u00e4\u0017\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u001c\u0000\u0000\u00e6\u00e7\u0005\u0002\u0000\u0000\u00e7\u00e8"+
		"\u0005\u0003\u0000\u0000\u00e8\u00e9\u0005\u0004\u0000\u0000\u00e9\u00ea"+
		"\u0005\u001f\u0000\u0000\u00ea\u00eb\u0005\u0005\u0000\u0000\u00eb\u00ec"+
		"\u0005\u001f\u0000\u0000\u00ec\u00ed\u0005\u0003\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0006\u0000\u0000\u00ee\u00ef\u0005\u0007\u0000\u0000\u00ef\u00f0"+
		"\u0005 \u0000\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1\u00f2\u0005"+
		"\t\u0000\u0000\u00f2\u00f3\u0005\n\u0000\u0000\u00f3\u00f4\u0005\u000b"+
		"\u0000\u0000\u00f4\u00f5\u0005 \u0000\u0000\u00f5\u00f6\u0005\u001d\u0000"+
		"\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8\u0005\u001e\u0000\u0000"+
		"\u00f8\u00f9\u0005 \u0000\u0000\u00f9\u00fa\u0005\u000e\u0000\u0000\u00fa"+
		"\u00fb\u0005 \u0000\u0000\u00fb\u0019\u0001\u0000\u0000\u0000\u0005\u001d"+
		"(g\u0080\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}