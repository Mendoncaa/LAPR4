package core.management.Plugin.application.controller;

import core.management.Plugin.application.service.SelectRequirementsService;
import core.management.Plugin.domain.Plugin;
import core.management.jobOpening.domain.JobReference;

import java.util.List;

public class SelectRequirementsController {

    private final SelectRequirementsService selectRequirementSpecification = new SelectRequirementsService();

    public void selectRequirementSpecification(String jobReference, String pluginName) {
        selectRequirementSpecification.selectRequirementSpecification(new JobReference(jobReference), pluginName);
    }

    public List<Plugin> allPlugins() {
        return selectRequirementSpecification.allPlugins();
    }

}