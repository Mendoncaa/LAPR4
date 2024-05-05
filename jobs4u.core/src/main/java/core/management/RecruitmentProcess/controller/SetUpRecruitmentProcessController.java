package core.management.RecruitmentProcess.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.Phase;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.RecruitmentProcess.domain.Status;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Role;

import java.time.LocalDate;

public class SetUpRecruitmentProcessController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    public boolean setupPhases(JobOpening jobOpening, boolean includeInterviews,
                               LocalDate applicationStart, LocalDate applicationEnd,
                               LocalDate screeningStart, LocalDate screeningEnd,
                               LocalDate interviewStart, LocalDate interviewEnd,
                               LocalDate analysisStart, LocalDate analysisEnd,
                               LocalDate resultStart, LocalDate resultEnd) {
        if (!isValidSequence(applicationEnd, screeningStart) ||
                !isValidDates(applicationStart, applicationEnd) ||
                !isValidDates(screeningStart, screeningEnd) ||
                (includeInterviews && (!isValidSequence(screeningEnd, interviewStart) ||
                        !isValidDates(interviewStart, interviewEnd))) ||
                !isValidSequence(includeInterviews ? interviewEnd : screeningEnd, analysisStart) ||
                !isValidDates(analysisStart, analysisEnd) ||
                !isValidSequence(analysisEnd, resultStart) ||
                !isValidDates(resultStart, resultEnd)) {
            return false;
        }

        RecruitmentProcess recruitmentProcess = new RecruitmentProcess();
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION, applicationStart, applicationEnd, Status.CLOSED));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING, screeningStart, screeningEnd, Status.CLOSED));
        if (includeInterviews) {
            recruitmentProcess.addPhase(new Phase(PhaseName.INTERVIEWS, interviewStart, interviewEnd, Status.CLOSED));
        }
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS, analysisStart, analysisEnd, Status.CLOSED));
        recruitmentProcess.addPhase(new Phase(PhaseName.RESULT, resultStart, resultEnd, Status.CLOSED));

        jobOpening.setRecruitmentProcess(recruitmentProcess);
        jobOpeningRepository.save(jobOpening);

        return true;
    }

    private boolean isValidSequence(LocalDate previousEnd, LocalDate nextStart) {
        return !previousEnd.isAfter(nextStart);
    }

    private boolean isValidDates(LocalDate start, LocalDate end) {
        return !start.isAfter(end);
    }

    public Iterable<JobOpening> allJobOpenings() {

        authz.ensureAuthenticatedUserHasAnyOf(Role.valueOf("CUSTOMER_MANAGER"), Role.valueOf("ADMIN"));

        return jobOpeningRepository.findAll();
    }
}
