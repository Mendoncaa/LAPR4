package core.management.jobApplication.application.service;

import core.infrastructure.persistence.PersistenceContext;
import core.management.candidate.domain.Candidate;
import core.management.candidate.repository.CandidateRepository;
import core.management.costumer.domain.PhoneNumber;
import core.management.jobApplication.domain.FileType;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.repository.JobOpeningRepository;
import core.management.user.domain.ExemploRoles;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.Name;
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
    private final ApplicationRepository applicationRepository = PersistenceContext.repositories().application();
    private final CandidateRepository candidateRepository = PersistenceContext.repositories().candidate();
    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();
    private final UserManagementService userSvc = AuthzRegistry.userService();

    public void processApplicationFiles(String reference, String path, String applicationId) throws IOException {
        Path jobOpeningPath = Paths.get(path, reference);
        Path selectedApplicationPath = jobOpeningPath.resolve(applicationId);
        List<File> files = Files.list(selectedApplicationPath)
                                .map(Path::toFile)
                                .collect(Collectors.toList());

        String[] parts = reference.split("-");
        JobReference jobReference = new JobReference(parts[0], Integer.parseInt(parts[1]));

        for (File file : files) {
            String fileName = file.getName();
            if(fileName.endsWith("candidate-data.txt")){
                JobOpening jobOpening = jobOpeningRepository.findByJobReference(jobReference)
                        .orElseThrow(() -> new IllegalArgumentException("No job opening found for the given job reference: " + jobReference));
                Candidate candidate = extractCandidate(file);

                jobApplication application = new jobApplication(candidate, jobOpening);
                applicationRepository.save(application);
            }

        }
    }

    private Candidate extractCandidate(File file) throws IOException {
        String content = new String(Files.readAllBytes(file.toPath()));
        String[] lines = content.split("\n");
        if (lines.length < 4) {
            throw new IllegalArgumentException("The file format is incorrect or missing information.");
        }

        EmailAddress email = EmailAddress.valueOf(lines[1].trim());
        Name name = Name.valueOf(lines[2].split(" ")[0].trim(), lines[2].split(" ")[1].trim());
        PhoneNumber phone = new PhoneNumber(lines[3].trim());
        Set<Role> roles = Set.of(ExemploRoles.CANDIDATE);

        SystemUser candidate = userSvc.registerNewUser("candidate" + lines[2].split(" ")[0].trim(), "Password1", lines[2].split(" ")[0].trim(), lines[2].split(" ")[1].trim(), lines[1].trim(), roles, CurrentTimeCalendars.now());
        
        return candidateRepository.save(new Candidate(email, name, phone, candidate));
    }

    public Iterable<jobApplication> findAll() {
        return applicationRepository.findAll();
    }

    public void uploadRequirementsResponses(jobApplication application, String path) {
        application.setRequirementAnswersPath(core.management.jobApplication.domain.File.valueOf(path, FileType.CANDIDATE_REQUIREMENTS_ANSWERS));
        applicationRepository.save(application);
    }

    public void uploadInterviewsResponses(jobApplication application, String path) {
        application.setInterviewAnswersPath(core.management.jobApplication.domain.File.valueOf(path, FileType.CANDIDATE_INTERVIEW_ANSWERS));
        applicationRepository.save(application);
    }
}
