package jobs4u.antlr4.InterviewModelManagement;


import jobs4u.antlr4.grammar.InterviewQuestionsLexer;
import jobs4u.antlr4.grammar.InterviewQuestionsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InterviewChecker {
    public int checkInterviews(List<InterviewAnswers> correctInterviews, List<InterviewAnswers> candidateInterviews) {
        int totalScore = 0;

        for (int i = 0; i < correctInterviews.size(); i++) {
            InterviewAnswers correctInterview = correctInterviews.get(i);
            InterviewAnswers candidateInterview = candidateInterviews.get(i);

            if (correctInterview.getAnswer().equals(candidateInterview.getAnswer())) {
                totalScore += correctInterview.getValue();
            } else if (correctInterview.getAnswer().contains(",") && candidateInterview.getAnswer().contains(",")) {
                String[] correctAnswers = correctInterview.getAnswer().split(",");
                String[] candidateAnswers = candidateInterview.getAnswer().split(",");
                int correctCount = 0;

                for (String candidateAnswer : candidateAnswers) {
                    for (String correctAnswer : correctAnswers) {
                        if (candidateAnswer.trim().equals(correctAnswer.trim())) {
                            correctCount++;
                            break;
                        }
                    }
                }

                totalScore += (correctCount / (double) correctAnswers.length) * correctInterview.getValue();
            }

            System.out.println("Pergunta " + correctInterview.getId() + ": " + correctInterview.getContent());
            System.out.println("Resposta do candidato: " + candidateInterview.getAnswer());
        }



                int correctQuestions = 0;
                int totalValueOfCorrectQuestions = 0;
                List<String> incorrectQuestions = new ArrayList<>();
                int totalPossibleScore = 0;

                for (int i = 0; i < correctInterviews.size(); i++) {
                    InterviewAnswers correctInterview = correctInterviews.get(i);
                    InterviewAnswers candidateInterview = candidateInterviews.get(i);

                    totalPossibleScore += correctInterview.getValue();

                    if (correctInterview.getAnswer().equals(candidateInterview.getAnswer())) {
                        correctQuestions++;
                        totalValueOfCorrectQuestions += correctInterview.getValue();
                    } else {
                        incorrectQuestions.add(correctInterview.getId());
                    }
                }

                System.out.println("Número de perguntas corretas: " + correctQuestions);
                System.out.println("Valor total das perguntas corretas: " + totalValueOfCorrectQuestions);
                System.out.println("Perguntas incorretas: " + incorrectQuestions);
                System.out.println("Pontuação total possível: " + totalPossibleScore);



        System.out.println("Pontuação total: " + totalScore);
        return totalScore;
    }

//    public void checkSyntax(String candidateFilePath) {
//        try {
//            InterviewQuestionsParser parser = createParser(candidateFilePath);
//            parser.start(); // tenta analisar o arquivo
//            System.out.println("A sintaxe do arquivo está correta.");
//        } catch (RecognitionException e) {
//            System.out.println("A sintaxe do arquivo está incorreta.");
//        } catch (IOException e) {
//            System.out.println("Ocorreu um erro ao ler o arquivo.");
//        }
//    }
//
//    private InterviewQuestionsParser createParser(String filePath) throws IOException {
//        CharStream charStream = CharStreams.fromFileName(filePath);
//        InterviewQuestionsLexer lexer = new InterviewQuestionsLexer(charStream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        return new InterviewQuestionsParser(tokens);
//    }
}
