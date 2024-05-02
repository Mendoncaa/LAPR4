package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;

public class Description implements ValueObject {
    private final String description;

    public Description(String description) {
        this.description = description;
    }

}
