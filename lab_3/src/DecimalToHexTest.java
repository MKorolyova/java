import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class DecimalToHexTest {
    @Test
    public void testDecimalToHexConverter() {
        ArrayList<Pair> expected = new ArrayList<Pair>();
        expected.add(new Pair(10, "A"));
        expected.add(new Pair(12, "C"));
        expected.add(new Pair(14, "E"));
        expected.add(new Pair(16, "10"));
        expected.add(new Pair(18, "12"));
        expected.add(new Pair(20, "14"));
        DecimalToHex test = new DecimalToHex();
        ArrayList<Pair> result = test.DecimalToHexConverter(20, 10, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyResult() {
        DecimalToHex converter = new DecimalToHex();
        ArrayList<Pair> result = converter.DecimalToHexConverter(5, 10, 1);

        assertTrue(result.isEmpty());
    }

}
