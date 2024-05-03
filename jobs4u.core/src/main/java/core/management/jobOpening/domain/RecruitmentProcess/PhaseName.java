package core.management.jobOpening.domain.RecruitmentProcess;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

public enum PhaseName implements ValueObject {
    APPLICATION("Application"),
    SCREENING("Screening"),
    INTERVIEWS("Interviews"),
    ANALYSIS("Analysis"),
    RESULT("Result");

    @Getter
    private final String description;

    PhaseName(String description) {
        this.description = description;
    }
}
