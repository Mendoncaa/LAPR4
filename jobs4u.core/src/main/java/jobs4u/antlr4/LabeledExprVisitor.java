// Generated from C:/Users/USER/IdeaProjects/sem4pi-23-24-2dj4/jobs4u.core/src/main/resources/grammar/LabeledExpr.g4 by ANTLR 4.13.1
package jobs4u.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LabeledExprParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#footer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFooter(LabeledExprParser.FooterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#interview_conduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterview_conduct(LabeledExprParser.Interview_conductContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(LabeledExprParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#order_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_atomic(LabeledExprParser.Order_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#score_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore_definition(LabeledExprParser.Score_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#outstandingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutstandingClause(LabeledExprParser.OutstandingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#requirements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements(LabeledExprParser.RequirementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#requirements_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements_body(LabeledExprParser.Requirements_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#requirements_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements_atomic(LabeledExprParser.Requirements_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#requirementsType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementsType(LabeledExprParser.RequirementsTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(LabeledExprParser.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#interview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterview(LabeledExprParser.InterviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#interview_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterview_body(LabeledExprParser.Interview_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#interview_atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterview_atomic(LabeledExprParser.Interview_atomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(LabeledExprParser.True_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShort(LabeledExprParser.ShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#single_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_choice(LabeledExprParser.Single_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#multiple_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_choice(LabeledExprParser.Multiple_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#c_choices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_choices(LabeledExprParser.C_choicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(LabeledExprParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#int_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_q(LabeledExprParser.Int_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#real_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_q(LabeledExprParser.Real_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#date_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_q(LabeledExprParser.Date_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#time_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_q(LabeledExprParser.Time_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#scale_q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScale_q(LabeledExprParser.Scale_qContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(LabeledExprParser.HeaderContext ctx);
}