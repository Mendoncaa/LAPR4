package core.management.rank.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;

@Embeddable
public class RankValue implements ValueObject {

    @Column(name = "value")
    private int value;

    public RankValue() {
        // Default constructor for JPA
    }

    public RankValue(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Rank value must be positive and greater than zero.");
        }
        this.value = value;
    }

}

