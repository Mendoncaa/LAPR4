package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

public enum ContractType implements ValueObject {
    FULL_TIME("Full Time"),
    PART_TIME("Part Time");

    @Getter
    private final String type;

    ContractType(String type) {
        this.type = type;
    }
}