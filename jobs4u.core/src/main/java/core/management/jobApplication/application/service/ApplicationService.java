/*package core.management.jobApplication.application.service;

import core.management.candidate.domain.Candidate;
import core.management.candidate.repository.CandidateRepository;
import core.management.jobApplication.domain.Application;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final CandidateRepository candidateRepository;
    private final JobOpeningRepository jobOpeningRepository;

    public ApplicationService(ApplicationRepository applicationRepository,
                              CandidateRepository candidateRepository,
                              JobOpeningRepository jobOpeningRepository) {
        this.applicationRepository = applicationRepository;
        this.candidateRepository = candidateRepository;
        this.jobOpeningRepository = jobOpeningRepository;
    }

    public void processApplicationFiles(String directoryPath) throws IOException {
        List<File> files = Files.list(Paths.get(directoryPath))
                                .map(Path::toFile)
                                .collect(Collectors.toList());

        for (File file : files) {
            String fileName = file.getName();
            String[] parts = fileName.split("-");
            String jobReference = parts[0];
            JobOpening jobOpening = jobOpeningRepository.findByJobReference(jobReference).orElseThrow(); //alterar isto para receber um objeto jobOpening
            Candidate candidate = extractCandidate(file);

            Application application = new Application(candidate, jobOpening);
            applicationRepository.save(application);
        }
    }

    private Candidate extractCandidate(File file) throws IOException {
        String content = new String(Files.readAllBytes(file.toPath()));
        String[] lines = content.split("\n");
        String email = lines[0]; // Simples exemplo, precisa de validação e parse adequados
        return candidateRepository.findByCandidateEmail(email) // modificar para enviar um objeto do tipo de candidate
                                  .orElseGet(() -> candidateRepository.save(new Candidate(email)));
    }
}
*/