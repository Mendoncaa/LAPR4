package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import core.management.InterviewModel.application.controller.SelectInterviewController;
import core.management.InterviewModel.domain.InterviewModel;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobReference;
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
        JobReference jobReference = jobReferences.get(scanner.nextInt() - 1);

        System.out.println("Available Plugins:");
        count = 1;
        List<InterviewModel> plugins = selectInterviewController.allPlugins();
        for (InterviewModel plugin : plugins) {
            System.out.println(count + ") " + plugin.getName());
            count++;
        };

        System.out.println("Enter Plugin Name:");
        String pluginName = plugins.get(scanner.nextInt() - 1).getName();

        selectInterviewController.selectInterviewModel(jobReference, pluginName);

        System.out.println("Interview Model selected successfully.");

        return true;
    }

    @Override
    public String headline() {
        return "Select Interview Model for a Job Opening";
    }
}
