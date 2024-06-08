package core.management.RequirementSpecification.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RequirementSpecification.domain.RequirementSpecification;
import core.management.RequirementSpecification.repository.RequirementSpecificationRepository;

import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class RegisterRequirementSpecificationService {

    private final RequirementSpecificationRepository requirementSpecificationRepository = PersistenceContext.repositories().requirementSpecification();

    // Método para registrar um novo plugin
    public void registerPlugin(String name, String jarPath) throws Exception {
        Path path = Paths.get(jarPath);
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("The specified .jar file does not exist.");
        }

        RequirementSpecification plugin = new RequirementSpecification(name, jarPath);
        requirementSpecificationRepository.save(plugin);
    }

    // Método para carregar um plugin registrado
    public Object loadPlugin(RequirementSpecification plugin) throws Exception {
        URL[] urls = { new URL("file://" + plugin.getJarPath()) };
        try (URLClassLoader classLoader = new URLClassLoader(urls)) {
            Class<?> clazz = classLoader.loadClass("MainPlugin");
            return clazz.getDeclaredConstructor().newInstance();
        }
    }

    public Optional<RequirementSpecification> findPluginByName(String pluginName) {
        return requirementSpecificationRepository.ofIdentity(pluginName);
    }
}
