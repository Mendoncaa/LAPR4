package core.management.jobOpening.domain.RegisterJobOpening;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RegisterJobOpeningDTO {

    private JobTitle title;

    private JobState state;

    private ContractType contractType;

    private JobMode mode;

    private Description description;

    private Address address;

    private NumberOfVacancies numberOfVacancies;


    public RegisterJobOpeningDTO (JobTitle title, JobState state, ContractType contractType, JobMode mode, Description description, Address address, NumberOfVacancies numberOfVacancies) {
        this.title = title;
        this.state = state;
        this.contractType = contractType;
        this.mode = mode;
        this.description = description;
        this.address = address;
        this.numberOfVacancies = numberOfVacancies;
    }
}
