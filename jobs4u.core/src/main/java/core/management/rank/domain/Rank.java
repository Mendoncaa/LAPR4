package core.management.rank.domain;

import core.management.candidate.domain.Candidate;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.domain.model.AggregateRoot;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "RANK") // Explicit table name definition
@Access(AccessType.FIELD) // Explicitly setting field access for consistency
public class Rank implements AggregateRoot<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<RankPosition> rankPosition;

    @Enumerated
    private RankStatus rankStatus;

    public Rank() {}

    public Rank(List<RankPosition> rankPosition) {
        this.rankPosition = rankPosition;
        this.rankStatus = RankStatus.NOT_Ranked;
    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Rank rank = (Rank) other;

        return id.equals(rank.id);
    }

    @Override
    public Long identity() {
        return id;
    }
}
