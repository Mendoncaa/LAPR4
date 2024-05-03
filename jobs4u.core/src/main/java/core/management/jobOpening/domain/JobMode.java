package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum JobMode implements ValueObject {
    REMOTE("Remote"),
    HYBRID("Hybrid"),
    ONSITE("Onsite");


    private final String mode;

    JobMode(String mode) {
        this.mode = mode;
    }
}