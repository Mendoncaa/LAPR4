package core.management.RecruitmentProcess.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum PhaseStatus implements ValueObject {
    OPEN,
    CLOSED
}
