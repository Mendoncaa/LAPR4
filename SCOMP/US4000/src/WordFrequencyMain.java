import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyMain {

    public static void main(String[] args) throws InterruptedException {
        String rootDirectory = "C:/SCOMP_PLUGIN/data";
        // Lista para armazenar as threads
        List<Thread> threads = new ArrayList<>();
        // Mapa para armazenar os resultados para os prefixos
        Map<String, List<WordData>> prefixResults = new HashMap<>();
        File rootDir = new File(rootDirectory);
        File[] candidateDirs = rootDir.listFiles(File::isDirectory);
        if (candidateDirs != null) {
            for (File candidateDir : candidateDirs) {
                File[] prefixDirs = candidateDir.listFiles(File::isDirectory);
                if (prefixDirs != null) {
                    for (File prefixDir : prefixDirs) {
                        String prefix = prefixDir.getName();
                        List<WordData> topWords = new ArrayList<>();
                        prefixResults.put(prefix, topWords);
                        // Criar uma nova thread para processar arquivos
                        Thread thread = new Thread(new FileProcessor(prefixDir, topWords));
                        threads.add(thread);
                        thread.start(); // Inicio da thread
                    }
                }
            }
        }

        // Espera que todas as threads terminem
        for (Thread thread : threads) {
            thread.join(); // Aguarda a conclusão das threads
        }

        // Printar os resultados
        for (Map.Entry<String, List<WordData>> entry : prefixResults.entrySet()) {
            String prefix = entry.getKey();
            List<WordData> topWords = entry.getValue();
            System.out.println("Prefixo: " + prefix);
            topWords.stream()
                    .sorted((wd1, wd2) -> Integer.compare(wd2.getFrequency(), wd1.getFrequency()))
                    .limit(20)
                    .forEach(wordData ->
                            System.out.println("Palavra: " + wordData.getWord() + ", Frequência: "
                                    + wordData.getFrequency() + ", Ficheiros: " + wordData.getFiles()));
            System.out.println();
        }

        System.out.println("All processing threads finished.");
    }
}
