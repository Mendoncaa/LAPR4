package core.management.RecruitmentProcess;

import core.management.RecruitmentProcess.domain.Phase;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.RecruitmentProcess.domain.RecruitmentProcessStatus;
import core.management.RecruitmentProcess.service.PhaseValidatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class US1010_OpenOrClosePhasesTests {

    private RecruitmentProcess recruitmentProcess;

    @BeforeEach
    public void setup() {
        recruitmentProcess = new RecruitmentProcess();
    }

    // Test Recruitment Process Phases Business Rules

    @Test
    public void transitionFromUninitiatedToApplication() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        boolean result = recruitmentProcess.nextPhase();
        assertTrue(result);
        assertEquals(PhaseName.APPLICATION, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void transitionFromApplicationToScreening() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        boolean result = recruitmentProcess.nextPhase(); // Move to SCREENING
        assertTrue(result);
        assertEquals(PhaseName.SCREENING, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void transitionFromScreeningToInterviews() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.addPhase(new Phase(PhaseName.INTERVIEWS));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        recruitmentProcess.nextPhase(); // Move to SCREENING
        boolean result = recruitmentProcess.nextPhase(); // Move to INTERVIEWS
        assertTrue(result);
        assertEquals(PhaseName.INTERVIEWS, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void transitionFromInterviewsToAnalysis() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.addPhase(new Phase(PhaseName.INTERVIEWS));
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        recruitmentProcess.nextPhase(); // Move to SCREENING
        recruitmentProcess.nextPhase(); // Move to INTERVIEWS
        boolean result = recruitmentProcess.nextPhase(); // Move to ANALYSIS
        assertTrue(result);
        assertEquals(PhaseName.ANALYSIS, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void transitionFromAnalysisToResult() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.addPhase(new Phase(PhaseName.INTERVIEWS));
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS));
        recruitmentProcess.addPhase(new Phase(PhaseName.RESULT));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        recruitmentProcess.nextPhase(); // Move to SCREENING
        recruitmentProcess.nextPhase(); // Move to INTERVIEWS
        recruitmentProcess.nextPhase(); // Move to ANALYSIS
        boolean result = recruitmentProcess.nextPhase(); // Move to RESULT
        assertTrue(result);
        assertEquals(PhaseName.RESULT, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void transitionFromResultToFinished() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.addPhase(new Phase(PhaseName.INTERVIEWS));
        recruitmentProcess.addPhase(new Phase(PhaseName.ANALYSIS));
        recruitmentProcess.addPhase(new Phase(PhaseName.RESULT));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        recruitmentProcess.nextPhase(); // Move to SCREENING
        recruitmentProcess.nextPhase(); // Move to INTERVIEWS
        recruitmentProcess.nextPhase(); // Move to ANALYSIS
        recruitmentProcess.nextPhase(); // Move to RESULT
        boolean result = recruitmentProcess.nextPhase(); // Move to FINISHED
        assertTrue(result);
        assertEquals(RecruitmentProcessStatus.FINISHED, recruitmentProcess.getStatus());
    }

    @Test
    public void transitionBackFromScreeningToApplication() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        recruitmentProcess.nextPhase(); // Move to SCREENING
        boolean result = recruitmentProcess.previousPhase(); // Move back to APPLICATION
        assertTrue(result);
        assertEquals(PhaseName.APPLICATION, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void cannotTransitionBackFromApplication() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.nextPhase(); // Move to APPLICATION
        boolean result = recruitmentProcess.previousPhase(); // Try to move back from APPLICATION
        assertFalse(result);
        assertEquals(recruitmentProcess.currentPhase().getName(), PhaseName.APPLICATION);
    }

    @Test
    public void addingPhaseToRecruitmentProcess() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        assertEquals(1, recruitmentProcess.getPhases().size());
        assertEquals(PhaseName.APPLICATION, recruitmentProcess.getPhases().get(0).getName());
    }

    @Test
    public void removingPhaseFromRecruitmentProcess() {
        Phase phase = new Phase(PhaseName.APPLICATION);
        recruitmentProcess.addPhase(phase);
        recruitmentProcess.removePhase(phase);
        assertTrue(recruitmentProcess.getPhases().isEmpty());
    }

    @Test
    public void transitionToNextPhaseWhenStatusIsUninitiated() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        boolean result = recruitmentProcess.nextPhase();
        assertTrue(result);
        assertEquals(recruitmentProcess.currentPhase().getName(), PhaseName.APPLICATION);
    }

    @Test
    public void transitionToNextPhaseWhenStatusIsInProcess() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        boolean result = recruitmentProcess.nextPhase();
        assertFalse(result);
        assertNull(recruitmentProcess.currentPhase());
    }

    @Test
    public void transitionToPreviousPhaseWhenCurrentPhaseIsApplication() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.setStatus(RecruitmentProcessStatus.IN_PROCESS);
        recruitmentProcess.nextPhase();
        boolean result = recruitmentProcess.previousPhase();
        assertFalse(result);
        assertNull(recruitmentProcess.currentPhase());
    }

    @Test
    public void transitionToPreviousPhaseWhenCurrentPhaseIsScreening() {
        recruitmentProcess.addPhase(new Phase(PhaseName.APPLICATION));
        recruitmentProcess.addPhase(new Phase(PhaseName.SCREENING));
        recruitmentProcess.nextPhase();
        recruitmentProcess.nextPhase();
        boolean result = recruitmentProcess.previousPhase();
        assertTrue(result);
        assertEquals(PhaseName.APPLICATION, recruitmentProcess.currentPhase().getName());
    }

    @Test
    public void validateForwardTransitionFromApplicationPhase() {
        // Verify that the transition from the Application phase to the Screening phase is valid if there is at least one application.
        boolean result = PhaseValidatorService.validatePhaseTransitionForward(PhaseName.APPLICATION, 1, 0);
        assertTrue(result);

        // Check if the transition is valid when there are multiple applications.
        result = PhaseValidatorService.validatePhaseTransitionForward(PhaseName.APPLICATION, 5, 0);
        assertTrue(result);

        // Check if the transition is invalid when there are no applications.
        result = PhaseValidatorService.validatePhaseTransitionForward(PhaseName.APPLICATION, 0, 0);
        assertFalse(result);
    }

    @Test
    public void validateBackwardTransitionFromScreeningPhase() {
        // Ensure that moving back from the Screening phase to the Application phase is valid if no applications have been verified.
        boolean result = PhaseValidatorService.validatePhaseTransitionBackward(PhaseName.SCREENING, 0);
        assertTrue(result);

        // Check if the transition is invalid when there are applications that been verified.
        result = PhaseValidatorService.validatePhaseTransitionBackward(PhaseName.SCREENING, 5);
        assertFalse(result);
    }

    @Test
    public void validateTransitionForwardWhenNoApplications() {
        // Confirm that transitioning forward from the Application phase is invalid if there are no applications.
        boolean result = PhaseValidatorService.validatePhaseTransitionForward(PhaseName.APPLICATION, 0, 0);
        assertFalse(result);

        // Check if the transition is invalid for other phases when there are no applications.
        for (PhaseName phaseName : PhaseName.values()) {
            if (phaseName != PhaseName.APPLICATION) {
                result = PhaseValidatorService.validatePhaseTransitionForward(phaseName, 0, 0);
                assertFalse(result);
            }
        }
    }
}