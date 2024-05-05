package core.management.plugins.requirementsSpecifications.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.plugins.requirementsSpecifications.Repository.RequirementsSpecificationRepository;
import core.management.plugins.requirementsSpecifications.domain.RequirementsSpecification;
import org.springframework.stereotype.Controller;

@Controller
public class SelectRequirementsSpecificationController {
    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    private final RequirementsSpecificationRepository requirementsSpecificationRepository = PersistenceContext.repositories().requirementsSpecifications();

    public Iterable<JobOpening> allJobOpenings() {
        return jobOpeningRepository.findAll();
    }

    public Iterable<RequirementsSpecification> AllRequirementsSpecifications() {
        return requirementsSpecificationRepository.findAll();
    }
}
