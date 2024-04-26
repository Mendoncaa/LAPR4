package app.backoffice.apresentacao;

import app.backoffice.aplicacao.AdminController;
import core.util.Console;

import javax.persistence.EntityManagerFactory;

public class adminUI {

    private static final AdminController ac = new AdminController();
    public adminUI(Long AdminId) {

        int opcao = 0;
        do {
            opcao = menu(AdminId);

            switch (opcao) {
                case 0:
                    System.out.println("fim ...");
                    break;
                case 1:
                    //new loginUI();
                    break;

                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }
    private static int menu(Long AdminId) {
        int option = -1;
        String username = ac.getUsername(AdminId);
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
