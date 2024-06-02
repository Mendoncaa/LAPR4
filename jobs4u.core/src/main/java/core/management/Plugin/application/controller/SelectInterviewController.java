package core.management.Plugin.application.controller;

import core.management.Plugin.application.service.SelectInterviewService;
import core.management.Plugin.domain.Plugin;
import core.management.jobOpening.domain.JobReference;

import java.util.List;

public class SelectInterviewController {

    private final SelectInterviewService selectInterviewModel = new SelectInterviewService();

    public void selectInterviewModel(String jobReference, String pluginName) {
        selectInterviewModel.selectInterviewModel(new JobReference(jobReference), pluginName);
    }

    public List<Plugin> allPlugins() {
        return selectInterviewModel.allPlugins();
    }
}