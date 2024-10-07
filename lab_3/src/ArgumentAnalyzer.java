import java.util.Scanner;

public class ArgumentAnalyzer {
    public static void analyze(Scanner scanner){

        System.out.print("\n\n\nEnter your arguments separated by spaces: ");
        String input = scanner.nextLine();
        String[] arguments = input.split(" ");

        System.out.print("Enter your substring for searching: ");
        String substring = scanner.nextLine();

        int count=0;

        System.out.println("Arguments containing the substring \"" + substring + "\":");

        for(String arg : arguments){
            if(arg.contains(substring)){
                System.out.println(arg);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No arguments contain the substring \"" + substring + "\".");
        } else {
            System.out.println("Total arguments: " + (arguments.length ));
            System.out.println("Arguments containing the substring: " + count);
        }

    }
}
