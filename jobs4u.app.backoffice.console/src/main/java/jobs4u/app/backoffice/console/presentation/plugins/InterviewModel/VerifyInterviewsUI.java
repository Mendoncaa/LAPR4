package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import core.management.InterviewModel.application.controller.VerifyInterviewsController;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import jobs4u.antlr4.InterviewModelManagement.InterviewAnswers;
import jobs4u.antlr4.grammar.UploadInterviewsController;
import jobs4u.app.backoffice.console.presentation.authz.SystemUserPrinter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VerifyInterviewsUI extends AbstractUI {

    private final ListJobOpeningsController listJobOpeningsController = new ListJobOpeningsController();

    private final VerifyInterviewsController theController = new VerifyInterviewsController();

    @Override
    protected boolean doShow() {

        System.out.println("Available Job Openings:");
        List<JobReference> jobReferences = listJobOpeningsController.allJobReferences();
        int count = 1;
        for (JobReference jobReference : jobReferences) {
            System.out.println(count + ") " + jobReference);
            count++;
        };

        int option = Console.readInteger("Select a job opening (Enter 0 to exit): ");

        if(option == 0){
            System.out.println("No Job Opening selected");
            return false;
        }

        JobReference jobReference = jobReferences.get(option - 1);

        String correctFilePath = theController.getInterviewFilePath(jobReference);

        if(correctFilePath == null) {
            System.out.println("No interviews available for this job opening");
            return false;
        }

        List<jobApplication> applications = theController.getApplications(jobReference);

        List<String> candidatesFilePath = theController.getCandidatesFilePath(applications);

        for (String filePath : candidatesFilePath) {
            if(filePath == null) {
                System.out.println("Not every candidate has an interview file.");
                return false;
            }
        }

        try{
            List<InterviewAnswers> correctInterviews = theController.getInterviewsFromFilePath(correctFilePath);
            int position = 0;
            for(String filePath : candidatesFilePath) {
                List<InterviewAnswers> candidateInterviews = theController.getInterviewsFromFilePath(filePath);
                int interviewPoints = theController.checkInterviews(correctInterviews, candidateInterviews);
                theController.savePointsToJobApplication(applications.get(position), interviewPoints);
                position++;
            }
        } catch (IOException e) {
            System.out.println("Error reading correct or a candidate file");
            return false;
        }




        return true;
    }

    @Override
    public String headline() {
        return "Verify Interviews";
    }
}
