package core.management.InterviewModel.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.InterviewModel.domain.InterviewModel;
import core.management.InterviewModel.repository.InterviewModelRepository;

import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class RegisterInterviewModelService {

    private final InterviewModelRepository interviewModelRepositoryRepository = PersistenceContext.repositories().interviewModel();

    // Método para registrar um novo plugin
    public void registerPlugin(String name, String jarPath) throws Exception {
        Path path = Paths.get(jarPath);
        if (!Files.exists(path)) {
            throw new IllegalArgumentException("The specified .jar file does not exist.");
        }

        InterviewModel plugin = new InterviewModel(name, jarPath);
        interviewModelRepositoryRepository.save(plugin);
    }

    // Método para carregar um plugin registrado
    public Object loadPlugin(InterviewModel plugin) throws Exception {
        URL[] urls = { new URL("file://" + plugin.getJarPath()) };
        try (URLClassLoader classLoader = new URLClassLoader(urls)) {
            Class<?> clazz = classLoader.loadClass("MainPlugin");
            return clazz.getDeclaredConstructor().newInstance();
        }
    }

    public Optional<InterviewModel> findPluginByName(String pluginName) {
        return interviewModelRepositoryRepository.ofIdentity(pluginName);
    }
}
