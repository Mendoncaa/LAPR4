package app.backoffice.apresentacao;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import core.aplicacao.mainController;

public class loginUI {

    private static final int DEFAULT_MAX_ATTEMPTS = 3;

    public loginUI(mainController mc) throws InstantiationException, NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);

        int attempts = 0;
        int outcome = 0;

        do {
            System.out.println("\n========== Login ==========");
            System.out.print("| Username: ");
            String usr = scan.nextLine();
            System.out.print("| Password: ");
            String psw = scan.nextLine();
            System.out.println("===========================");

            outcome = mc.auth(usr, psw, "Admin");
            if (outcome == 0) {
                attempts++;
                System.out.println("Username or Password incorrect");
                System.out.println("You have " + (DEFAULT_MAX_ATTEMPTS - attempts) + " attempts left");
            } else if (outcome == -1) {
                System.out.println("User is Deactivated");
            } else if (outcome == -2) {
                System.out.println("User is not an Admin");
            } else if (outcome == 1) {
                Long AdminId = mc.getId(usr, psw);
                new adminUI(AdminId);
            } else {
                throw new InstantiationException("Couldn't login");
            }
        } while (outcome != 1 && attempts < DEFAULT_MAX_ATTEMPTS);
    }
}
