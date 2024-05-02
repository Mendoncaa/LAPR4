package core.management.jobApplication.application.service;
/*package core.management.jobApplication.application;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import core.management.jobApplication.repository.ApplicationRepository;
// import core.management.jobApplication.repository.CandidateRepository;

public class ApplicationService {
    private final CandidateRepository candidateRepository;
    private final ApplicationRepository applicationRepository;

    public ApplicationService(CandidateRepository candidateRepository, ApplicationRepository applicationRepository) {
        this.candidateRepository = candidateRepository;
        this.applicationRepository = applicationRepository;
    }

    public void processFilesFromDirectory(String directoryPath) throws IOException {
        List<File> files = Files.list(Paths.get(directoryPath))
                                .map(Path::toFile)
                                .collect(Collectors.toList());

        for (File file : files) {
            String fileName = file.getName();
            String jobReference = fileName.split("-")[0];  // Assume the format "JOBREF-001.txt"
            
            // Extract candidate data from the file
            // For this example, assume that the candidate's email, name, and phone are in the file
            String content = new String(Files.readAllBytes(file.toPath()));
            String[] candidateData = content.split("\n");
            String email = candidateData[0];
            String name = candidateData[1];
            String phoneNumber = candidateData[2];

            if (!candidateRepository.existsByEmail(email)) {
                Candidate candidate = CandidateFactory.createCandidate(email, name, phoneNumber);
                candidateRepository.save(candidate);
                
                Application application = new Application(candidate, jobReference);
                applicationRepository.save(application);
            }
        }
    }
}
/* */