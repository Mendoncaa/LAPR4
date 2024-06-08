package core.management.InterviewModel.application.controller;


import core.management.InterviewModel.application.service.RegisterInterviewModelService;
import core.management.InterviewModel.domain.InterviewModel;

import java.util.Optional;

public class RegisterInterviewModelController {

    private final RegisterInterviewModelService interviewModelServiceService = new RegisterInterviewModelService();

    // Endpoint para registrar um novo plugin
    public void registerInterviewModel(String name, String jarPath) throws Exception {
        interviewModelServiceService.registerPlugin(name, jarPath);
    }

    // Endpoint para carregar um plugin registrado

    public Object loadPlugin(String pluginName) throws Exception {
        Optional<InterviewModel> plugin = interviewModelServiceService.findPluginByName(pluginName);
        if (plugin.isPresent()) {
            return interviewModelServiceService.loadPlugin(plugin.get());
        }
        throw new IllegalArgumentException("Invalid plugin ID");
    }
}
