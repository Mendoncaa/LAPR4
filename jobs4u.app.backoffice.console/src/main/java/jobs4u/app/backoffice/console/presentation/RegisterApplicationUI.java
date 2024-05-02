/*package jobs4u.app.backoffice.console.presentation;


import java.io.File;
import java.util.HashSet;
import java.util.Set;

import core.management.jobApplication.application.controller.RegisterApplicationController;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.io.util.Console;

 * UI for initiating the import process of candidate files.
 
public class RegisterApplicationUI extends AbstractUI {

    private final RegisterApplicationController theController = new RegisterApplicationController();

    @Override
    protected boolean doShow() {
        
        final String directoryPath = Console.readLine("Enter the directory path for candidate files:");
        File dir = new File(directoryPath);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path.");
            return false;
        }

        try {
            theController.processFilesFromDirectory(directoryPath);
            System.out.println("Files processed successfully.");
        } catch (Exception e) {
            System.out.println("Error processing files: " + e.getMessage());
        }

        return false;
    }

    @Override
    public String headline() {
        return "Import Candidate Files";
    }
}
*/