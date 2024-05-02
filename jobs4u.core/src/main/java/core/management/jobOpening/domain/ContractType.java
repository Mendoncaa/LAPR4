package core.management.jobOpening.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum ContractType implements ValueObject {
    FULL_TIME("Full Time"),
    PART_TIME("Part Time");

    private final String type;

    ContractType(String type) {
        this.type = type;
    }

}