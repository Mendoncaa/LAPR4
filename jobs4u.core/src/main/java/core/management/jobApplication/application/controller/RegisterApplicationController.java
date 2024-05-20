package core.management.jobApplication.application.controller;

import java.io.IOException;

import core.management.jobApplication.application.service.ApplicationService;

public class RegisterApplicationController {
    private final ApplicationService applicationService = new ApplicationService();

    public void registerApplication(String path) throws IOException {
        applicationService.processApplicationFiles(path);
    }
}
