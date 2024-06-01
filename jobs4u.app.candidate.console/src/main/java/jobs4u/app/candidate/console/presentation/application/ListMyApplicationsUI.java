package jobs4u.app.candidate.console.presentation.application;

import core.management.jobApplication.application.controller.ListApplicationsForJobOpeningController;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobOpening.controller.ListJobOpeningsController;
import core.management.jobOpening.domain.JobOpening;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ListMyApplicationsUI extends AbstractUI {

    private final ListApplicationsForJobOpeningController theController = new ListApplicationsForJobOpeningController();
    private static final Logger LOGGER = LoggerFactory.getLogger(ListMyApplicationsUI.class);
    private final ListJobOpeningsController jobOpeningsController = new ListJobOpeningsController();

    @Override
    protected boolean doShow() {

        return false;
    }

    @Override
    public String headline() {
        return "List All my Applications";
    }

}


