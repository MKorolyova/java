import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArgumentAnalyzer argAnalyzerTest = new ArgumentAnalyzer();

        System.out.print("\n\n\nEnter your arguments separated by spaces: ");
        String input = scanner.nextLine();
        String[] arguments = input.split(" ");

        System.out.print("Enter your substring for searching: ");
        String substring = scanner.nextLine();

        ArrayList<String> argumentsWithSubstring = argAnalyzerTest.analyze(arguments, substring);
        System.out.println("Arguments containing the substring \"" + substring + "\":");

        if (argumentsWithSubstring.size() == 0) {
            System.out.println("No arguments contain the substring \"" + substring + "\".");
        } else {
            System.out.println("Total arguments: " + (arguments.length ));
            System.out.println("Arguments containing the substring: " + argumentsWithSubstring.size());
        }


        DecimalToHex decimalToHexTest = new DecimalToHex();
        int min;
        int max;
        int step;

        while(true){

            System.out.print("\n\n\nEnter max number:");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid integer:");
                scanner.next();
            }

            max = scanner.nextInt();
            
            System.out.print("Enter min number:");

            while(!scanner.hasNextInt()){
                System.out.print("Invalid input. Please enter a valid integer:");
            }

            min = scanner.nextInt();


            System.out.print("Enter step number:");
            while(!scanner.hasNextInt()){
                System.out.print("Invalid input. Please enter a valid integer:");
            }

            step = scanner.nextInt();
            

            if (max > min && step > 0 && step < (max - min)) {
                break; 
            } else {
                System.out.println("Invalid input: ensure max > min and step is positive and less than (max - min).");
            }
        }

        ArrayList<Pair> DecimalAndHex = decimalToHexTest.DecimalToHexConverter(max, min, step);
        System.out.println("\nDecimal number -> Hexadecimal number");
        for(Pair numbers : DecimalAndHex){
            System.out.println(numbers);
        }

        CaeserCode caeserCodeTest = new CaeserCode();

        System.out.print("Text to encryption program:");

        System.out.print("\n\n\nEnter shift:");

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer:");
            scanner.next();
        }

        int shift  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your text to encrypt:");
        String text = scanner.nextLine();

        StringBuffer encryptText = caeserCodeTest.encryptCaesar(shift, text);
        
        System.out.print("Encrypt text:");
        System.out.println(encryptText);

        System.out.print("Text to decryption program:");

        System.out.print("\n\n\nEnter shift:");

        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer:");
            scanner.next();
        }

        shift  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your text to decrypt:");
        text = scanner.nextLine();

        StringBuffer decryptText = caeserCodeTest.decryptCaesar(shift, text);

        System.out.print("Encrypt text:");
        System.out.println(decryptText);

        HexArgument hexArgumentTest = new HexArgument();
        String[] arg = {"Apple", "A1B", "12", "Cat", "A7"};
        ArrayList<String>  binaryNumbers = hexArgumentTest.HexArgumentConverter(arg);

        System.out.println("\n\n\nArguments: ");
        int totalArgs = arg.length;
        int numericArgsCount = binaryNumbers.size();

        for(String number :  binaryNumbers){
            System.out.println(number);
        }

        System.out.println("\nTotal arguments number " + totalArgs);
        System.out.println("Not hexadecimal arguments number: " + (totalArgs-numericArgsCount));
        System.out.println("Hexadecimal arguments number: " + numericArgsCount);

        scanner.close();
    }

}


