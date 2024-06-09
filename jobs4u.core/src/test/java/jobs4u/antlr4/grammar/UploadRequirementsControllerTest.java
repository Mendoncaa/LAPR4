package jobs4u.antlr4.grammar;

import core.management.jobApplication.application.service.ApplicationService;
import core.management.jobApplication.domain.jobApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UploadRequirementsControllerTest {

    @Mock
    private ApplicationService applicationService;

    @InjectMocks
    private UploadRequirementsController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void testUploadTextFileWithValidGrammar() throws IOException {
        // Arrange
        jobApplication application = mock(jobApplication.class);
        String validFilePath = "validFile.txt";

        UploadRequirementsController controllerSpy = spy(controller);
        doReturn(true).when(controllerSpy).passGrammar(validFilePath);

        // Act
        controllerSpy.uploadTextFile(application, validFilePath);

        // Assert
        verify(applicationService).uploadRequirementsResponses(application, validFilePath);
    }

    @Test
    void testUploadTextFileWithInvalidGrammar() throws IOException {
        // Arrange
        jobApplication application = mock(jobApplication.class);
        String invalidFilePath = "invalidFile.txt";

        UploadRequirementsController controllerSpy = spy(controller);
        doReturn(false).when(controllerSpy).passGrammar(invalidFilePath);

        // Act
        controllerSpy.uploadTextFile(application, invalidFilePath);

        // Assert
        verify(applicationService, never()).uploadRequirementsResponses(any(), any());
    }

    @Test
    void testPassGrammarWithValidFile() throws IOException {
        // Arrange
        String validFilePath = "src/test/resources/validFile.txt";
        // Simulate valid file content here if necessary

        // Act
        boolean result = controller.passGrammar(validFilePath);

        // Assert
        assertTrue(result);
    }

    @Test
    void testPassGrammarWithInvalidFile() throws IOException {
        // Arrange
        String invalidFilePath = "src/test/resources/invalidFile.txt";
        // Simulate invalid file content here if necessary

        // Act
        boolean result = controller.passGrammar(invalidFilePath);

        // Assert
        assertFalse(result);
    }
}
