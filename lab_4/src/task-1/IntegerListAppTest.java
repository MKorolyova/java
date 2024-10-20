import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class IntegerListAppTest {
    @Test
    public void priceChecker() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(99);
        expected.add(77);
        expected.add(11);


    IntegerListApp test = new IntegerListApp(new ArrayList<Integer>(Arrays.asList(1,5,77,11)));
    test.replaceNumbers(0, 1, new ArrayList<Integer>(Arrays.asList(8, 99)));
    ArrayList<Integer> answer = test.getNumbers();
    assertEquals(expected, answer);
    }

    @Test
    public void sortChecker() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(11);
        expected.add(77);
        expected.add(99);


    IntegerListApp test = new IntegerListApp(new ArrayList<Integer>(Arrays.asList(8,99,77,11)));
    test.sort();;
    ArrayList<Integer> answer = test.getNumbers();
    assertEquals(expected, answer);
    }

    @Test
    public void sortReversChecker() {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(99);
        expected.add(77);
        expected.add(11);
        expected.add(8);


    IntegerListApp test = new IntegerListApp(new ArrayList<Integer>(Arrays.asList(8,99,77,11)));
    test.sortReverse();;
    ArrayList<Integer> answer = test.getNumbers();
    assertEquals(expected, answer);
    }
}
