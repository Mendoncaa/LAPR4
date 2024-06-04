package core.management.rank.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;

@Embeddable
public class RankValue implements ValueObject {

    private int rankValue;

    protected RankValue() {
        rankValue = 0;
    }

    public RankValue(int rankValue) {
        if (rankValue <= 0) {
            throw new IllegalArgumentException("Rank Value must be greater than zero");
        }
        this.rankValue = rankValue;
    }

    @Override
    public String toString() {
        return String.valueOf(rankValue);
    }


}

