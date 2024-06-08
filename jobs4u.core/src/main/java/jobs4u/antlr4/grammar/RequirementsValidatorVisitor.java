package jobs4u.antlr4.grammar;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class RequirementsValidatorVisitor implements CostumerRequirementsVisitor<Object> {



    @Override
    public Object visitStart(CostumerRequirementsParser.StartContext ctx) {
        return null;
    }

    @Override
    public Object visitHeader(CostumerRequirementsParser.HeaderContext ctx) {
        return null;
    }

    @Override
    public Object visitRequirement(CostumerRequirementsParser.RequirementContext ctx) {
        return null;
    }

    @Override
    public Object visitReqType(CostumerRequirementsParser.ReqTypeContext ctx) {
        return null;
    }

    @Override
    public Object visitTrueFalseReq(CostumerRequirementsParser.TrueFalseReqContext ctx) {
        return null;
    }

    @Override
    public Object visitShortAReq(CostumerRequirementsParser.ShortAReqContext ctx) {
        return null;
    }

    @Override
    public Object visitIntReq(CostumerRequirementsParser.IntReqContext ctx) {
        return null;
    }

    @Override
    public Object visitChoiceReq(CostumerRequirementsParser.ChoiceReqContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        throw new RuntimeException("Entered file is not a valid requirements file.");
    }
}
