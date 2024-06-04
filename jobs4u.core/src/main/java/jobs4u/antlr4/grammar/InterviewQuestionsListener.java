// Generated from /Users/mendonca/PROJETO_LAPR4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterviewQuestionsParser}.
 */
public interface InterviewQuestionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#interviewMod}.
	 * @param ctx the parse tree
	 */
	void enterInterviewMod(InterviewQuestionsParser.InterviewModContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#interviewMod}.
	 * @param ctx the parse tree
	 */
	void exitInterviewMod(InterviewQuestionsParser.InterviewModContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#headerSec}.
	 * @param ctx the parse tree
	 */
	void enterHeaderSec(InterviewQuestionsParser.HeaderSecContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#headerSec}.
	 * @param ctx the parse tree
	 */
	void exitHeaderSec(InterviewQuestionsParser.HeaderSecContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#questionSec}.
	 * @param ctx the parse tree
	 */
	void enterQuestionSec(InterviewQuestionsParser.QuestionSecContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#questionSec}.
	 * @param ctx the parse tree
	 */
	void exitQuestionSec(InterviewQuestionsParser.QuestionSecContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void enterQuestionValue(InterviewQuestionsParser.QuestionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#questionValue}.
	 * @param ctx the parse tree
	 */
	void exitQuestionValue(InterviewQuestionsParser.QuestionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#singleQ}.
	 * @param ctx the parse tree
	 */
	void enterSingleQ(InterviewQuestionsParser.SingleQContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#singleQ}.
	 * @param ctx the parse tree
	 */
	void exitSingleQ(InterviewQuestionsParser.SingleQContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#answerSec}.
	 * @param ctx the parse tree
	 */
	void enterAnswerSec(InterviewQuestionsParser.AnswerSecContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#answerSec}.
	 * @param ctx the parse tree
	 */
	void exitAnswerSec(InterviewQuestionsParser.AnswerSecContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#choiceQ}.
	 * @param ctx the parse tree
	 */
	void enterChoiceQ(InterviewQuestionsParser.ChoiceQContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#choiceQ}.
	 * @param ctx the parse tree
	 */
	void exitChoiceQ(InterviewQuestionsParser.ChoiceQContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#multiChoiceQ}.
	 * @param ctx the parse tree
	 */
	void enterMultiChoiceQ(InterviewQuestionsParser.MultiChoiceQContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#multiChoiceQ}.
	 * @param ctx the parse tree
	 */
	void exitMultiChoiceQ(InterviewQuestionsParser.MultiChoiceQContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#rangeQ}.
	 * @param ctx the parse tree
	 */
	void enterRangeQ(InterviewQuestionsParser.RangeQContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#rangeQ}.
	 * @param ctx the parse tree
	 */
	void exitRangeQ(InterviewQuestionsParser.RangeQContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#integerAnswer}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAnswer(InterviewQuestionsParser.IntegerAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#integerAnswer}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAnswer(InterviewQuestionsParser.IntegerAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#choiceIntAnswer}.
	 * @param ctx the parse tree
	 */
	void enterChoiceIntAnswer(InterviewQuestionsParser.ChoiceIntAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#choiceIntAnswer}.
	 * @param ctx the parse tree
	 */
	void exitChoiceIntAnswer(InterviewQuestionsParser.ChoiceIntAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#multiIntAnswer}.
	 * @param ctx the parse tree
	 */
	void enterMultiIntAnswer(InterviewQuestionsParser.MultiIntAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#multiIntAnswer}.
	 * @param ctx the parse tree
	 */
	void exitMultiIntAnswer(InterviewQuestionsParser.MultiIntAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#decimalAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDecimalAnswer(InterviewQuestionsParser.DecimalAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#decimalAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDecimalAnswer(InterviewQuestionsParser.DecimalAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDateAnswer(InterviewQuestionsParser.DateAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDateAnswer(InterviewQuestionsParser.DateAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTimeAnswer(InterviewQuestionsParser.TimeAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTimeAnswer(InterviewQuestionsParser.TimeAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#choiceOption}.
	 * @param ctx the parse tree
	 */
	void enterChoiceOption(InterviewQuestionsParser.ChoiceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#choiceOption}.
	 * @param ctx the parse tree
	 */
	void exitChoiceOption(InterviewQuestionsParser.ChoiceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseAnswer(InterviewQuestionsParser.TrueFalseAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseAnswer(InterviewQuestionsParser.TrueFalseAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterviewQuestionsParser#shortTextAnswer}.
	 * @param ctx the parse tree
	 */
	void enterShortTextAnswer(InterviewQuestionsParser.ShortTextAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterviewQuestionsParser#shortTextAnswer}.
	 * @param ctx the parse tree
	 */
	void exitShortTextAnswer(InterviewQuestionsParser.ShortTextAnswerContext ctx);
}