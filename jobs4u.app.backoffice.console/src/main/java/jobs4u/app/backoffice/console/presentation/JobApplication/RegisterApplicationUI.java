package jobs4u.app.backoffice.console.presentation.JobApplication;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import core.management.jobApplication.application.controller.RegisterApplicationController;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.io.util.Console;
import jobs4u.Application;

public class RegisterApplicationUI extends AbstractUI {

    private final RegisterApplicationController theController = new RegisterApplicationController();
    private final ListJobOpeningsController jobOpeningController = new ListJobOpeningsController();

    @Override
    protected boolean doShow() {
        Iterable<JobOpening> jobOpenings = jobOpeningController.allJobOpenings();
        

        System.out.println("Available Job Openings:");
        jobOpenings.forEach(job -> System.out.println(job.getJobReference().toString()));

        String selectedJobRef = Console.readLine("Enter the Job Reference from the above list:");
        String path = "jobs4u.app.backoffice.console/src/main/resources/SCOMP/File_Report";
        if(!theController.existsPathJobOpening(selectedJobRef, path)) {
            System.out.println("No Candidate Applications found for the selected Job Reference.");
            return false;
        }

        List<Path> applications = null;
        try {
            applications = theController.getListApplications(selectedJobRef, path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("There are " + applications.size() + " candidate applications for Job Reference: "
                + selectedJobRef);
        applications.forEach(pat -> System.out.println("Application ID: " + pat.getFileName()));

        String selectedApplicationId = Console.readLine("Enter the Application ID you wish to process:");

        if(!theController.existsPathForCandidate(selectedJobRef, path, selectedApplicationId)) {
            System.out.println("Invalid Application ID selected");
            return false;
        }

        try {
            theController.registerApplication(selectedJobRef, path, selectedApplicationId);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Application processed successfully for Application ID: " + selectedApplicationId);

        return false;

    }

    @Override
    public String headline() {
        return "Import Candidate Files for Selected Job Opening and Application";
    }
}
