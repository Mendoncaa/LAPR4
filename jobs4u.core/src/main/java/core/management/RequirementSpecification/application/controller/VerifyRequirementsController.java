package core.management.RequirementSpecification.application.controller;


import core.infrastructure.persistence.PersistenceContext;
import core.management.jobApplication.domain.*;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import jobs4u.antlr4.CustomerRequirementsManagement.RequirementAnswers;
import jobs4u.antlr4.CustomerRequirementsManagement.RequirementsChecker;
import jobs4u.antlr4.CustomerRequirementsManagement.RequirementsVisitor;
import jobs4u.antlr4.InterviewModelManagement.InterviewAnswers;
import jobs4u.antlr4.InterviewModelManagement.InterviewChecker;
import jobs4u.antlr4.InterviewModelManagement.InterviewVisitor;
import jobs4u.antlr4.grammar.CostumerRequirementsLexer;
import jobs4u.antlr4.grammar.CostumerRequirementsParser;
import jobs4u.antlr4.grammar.InterviewQuestionsLexer;
import jobs4u.antlr4.grammar.InterviewQuestionsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VerifyRequirementsController {

    JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    ApplicationRepository applicationRepository = PersistenceContext.repositories().application();

    public String getRequirementFilePath(JobReference jobReference) {
        return jobOpeningRepository.getRequirementFilePath(jobReference);
    }

    public List<jobApplication> getApplications(JobReference jobReference) {
        return applicationRepository.findByJobReference(jobReference);
    }

    public List<String> getCandidatesFilePath(List<jobApplication> applications) {

        List<String> candidatesFilePath = new ArrayList<>();

        for(jobApplication application : applications) {
            if(application.getRequirementAnswersPath() == null){
                candidatesFilePath.add(null);
            }
            else{
                candidatesFilePath.add(application.getRequirementAnswersPath().getFilePath());
            }
        }

        return candidatesFilePath;
    }

    public List<RequirementAnswers> getRequirementsFromFilePath(String filePath) throws IOException {
        CostumerRequirementsParser parser = createParser(filePath);
        CostumerRequirementsParser.StartContext startContext = parser.start();
        RequirementsVisitor visitor = new RequirementsVisitor();
        visitor.visit(startContext);
        return visitor.getRequirements();
    }

    private CostumerRequirementsParser createParser(String filePath) throws IOException {
        CharStream charStream = CharStreams.fromFileName(filePath);
        CostumerRequirementsLexer lexer = new CostumerRequirementsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new CostumerRequirementsParser(tokens);
    }

    public boolean checkRequirements(List<RequirementAnswers> correctInterviews, List<RequirementAnswers> candidateInterviews) {

        RequirementsChecker requrementsChecker = new RequirementsChecker();

        return requrementsChecker.checkRequirements(correctInterviews, candidateInterviews);
    }

    public void saveEvaluationToJobApplication(jobApplication application, boolean passedRequirements) {
        Requirements requirements;
        if(passedRequirements) {
            requirements = Requirements.valueOf(RequirementsEvaluation.ACCEPTED, RequirementsJustification.valueOf("The candidate has passed the requirements"));
        }
        else {
            requirements = Requirements.valueOf(RequirementsEvaluation.REJECTED, RequirementsJustification.valueOf("The candidate has not passed the requirements"));
            application.reject();
        }

        application.setRequirements(requirements);
        applicationRepository.save(application);
    }

}