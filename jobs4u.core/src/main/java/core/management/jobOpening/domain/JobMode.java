package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

public enum JobMode implements ValueObject {
    REMOTE("Remote"),
    HYBRID("Hybrid"),
    ONSITE("Onsite");

    @Getter
    private final String mode;

    JobMode(String mode) {
        this.mode = mode;
    }
}