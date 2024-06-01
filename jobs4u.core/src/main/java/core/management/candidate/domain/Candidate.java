package core.management.candidate.domain;

import core.management.costumer.domain.PhoneNumber;
import core.management.rank.domain.Rank;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.domain.model.Name;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "CANDIDATE") // Explicit table name definition
@Access(AccessType.FIELD) // Explicitly setting field access for consistency
public class Candidate implements AggregateRoot<EmailAddress> {

    // Getters for all fields
    @EmbeddedId
    @Column(unique = true, nullable = false)
    private EmailAddress candidateEmail; //mudar para so email pois n tem regras especificas

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CandidateState candidateState;

    @Embedded
    @Column(nullable = false)
    private Name candidateName;

    @Embedded
    @Column(nullable = false)
    private PhoneNumber candidatePhone;

    @OneToOne
    @JoinColumn(name = "system_user_id")
    private SystemUser candidateUser;


    public Candidate(EmailAddress candidateEmail, Name candidateName, PhoneNumber candidatePhone, SystemUser candidateUser) {
        if (candidateEmail == null || candidateName == null || candidatePhone == null || candidateUser == null) {
            throw new IllegalArgumentException("None of the fields can be null");
        }
        this.candidateEmail = candidateEmail;
        this.candidateState = CandidateState.ENABLED; //nao receber candidate state, ser criado aqui
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
    public EmailAddress identity() {
        return this.candidateEmail;
    }


}