package core.management.RecruitmentProcess.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.service.PhaseValidatorService;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@UseCaseController
@Component
public class PhasesController {

    private JobOpeningRepository jobOpeningRepository;

    private PhaseValidatorService phaseValidatorService;

    private AuthorizationService authz;

    private JobOpening jobOpeningChosen;

    public PhasesController() {
        jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
        authz = AuthzRegistry.authorizationService();
    }

    @Transactional
    public Iterable<String> validateJobReference(String jobReference) throws Exception {
        Optional<JobOpening> jobOpening;
        try {
            jobOpening = jobOpeningRepository.findByJobReference(new JobReference(jobReference));
            if (jobOpening.isEmpty()) {
                throw new Exception("Invalid Job Reference!");
            }
        }catch (Exception e){
            throw new Exception("Invalid Job Reference!");
        }
        jobOpeningChosen = jobOpening.get();
        RecruitmentProcess recruitmentProcess = jobOpeningChosen.getRecruitmentProcess();
        phaseValidatorService = new PhaseValidatorService(recruitmentProcess);
        return phaseValidatorService.validatePhaseTransition(jobOpeningChosen);
    }

    @Transactional
    public boolean processTransition(String chosenOption) throws Exception {

        RecruitmentProcess recruitmentProcess = jobOpeningChosen.getRecruitmentProcess();

        if ("Forward".equalsIgnoreCase(chosenOption)) {
            if (!recruitmentProcess.nextPhase()) {
                throw new Exception("Error processing transition to next phase!");
            }
        } else if ("Backward".equalsIgnoreCase(chosenOption)) {
            if (!recruitmentProcess.previousPhase()) {
                throw new Exception("Error processing transition to previous phase!");
            }
        } else {
            return false;
        }
        try {
            authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("CUSTOMER_MANAGER"), Role.valueOf("ADMIN"));
        }catch (Exception e){
            throw new Exception("User does not have permission to perform this operation");
        }

        try {
            jobOpeningChosen.setRecruitmentProcess(recruitmentProcess);
            jobOpeningRepository.save(jobOpeningChosen);
        }
        catch (Exception e){
            throw new Exception("Error persisting changes");
        }

        return true;
    }
}
