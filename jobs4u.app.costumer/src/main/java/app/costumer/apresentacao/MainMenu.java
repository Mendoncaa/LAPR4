/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.costumer.apresentacao;

import core.aplicacao.mainController;
import core.util.Console;

import java.security.NoSuchAlgorithmException;

public class MainMenu {

	private static mainController mc = new mainController();

	public static void main(String[] args) {
		try {
			//load bootsrap data
			mc.loadData();

			//main loop
			mainloop();
		} catch (InstantiationException | NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

    }

    public static void mainloop() throws InstantiationException, NoSuchAlgorithmException {
		int opcao = 0;
		do {
			opcao = menu();

			switch (opcao) {
				case 0:
					System.out.println("fim ...");
					break;
				case 1:
					new loginUI(mc);
					break;

				default:
					System.out.println("opcao não reconhecida.");
					break;
			}
		} while (opcao != 0);

	}

	private static int menu() {
		int option = -1;
		System.out.println(" ");
		System.out.println("======================================");
		System.out.println(" Jobs4u - Costumer App");
		System.out.println("======================================");
		System.out.println("1.Login");
        System.out.println("======================================");
        System.out.println("0. Sair\n");
		option = Console.readInteger("Por favor escolha opção");
		return option;
	}
}
