/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import persistence.impl.jpa.ClientEntity;
import util.Console;

/**
 *
 * @author mcn
 */
public class MainMenu {

	static CLientUI ClientUI = new ClientUI();
    public static void mainLoop() throws InstantiationException {
		int opcao = 0;
		do {
			opcao = menu();

			switch (opcao) {
				case 0:
					System.out.println("fim ...");
					break;
				case 1:
					ClientUI.registarGA();
					break;

				case 2:
					ClientUI.listarGAs();
					break;

				case 3:
					ClientUI.procurarGAPorID();
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
