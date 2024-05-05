package core.management.RecruitmentProcess.controller;

import core.management.RecruitmentProcess.domain.Phase;
import core.management.RecruitmentProcess.domain.PhaseName;
import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.RecruitmentProcess.domain.Status;
import core.management.jobOpening.domain.JobOpening;

import java.time.LocalDate;

public class SetUpRecruitmentProcessController {

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

        // TODO: save jobOpening

        return true;
    }

    private boolean isValidSequence(LocalDate previousEnd, LocalDate nextStart) {
        return !previousEnd.isAfter(nextStart);
    }

    private boolean isValidDates(LocalDate start, LocalDate end) {
        return !start.isAfter(end);
    }
}
