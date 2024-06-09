package core.management.jobApplication.application.controller;

import core.infrastructure.persistence.PersistenceContext;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.jobApplication.application.service.OrderApplicationsService;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import eapli.framework.application.UseCaseController;
import jakarta.transaction.Transactional;
import jobs4u.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Transactional
@UseCaseController
@Component
public class ListOrderedApplicationsController {

    private JobOpeningRepository jobOpeningRepository;

    private ApplicationRepository applicationRepository;

    private OrderApplicationsService orderApplicationsService;

    public ListOrderedApplicationsController() {
        jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
        applicationRepository = PersistenceContext.repositories().application();
    }

    public List<jobApplication> validateJobReference(String jobReference) throws Exception {
        Optional<JobOpening> jobOpeningOpt;
        try {
            jobOpeningOpt = jobOpeningRepository.findByJobReference(new JobReference(jobReference));
        }
        catch (Exception e) {
            throw new Exception("Invalid job reference.");
        }


        JobOpening jobOpening = jobOpeningOpt.get();
        RecruitmentProcess recruitmentProcess = jobOpening.getRecruitmentProcess();
        JobReference jobRef = jobOpening.getJobReference();
        orderApplicationsService = new OrderApplicationsService(recruitmentProcess);
        List<jobApplication> applications = applicationRepository.findByJobReference(jobRef);

        return orderApplicationsService.orderedListOfApplications(applications);
    }
}