
import java.util.Scanner;

import task_1.Parabola;
import task_2.ForumMessage;
import task_3.GraduateStudent;
import task_3.Student;
import task_4.Book;
import task_4.LibraryBook;

public class App {
    public static void main(String[] args) {
        while(true){
            System.out.println("1. Parabola");
            System.out.println("2. Message forum");
            System.out.println("3. Student");
            System.out.println("4. Book");
            System.out.println("5. Exit");
            System.out.print("Choose program: ");
    
            Scanner scanner = new Scanner(System.in);
            int choice = integerInput(scanner);
    
            switch (choice) {
                case 1 -> ParabolaMenu(scanner);
                case 2 -> ForumMessageMenu(scanner);
                case 3 -> StudentMenu(scanner);
                case 4 -> BookMenu(scanner);
                case 5 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default -> System.out.println("You enter something wrong");
            }
        }
       
    }

    public static void ParabolaMenu(Scanner scanner) {
        System.out.println("Enter coefficients a, b, c:");
        double a = doubleInput(scanner);
        double b = doubleInput(scanner);
        double c = doubleInput(scanner);

        Parabola parabola = new Parabola(a, b, c);
        System.out.println("Created parabola: " + parabola);

        System.out.print("Enter x value for y calculation: ");
        double x = scanner.nextDouble();
        System.out.println("y = " + parabola.calculateY(x));

        System.out.print("Enter y value for x calculation: ");
        double y = scanner.nextDouble();
        try {
            double[] roots = parabola.calculateX(y);
            System.out.printf("Roots: x1 = %.2f, x2 = %.2f\n", roots[0], roots[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ForumMessageMenu(Scanner scanner) {

        System.out.println("Enter author name:");
        String author = scanner.nextLine();
        System.out.println("Enter topic:");
        String topic = scanner.nextLine();
        System.out.println("Enter message text:");
        String text = scanner.nextLine();

        ForumMessage message = new ForumMessage(author, topic, text);
        System.out.println("New message was created:\n" + message);

        System.out.println("Do you want to edit message? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Enter new massege text:");
            String newText = scanner.nextLine();
            message.editMessage(newText);
            System.out.println("Message after eding:\n" + message);
        }
    }

    public static void StudentMenu(Scanner scanner) {

        while(true){
            System.out.println("1. Create student");
            System.out.println("2. Creation of a graduate student");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            int choice = integerInput(scanner);
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter course: ");
                int course =  integerInput(scanner);
                scanner.nextLine();
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                Student student = new Student(name, course, id);
                student.printInfo();
            } else if (choice == 2) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter course: ");
                int course =  integerInput(scanner);
                scanner.nextLine();
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter thesis topic: ");
                String thesisTopic = scanner.nextLine();
                GraduateStudent gradStudent = new GraduateStudent(name, course, id, thesisTopic);
                gradStudent.printInfo();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("You enter something wrong");
            }
        }
        
    }

    public static void BookMenu(Scanner scanner) {

        while(true){
            System.out.println("1. Add book");
            System.out.println("2. Add library book");
            System.out.println("3. Exit");

            System.out.print("Choose option: ");
            int choice = integerInput(scanner);

            

            if (choice == 1) {
                System.out.print("enter titleу: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter publication year: ");
                int year = integerInput(scanner);
                System.out.print("Enter edition: ");
                int edition = integerInput(scanner);
                System.out.print("Enter page number: ");
                int pages = integerInput(scanner);
                scanner.nextLine();
                Book book = new Book(title, author, year, edition, pages);
                book.printInfo();
            } else if (choice == 2) {
                System.out.print("enter titleу: ");
                String title = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter publication year: ");
                int year = integerInput(scanner);
                System.out.print("Enter edition: ");
                int edition = integerInput(scanner);
                System.out.print("Enter page number: ");
                int pages = integerInput(scanner);
                scanner.nextLine();
                System.out.print("Enter inventory number: ");
                String inventoryNumber = scanner.nextLine();
                System.out.print("Enter the name of the person who took the book: ");
                String takenBy = scanner.nextLine();

                LibraryBook libraryBook = new LibraryBook(title, author, year, edition, pages, inventoryNumber, takenBy);
                libraryBook.printInfo();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("You enter something wrong");
            }
        }
    }

    
    private static int integerInput(Scanner scanner){
        int input;
        while (true) {
            if (scanner.hasNextInt()) { 
                input = scanner.nextInt(); 
                break; 
            } else {
                System.out.println("You enter something wrong");
                scanner.next(); 
            }
        }
        return input; 
    }

    private static double doubleInput(Scanner scanner) {
        double input;
        while (true) {
            if (scanner.hasNextDouble()) { 
                input = scanner.nextDouble(); 
                break; 
            } else {
                System.out.println("You entered something wrong. Please enter a valid double.");
                scanner.next(); 
            }
        }
        return input; 
    }
    
    

}
