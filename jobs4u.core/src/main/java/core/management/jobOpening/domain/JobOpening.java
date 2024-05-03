package core.management.jobOpening.domain;

import core.management.jobOpening.domain.RecruitmentProcess.RecruitmentProcess;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "job_openings") // Explicit table name definition
@Access(AccessType.FIELD) // Explicitly setting field access for consistency
public class JobOpening implements AggregateRoot<JobReference> {

    // Getters for all fields
    @EmbeddedId
    @Column(unique = true, nullable = false)
    private JobReference jobReference;

    @Embedded
    @Column(nullable = false)
    private JobTitle jobTitle;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private JobState jobState;

    @Embedded
    @Column(nullable = false)
    private ContractType contractType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private JobMode mode;

    @Embedded
    @Column(nullable = false)
    private Description description;

    @Embedded
    @Column(nullable = false)
    private Address address;

    @Embedded
    @Column(nullable = false)
    private NumberOfVacancies numberOfVacancies;

    @Setter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recruitmentProcessId", referencedColumnName = "id")
    private RecruitmentProcess recruitmentProcess;

    public JobOpening(JobReference jobReference, JobTitle jobTitle, JobState jobState, ContractType contractType, JobMode mode, Description description, Address address, NumberOfVacancies numberOfVacancies, RecruitmentProcess recruitmentProcess) {
        if (jobReference == null || jobTitle == null || jobState == null || contractType == null || mode == null || description == null || address == null || numberOfVacancies == null || recruitmentProcess == null) {
            throw new IllegalArgumentException("None of the fields can be null");
        }
        this.jobReference = jobReference;
        this.jobTitle = jobTitle;
        this.jobState = jobState;
        this.contractType = contractType;
        this.mode = mode;
        this.description = description;
        this.address = address;
        this.numberOfVacancies = numberOfVacancies;
        this.recruitmentProcess = recruitmentProcess;
    }

    protected JobOpening() {

    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (!(other instanceof JobOpening that)) return false;
        return this.jobReference.equals(that.jobReference);
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public JobMode getMode() {
        return mode;
    }

    public Description getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }

    public NumberOfVacancies getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public RecruitmentProcess getRecruitmentProcess() {
        return recruitmentProcess;
    }

    @Override
    public JobReference identity() {
        return this.jobReference;
    }

    public RecruitmentProcess RecruitmentProcess() {
        return recruitmentProcess;
    }

    public JobState getJobState() {
        return this.jobState;
    }
}
