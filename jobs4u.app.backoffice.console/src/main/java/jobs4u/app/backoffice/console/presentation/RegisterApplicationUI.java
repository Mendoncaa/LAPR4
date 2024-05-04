/*package jobs4u.app.backoffice.console.presentation;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import core.management.jobApplication.application.controller.RegisterApplicationController;
import core.management.jobOpening.application.ListJobOpeningService;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.io.util.Console;

public class RegisterApplicationUI extends AbstractUI {

    private final RegisterApplicationController theController;
    private final ListJobOpeningService jobOpeningService;

    public RegisterApplicationUI(RegisterApplicationController theController, ListJobOpeningService jobOpeningService) {
        this.theController = theController;
        this.jobOpeningService = jobOpeningService;
    }

    @Override
    protected boolean doShow() {
        List<JobOpening> jobOpenings = jobOpeningService.listJobOpenings();
        if (jobOpenings.isEmpty()) {
            System.out.println("No job openings available.");
            return false;
        }

        System.out.println("Available Job Openings:");
        jobOpenings.forEach(job -> System.out.println(job.getJobReference().toString()));

        String selectedJobRef = Console.readLine("Enter the Job Reference from the above list:");
        Path jobOpeningPath = Paths.get("path/to/applications", selectedJobRef);

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
*/