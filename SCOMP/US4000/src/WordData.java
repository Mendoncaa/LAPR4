import java.util.HashSet;
import java.util.Set;

public class WordData {
    private final String word;
    private int frequency;
    private final Set<String> files;
    public WordData(String word, String fileName) {
        this.word = word;
        this.frequency = 1;
        this.files = new HashSet<>();
        this.files.add(fileName);
    }
    public String getWord() {
        return word;
    }
    public int getFrequency() {
        return frequency;
    }
    public Set<String> getFiles() {
        return files;
    }
    public void incrementFrequency(String fileName) {
        this.frequency++;
        this.files.add(fileName);
    }
}
