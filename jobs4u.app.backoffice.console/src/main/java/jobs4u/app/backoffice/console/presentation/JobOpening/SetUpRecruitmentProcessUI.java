package jobs4u.app.backoffice.console.presentation.JobOpening;

import core.management.jobOpening.domain.JobOpening;
import eapli.framework.presentation.console.AbstractUI;
import core.management.RecruitmentProcess.controller.SetUpRecruitmentProcessController;
import eapli.framework.presentation.console.SelectWidget;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class SetUpRecruitmentProcessUI extends AbstractUI {

    private final SetUpRecruitmentProcessController controller = new SetUpRecruitmentProcessController();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    protected boolean doShow() {

        JobOpening selectedJobOpening = selectJobOpening();

        boolean includeInterviews = askYesNo("Include Interviews phase? (yes/no):");

        LocalDate applicationStart = askForDate("Enter Application phase start date (yyyy-mm-dd):");
        LocalDate applicationEnd = askForDate("Enter Application phase end date (yyyy-mm-dd):", applicationStart);

        LocalDate screeningStart = askForDate("Enter Screening phase start date (yyyy-mm-dd):", applicationEnd);
        LocalDate screeningEnd = askForDate("Enter Screening phase end date (yyyy-mm-dd):", screeningStart);

        LocalDate interviewStart = null;
        LocalDate interviewEnd = null;
        if (includeInterviews) {
            interviewStart = askForDate("Enter Interviews phase start date (yyyy-mm-dd):", screeningEnd);
            interviewEnd = askForDate("Enter Interviews phase end date (yyyy-mm-dd):", interviewStart);
        }

        LocalDate analysisStart = askForDate("Enter Analysis phase start date (yyyy-mm-dd):", includeInterviews ? interviewEnd : screeningEnd);
        LocalDate analysisEnd = askForDate("Enter Analysis phase end date (yyyy-mm-dd):", analysisStart);

        LocalDate resultStart = askForDate("Enter Result phase start date (yyyy-mm-dd):", analysisEnd);
        LocalDate resultEnd = askForDate("Enter Result phase end date (yyyy-mm-dd):", resultStart);

        boolean success = controller.setupPhases(selectedJobOpening, includeInterviews,
                applicationStart, applicationEnd, screeningStart, screeningEnd,
                interviewStart, interviewEnd, analysisStart, analysisEnd,
                resultStart, resultEnd);

        if (success) {
            System.out.println("Recruitment process set up successfully.");
        } else {
            System.out.println("Failed to set up recruitment process. Check the dates and try again.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Set Up Recruitment Process";
    }

    private JobOpening selectJobOpening() {
        Iterable<JobOpening> jobOpenings = controller.allJobOpenings();

        SelectWidget<JobOpening> selectWidget = new SelectWidget<>("Select a job opening:", jobOpenings);

        selectWidget.show();

        return selectWidget.selectedElement();
    }

    private boolean askYesNo(String prompt) {
        String response;
        while (true) {
            System.out.println(prompt);
            response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                return true;
            } else if (response.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid response. Please answer 'yes' or 'no'.");
            }
        }
    }


    private LocalDate askForDate(String prompt) {
        while (true) {
            try {
                System.out.println(prompt);
                return LocalDate.parse(scanner.next());
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy-mm-dd.");
            }
        }
    }

    private LocalDate askForDate(String prompt, LocalDate minDate) {
        LocalDate date;
        do {
            date = askForDate(prompt);
            if (date.isBefore(minDate)) {
                System.out.println("The date must not be before " + minDate);
            }
        } while (date.isBefore(minDate));
        return date;
    }
}
