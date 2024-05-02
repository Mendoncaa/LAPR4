package core.management.jobOpening.domain.RegisterJobOpening;

import java.util.Date;

import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class JobOpeningDTO {

    
    private JobReference jobReference; // Agora usando JobReference como ID.

    private JobTitle jobTitle;
    
    private JobState  jobState;

    private ContractType contractType;

    private JobMode mode;
   
    private Description description;

    private Address address;

    private NumberOfVacancies numberOfVacancies;
    

    @Override
    public String toString() {
        return "\njobOpening: \n" +
                "jobOpening Reference: " + jobReference +
                "\njobOpening Title: " + jobTitle +
                "\njobOpening Description: " + description +
                // "\njobOpening Start Date: " + jobOpeningStartDate +
                "\njobOpening State: " + jobState +
                "\njobOpening Contract Type: " + contractType +
                "\njobOpening Mode: " + mode +
                "\njobOpening Address: " + address +
                "\njobOpening Number of Vacancies: " + numberOfVacancies +
                "\n";
     

    }
   
    public JobOpeningDTO(JobReference jobReference, JobTitle jobTitle, JobState jobState, ContractType contractType, JobMode mode, Description description, Address address, NumberOfVacancies numberOfVacancies) {
        this.jobReference = jobReference;
        this.jobTitle = jobTitle;
        this.jobState = jobState;
        this.contractType = contractType;
        this.mode = mode;
        this.description = description;
        this.address = address;
        this.numberOfVacancies = numberOfVacancies;

        
    }
}
