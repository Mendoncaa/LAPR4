package core.management.jobOpening.domain;

import core.management.RecruitmentProcess.domain.RecruitmentProcess;
import core.management.plugins.interviewModel.domain.InterviewModel;
import core.management.plugins.requirementsSpecifications.domain.RequirementsSpecification;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate; // Import LocalDate for handling dates

@Getter
@Entity
@Table(name = "job_openings")
@Access(AccessType.FIELD)
public class JobOpening implements AggregateRoot<JobReference> {

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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "requirementsSpecificationsId", referencedColumnName = "id")
    private RequirementsSpecification requirementsSpecification;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "interviewModelId", referencedColumnName = "id")
    private InterviewModel interviewModel;

    @Embedded
    @Column(nullable = false)
    private JobActiveSince activeSince;

    public JobOpening(JobReference jobReference, JobTitle jobTitle, JobState jobState, ContractType contractType, JobMode mode, Description description, Address address, NumberOfVacancies numberOfVacancies) {
        if (jobReference == null || jobTitle == null || jobState == null || contractType == null || mode == null || description == null || address == null || numberOfVacancies == null) {
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
        this.activeSince = new JobActiveSince(LocalDate.now());
    }

    protected JobOpening() {

    }

    @Override
    public boolean sameAs(Object other) {
        if (this == other) return true;
        if (!(other instanceof JobOpening that)) return false;
        return this.jobReference.equals(that.jobReference);
    }

    @Override
    public int compareTo(JobReference other) {
        return AggregateRoot.super.compareTo(other);
    }

    public Object jobMode() {
        return mode;
    }

    @Override
    public JobReference identity() {
        return jobReference;
    }

    @Override
    public boolean hasIdentity(JobReference id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    public Object JobReference() {
        return jobReference;
    }

    public Object jobTitle() {
        return jobTitle;
    }

    public Object address() {
        return address;
    }

    public Object contractType() {
        return contractType;
    }

    public Object jobState() {
        return jobState;
    }

    public Object description() {
        return description;
    }

    public Object numberOfVacancies() {
        return numberOfVacancies;
    }

    public Object ActiveSince() {
        return activeSince;
    }
}
