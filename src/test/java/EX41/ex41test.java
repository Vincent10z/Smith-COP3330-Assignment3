package EX41;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ex41test {
    private ex41 ex41;
    @BeforeEach
    public void setUp() throws Exception {
        ex41 = new ex41();
    }
    @Test
    @DisplayName("Reader should work")
    public void testRead() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\COP 3330\\IntelliJProjects\\" +
                "Smith-COP3330-Assignment3\\src\\main\\java\\EX41\\exercise41_input.txt"));

    }
}
