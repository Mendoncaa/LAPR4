package core.management.rank.domain;

import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;

@Entity
@Table(name = "RANK_VALUE")
@Access(AccessType.FIELD)
public class RankValue implements ValueObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rankValue")
    private int rankValue;

    public RankValue() {
        // Default constructor for JPA
    }
}

