package core.management.jobOpening.domain.RegisterJobOpening;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class JobOpening {
    @Id
    private JobReference jobReference; // Agora usando JobReference como ID.

    @Embedded
    private JobTitle title;

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

    //@Column(nullable = false)
    
    // CostumerCode como foreign key

    // Constructor, getters, and setters
    public JobOpeningDTO JobOpening(JobReference jobReference, JobTitle title, ContractType contractType, JobMode mode, Description description, String address, int numberOfVacancies, String company) {
        this.jobReference = jobReference;
        this.title = title;
        this.contractType = contractType;
        this.mode = mode;
        this.description = description;
        //this.address = address;
        //this.numberOfVacancies = numberOfVacancies;
        // this.company = company;
    }
a
    // Additional methods and business logic
}
