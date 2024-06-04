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
    private List<RankValue> rankValues;

    @OneToOne
    @JoinColumns({
            @JoinColumn(name = "rank_job_reference_customerCode", nullable = false),
            @JoinColumn(name = "rank_job_reference_jobNumber", nullable = false)
    })
    private JobOpening jobOpening;

    @OneToMany
    private List<Candidate> candidates;

    public Rank() {}

    public Rank(List<RankValue> rankValues, JobOpening jobOpening, List<Candidate> candidates) {
        this.rankValues = rankValues;
        this.jobOpening = jobOpening;
        this.candidates = candidates;
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
