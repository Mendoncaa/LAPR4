package core.management.Plugin.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.Plugin.domain.Plugin;
import core.management.Plugin.domain.PluginType;
import core.management.Plugin.repository.PluginRepository;

import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class RegisterPluginService {

    private final PluginRepository pluginRepository = PersistenceContext.repositories().plugin();

    // Método para registrar um novo plugin
    public Plugin registerPlugin(String name, String jarPath, PluginType type) throws Exception {
        Path path = Paths.get(jarPath);
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("The specified .jar file does not exist.");
        }

        Plugin plugin = new Plugin(name, jarPath, type);
        return pluginRepository.save(plugin);
    }

    // Método para carregar um plugin registrado
    public Object loadPlugin(Plugin plugin) throws Exception {
        URL[] urls = { new URL("file://" + plugin.getJarPath()) };
        try (URLClassLoader classLoader = new URLClassLoader(urls)) {
            Class<?> clazz = classLoader.loadClass("MainPlugin");
            return clazz.getDeclaredConstructor().newInstance();
        }
    }

    public Optional<Plugin> findPluginByName(String pluginName) {
        return pluginRepository.ofIdentity(pluginName);
    }
}
