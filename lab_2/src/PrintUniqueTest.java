import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class PrintUniqueTest {
    @Test
    public void testPrintUniquen() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 4, 6, 8, 9, 7, 5, 3, 2, 1));
        HashSet<Integer> expected = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(expected, PrintUnique.start(input));

        String expectedOutput = expected.toString()  + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());

        System.setOut(System.out);
    }

}
