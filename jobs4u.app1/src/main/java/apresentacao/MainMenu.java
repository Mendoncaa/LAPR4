/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import util.Console;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author mcn
 */
public class MainMenu {

	static ClientUI ClientUI = new ClientUI();
    public static void mainLoop() throws InstantiationException, NoSuchAlgorithmException {
		int opcao = 0;
		do {
			opcao = menu();

			switch (opcao) {
				case 0:
					System.out.println("fim ...");
					break;
				case 1:
					ClientUI.registarClient();
					break;

				case 2:
					ClientUI.listarClients();
					break;

				case 3:
					ClientUI.procurarClientPorNome();
					break;

				
				default:
					System.out.println("opcao não reconhecida.");
					break;
			}
		} while (opcao != 0);

	}

	private static int menu() {
		int option = -1;
		System.out.println("");
		System.out.println("=============================");
		System.out.println(" Jobs4u - Test scripts and persistence");
		System.out.println("=============================\n");
		System.out.println("1.Registar User");
		System.out.println("2.Listar todos os Users");
		System.out.println("3.Procurar Users por Nome");
		
        System.out.println("=============================");
        System.out.println("0. Sair\n\n");
		option = Console.readInteger("Por favor escolha opção");
		return option;
	}
}
