package jobs4u.app.backoffice.console.presentation.plugins.RequirementsSpecification;

import core.management.InterviewModel.application.controller.VerifyInterviewsController;
import core.management.RequirementSpecification.application.controller.VerifyRequirementsController;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import jobs4u.antlr4.CustomerRequirementsManagement.RequirementAnswers;
import jobs4u.antlr4.InterviewModelManagement.InterviewAnswers;

import java.io.IOException;
import java.util.List;

public class VerifyRequirementsUI extends AbstractUI {

    private final ListJobOpeningsController listJobOpeningsController = new ListJobOpeningsController();

    private final VerifyRequirementsController theController = new VerifyRequirementsController();

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

        String correctFilePath = theController.getRequirementFilePath(jobReference);

        if(correctFilePath == null) {
            System.out.println("No Requirement Specification available for this job opening");
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
            List<RequirementAnswers> correctInterviews = theController.getRequirementsFromFilePath(correctFilePath);
            int position = 0;
            for(String filePath : candidatesFilePath) {
                List<RequirementAnswers> candidateInterviews = theController.getRequirementsFromFilePath(filePath);
                boolean passedRequirements = theController.checkRequirements(correctInterviews, candidateInterviews);
                theController.saveEvaluationToJobApplication(applications.get(position), passedRequirements);
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
        return "Verify Requirements";
    }
}
