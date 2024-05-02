package core.management.jobOpening.domain;


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


