package core.management.Plugin.application.controller;

import core.management.jobApplication.application.service.ApplicationService;
import core.management.jobApplication.application.service.JobOpeningService;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.domain.JobOpening;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UploadRequirementsController {
    JobOpeningService jobOpeningService = new JobOpeningService();
    ApplicationService applicationService = new ApplicationService();

    public Iterable<jobApplication> getApplications() {
        return applicationService.findAll();
    }

    public void uploadTextFile(jobApplication application, String path) {

        applicationService.uploadRequirementsResponses(application, path);
    }

    private String extractAfterSecondColon(String line) {
        int firstColonIndex = line.indexOf(":");

        if (firstColonIndex != -1) {
            int secondColonIndex = line.indexOf(":", firstColonIndex + 1);
            if (secondColonIndex != -1) {
                return line.substring(secondColonIndex + 1).trim();
            }
        }

        return "";
    }

    private List<String> readFileLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file");
            e.printStackTrace();
        }
        return lines;
    }
}
