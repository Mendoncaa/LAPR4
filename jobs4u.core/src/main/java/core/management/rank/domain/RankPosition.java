package core.management.rank.domain;

import core.management.candidate.domain.Candidate;
import eapli.framework.domain.model.ValueObject;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class RankPosition implements ValueObject {

    private int position;

    @OneToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    protected RankPosition() {
        // for ORM
    }

    public RankPosition(int position, Candidate candidate) {
        if (position <= 0) {
            throw new IllegalArgumentException("Rank Position must be greater than zero");
        }
        else if (candidate == null){
            throw new IllegalArgumentException("Candidate must be provided");
        }
        this.position = position;
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return String.format("Position: %d, Candidate: %s", position, candidate.getCandidateName().toString());
    }


}

