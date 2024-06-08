package jobs4u.antlr4.grammar;


import core.management.jobOpening.domain.JobOpening;

public class GenerateRequirementSpecificationTemplateController {

    GenerateRequirementSpecificationTemplateService generateRequirementSpecificationTemplateService = new GenerateRequirementSpecificationTemplateService();

    public Iterable<JobOpening> getJobOpenings(){
        return generateRequirementSpecificationTemplateService.findJobOpenings();
    }

    public void template(String sourcePath, JobOpening jobOpening) {
        generateRequirementSpecificationTemplateService.generateTemplate(sourcePath, jobOpening);
    }
}