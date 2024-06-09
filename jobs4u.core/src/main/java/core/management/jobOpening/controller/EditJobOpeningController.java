package core.management.jobOpening.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobOpening.domain.*;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.general.domain.model.Description;

public class EditJobOpeningController {
    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();

    public void changeTitle(JobOpening job, String newTitle) {
        job.setJobTitle( JobTitle.valueOf(newTitle));
        jobOpeningRepository.save(job);

    }

    public void changeState(JobOpening job, String newState) {
        job.setJobState( JobState.valueOf(newState));
        jobOpeningRepository.save(job);
    }

    public void changeContractType(JobOpening job, String newContractType) {
        job.setContractType( ContractType.valueOf(newContractType));
        jobOpeningRepository.save(job);
    }

    public void changeMode(JobOpening job, String newMode) {
        job.setMode(JobMode.valueOf(newMode));
        jobOpeningRepository.save(job);
    }

    public void changeDescription(JobOpening job, String newDescription) {
        job.setDescription( Description.valueOf(newDescription));
        jobOpeningRepository.save(job);
    }

    public void changeAddress(JobOpening job, String newAddress) {
        job.setAddress( new Address (newAddress));
        jobOpeningRepository.save(job);

    }

    public void changeNumberOfVacancies(JobOpening job, int newNumberOfVacancies) {
        job.setNumberOfVacancies( new NumberOfVacancies (newNumberOfVacancies));
        jobOpeningRepository.save(job);
    }

    public JobOpening findByJobReference(String jobReferenceStr) {
       return jobOpeningRepository.findByJobReference(new JobReference (jobReferenceStr)).get();
    }

}
