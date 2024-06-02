package core.management.Plugin.application.controller;


import core.management.Plugin.application.service.RegisterPluginService;
import core.management.Plugin.domain.Plugin;
import core.management.Plugin.domain.PluginType;

import java.util.Optional;

public class RegisterPluginController {

    private final RegisterPluginService pluginService = new RegisterPluginService();

    // Endpoint para registrar um novo plugin
    public Plugin registerPlugin(String name, String jarPath, PluginType type) throws Exception {
        return pluginService.registerPlugin(name, jarPath, type);
    }

    // Endpoint para carregar um plugin registrado

    public Object loadPlugin(String pluginName) throws Exception {
        Optional<Plugin> plugin = pluginService.findPluginByName(pluginName);
        if (plugin.isPresent()) {
            return pluginService.loadPlugin(plugin.get());
        }
        throw new IllegalArgumentException("Invalid plugin ID");
    }//TODO: Preciso de carregar um plugin no sistema?
}
