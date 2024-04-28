package app.backoffice.apresentacao;

import app.backoffice.aplicacao.BackOfficeController;
import core.util.Console;
import persistence.impl.jpa.UserEntityRepositorioJPAImpl;
import javax.persistence.EntityManagerFactory;
import core.aplicacao.Factory;

import java.security.NoSuchAlgorithmException;

public class adminUI {

    private final BackOfficeController controller;

    public adminUI(Long UserID) throws NoSuchAlgorithmException, InstantiationException {
        EntityManagerFactory factory = Factory.getFactory();
        UserEntityRepositorioJPAImpl userRepo = new UserEntityRepositorioJPAImpl();
        this.controller = new BackOfficeController(UserID, factory, userRepo);

        int opcao = 0;
        do {
            opcao = menu(UserID);

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Nao implementado.");
                    break;
                case 2:
                    new ViewUserUI(controller);
                    break;
                case 3:
                    new JobOpeningUI(controller);
                    break;
                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }
    private int menu(Long UserId) {
        int option = -1;
        String username = controller.getUsername(UserId);
        System.out.println("\n======================================");
        System.out.println("| Jobs4u - BackOffice - Admin Menu   |");
        System.out.println("======================================");
        System.out.println("| 1. My account                      |");
        System.out.println("| 2. Users                           |");
        System.out.println("| 3. Job Opening                     |");
        System.out.println("| 0. Exit                            |");
        System.out.println("======================================");
        option = Console.readInteger("Please choose an option");
        return option;
    }
}
