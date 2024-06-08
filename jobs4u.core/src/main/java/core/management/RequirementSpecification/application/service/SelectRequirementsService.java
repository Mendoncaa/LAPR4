package core.management.RequirementSpecification.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RequirementSpecification.domain.RequirementSpecification;
import core.management.RequirementSpecification.repository.RequirementSpecificationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;

import java.util.List;
import java.util.Optional;

public class SelectRequirementsService {

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    private final RequirementSpecificationRepository requirementSpecificationRepository = PersistenceContext.repositories().requirementSpecification();

    public void selectRequirementSpecification(JobReference jobReference, String pluginName) {
        Optional<JobOpening> jobOpeningOpt = jobOpeningRepository.findByJobReference(jobReference);
        Optional<RequirementSpecification> pluginOpt = requirementSpecificationRepository.ofIdentity(pluginName);

        if (jobOpeningOpt.isPresent() && pluginOpt.isPresent()) {
            JobOpening jobOpening = jobOpeningOpt.get();
            RequirementSpecification plugin = pluginOpt.get();
            jobOpening.setRequirementsSpecification(plugin);
            jobOpeningRepository.save(jobOpening);
        } else {
            throw new IllegalArgumentException("Invalid JobOpening or Plugin ID");
        }
    }

    public List<RequirementSpecification> allPlugins() {
        return (List<RequirementSpecification>) requirementSpecificationRepository.findAll();
    }
}



