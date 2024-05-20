package jobs4u.app.backoffice.console.presentation.JobApplication;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        Path jobOpeningPath = Paths.get("SCOMP/File_Report/" + selectedJobRef + "/1/1-candidate-data.txt");

        if (!Files.exists(jobOpeningPath) || !Files.isDirectory(jobOpeningPath)) {
            System.out.println("Invalid Job Reference or no applications found for the selected reference.");
            return false;
        }

        try {
            List<Path> applications = new ArrayList<>();
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(jobOpeningPath)) {
                for (Path path : stream) {
                    if (Files.isDirectory(path)) {
                        applications.add(path);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("There are " + applications.size() + " candidate applications for Job Reference: "
                    + selectedJobRef);
            applications.forEach(path -> System.out.println("Application ID: " + path.getFileName()));

            String selectedApplicationId = Console.readLine("Enter the Application ID you wish to process:");

            Path selectedApplicationPath = jobOpeningPath.resolve(selectedApplicationId);
            if (!Files.exists(selectedApplicationPath) || !Files.isDirectory(selectedApplicationPath)) {
                System.out.println("Invalid Application ID selected.");
                return false;
            }

            // Process the selected application
            theController.registerApplication(selectedApplicationPath.toString());
            System.out.println("Application processed successfully for Application ID: " + selectedApplicationId);
        } catch (IOException e) {
            System.out.println("Error processing applications: " + e.getMessage());
        }

        return false;
    }

    @Override
    public String headline() {
        return "Import Candidate Files for Selected Job Opening and Application";
    }
}
