import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class WordFrequencyAnalyzer {
    private final WordFrequency wordFrequency = new WordFrequency(); // Instância de WordFrequency para armazenar dados das palavras
    public void analyzeFile(Path filePath) throws IOException {
        List<String> lines = Files.readAllLines(filePath); // Lê todas as linhas do arquivo
        String fileName = filePath.getFileName().toString();
        for (String line : lines) {
            String[] words = line.split("\\W+"); // Divide a linha em palavras através do delimitador
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordFrequency.addWord(word, fileName); // Adiciona a palavra ao WordFrequency
                }
            }
        }
    }

    // Retorna as 20 palavras mais frequentes
    public List<WordData> getTop20Words() {
        return wordFrequency.getWordMap().values().stream()
                .sorted((wd1, wd2) -> Integer.compare(wd2.getFrequency(), wd1.getFrequency())) // Ordena as palavras através da frequência
                .limit(20) // Limita o top 20
                .collect(Collectors.toList()); // Coleta os resultados
    }
}
