public class HexArgument {
    public static void HexArgumentConverter(String[] args) {
        
            int totalArgs = args.length;
            int numericArgsCount = 0;
    
            System.out.println("\n\n\nArguments: ");
            
            for (String arg : args) {
                if (isHexNumber(arg)) {
                    numericArgsCount++;
                    int decimalValue = Integer.parseUnsignedInt(arg, 16);
                    String binaryValue = Integer.toBinaryString(decimalValue);
                    System.out.println("Hexadecimal number: " + arg + " -> Binary number: " + binaryValue);
                }else{
                    System.out.println(arg);
                }
            }
            System.out.println("\nTotal arguments number " + totalArgs);
            System.out.println("Not hexadecimal arguments number: " + (totalArgs-numericArgsCount));
            System.out.println("Hexadecimal arguments number: " + numericArgsCount);
        }
    

        private static boolean isHexNumber(String arg) {
            return arg.matches("^[0-9a-fA-F]+$");
        }
    
    
}
