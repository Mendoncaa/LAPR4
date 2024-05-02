package core.management.jobOpening.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Description;
import jakarta.persistence.*;

@Entity
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
    }

    protected JobOpening() {
        // for ORM
    }


    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public JobReference identity() {
        return null;
    }

    @Override
    public boolean hasIdentity(JobReference id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    public Object jobReference() {
        return this.jobReference;
    }

    public Object jobState() {
        return this.jobState;
    }


    /*
    public static RegisterJobOpeningDTO toJobOpeningDTO(JobOpening jobOpening) {
        if (jobOpening == null) {
            return null;
        }
        RegisterJobOpeningDTO registerJobOpeningDTO = new RegisterJobOpeningDTO();
        registerJobOpeningDTO.setRegisterJobOpeningCode(jobOpening.jobReference.getValue());
        registerJobOpeningDTO.setRegisterJobOpeningName(jobOpening.jobTitle.getValue());
        registerJobOpeningDTO.setRegisterJobOpeningDescription(jobOpening.description.getValue());
        registerJobOpeningDTO.setRegisterJobOpeningState(jobOpening.jobState.getValue());
        registerJobOpeningDTO.setMaximumEnrollmentLimit(jobOpening.numberOfVacancies.getValue());
        return registerJobOpeningDTO;
    }

    // Additional methods and business logic

     */
}