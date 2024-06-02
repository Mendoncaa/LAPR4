package core.management.Plugin.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.Plugin.domain.Plugin;
import core.management.Plugin.repository.PluginRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;

import java.util.List;
import java.util.Optional;

public class SelectRequirementsService {

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    private final PluginRepository pluginRepository = PersistenceContext.repositories().plugin();

    public void selectRequirementSpecification(JobReference jobReference, String pluginName) {
        Optional<JobOpening> jobOpeningOpt = jobOpeningRepository.findByJobReference(jobReference);
        Optional<Plugin> pluginOpt = pluginRepository.ofIdentity(pluginName);

        if (jobOpeningOpt.isPresent() && pluginOpt.isPresent()) {
            JobOpening jobOpening = jobOpeningOpt.get();
            Plugin plugin = pluginOpt.get();
            jobOpening.setRequirementsSpecification(plugin);
            jobOpeningRepository.save(jobOpening);
        } else {
            throw new IllegalArgumentException("Invalid JobOpening or Plugin ID");
        }
    }

    public List<Plugin> allPlugins() {
        return (List<Plugin>) pluginRepository.findAll();
    }
}



