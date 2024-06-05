package core.management.RecruitmentProcess.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.PhaseValidatorService;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Transactional
@UseCaseController
@Component
public class PhasesController {

    private JobOpeningRepository jobOpeningRepository;

    private PhaseValidatorService phaseValidatorService;

    private AuthorizationService authz;

    public PhasesController() {
        jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
        authz = AuthzRegistry.authorizationService();
    }

    public Iterable<String> validateJobReference(String jobReference) {
        Optional<JobOpening> jobOpening;
        try {
            jobOpening = jobOpeningRepository.findByJobReference(new JobReference(jobReference));
            if (jobOpening.isEmpty()) {
                return null;
            }
        }catch (IllegalArgumentException e){
            return null;
        }

        RecruitmentProcess recruitmentProcess = jobOpening.get().getRecruitmentProcess();
        phaseValidatorService = new PhaseValidatorService(recruitmentProcess);
        return phaseValidatorService.validatePhaseTransition(jobReference);
    }

    public boolean processTransition(String chosenOption, String jobReference) {
        Optional<JobOpening> jobOpeningOpt = jobOpeningRepository.findByJobReference(new JobReference(jobReference));
        if (jobOpeningOpt.isEmpty()) {
            return false;
        }

        JobOpening jobOpening = jobOpeningOpt.get();
        RecruitmentProcess recruitmentProcess = jobOpening.getRecruitmentProcess();

        if ("Forward".equalsIgnoreCase(chosenOption)) {
            recruitmentProcess.nextPhase();
        } else if ("Backward".equalsIgnoreCase(chosenOption)) {
            recruitmentProcess.previousPhase();
        } else {
            return false;
        }

        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("CUSTOMER_MANAGER"), Role.valueOf("ADMIN"));

        jobOpening.setRecruitmentProcess(recruitmentProcess);
        jobOpeningRepository.save(jobOpening);
        return true;
    }
}
