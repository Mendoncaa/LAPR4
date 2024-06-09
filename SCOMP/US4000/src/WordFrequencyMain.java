import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyMain {

    public static void main(String[] args) throws InterruptedException {
        // Diretório raiz onde os dados estão localizados
        String rootDirectory = "C:/SCOMP_PLUGIN/data";

        // Lista para armazenar todas as threads
        List<Thread> threads = new ArrayList<>();

        // Mapa para armazenar os resultados para cada prefixo
        Map<String, List<WordData>> prefixResults = new HashMap<>();

        // Obter lista de diretórios no diretório raiz
        File rootDir = new File(rootDirectory);
        File[] candidateDirs = rootDir.listFiles(File::isDirectory);

        if (candidateDirs != null) {
            for (File candidateDir : candidateDirs) {
                // Obter prefixos de subdiretórios (1, 2, etc.)
                File[] prefixDirs = candidateDir.listFiles(File::isDirectory);
                if (prefixDirs != null) {
                    for (File prefixDir : prefixDirs) {
                        String prefix = prefixDir.getName(); // Obtém o prefixo do diretório
                        List<WordData> topWords = new ArrayList<>(); // Cria uma lista para armazenar as palavras mais frequentes
                        prefixResults.put(prefix, topWords); // Adiciona a lista ao mapa de resultados
                        // Criar uma nova thread para processar os arquivos no subdiretório
                        Thread thread = new Thread(new FileProcessor(prefixDir, topWords));
                        threads.add(thread);
                        thread.start(); // Inicia a thread
                    }
                }
            }
        }

        // Esperar que todas as threads terminem
        for (Thread thread : threads) {
            thread.join(); // Aguarda a conclusão da thread
        }

        // Printar os resultados
        for (Map.Entry<String, List<WordData>> entry : prefixResults.entrySet()) {
            String prefix = entry.getKey();
            List<WordData> topWords = entry.getValue();
            System.out.println("Prefix: " + prefix);
            topWords.stream()
                    .sorted((wd1, wd2) -> Integer.compare(wd2.getFrequency(), wd1.getFrequency())) // Ordena as palavras por frequência
                    .limit(20) // Limita a lista a 20 palavras
                    .forEach(wordData ->
                            System.out.println("Word: " + wordData.getWord() + ", Frequency: "
                                    + wordData.getFrequency() + ", Files: " + wordData.getFiles())); // Exibe as palavras mais frequentes e suas frequências
            System.out.println();
        }

        System.out.println("All processing threads finished.");
    }
}
