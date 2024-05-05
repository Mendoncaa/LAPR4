package core.management.jobApplication.application.service;

import core.management.candidate.domain.Candidate;
import core.management.candidate.domain.CandidateEmail;
import core.management.candidate.domain.CandidateName;
import core.management.candidate.domain.CandidatePhone;
import core.management.candidate.domain.CandidateState;
import core.management.candidate.repository.CandidateRepository;
import core.management.jobApplication.domain.Application;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.user.domain.ExemploRoles;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.time.util.CurrentTimeCalendars;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final CandidateRepository candidateRepository;
    private final JobOpeningRepository jobOpeningRepository;
    private final UserManagementService userSvc = AuthzRegistry.userService();

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
            JobReference jobReference = new JobReference(parts[0]);
            JobOpening jobOpening = jobOpeningRepository.findByJobReference(jobReference)
                .orElseThrow(() -> new IllegalArgumentException("No job opening found for the given job reference: " + jobReference));
            Candidate candidate = extractCandidate(file);

            Application application = new Application(candidate, jobOpening);
            applicationRepository.save(application);
        }
    }

    private Candidate extractCandidate(File file) throws IOException {
        String content = new String(Files.readAllBytes(file.toPath()));
        String[] lines = content.split("\n");
        if (lines.length < 4) {
            throw new IllegalArgumentException("The file format is incorrect or missing information.");
        }

        CandidateEmail email = new CandidateEmail(lines[1].trim());
        CandidateName name = new CandidateName(lines[2].split(" ")[0].trim(), lines[2].split(" ")[1].trim());
        CandidatePhone phone = new CandidatePhone(lines[3].trim());
        CandidateState state = CandidateState.ENABLED;
        Set<Role> roles = Set.of(ExemploRoles.CANDIDATE);

        SystemUser candidate = userSvc.registerNewUser("candidate" + lines[2].split(" ")[0].trim(), "Password1", lines[2].split(" ")[0].trim(), lines[2].split(" ")[1].trim(), lines[1].trim(), roles, CurrentTimeCalendars.now());
        
        return candidateRepository.findByCandidateEmail(email)
            .orElseGet(() -> candidateRepository.save(new Candidate(email, state, name, phone, candidate)));
    }
    
}
