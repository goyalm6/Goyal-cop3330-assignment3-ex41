package ex41;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortNamesTest {
    private SortNames sn;

    @BeforeEach
    void setUp() {
        sn = new SortNames();
        sn.inputFile = "src/main/resources/exercise41_input.txt";
        sn.outputFile = "src/main/resources/exercise41_output.txt";
    }

    @AfterEach
    void tearDown() {
        sn = null;
    }

    @Test
    void testInputFileNotEmpty() {
        List<String> names = sn.readFromFile();
        assertNotNull(names);
    }

    @Test
    void testOutputFileExists() {
        List<String> names = sn.readFromFile();
        sn.writeToFile(names);

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("exercise41_output.txt").getFile());
        String absolutePath = file.getAbsolutePath();

        assertTrue(file.exists());
    }
}
