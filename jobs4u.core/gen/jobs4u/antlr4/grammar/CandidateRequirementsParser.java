// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/CandidateRequirements.g4 by ANTLR 4.13.1
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
public class CandidateRequirementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUMBER=2, TEXT=3, WS=4;
	public static final int
		RULE_requirements = 0, RULE_requirement = 1, RULE_answer = 2, RULE_text = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"requirements", "requirement", "answer", "text"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'R:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "NUMBER", "TEXT", "WS"
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
	public String getGrammarFileName() { return "CandidateRequirements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CandidateRequirementsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CandidateRequirementsParser.EOF, 0); }
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).enterRequirements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).exitRequirements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CandidateRequirementsVisitor ) return ((CandidateRequirementsVisitor<? extends T>)visitor).visitRequirements(this);
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
			setState(13);
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
	public static class RequirementContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CandidateRequirementsVisitor ) return ((CandidateRequirementsVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(T__0);
			setState(16);
			text();
			setState(17);
			answer();
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
		public TerminalNode NUMBER() { return getToken(CandidateRequirementsParser.NUMBER, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CandidateRequirementsVisitor ) return ((CandidateRequirementsVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(CandidateRequirementsParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CandidateRequirementsListener ) ((CandidateRequirementsListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CandidateRequirementsVisitor ) return ((CandidateRequirementsVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0004\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000"+
		"\n\b\u0000\u000b\u0000\f\u0000\u000b\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000"+
		"\u0000\u0014\u0000\t\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000"+
		"\u0000\u0004\u0013\u0001\u0000\u0000\u0000\u0006\u0015\u0001\u0000\u0000"+
		"\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\u000b"+
		"\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f\u0001"+
		"\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0000\u0000"+
		"\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f\u0010\u0005\u0001\u0000"+
		"\u0000\u0010\u0011\u0003\u0006\u0003\u0000\u0011\u0012\u0003\u0004\u0002"+
		"\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0002\u0000"+
		"\u0000\u0014\u0005\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0003\u0000"+
		"\u0000\u0016\u0007\u0001\u0000\u0000\u0000\u0001\u000b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}