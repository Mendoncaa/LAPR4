package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

import java.io.Serializable;

public enum JobMode implements ValueObject {

    REMOTE("Remote"), HYBRID("Hybrid"), ONSITE("Onsite");

    @Getter
    private final String description;

    JobMode(String description) {
        this.description = description;
    }
}
