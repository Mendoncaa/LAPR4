package jobs4u.antlr4.grammar;


import core.management.jobOpening.domain.JobOpening;

public class GenerateInterviewTemplateController {

    GenerateInterviewTemplateService generateInterviewTemplateService = new GenerateInterviewTemplateService();

    public Iterable<JobOpening> getJobOpenings(){
        return generateInterviewTemplateService.findJobOpenings();
    }

    public void template(String sourcePath, JobOpening jobOpening) {
        generateInterviewTemplateService.generateTemplate(sourcePath, jobOpening);
    }
}