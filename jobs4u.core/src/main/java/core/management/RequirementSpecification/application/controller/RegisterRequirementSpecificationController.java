package core.management.RequirementSpecification.application.controller;


import core.management.RequirementSpecification.application.service.RegisterRequirementSpecificationService;
import core.management.RequirementSpecification.domain.RequirementSpecification;

import java.util.Optional;

public class RegisterRequirementSpecificationController {

    private final RegisterRequirementSpecificationService pluginService = new RegisterRequirementSpecificationService();

    // Endpoint para registrar um novo plugin
    public void registerRequirementSpecification(String name, String jarPath) throws Exception {
        pluginService.registerPlugin(name, jarPath);
    }

    // Endpoint para carregar um plugin registrado

//    public Object loadPlugin(String pluginName) throws Exception {
//        Optional<RequirementSpecification> plugin = pluginService.findPluginByName(pluginName);
//        if (plugin.isPresent()) {
//            return pluginService.loadPlugin(plugin.get());
//        }
//        throw new IllegalArgumentException("Invalid plugin ID");
//    }//TODO: Preciso de carregar um plugin no sistema?
}
