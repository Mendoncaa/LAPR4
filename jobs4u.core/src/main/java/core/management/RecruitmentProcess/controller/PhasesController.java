package core.management.RecruitmentProcess.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.PhaseValidatorService;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Transactional
@UseCaseController
@Component
public class PhasesController {

    @Autowired
    private JobOpeningRepository jobOpeningRepository;

    @Autowired
    private PhaseValidatorService phaseValidatorService;

    @Autowired
    private AuthorizationService authz;

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
