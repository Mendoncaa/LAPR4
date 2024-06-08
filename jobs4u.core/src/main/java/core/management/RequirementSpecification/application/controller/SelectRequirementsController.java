package core.management.RequirementSpecification.application.controller;

import core.management.RequirementSpecification.application.service.SelectRequirementsService;
import core.management.RequirementSpecification.domain.RequirementSpecification;
import core.management.jobOpening.domain.JobReference;

import java.util.List;

public class SelectRequirementsController {

    private final SelectRequirementsService selectRequirementSpecification = new SelectRequirementsService();

    public void selectRequirementSpecification(JobReference jobReference, String pluginName) {
        selectRequirementSpecification.selectRequirementSpecification(jobReference, pluginName);
    }

    public List<RequirementSpecification> allPlugins() {
        return selectRequirementSpecification.allPlugins();
    }

}