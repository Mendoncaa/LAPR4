package app.backoffice.apresentacao;

import app.backoffice.aplicacao.BackOfficeController;
import core.util.Console;

import java.security.NoSuchAlgorithmException;

public class JobOpeningUI {

    private final BackOfficeController controller;

    public JobOpeningUI(BackOfficeController controller) {
        this.controller = controller;

        int opcao = 0;
        do {
            opcao = menu();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    //JobOpening jobOpening = createJobOpening();
                    // Optionally handle the created job opening, e.g., save to database or display details
                    break;

                default:
                    System.out.println("Option not recognized.");
                    break;
            }
        } while (opcao != 0);

    }

    private int menu() {
        int option = -1;
        System.out.println("\n======= Job Opening Management =======");
        System.out.println("| 1. Create Job Opening              |");
        System.out.println("| 2. List All Job Openings           |");
        System.out.println("| 0. Exit                            |");
        System.out.println("======================================");
        option = Console.readInteger("Please choose an option");
        return option;
    }

    /*
    public JobOpening createJobOpening() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter job reference ID:");
        String reference = scanner.nextLine();

        System.out.println("Enter contract type (FULL_TIME/PART_TIME):");
        ContractType.Type contractType = readContractType(scanner);

        System.out.println("Enter job mode (REMOTE/HYBRID/ONSITE):");
        JobMode.Mode mode = readJobMode(scanner);

        // Setting default JobState and Active Date
        JobState.State state = JobState.State.OPEN;
        Date activeSinceDate = new Date();

        // Create required embedded objects
        JobReference jobReference = new JobReference(reference);
        ContractType contract = new ContractType(contractType);
        JobMode jobMode = new JobMode(mode);
        JobState jobState = new JobState(state);
        JobActiveSinceDate jobActiveSince = new JobActiveSinceDate(activeSinceDate);

        // Construct the JobOpening with required fields
        return new JobOpening(jobReference, contract, jobMode, jobState, jobActiveSince);
    }

     */

}
