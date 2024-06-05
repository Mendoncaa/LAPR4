package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum PhaseStatus implements ValueObject {
    OPEN("Open"),
    CLOSED("Closed");

    private final String state;

    PhaseStatus(String state) {
        this.state = state;
    }
}
