package core.management.jobOpening.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class JobStateDTO {

    @Getter
    private String description;


    @Override
    public String toString() {
        return description;
    }
}
