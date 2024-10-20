import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HexArgumentTest {
    @Test
    public void testHexArgumentConverter() {
        HexArgument test = new HexArgument();

        String[] input = {"1A", "FF", "G1", "0C", "123", "XYZ"};
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Hexadecimal number: 1A -> Binary number: 11010");
        expected.add("Hexadecimal number: FF -> Binary number: 11111111");
        expected.add("Hexadecimal number: 0C -> Binary number: 1100");
        expected.add("Hexadecimal number: 123 -> Binary number: 100100011");

        ArrayList<String> result = test.HexArgumentConverter(input);

        assertEquals(expected, result);
    }
}
