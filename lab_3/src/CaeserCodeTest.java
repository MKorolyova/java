import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CaeserCodeTest {
     @Test
    public void testEncryptCaesar() {
        CaeserCode caeserCode = new CaeserCode();
        String inputText = "abc";
        int shift = 3;

        StringBuffer encryptedText = caeserCode.encryptCaesar(shift, inputText);
        assertEquals("def", encryptedText.toString());
    }

    @Test
    public void testDecryptCaesar() {
        CaeserCode caeserCode = new CaeserCode();
        String inputText = "def";
        int shift = 3;

        StringBuffer decryptedText = caeserCode.decryptCaesar(shift, inputText);
        assertEquals("abc", decryptedText.toString());
    }
}
