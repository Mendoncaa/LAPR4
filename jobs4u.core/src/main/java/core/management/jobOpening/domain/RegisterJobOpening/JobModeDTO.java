package core.management.jobOpening.domain.RegisterJobOpening; 

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class JobModeDTO {

    @Getter
    private String description;


    @Override
    public String toString() {
        return description;
    }
    
}
