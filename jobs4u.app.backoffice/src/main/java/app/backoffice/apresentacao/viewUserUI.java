package app.backoffice.apresentacao;

import app.backoffice.aplicacao.BackOfficeController;
import core.util.Console;

public class viewUserUI {

    private static final BackOfficeController uc = new BackOfficeController();

    public viewUserUI(Long UserId, String username) {

        int opcao = 0;
        do {
            opcao = menu(UserId);

            switch (opcao) {
                case 0:
                    System.out.println("fim ...");
                    break;
                case 1:
                    System.out.println("Nao implementado.");
                    break;

                case 2:
                    listUsers();
                    break;

                case 3:
                    System.out.println("Nao implementado.");
                    break;

                case 4:
                    System.out.println("Nao implementado.");
                    break;

                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 0);

    }
    private static int menu(Long UserId) {
        int option = -1;
        String username = uc.getUsername(UserId);
        System.out.println(" ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Users:\n");
        System.out.println("1.Add User");
        System.out.println("2.List All Users");
        System.out.println("3.Deactivate User");
        System.out.println("4.Activate User");
        System.out.println("\n0. Sair\n");
        option = Console.readInteger("Por favor escolha opção");
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
}
