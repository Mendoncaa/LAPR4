package app.backoffice.apresentacao;

import app.backoffice.aplicacao.mainController;

import java.util.Scanner;



public class loginUI {

    private static final int DEFAULT_MAX_ATTEMPTS = 3;

    public loginUI(mainController mc) throws InstantiationException{
        Scanner scan = new Scanner(System.in);

        int attempts = 0;
        int outcome = 0;

        do{
            System.out.println("==Login==");
            System.out.println("Username:");
            String usr = scan.nextLine();
            System.out.println("Password:");
            String psw = scan.nextLine();

            outcome = mc.auth(usr,psw);
            if (outcome == 0){
                attempts++;
                System.out.println("User of Password incorrect");
                System.out.println("YOU HAVE " + (DEFAULT_MAX_ATTEMPTS - attempts) + " ATTEMPTS LEFT");
            }
            if(outcome == 1){
                int AdminId = mc.getAdminId(usr,psw);
                new adminUI(AdminId);
                outcome = 0;
            }
            else{
                throw new InstantiationException("Couldn't login");
            }

        } while (outcome == 0 && attempts < DEFAULT_MAX_ATTEMPTS);

        // Get authentication info

    }
}
