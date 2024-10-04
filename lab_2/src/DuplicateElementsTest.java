import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;




public class DuplicateElementsTest {
        
    @Test
    public void testNoRepeatedArray () {
        int[] input = {2, 4, 6, 8, 9, 7, 5, 3, 1};
        HashMap<Integer, ArrayList<Integer>> expected = new HashMap<>();
        assertEquals(expected, DuplicateElements.start(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        HashMap<Integer, ArrayList<Integer>> expected = new HashMap<>();
        assertEquals(expected, DuplicateElements.start(input));
    }

    @Test
    public void testRepeatedArray() {
        int[] input = {2, 4, 2, 6, 8, 4, 9, 6, 7, 5, 3, 8, 1};
        HashMap<Integer, ArrayList<Integer>> expected = new HashMap<>();
        expected.put(2, new ArrayList<>(Arrays.asList(0, 2)));
        expected.put(4, new ArrayList<>(Arrays.asList(1,5)));
        expected.put(6, new ArrayList<>(Arrays.asList(3, 7)));
        expected.put(8, new ArrayList<>(Arrays.asList(4, 11)));

        assertEquals(expected, DuplicateElements.start(input));
    }
}
