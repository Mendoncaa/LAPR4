package core.management.jobOpening.domain.RecruitmentProcess;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

public enum Status implements ValueObject {
    OPEN("Open"),
    CLOSED("Closed");

    @Getter
    private final String state;

    Status(String state) {
        this.state = state;
    }
}
