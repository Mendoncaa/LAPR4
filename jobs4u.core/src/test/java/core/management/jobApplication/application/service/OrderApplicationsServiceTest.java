package core.management.jobApplication.application.service;

import core.management.RecruitmentProcess.domain.*;
import core.management.jobApplication.domain.Interview;
import core.management.jobApplication.domain.InterviewGrade;
import core.management.jobApplication.domain.jobApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderApplicationsServiceTest {

    private RecruitmentProcess recruitmentProcess;
    private OrderApplicationsService orderApplicationsService;

    private jobApplication application1;
    private jobApplication application2;
    private jobApplication application3;

    @BeforeEach
    void setUp() {

        application1 = new jobApplication(null, null);
        Interview interview = new Interview();
        interview.setInterviewGrade(new InterviewGrade(3));
        application1.setInterview(interview);

        application2 = new jobApplication(null, null);
        interview = new Interview();
        interview.setInterviewGrade(new InterviewGrade(1));
        application2.setInterview(interview);

        application3 = new jobApplication(null, null);
        interview = new Interview();
        interview.setInterviewGrade(new InterviewGrade(2));
        application3.setInterview(interview);
    }

    @Test
    void testOrderedListOfApplications_ThrowsException_WhenNotInAnalysisPhase() {
        recruitmentProcess = new RecruitmentProcess();
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.CLOSED));
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.OPEN));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        orderApplicationsService = new OrderApplicationsService(recruitmentProcess);

        Exception exception = assertThrows(Exception.class, () -> {
            orderApplicationsService.orderedListOfApplications(Arrays.asList(application1, application2, application3));
        });

        assertEquals("Current phase is not ANALYSIS.", exception.getMessage());
    }

    @Test
    void testOrderedListOfApplications_FiltersOutApplicationsWithNullInterview() throws Exception {
        recruitmentProcess = new RecruitmentProcess();
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.OPEN));
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.CLOSED));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        orderApplicationsService = new OrderApplicationsService(recruitmentProcess);
        application3.setInterview(null);
        jobApplication application4 = new jobApplication(null, null);
        Interview interview = new Interview();
        interview.setInterviewGrade(null);
        application4.setInterview(interview);

        List<jobApplication> result = orderApplicationsService.orderedListOfApplications(Arrays.asList(application1, application2, application3, application4));

        assertEquals(2, result.size());
        assertEquals(application1, result.get(0));
        assertEquals(application2, result.get(1));
    }

    @Test
    void testOrderedListOfApplications_OrdersByInterviewGrade() throws Exception {
        recruitmentProcess = new RecruitmentProcess();
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.OPEN));
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.CLOSED));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        orderApplicationsService = new OrderApplicationsService(recruitmentProcess);

        List<jobApplication> result = orderApplicationsService.orderedListOfApplications(Arrays.asList(application1, application2, application3));

        assertEquals(3, result.size());
        assertEquals(application1, result.get(0));
        assertEquals(application3, result.get(1));
        assertEquals(application2, result.get(2));
    }

    @Test
    void testOrderedListOfApplications_EmptyList() throws Exception {
        recruitmentProcess = new RecruitmentProcess();
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.OPEN));
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.CLOSED));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        orderApplicationsService = new OrderApplicationsService(recruitmentProcess);
        List<jobApplication> result = orderApplicationsService.orderedListOfApplications(Collections.emptyList());

        assertTrue(result.isEmpty());
    }

    @Test
    void testOrderedListOfApplications_AllApplicationsWithNullInterviewGrade() throws Exception {
        recruitmentProcess = new RecruitmentProcess();
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.OPEN));
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION, LocalDate.now(), LocalDate.now().plusDays(1), PhaseStatus.CLOSED));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        orderApplicationsService = new OrderApplicationsService(recruitmentProcess);

        application1.setInterview(new Interview());
        application2.setInterview(new Interview());
        application3.setInterview(new Interview());

        List<jobApplication> result = orderApplicationsService.orderedListOfApplications(Arrays.asList(application1, application2, application3));

        assertTrue(result.isEmpty());
    }
}