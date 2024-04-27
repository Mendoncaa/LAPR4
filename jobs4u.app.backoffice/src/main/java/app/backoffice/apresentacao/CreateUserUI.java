package app.backoffice.apresentacao;

import app.backoffice.aplicacao.CreateUserController;
import core.util.Console;

import domain.UserEntity;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public class CreateUserUI {

    private final CreateUserController controller = new CreateUserController();

    public CreateUserUI() throws InstantiationException, NoSuchAlgorithmException {
        System.out.println("*** Registar Cliente ***\n");
        final String username = Console.readLine("Username");
        String password = Console.readLine("Password");
        final String firstName = Console.readLine("First Name");
        final String lastName = Console.readLine("Last Name");
        String role = null;
        int opcao;
        do {
            opcao = menu();

            switch (opcao) {
                case 1:
                    role = "Costumer";
                    break;

                case 2:
                    role = "Candidate";
                    break;

                case 3:
                    role = "Admin";
                    break;


                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao < 1 || opcao > 3);

        if(controller.checkValidUser(username, password, firstName, lastName, role)){
            System.out.println("A registar User...\n");
            UserEntity userEntity = controller.createAndSaveUser(username, password, firstName, lastName, role);
            System.out.println("User: " + userEntity + "\nRegistado com sucesso!");
        } else {
            System.out.println("Erro ao registar User");
        }

    }

    private static int menu() {
        int option = -1;
        System.out.println("");
        System.out.println(" Role:\n");
        System.out.println("=============================");
        System.out.println("1.Costumer");
        System.out.println("2.Candidate");
        System.out.println("3.Admin");
        System.out.println("=============================\n");
        option = Console.readInteger("Por favor escolha opção");
        return option;
    }
}
