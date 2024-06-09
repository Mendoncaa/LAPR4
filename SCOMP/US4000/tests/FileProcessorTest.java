import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    @Test
    void testProcessFilesInDirectory() throws IOException {
        // Setup
        File tempDir = Files.createTempDirectory("testDir").toFile();
        File tempFile1 = File.createTempFile("testFile1", ".txt", tempDir);
        File tempFile2 = File.createTempFile("testFile2", ".txt", tempDir);

        List<WordData> topWords = new ArrayList<>();
        FileProcessor fileProcessor = new FileProcessor(tempDir, topWords);

        // Write some content to the files
        Files.write(tempFile1.toPath(), "word1 word2 word1".getBytes());
        Files.write(tempFile2.toPath(), "word3 word1 word3".getBytes());

        // Execute
        fileProcessor.run();

        // Verify
        assertFalse(topWords.isEmpty());
        assertTrue(topWords.size() > 0);
    }

    @Test
    void testProcessEmptyDirectory() throws IOException {
        // Setup
        File tempDir = Files.createTempDirectory("emptyDir").toFile();

        List<WordData> topWords = new ArrayList<>();
        FileProcessor fileProcessor = new FileProcessor(tempDir, topWords);

        // Execute
        fileProcessor.run();

        // Verify
        assertTrue(topWords.isEmpty());
    }

    @Test
    void testProcessFileWithNoText() throws IOException {
        // Setup
        File tempDir = Files.createTempDirectory("testDir").toFile();
        File tempFile = File.createTempFile("emptyFile", ".txt", tempDir);

        List<WordData> topWords = new ArrayList<>();
        FileProcessor fileProcessor = new FileProcessor(tempDir, topWords);

        // Execute
        fileProcessor.run();

        // Verify
        assertTrue(topWords.isEmpty());
    }
}
