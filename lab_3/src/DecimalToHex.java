import java.util.Scanner;

public class  DecimalToHex{

    public static void DecimalToHexConverter(Scanner scanner) {

        int max;
        int min;
        int step;

        while(true){

            System.out.print("\n\n\nEnter max number:");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a valid integer:");
                scanner.next();
            }

            max = scanner.nextInt();
            //scanner.nextLine();
            
            System.out.print("Enter min number:");

            while(!scanner.hasNextInt()){
                System.out.print("Invalid input. Please enter a valid integer:");
            }

            min = scanner.nextInt();
            //scanner.nextLine();


            System.out.print("Enter step number:");
            while(!scanner.hasNextInt()){
                System.out.print("Invalid input. Please enter a valid integer:");
            }

            step = scanner.nextInt();
            //scanner.nextLine();
            

            if (max > min && step > 0 && step < (max - min)) {
                break; 
            } else {
                System.out.println("Invalid input: ensure max > min and step is positive and less than (max - min).");
            }
        }

        System.out.println("\nDecimal number -> Hexadecimal number");
        for(int i = min; i <= max; i += step){
            System.out.printf("%d\t\t\t%s\n", i,  Integer.toHexString(i).toUpperCase());
        }


    }  

}
