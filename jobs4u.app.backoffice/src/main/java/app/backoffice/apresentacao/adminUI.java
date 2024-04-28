package app.backoffice.apresentacao;

import app.backoffice.aplicacao.BackOfficeController;
import core.util.Console;

import java.security.NoSuchAlgorithmException;

public class adminUI {

    private static final BackOfficeController ac = new BackOfficeController();

    static String username;

    public adminUI(Long UserID) throws NoSuchAlgorithmException, InstantiationException {

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
                    new ViewUserUI(UserID, username);
                    break;

                case 3:
                    new JobOpeningUI(UserID, username);
                    break;

                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }
    private static int menu(Long UserId) {
        int option = -1;
        username = ac.getUsername(UserId);
        System.out.println(" ");
        System.out.println("======================================");
        System.out.println(" Jobs4u - BackOffice - Admin Menu (" + username + ")");
        System.out.println("======================================");
        System.out.println("1.My account");
        System.out.println("2.Users");
        System.out.println("======================================");
        System.out.println("0. Sair\n");
        option = Console.readInteger("Por favor escolha opção");
        return option;
    }
}
