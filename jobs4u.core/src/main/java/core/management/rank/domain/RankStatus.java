package core.management.rank.domain;

import eapli.framework.domain.model.ValueObject;
import lombok.Getter;

@Getter
public enum RankStatus implements ValueObject {

    UNSTARTED ("Unstarted"),
    STARTED ("Started"),
    FINISHED ("Finished");

    private final String state;

    RankStatus(String state) {
        this.state = state;
    }

}
