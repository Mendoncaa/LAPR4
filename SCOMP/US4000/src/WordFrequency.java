import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    private final Map<String, WordData> wordMap = new HashMap<>(); // Mapa de armazenamento dos detalhes das palavras
    public void addWord(String word, String fileName) {
        word = word.toLowerCase(); // Conversão para lowercase
        WordData wordData = wordMap.get(word); // Obtém os dados da palavra através do mapa
        if (wordData == null) {
            wordData = new WordData(word, fileName); // Cria um novo WordData
            wordMap.put(word, wordData); // Adiciona a palavra ao mapa
        } else {
            wordData.incrementFrequency(fileName); // Aumenta a frequência
        }
    }

    public Map<String, WordData> getWordMap() {
        return wordMap; // Retorna o mapa de palavras
    }
}
