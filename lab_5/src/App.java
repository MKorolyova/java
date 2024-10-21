
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
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

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

        System.out.println("1. Створити студента");
        System.out.println("2. Створити студента-дипломника");
        System.out.print("Оберіть опцію: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Пропускаємо символ нового рядка

        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть курс: ");
        int course = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть ID: ");
        String id = scanner.nextLine();

        if (choice == 1) {
            Student student = new Student(name, course, id);
            student.printInfo();
        } else if (choice == 2) {
            System.out.print("Введіть тему диплома: ");
            String thesisTopic = scanner.nextLine();
            GraduateStudent gradStudent = new GraduateStudent(name, course, id, thesisTopic);
            gradStudent.printInfo();
        } else {
            System.out.println("Невірний вибір!");
        }
    }

    public static void BookMenu(Scanner scanner) {

        System.out.println("1. Додати книгу");
        System.out.println("2. Додати книгу з бібліотеки");
        System.out.print("Оберіть опцію: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть назву: ");
        String title = scanner.nextLine();
        System.out.print("Введіть автора: ");
        String author = scanner.nextLine();
        System.out.print("Введіть рік видання: ");
        int year = scanner.nextInt();
        System.out.print("Введіть тираж: ");
        int edition = scanner.nextInt();
        System.out.print("Введіть кількість сторінок: ");
        int pages = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            Book book = new Book(title, author, year, edition, pages);
            book.printInfo();
        } else if (choice == 2) {
            System.out.print("Введіть інвентарний номер: ");
            String inventoryNumber = scanner.nextLine();
            System.out.print("Введіть ім'я того, хто взяв книгу: ");
            String takenBy = scanner.nextLine();

            LibraryBook libraryBook = new LibraryBook(title, author, year, edition, pages, inventoryNumber, takenBy);
            libraryBook.printInfo();
        } else {
            System.out.println("Невірний вибір!");
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

    private static int floatInput(Scanner scanner){
        int input;
        while (true) {
            if (scanner.hasNextFloat()) { 
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
