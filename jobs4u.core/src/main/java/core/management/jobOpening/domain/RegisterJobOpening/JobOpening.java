package core.management.jobOpening.domain.RegisterJobOpening;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class JobOpening {

    @Embedded
    @Column(unique = true, nullable = false)
    private JobReference jobReference;

    @Embedded
    @Column(nullable = false)
    private JobTitle jobTitle;

    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "BINARY(2)")
    private JobState  jobState;

    @Embedded
    @Column(nullable = false)
    private ContractType contractType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "BINARY(2)")
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

    @Id
    private Long id;

    public JobOpening(JobReference jobReference, JobTitle jobTitle, JobState jobState, ContractType contractType, JobMode mode, Description description, Address address, NumberOfVacancies numberOfVacancies) {
        this.jobReference = jobReference;
        this.jobTitle = jobTitle;
        this.jobState=jobState;
        this.contractType = contractType;
        this.mode = mode;
        this.description = description;
        this.address = address;
        this.numberOfVacancies = numberOfVacancies;
    }

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
}