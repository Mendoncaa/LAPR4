package core.management.RecruitmentProcess.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.PhaseValidatorService;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.application.UseCaseController;
import org.springframework.stereotype.Component;

import java.util.Optional;

@UseCaseController
@Component
public class PhasesController {

    private JobOpeningRepository jobOpeningRepository;
    private PhaseValidatorService phaseValidatorService;

    public PhasesController() {
        jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    }

    public void validateJobReference(String jobReference) {
        Optional<JobOpening> jobOpening = jobOpeningRepository.findByJobReference(new JobReference(jobReference));
        RecruitmentProcess recruitmentProcess = jobOpening.get().getRecruitmentProcess();
        phaseValidatorService = new PhaseValidatorService(recruitmentProcess);
        Iterable<String> options = phaseValidatorService.validatePhaseTransition(jobReference);
    }

    public void processTransition(String chosenOption) {
        RecruitmentProcess recruitmentProcess = phaseValidatorService.getRecruitmentProcess();
        if ("Forward".equals(chosenOption)) {
            recruitmentProcess.nextPhase();
        } else if ("Backward".equals(chosenOption)) {
            recruitmentProcess.previousPhase();
        }
        //jobOpeningRepository.save(recruitmentProcess);
    }
}
