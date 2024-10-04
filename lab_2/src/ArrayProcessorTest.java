
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
 

public class ArrayProcessorTest {

    @Test
    public void testProcessArray() {
        int[] input = {3, 1, 4, 6, 5, 9, 8, 7, 2};
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 9, 7, 5, 3, 1));
        assertEquals(expected, ArrayProcessor.main(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        ArrayList<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, ArrayProcessor.main(input));
    }

    @Test
    public void testAllEvenNumbers() {
        int[] input = {8, 4, 2, 6};
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8));
        assertEquals(expected, ArrayProcessor.main(input));
    }

    @Test
    public void testAllOddNumbers() {
        int[] input = {9, 1, 5, 3};
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(9, 5, 3, 1));
        assertEquals(expected, ArrayProcessor.main(input));
    }
}
