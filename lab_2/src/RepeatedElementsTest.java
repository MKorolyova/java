
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
 
public class RepeatedElementsTest {
    
    @Test
    public void testNoRepeatedArray () {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 9, 7, 5, 3, 1));
        HashSet<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, RepeatedElements.main(input));
    }

    @Test
    public void testEmptyArray() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        HashSet<Integer> expected = new HashSet<Integer>();
        assertEquals(expected, RepeatedElements.main(input));
    }

    @Test
    public void testRepeatedArray() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 2, 6, 8, 4, 9, 6, 7, 5, 3, 8, 1));
        HashSet<Integer> expected = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8));
        assertEquals(expected, RepeatedElements.main(input));
    }

}
