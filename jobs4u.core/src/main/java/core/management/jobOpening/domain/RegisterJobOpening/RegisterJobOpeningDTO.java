package core.management.jobOpening.domain.RegisterJobOpening;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
String
public class RegisterJobOpeningDTO {

    private JobReference jobReference;

    private JobTitle jobTitle;

    private JobState jobState;

    private ContractType contractType;

    private JobMode jobMode;

    private Description jobDescription;

    private Address address;

    private NumberOfVacancies numberOfVacancies;


    public RegisterJobOpeningDTO (JobReference jobReference, JobTitle title, JobState state, ContractType contractType, JobMode mode, Description description, Address address, NumberOfVacancies numberOfVacancies) {
        this.jobTitle = title;
        this.jobState = state;
        this.contractType = contractType;
        this.jobMode = mode;
        this.jobDescription = description;
        this.address = address;
        this.numberOfVacancies = numberOfVacancies;
    }
}
