package core.management.jobOpening.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class JobActiveSince {

    private LocalDate date;

    public boolean isAfter(LocalDate date) {
        return this.date.isAfter(date);
    }

}