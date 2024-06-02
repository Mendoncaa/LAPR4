// Generated from C:/Users/David/Desktop/SEM4PI/sem4pi-23-24-2dj4/jobs4u.core/src/main/java/jobs4u/antlr4/grammar/InterviewQuestions.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#interview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterview(InterviewQuestionsParser.InterviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(InterviewQuestionsParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(InterviewQuestionsParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#shortTextQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortTextQuestion(InterviewQuestionsParser.ShortTextQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceQuestion(InterviewQuestionsParser.SingleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion(InterviewQuestionsParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#integerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerQuestion(InterviewQuestionsParser.IntegerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#decimalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalQuestion(InterviewQuestionsParser.DecimalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#dateQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateQuestion(InterviewQuestionsParser.DateQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#timeQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeQuestion(InterviewQuestionsParser.TimeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScaleQuestion(InterviewQuestionsParser.NumericScaleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(InterviewQuestionsParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#weight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeight(InterviewQuestionsParser.WeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(InterviewQuestionsParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterviewQuestionsParser#scale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale(InterviewQuestionsParser.ScaleContext ctx);
}