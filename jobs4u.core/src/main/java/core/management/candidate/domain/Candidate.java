package core.management.candidate.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "CANDIDATE") // Explicit table name definition
@Access(AccessType.FIELD) // Explicitly setting field access for consistency
public class Candidate implements AggregateRoot<CandidateEmail> {

    // Getters for all fields
    @EmbeddedId
    @Column(unique = true, nullable = false)
    private CandidateEmail candidateEmail;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CandidateState candidateState;

    @Embedded
    @Column(nullable = false)
    private CandidateName candidateName;

    @Embedded
    @Column(nullable = false)
    private CandidatePhone candidatePhone;

    @OneToOne
    @JoinColumn(name = "system_user_id")
    private SystemUser candidateUser;

    public Candidate(CandidateEmail candidateEmail, CandidateState candidateState, CandidateName candidateName, CandidatePhone candidatePhone, SystemUser candidateUser) {
        if (candidateEmail == null || candidateState == null || candidateName == null || candidatePhone == null || candidateUser == null) {
            throw new IllegalArgumentException("None of the fields can be null");
        }
        this.candidateEmail = candidateEmail;
        this.candidateState = candidateState;
        this.candidateName = candidateName;
        this.candidatePhone = candidatePhone;
        this.candidateUser = candidateUser;
    }

    public Candidate() {

    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (!(other instanceof Candidate that)) return false;
        return this.candidateEmail.equals(that.candidateEmail);
    }

    @Override
    public CandidateEmail identity() {
        return this.candidateEmail;
    }


}