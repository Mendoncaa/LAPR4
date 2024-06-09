package core.management.InterviewModel.application.controller;


import core.infrastructure.persistence.PersistenceContext;
import core.management.jobApplication.domain.*;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import jobs4u.antlr4.InterviewModelManagement.InterviewAnswers;
import jobs4u.antlr4.InterviewModelManagement.InterviewChecker;
import jobs4u.antlr4.InterviewModelManagement.InterviewVisitor;
import jobs4u.antlr4.grammar.InterviewQuestionsLexer;
import jobs4u.antlr4.grammar.InterviewQuestionsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VerifyInterviewsController {

    JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    ApplicationRepository applicationRepository = PersistenceContext.repositories().application();

    public String getInterviewFilePath(JobReference jobReference) {
        return jobOpeningRepository.getInterviewFilePath(jobReference);
    }

    public List<jobApplication> getApplications(JobReference jobReference) {
        return applicationRepository.findByJobReference(jobReference);
    }

    public List<String> getCandidatesFilePath(List<jobApplication> applications) {

        List<String> candidatesFilePath = new ArrayList<>();

        for(jobApplication application : applications) {
            if(application.getInterviewAnswersPath() == null){
                candidatesFilePath.add(null);
            }
            else{
                candidatesFilePath.add(application.getInterviewAnswersPath().getFilePath());
            }
        }

        return candidatesFilePath;
    }

    public List<InterviewAnswers> getInterviewsFromFilePath(String filePath) throws IOException{
        InterviewQuestionsParser parser = createParser(filePath);
        InterviewQuestionsParser.StartContext startContext = parser.start();
        InterviewVisitor visitor = new InterviewVisitor();
        visitor.visit(startContext);
        return visitor.getInterviews();
    }

    private InterviewQuestionsParser createParser(String filePath) throws IOException {
        CharStream charStream = CharStreams.fromFileName(filePath);
        InterviewQuestionsLexer lexer = new InterviewQuestionsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new InterviewQuestionsParser(tokens);
    }

    public int checkInterviews(List<InterviewAnswers> correctInterviews, List<InterviewAnswers> candidateInterviews) {
        int totalScore = 0;

        InterviewChecker interviewChecker = new InterviewChecker();

        return interviewChecker.checkInterviews(correctInterviews, candidateInterviews);
    }

    public void savePointsToJobApplication(jobApplication application, int points) {
        Interview interview = Interview.valueOf(InterviewDateTime.valueOf(LocalDate.now()), InterviewGrade.valueOf(points), InterviewJustification.valueOf("This candidate has been evaluated."));
        application.setInterview(interview);
        applicationRepository.save(application);
    }

}