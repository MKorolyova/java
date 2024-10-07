import java.util.Scanner;

public class CaeserCode {
    
    static public void encryptCaesar(Scanner scanner){

   

        System.out.print("\n\n\nEnter shift:");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid integer:");
                scanner.next();
            }

        int shift  = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter your text to encrypt:");
        String text = scanner.nextLine();


        StringBuffer encryptText = new StringBuffer();

        for(int i = 0; i < text.length(); i++){

            char character = text.charAt(i);
            int charCode = (int) character;
            int encryptCharCode = charCode + shift;
            char encryptCharacter = (char) encryptCharCode;
            encryptText.append(encryptCharacter);
        }

        System.out.print("Encrypt text:");
        System.out.println(encryptText);
    }

    static public void decryptCaesar (Scanner scanner){

        System.out.print("\nEnter shift:");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid integer:");
                scanner.next();
            }

        int shift  = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your text to decrypt:");
        String text = scanner.nextLine();

        StringBuffer decryptText = new StringBuffer();

        for(int i = 0; i < text.length(); i++){

            char character = text.charAt(i);
            int charCode = (int) character;
            int decryptCharCode = charCode -shift;
            char decryptCharacter = (char) decryptCharCode;
            decryptText.append(decryptCharacter);
        }

        System.out.print("Encrypt text:");
        System.out.println(decryptText);
    }
}
