package jobs4u.antlr4.CustomerRequirementsManagement;

import jobs4u.antlr4.grammar.CostumerRequirementsLexer;
import jobs4u.antlr4.grammar.CostumerRequirementsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.IOException;
import java.util.List;

public class RequirementsChecker {
    public boolean checkRequirements(List<RequirementAnswers> correctRequirements, List<RequirementAnswers> candidateRequirements) {
        boolean passedRequirements = true;
        for (int i = 0; i < correctRequirements.size(); i++) {
            RequirementAnswers correctRequirement = correctRequirements.get(i);
            RequirementAnswers candidateRequirement = candidateRequirements.get(i);

            if (!correctRequirement.getAnswer().equals(candidateRequirement.getAnswer())) {
                passedRequirements = false;
                System.out.println("A resposta para a pergunta " + correctRequirement.getId() + " está errada.");
                System.out.println("A resposta correta é: " + correctRequirement.getAnswer());
            }
            System.out.println("A resposta para a pergunta " + correctRequirement.getId() + " está correta.");
        }
        return passedRequirements;
    }

}