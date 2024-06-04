// Generated from /Users/mendonca/PROJETO_LAPR4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
package jobs4u.antlr4.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterviewQuestionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterviewQuestionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#interviewMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterviewMod(InterviewQuestionsParser.InterviewModContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#headerSec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderSec(InterviewQuestionsParser.HeaderSecContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#questionSec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionSec(InterviewQuestionsParser.QuestionSecContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#questionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionValue(InterviewQuestionsParser.QuestionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#singleQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQ(InterviewQuestionsParser.SingleQContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#answerSec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerSec(InterviewQuestionsParser.AnswerSecContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#choiceQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceQ(InterviewQuestionsParser.ChoiceQContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#multiChoiceQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiChoiceQ(InterviewQuestionsParser.MultiChoiceQContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#rangeQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeQ(InterviewQuestionsParser.RangeQContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#integerAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAnswer(InterviewQuestionsParser.IntegerAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#choiceIntAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceIntAnswer(InterviewQuestionsParser.ChoiceIntAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#multiIntAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiIntAnswer(InterviewQuestionsParser.MultiIntAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#decimalAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalAnswer(InterviewQuestionsParser.DecimalAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#dateAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateAnswer(InterviewQuestionsParser.DateAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#timeAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAnswer(InterviewQuestionsParser.TimeAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#choiceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoiceOption(InterviewQuestionsParser.ChoiceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseAnswer(InterviewQuestionsParser.TrueFalseAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#shortTextAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortTextAnswer(InterviewQuestionsParser.ShortTextAnswerContext ctx);
}