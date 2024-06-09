import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordDataTest {

    @Test
    void testWordDataCreation() {
        WordData wordData = new WordData("test", "file1.txt");
        assertEquals("test", wordData.getWord());
        assertEquals(1, wordData.getFrequency());
        assertTrue(wordData.getFiles().contains("file1.txt"));
        assertEquals(1, wordData.getFiles().size());
    }

    @Test
    void testIncrementFrequency() {
        WordData wordData = new WordData("test", "file1.txt");
        wordData.incrementFrequency("file2.txt");
        assertEquals(2, wordData.getFrequency());
        assertTrue(wordData.getFiles().contains("file1.txt"));
        assertTrue(wordData.getFiles().contains("file2.txt"));
        assertEquals(2, wordData.getFiles().size());
    }

    @Test
    void testIncrementFrequencySameFile() {
        WordData wordData = new WordData("test", "file1.txt");
        wordData.incrementFrequency("file1.txt");
        assertEquals(2, wordData.getFrequency());
        assertTrue(wordData.getFiles().contains("file1.txt"));
        assertEquals(1, wordData.getFiles().size());
    }

    @Test
    void testGetWord() {
        WordData wordData = new WordData("example", "file1.txt");
        assertEquals("example", wordData.getWord());
    }

    @Test
    void testGetFrequency() {
        WordData wordData = new WordData("example", "file1.txt");
        assertEquals(1, wordData.getFrequency());
        wordData.incrementFrequency("file2.txt");
        assertEquals(2, wordData.getFrequency());
    }

    @Test
    void testGetFiles() {
        WordData wordData = new WordData("example", "file1.txt");
        Set<String> files = wordData.getFiles();
        assertNotNull(files);
        assertTrue(files.contains("file1.txt"));
        assertEquals(1, files.size());
    }
}