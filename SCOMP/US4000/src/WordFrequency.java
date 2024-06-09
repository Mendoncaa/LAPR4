import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    private final Map<String, WordData> wordMap = new HashMap<>(); // Mapa para armazenar dados de palavras

    public void addWord(String word, String fileName) {
        word = word.toLowerCase(); // Converte a palavra para minúsculas
        WordData wordData = wordMap.get(word); // Obtém os dados da palavra, se já existir no mapa
        if (wordData == null) {
            wordData = new WordData(word, fileName); // Cria um novo WordData se a palavra não existir
            wordMap.put(word, wordData); // Adiciona a nova palavra ao mapa
        } else {
            wordData.incrementFrequency(fileName); // Incrementa a frequência da palavra existente
        }
    }

    public Map<String, WordData> getWordMap() {
        return wordMap; // Retorna o mapa de palavras
    }
}
