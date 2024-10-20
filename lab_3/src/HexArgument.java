import java.util.*;

public class HexArgument {
    public ArrayList<String> HexArgumentConverter(String[] args) {
          ArrayList<String> answerToPrint = new ArrayList<String>();
            for (String arg : args) {
                if (isHexNumber(arg)) {
                    int decimalValue = Integer.parseUnsignedInt(arg, 16);
                    String binaryValue = Integer.toBinaryString(decimalValue);
                    answerToPrint.add("Hexadecimal number: " + (String) arg + " -> Binary number: " + binaryValue);
                }
            }
            return answerToPrint;
        }
    

        private static boolean isHexNumber(String arg) {
            return arg.matches("^[0-9a-fA-F]+$");
        }
    
    
}
