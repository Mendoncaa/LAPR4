package core.management.jobOpening.domain.RecruitmentProcess;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum Status implements ValueObject {
    OPEN("Open"),
    CLOSED("Closed");

    private final String state;

    Status(String state) {
        this.state = state;
    }
}
