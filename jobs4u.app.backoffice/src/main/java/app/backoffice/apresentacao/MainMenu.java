/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.backoffice.apresentacao;

import core.util.Console;
import core.aplicacao.mainController;

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
		System.out.println("\n======================================");
		System.out.println("| Jobs4u - BackOffice                 |");
		System.out.println("======================================");
		System.out.println("| 1. Login                            |");
		System.out.println("| 0. Exit                             |");
		System.out.println("======================================");
		option = Console.readInteger("Please choose an option");
		return option;
	}
}
