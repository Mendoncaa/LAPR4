package app.backoffice.apresentacao;

import app.backoffice.aplicacao.BackOfficeController;
import core.util.Console;
import domain.UserEntity;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class ViewUserUI {

    private BackOfficeController uc;

    public ViewUserUI(BackOfficeController uc) throws NoSuchAlgorithmException, InstantiationException {
        this.uc = uc;

        int opcao = 0;
        do {
            opcao = menu();

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    new CreateUserUI();
                    break;

                case 2:
                    listUsers();
                    break;

                case 3:
                    deactivateUser();
                    break;

                case 4:
                    activateUser();
                    break;

                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }

    private int menu() {
        int option = -1;
        System.out.println("\n======================================");
        System.out.println("|           User Management          |");
        System.out.println("======================================");
        System.out.println("| 1. Add User                        |");
        System.out.println("| 2. List All Users                  |");
        System.out.println("| 3. Deactivate User                 |");
        System.out.println("| 4. Activate User                   |");
        System.out.println("| 0. Exit                            |");
        System.out.println("======================================");
        option = Console.readInteger("Please choose an option");
        return option;
    }

    private void listUsers() {
        int[] count = {1};
        System.out.println("\n+= List Users =====================================================================+");
        System.out.printf("%-3s %-15s %-30s %-30s\n", "#.", "USERNAME", "FIRST NAME", "LAST NAME");
        uc.findAll().forEach(user -> {
            System.out.printf("%-3s %-15s %-30s %-30s\n", count[0] + ".", user.getUsername(), user.getFirstName(), user.getLastName());
            count[0]++;
        });
        System.out.println("===================================================================================+\n");
    }

    private void deactivateUser() {
        int[] count = {1};
        System.out.println("SELECT User to Deactivate");
        System.out.printf("%-3s %-15s %-30s %-30s\n", "#.", "USERNAME", "FIRST NAME", "LAST NAME");
        List<UserEntity> listUsers = uc.findAllActive();
        listUsers.forEach(user -> {
            System.out.printf("%-3s %-15s %-30s %-30s\n", count[0] + ".", user.getUsername(), user.getFirstName(), user.getLastName());
            count[0]++;
        });
        int option = Console.readInteger("\nEnter the number of the user to deactivate or 0 to cancel");
        if(option != 0) uc.deactivateOrActivateUser(listUsers.get(option - 1).getIdUser(), false);
    }

    private void activateUser() {
        int[] count = {1};
        System.out.println("SELECT User to Deactivate");
        System.out.printf("%-3s %-15s %-30s %-30s\n", "#.", "USERNAME", "FIRST NAME", "LAST NAME");
        List<UserEntity> listUsers = uc.findAllInactive();
        listUsers.forEach(user -> {
            System.out.printf("%-3s %-15s %-30s %-30s\n", count[0] + ".", user.getUsername(), user.getFirstName(), user.getLastName());
            count[0]++;
        });
        int option = Console.readInteger("\nEnter the number of the user to deactivate or 0 to cancel");
        if(option != 0) uc.deactivateOrActivateUser(listUsers.get(option - 1).getIdUser(), true);
    }
}
