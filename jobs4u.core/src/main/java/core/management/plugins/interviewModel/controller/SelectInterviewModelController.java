package core.management.plugins.interviewModel.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.plugins.interviewModel.Repository.InterviewModelRepository;
import core.management.plugins.interviewModel.domain.InterviewModel;
import core.management.plugins.requirementsSpecifications.Repository.RequirementsSpecificationRepository;
import core.management.plugins.requirementsSpecifications.domain.RequirementsSpecification;
import org.springframework.stereotype.Controller;

@Controller
public class SelectInterviewModelController {

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    private final InterviewModelRepository interviewModelRepository = PersistenceContext.repositories().interviewModel();

    public Iterable<JobOpening> allJobOpenings() {
        return jobOpeningRepository.findAll();
    }

    public Iterable<InterviewModel> AllInterviewModels() {
        return interviewModelRepository.findAll();
    }

    public void associateInterviewModelToJobOpening(JobOpening jobOpening, InterviewModel interviewModel) {
        jobOpening.setInterviewModel(interviewModel);
        jobOpeningRepository.save(jobOpening);
    }
}
