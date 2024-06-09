package jobs4u.antlr4.grammar;

import core.management.jobApplication.application.service.ApplicationService;
import core.management.jobApplication.domain.jobApplication;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UploadInterviewsController {
    ApplicationService applicationService = new ApplicationService();

    public Iterable<jobApplication> getApplications() {
        return applicationService.findAll();
    }

    public void uploadTextFile(jobApplication application, String path) {
            if(passGrammar(path)){
                applicationService.uploadInterviewsResponses(application, path);
            }else{
                System.out.println("Error. File didn't match grammar.");
            }

    }

    private String extractAfterSecondColon(String line) {
        int firstColonIndex = line.indexOf(":");

        if (firstColonIndex != -1) {
            int secondColonIndex = line.indexOf(":", firstColonIndex + 1);
            if (secondColonIndex != -1) {
                return line.substring(secondColonIndex + 1).trim();
            }
        }

        return "";
    }

    private List<String> readFileLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file");
            e.printStackTrace();
        }
        return lines;
    }
    public boolean passGrammar(String path) {
        if (path == null) {
            System.out.println("File not found");
            return false;
        }

        try {
            CharStream input = CharStreams.fromFileName(path);
            InterviewQuestionsLexer lexer = new InterviewQuestionsLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InterviewQuestionsParser parser = new InterviewQuestionsParser(tokens);
            CustomErrorListener errorListener = new CustomErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            ParseTree tree = parser.start();
            if(errorListener.hasErrors()){
                System.err.println("grammar not successufuly passed");
                return  false;
            }else{
                System.out.println("File matches grammar. Uploading file.");

            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false;
        } catch (RuntimeException e) {
            System.out.println("File does not match grammar: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.err.println("Error verifying grammar: " + e.getMessage());
            return false;
        }
        return true;
    }
    private static class CustomErrorListener extends BaseErrorListener {
        private boolean hasErrors = false;

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                                String msg, RecognitionException e) {
            hasErrors = true;
            System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
        }

        /**
         * Has errors boolean.
         *
         * @return the boolean
         */
        public boolean hasErrors() {
            return hasErrors;
}
}
}



