package core.management.jobOpening.domain.RegisterJobOpening;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class JobOpening {

    @Embedded
    private JobReference jobReference; // Agora usando JobReference como ID.

    @Embedded
    private JobTitle jobTitle;

    @Embedded
    private JobState  jobState;

    @Embedded
    private ContractType contractType;

    @Embedded
    private JobMode mode;

    @Embedded
    private Description description;

    @Embedded
    private Address address;

    @Embedded
    private NumberOfVacancies numberOfVacancies;
    @Id
    private Long id;

    //@Column(nullable = false)
    
    // CostumerCode como foreign key

    // Constructor, getters, and setters
    public RegisterJobOpeningDTO JobOpening(JobReference jobReference, JobTitle jobTitle, JobState jobState, ContractType contractType, JobMode mode, Description description, String address, int numberOfVacancies, String company) {
        this.jobReference = jobReference;
        this.jobTitle = jobTitle;
        this.jobState=jobState;
        this.contractType = contractType;
        this.mode = mode;
        this.description = description;
        //this.address = address;
        //this.numberOfVacancies = numberOfVacancies;
        // this.company = company;
        return null;
    }

    // Additional methods and business logic
}
