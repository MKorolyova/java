import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArgumentAnalyzerTest {
    @Test
    public void testAnalyze_WithMatchingSubstring() {
        String[] arguments = {"apple", "banana", "pineapple", "grape", "peach"};
        String substring = "apple";

        ArrayList<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("pineapple");
        
        ArgumentAnalyzer test = new ArgumentAnalyzer();
        ArrayList<String> result = test.analyze(arguments, substring);

        assertEquals(expected, result);
    }

    @Test
    public void testAnalyze_WithNoMatchingSubstring() {
        String[] arguments = {"apple", "banana", "grape"};
        String substring = "berry";

        ArrayList<String> expected = new ArrayList<>();
        
        ArgumentAnalyzer test = new ArgumentAnalyzer();
        ArrayList<String> result = test.analyze(arguments, substring);

        assertEquals(expected, result);
    }

}
