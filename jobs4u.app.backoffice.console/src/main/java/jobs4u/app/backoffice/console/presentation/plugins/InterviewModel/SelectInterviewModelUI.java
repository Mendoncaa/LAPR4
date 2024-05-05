package jobs4u.app.backoffice.console.presentation.plugins.InterviewModel;

import core.management.jobOpening.domain.JobOpening;
import core.management.plugins.interviewModel.controller.SelectInterviewModelController;
import core.management.plugins.interviewModel.domain.InterviewModel;
import core.management.plugins.requirementsSpecifications.controller.SelectRequirementsSpecificationController;
import core.management.plugins.requirementsSpecifications.domain.RequirementsSpecification;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

public class SelectInterviewModelUI extends AbstractUI {

    private final SelectInterviewModelController controller = new SelectInterviewModelController();
    @Override
    protected boolean doShow() {

        try{
            controller.associateInterviewModelToJobOpening(selectJobOpening(), selectInterviewModel());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }

        return false;
    }

    private JobOpening selectJobOpening() {
        Iterable<JobOpening> jobOpenings = controller.allJobOpenings();

        SelectWidget<JobOpening> selectWidget = new SelectWidget<>("Select a job opening:", jobOpenings);

        selectWidget.show();

        return selectWidget.selectedElement();
    }

    private InterviewModel selectInterviewModel() {
        Iterable<InterviewModel> jobRequirementsSpecifications = controller.AllInterviewModels();

        SelectWidget<InterviewModel> selectWidget = new SelectWidget<>("Select a Interview Model", jobRequirementsSpecifications);

        selectWidget.show();

        return selectWidget.selectedElement();
    }

    @Override
    public String headline() {
        return "Select Interview Model";
    }
}
