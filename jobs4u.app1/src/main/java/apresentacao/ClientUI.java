/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import aplicacao.ClientController;
import persistence.impl.jpa.ClientEntity;
import util.Console;
import java.util.List;

/**
 *
 * @author mcn
 */
public class ClientUI {

    private final ClientController controller = new ClientController();

    public void registarClient() throws InstantiationException {
        System.out.println("*** Registar Cliente ***\n");
        final String username = Console.readLine("Username");
        final String password = Console.readLine("Password");
        final String firstName = Console.readLine("First Name");
        final String lastName = Console.readLine("Last Name");
        final String email = Console.readLine("E-Mail");
        final String phone = Console.readLine("Phone");
        String role = null;
        int opcao = 0;
        do {
            opcao = menu();

            switch (opcao) {
                case 1:
                    role = "User";
                    break;

                case 2:
                    role = "Admin";
                    break;


                default:
                    System.out.println("opcao não reconhecida.");
                    break;
            }
        } while (opcao != 1 && opcao != 2);
        
        ClientEntity clientEntity = controller.checkValidClient(username, password, firstName, lastName, email, phone, role);
        System.out.println("User: " + clientEntity + "\nRegistado com sucesso!");
    }
    public void listarClients() {
		List<GrupoAutomovel> lista = controller.listarGruposAutomoveis();
        for (GrupoAutomovel ga : lista) {
            System.out.println(ga);
        }
	}

	public void procurarClientPorNome() {
        long id = Console.readInteger("Por favor introduza o ID do Grupo Automóvel:");
        GrupoAutomovel ga = controller.procurarGrupoAutomovel(id);
        if (ga != null) {
            System.out.println(ga);
        } else {
            System.out.println("Grupo Automóvel não encontrado");
        }
	}

    private static int menu() {
        int option = -1;
        System.out.println("");
        System.out.println(" Role:\n");
        System.out.println("=============================");
        System.out.println("1.User");
        System.out.println("2.Admin");
        System.out.println("=============================\n");
        option = Console.readInteger("Por favor escolha opção");
        return option;
    }
}
