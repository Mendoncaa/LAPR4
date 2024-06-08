package jobs4u.antlr4.grammar;

import core.infrastructure.persistence.PersistenceContext;
import core.management.jobOpening.domain.JobOpening;
import core.management.jobOpening.repository.JobOpeningRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GenerateRequirementSpecificationTemplateService {
    private final JobOpeningRepository jobOpeningRepository = PersistenceContext.repositories().jobOpenings();


    public Iterable<JobOpening> findJobOpenings() {
        return jobOpeningRepository.findAll();
    }

    public boolean generateTemplate(String sourcePath, JobOpening jobOpening) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(sourcePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(trimAfterSecondColon(line));
            }
        } catch (IOException e) {
            System.err.println("Error reading the file");
            e.printStackTrace();
            return false;
        }


        String destinationPath = "jobs4u.core/src/main/java/core/management/RequirementSpecification/" + jobOpening.identity().toString();
        Path newFolder = Paths.get(destinationPath);
        try{
            Files.createDirectories(newFolder);
        }catch (IOException e){
            System.err.println("Error creating the folder");
            e.printStackTrace();
            return false;
        }
        File destinationFile = new File(destinationPath + "/requirements" + jobOpening.identity().toString() + ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            for (String processedLine : lines) {
                writer.write(processedLine);
                writer.newLine();
            }

            System.out.println("File generated successfully!");
        } catch (IOException e) {
            System.err.println("Error writing the file");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private String trimAfterSecondColon(String line) {
        int firstColonIndex = line.indexOf(":");
        if (firstColonIndex != -1) {
            int secondColonIndex = line.indexOf(":", firstColonIndex + 1);
            if (secondColonIndex != -1) {
                return line.substring(0, secondColonIndex + 2);
            }
        }
        return line;
    }
}
