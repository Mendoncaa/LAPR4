package core.management.jobApplication.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobOpening.domain.JobReference;
import eapli.framework.domain.services.DomainService;
import jobs4u.Application;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@DomainService
@Component
public class OrderApplicationsService {

    private final RecruitmentProcess recruitmentProcess;

    public OrderApplicationsService(RecruitmentProcess recruitmentProcess) {
        this.recruitmentProcess = recruitmentProcess;
    }

    public List<jobApplication> orderedListOfApplications(List<jobApplication> applications) throws Exception {
        List<jobApplication> orderedApplications = new ArrayList<>();
        if (!validateCurrentPhase()) {
            throw new Exception("Current phase is not ANALYSIS.");
        }

        applications.stream()
                .filter(application -> application.getInterview() != null && application.getInterview().getInterviewGrade() != null)
                .sorted(Comparator.comparing(application -> application.getInterview().getInterviewGrade().getGrade()))
                .forEachOrdered(orderedApplications::add);

        Collections.reverse(orderedApplications);

        return orderedApplications;
    }

    private boolean validateCurrentPhase() {
        return recruitmentProcess.currentPhase().getName() == PhaseName.ANALYSIS;
    }
}