package core.management.jobOpening.domain.RegisterJobOpening;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class JobTitleDTO {

    @Getter
    private String jobTitle;

    @Override
    public String toString() {
        return jobTitle;
    }

}


