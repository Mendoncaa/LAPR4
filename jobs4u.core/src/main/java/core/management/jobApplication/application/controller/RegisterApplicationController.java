package core.management.jobApplication.application.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import core.management.jobApplication.application.service.ApplicationService;

public class RegisterApplicationController {
    private final ApplicationService applicationService = new ApplicationService();

    public void registerApplication(String jobReference, String path, String applicationId) throws IOException {
        Path jobOpeningPath = Paths.get(path, jobReference);
        Path selectedApplicationPath = jobOpeningPath.resolve(applicationId);
        applicationService.processApplicationFiles(jobReference, path, applicationId);
    }

    public boolean existsPathJobOpening(String jobReference, String path){
        Path jobOpeningPath = Paths.get(path, jobReference);
        System.out.println("Resource Path: " + jobOpeningPath);
        if (!Files.exists(jobOpeningPath) || !Files.isDirectory(jobOpeningPath)) {
            return false;
        }
        return true;
    }

    public List<Path> getListApplications(String jobReference, String path) throws IOException {
        Path jobOpeningPath = Paths.get(path, jobReference);
        List<Path> app = new ArrayList<>();
        DirectoryStream<Path> stream = Files.newDirectoryStream(jobOpeningPath);
        for (Path pat : stream) {
            if (Files.isDirectory(pat)) {
                app.add(pat);
            }
        }
        return app;
    }

    public boolean existsPathForCandidate(String jobReference, String path, String applicationId) {
        Path jobOpeningPath = Paths.get(path, jobReference);
        Path selectedApplicationPath = jobOpeningPath.resolve(applicationId);
        if (!Files.exists(selectedApplicationPath) || !Files.isDirectory(selectedApplicationPath)) {
            return false;
        }
        return true;
    }
}
