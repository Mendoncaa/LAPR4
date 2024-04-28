package core.jobOpening.persistance;

import java.util.ArrayList;
import java.util.List;
import core.jobOpening.domain.JobOpening;

public class JobOpeningRepository {
    private List<JobOpening> jobOpenings;

    public JobOpeningRepository() {
        this.jobOpenings = new ArrayList<>();
    }

    public void save(JobOpening jobOpening) {
        // Salve a instância de JobOpening no repositório
        jobOpenings.add(jobOpening);
    }

    public List<JobOpening> getAllJobOpenings() {
        // Retorne todas as instâncias de JobOpening no repositório
        return new ArrayList<>(jobOpenings);
    }
}
