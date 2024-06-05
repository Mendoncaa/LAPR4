package jobs4u.app.backoffice.console.presentation.JobApplication;


import core.management.jobApplication.application.service.JobOpeningService;
import core.management.jobOpening.domain.JobOpening;

import java.nio.file.Path;

public class GenerateTemplateController {

    JobOpeningService jobOpeningService = new JobOpeningService();

    public Iterable<JobOpening> getJobOpenings(){
        return jobOpeningService.findJobOpenings();
    }

    public boolean template(String sourcePath, JobOpening jobOpening) {
        return   jobOpeningService.generateTemplate(sourcePath, jobOpening);
        }
}