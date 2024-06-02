package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import core.management.Plugin.application.controller.SelectInterviewController;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobReference;
import core.management.Plugin.domain.Plugin;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;
import java.util.Scanner;

public class SelectInterviewUI extends AbstractUI {

    private final SelectInterviewController selectInterviewController = new SelectInterviewController();

    private final ListJobOpeningsController listJobOpeningsController = new ListJobOpeningsController();

    public boolean doShow() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Job Openings:");
        List<JobReference> jobReferences = listJobOpeningsController.allJobReferences();
        int count = 1;
        for (JobReference jobReference : jobReferences) {
            System.out.println(count + ") " + jobReference);
            count++;
        };

        System.out.println("Enter Job Reference:");
        String jobReferenceStr = scanner.nextLine();

        System.out.println("Available Plugins:");
        List<Plugin> plugins = selectInterviewController.allPlugins();
        for (Plugin plugin : plugins) {
            System.out.println(count + ") " + plugin.getName());
            count++;
        };

        System.out.println("Enter Plugin Name:");
        String pluginName = scanner.nextLine();

        selectInterviewController.selectInterviewModel(jobReferenceStr, pluginName);

        System.out.println("Interview Model selected successfully.");

        return true;
    }

    @Override
    public String headline() {
        return "Select Interview Model for a Job Opening";
    }
}
