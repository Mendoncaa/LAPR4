package core.management.InterviewModel.application.controller;

import core.management.InterviewModel.application.service.SelectInterviewService;
import core.management.InterviewModel.domain.InterviewModel;
import core.management.jobOpening.domain.JobReference;

import java.util.List;

public class SelectInterviewController {

    private final SelectInterviewService selectInterviewModel = new SelectInterviewService();

    public void selectInterviewModel(JobReference jobReference, String pluginName) {
        selectInterviewModel.selectInterviewModel(jobReference, pluginName);
    }

    public List<InterviewModel> allPlugins() {
        return selectInterviewModel.allPlugins();
    }
}