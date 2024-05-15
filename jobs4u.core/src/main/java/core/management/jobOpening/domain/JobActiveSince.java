package core.management.jobOpening.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@AllArgsConstructor
@Embeddable
public class JobActiveSince {

    private LocalDate date;

    public JobActiveSince() {
        this.date = LocalDate.now();
    }

    public boolean isAfter(LocalDate date) {
        return this.date.isAfter(date);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(formatter);
    }

}