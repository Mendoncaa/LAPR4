package core.management.rank.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum RankStatus implements ValueObject {

    Unstarted,
    Started,
    Finishef;

}
