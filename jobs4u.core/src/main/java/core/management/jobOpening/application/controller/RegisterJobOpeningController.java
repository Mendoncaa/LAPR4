package core.management.jobOpening.application.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;
import shared.exception.DomainInvariantViolatedException;
import shared.exception.IllegalOperationException;
import core.management.jobOpening.domain.RegisterJobOpeningDTO;
import core.management.jobOpening.domain.Address;
import core.management.jobOpening.domain.ContractType;
import core.management.jobOpening.domain.JobMode;
import core.management.jobOpening.domain.Description;
import core.management.jobOpening.domain.JobReference;
import core.management.jobOpening.domain.JobState;
import core.management.jobOpening.domain.NumberOfVacancies;
import core.management.jobOpening.domain.JobTitle;
import core.management.jobOpening.domain.JobOpening;


@RequiredArgsConstructor
@Controller
public class RegisterJobOpeningController {
    @NonNull
    private final JobOpeningRepository jobOpeningRepository;

    /*
    public boolean registerJobOpening(RegisterJobOpeningDTO registerJobOpeningDTO) {
        try {
            // Initialize value objects with data from DTO
            JobReference jobReference = new JobReference(registerJobOpeningDTO.getJobReference().getJobReference());
            JobTitle jobTitle = new JobTitle(registerJobOpeningDTO.getJobTitle());
            JobState jobState = new JobState(registerJobOpeningDTO.getJobState()); // Assuming JobState is maintained similarly
            ContractType contractType = new ContractType(registerJobOpeningDTO.getContractType());
            JobMode mode = new JobMode(registerJobOpeningDTO.getMode());
            Description description = new Description(registerJobOpeningDTO.getDescription());
            Address address = new Address(registerJobOpeningDTO.getAddress());
            NumberOfVacancies numberOfVacancies = new NumberOfVacancies(registerJobOpeningDTO.getNumberOfVacancies());

            // Create new JobOpening instance
            JobOpening jobOpening = new JobOpening(
                jobReference, jobTitle, jobState, contractType, mode, 
                description, address, numberOfVacancies
            );

            // Check if jobOpening already exists in the repository
            if (jobOpeningRepository.findByJobReference(jobOpening.getJobReference()) == null) {
                jobOpeningRepository.save(jobOpening);
                return true;
            } else {
                return false; // JobOpening already exists
            }
        } catch (DomainInvariantViolatedException | IllegalOperationException e) {
            e.printStackTrace();
            return false;
        }
    }

     */
}
