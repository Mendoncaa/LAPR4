import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileProcessor implements Runnable {
    private final File directory; // Diretório a processar
    private final List<WordData> topWords; // Lista com as palavras mais frequentes

    public FileProcessor(File directory, List<WordData> topWords) {
        this.directory = directory;
        this.topWords = topWords;
    }

    @Override
    public void run() {
        processFilesInDirectory(directory); // Iniciação do processamento dos arquivos
    }

    private void processFilesInDirectory(File directory) {
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files != null) {
            WordFrequencyAnalyzer analyzer = new WordFrequencyAnalyzer(); // Inicia o analisador de frequência de palavras
            for (File file : files) {
                try {
                    System.out.println("Processando Ficheiro: " + file.getName());
                    analyzer.analyzeFile(file.toPath()); // Analisa o arquivo
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            synchronized (topWords) {
                topWords.addAll(analyzer.getTop20Words()); // Adiciona as palavras mais frequentes à lista compartilhada
            }
        }
    }
}
