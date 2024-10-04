import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
 
public class UniquenessCheckerTest {

    @Test
    public void testUniquenessCheckerTrue() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 9, 7, 5, 3, 1));
        boolean expected = true;
        assertEquals(expected, UniquenessChecker.start(input));
    }

    @Test
    public void testUniquenessCheckerFalse() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2, 2, 4, 6, 8, 8, 9, 7, 5, 3, 1));
        boolean expected = false;
        assertEquals(expected, UniquenessChecker.start(input));
    }

    @Test
    public void testEmptyArray() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        boolean expected = true;
        assertEquals(expected, UniquenessChecker.start(input));
    }
}
