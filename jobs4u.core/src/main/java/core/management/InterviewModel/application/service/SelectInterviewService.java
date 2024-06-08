package core.management.InterviewModel.application.service;


import core.infrastructure.persistence.PersistenceContext;
import core.management.InterviewModel.domain.InterviewModel;
import core.management.InterviewModel.repository.InterviewModelRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;

import java.util.List;
import java.util.Optional;


public class SelectInterviewService {

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    private final InterviewModelRepository interviewModelRepository = PersistenceContext.repositories().interviewModel();

    public void selectInterviewModel(JobReference jobReference, String pluginName) {
        Optional<JobOpening> jobOpeningOpt = jobOpeningRepository.findByJobReference(jobReference);
        Optional<InterviewModel> pluginOpt = interviewModelRepository.ofIdentity(pluginName);

        if (jobOpeningOpt.isPresent() && pluginOpt.isPresent()) {
            JobOpening jobOpening = jobOpeningOpt.get();
            InterviewModel plugin = pluginOpt.get();
            jobOpening.setInterviewModel(plugin);
            jobOpeningRepository.save(jobOpening);
        } else {
            throw new IllegalArgumentException("Invalid JobOpening or Plugin ID");
        }
    }

    public List<InterviewModel> allPlugins() {
        return (List<InterviewModel>) interviewModelRepository.findAll();
    }
}
