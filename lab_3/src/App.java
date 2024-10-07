import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalToHex.DecimalToHexConverter(scanner);
        CaeserCode.encryptCaesar(scanner);
        CaeserCode.decryptCaesar(scanner);
        String[] arg = {"Apple", "A1B", "12", "Cat", "A7"};
        HexArgument.HexArgumentConverter(arg);
        ArgumentAnalyzer.analyze(scanner);
        scanner.close();
    }

}


