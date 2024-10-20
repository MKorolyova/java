import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;
        IntegerListApp list = new IntegerListApp();
        LibraryApp library = new LibraryApp();
        QueueApp queue = new QueueApp();
        FileViewerApp file = new FileViewerApp();
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Integer List App");
            System.out.println("2. Library App");
            System.out.println("3. Queue App");
            System.out.println("4. File Viewer App");
            System.out.println("5. Exit");
            System.out.print("\nSelect an option: ");

            choice = integerInput(scanner);

            switch (choice) {
                case 1:
                boolean exitIntegerApp = false;
                while (!exitIntegerApp) {
                    System.out.println("\n\n===== MENU LIST =====");
                    System.out.println("1. Show list of numbers");
                    System.out.println("2. Create another list of numbers");
                    System.out.println("3. Replace elements");
                    System.out.println("4. Sort in ascending order");
                    System.out.println("5. Sort in descending order");
                    System.out.println("6. Show element frequencies");
                    System.out.println("7. Exit");
                    System.out.print("\nSelect an option: ");
        
                    choice = integerInput(scanner);
        
                    switch (choice) {
                        case 1:

                            System.out.println("\nCurrent list of numbers: " + list.getNumbers());
                            break;
                        
                        case 2:

                            System.out.println("\nEnter how many numbers you want to add to list:");
                            int amount = integerInput(scanner);

                            System.out.println("Now enter all your numbers please:");
                            ArrayList<Integer> input = new ArrayList<Integer>();
                            for(int i = 0; i<amount; i++){
                                int number = integerInput(scanner);
                                input.add(number);
                            } 
                            list = new IntegerListApp(input);
                            break;

                        case 3:

                            System.out.print("\nEnter the start index: ");
                            int startIndex = integerInput(scanner);
                    
                            System.out.print("Enter the end index: ");
                            int endIndex = integerInput(scanner);
                            
                            System.out.println("Now enter all your numbers please:");
                            ArrayList<Integer> newNumbers = new ArrayList<>();
                            for(int i = startIndex; i<endIndex; i++){
                                int number = integerInput(scanner);
                                newNumbers.add(number);
                            } 
                    
                            if (list.checkForReplace(startIndex, endIndex, newNumbers.size())) {
                                list.replaceNumbers(startIndex, endIndex, newNumbers);
                                System.out.println("Elements replaced successfully.");
                            } else {
                                System.out.println("Error: Invalid indices or size.");
                            }
                            break;

                        case 4:
                            list.sort();
                            System.out.println("\nList sorted in ascending order.");
                            break;
                        case 5:

                            list.sortReverse();
                            System.out.println("\nList sorted in descending order.");
                            break;
                          
                        case 6:

                            ArrayList<Pair> frequencies = list.getElementFrequencies();
                            System.out.println("\nElement frequencies:");
                            for (Pair pair : frequencies) {
                                System.out.println("Element: " + pair.getFirst() + ", Frequency: " + pair.getSecond());
                            }
                            break;

                        case 7:
                            exitIntegerApp = true;
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }}
                    break;

                case 2:

                boolean exitLibraryApp= false;
                while (!exitLibraryApp) {
                    System.out.println("\n===== LIBRARY MENU =====");
                    System.out.println("1. Show catalog");
                    System.out.println("2. Add a book");
                    System.out.println("3. Delete a book");
                    System.out.println("4. Sort catalog by title");
                    System.out.println("5. Sort catalog by publication year");
                    System.out.println("6. Sort catalog by price");
                    System.out.println("7. Exit");
                    System.out.print("\nSelect an option: ");
        
                    choice = integerInput(scanner);
        
                    switch (choice) {
                        case 1:
                            System.out.println("\nLibrary Catalog");
                            for (Integer id : library.getCatalog().keySet()) {
                                System.out.println("\nID: " + id  + library.getCatalog().get(id));
                            }                            
                            break;
                        case 2:
                            System.out.println("\nEnter the book details:");

                            System.out.print("ID: ");
                            int id = integerInput(scanner);
                    
                            System.out.print("Title: ");
                            String title = scanner.nextLine();
                    
                            System.out.print("Author's First Name: ");
                            String firstName = scanner.nextLine();
                    
                            System.out.print("Author's Last Name: ");
                            String lastName = scanner.nextLine();
                    
                            System.out.print("Publication Year: ");
                            int year = integerInput(scanner);
                    
                            System.out.print("Publisher: ");
                            String publisher = scanner.nextLine();
                    
                            System.out.print("Price: ");
                            float price = floatInput(scanner);
                    
                            library.addBook(id, title, firstName, lastName, year, publisher, price);
                            System.out.println("Book added successfully.");
                            break;
                        case 3:
                            System.out.print("\nEnter the ID of the book to delete: ");
                            id = integerInput(scanner);
                    
                            Book deletedBook = library.delBook(id);
                            if (deletedBook != null) {
                                System.out.println("Deleted book: " + deletedBook);
                            } else {
                                System.out.println("No book found with the given ID.");
                            }
                            break;
                        case 4:
                            System.out.println("Catalog sorted by title:");
                            ArrayList<Book> sortedLibrary =  library.compairTitle();
                            for(Book book : sortedLibrary){
                                System.out.println(book); 
                            }
                            break;
                        case 5:
                            System.out.println("Catalog sorted by publication year:\n");
                             sortedLibrary = library.compairPublicationYear();
                            for(Book book : sortedLibrary){
                                System.out.println(book);
                            }
                            break;
                        case 6:
                            System.out.println("Catalog sorted by price:");
                            sortedLibrary =  library.compairPrice();
                            for(Book book : sortedLibrary){
                                System.out.println(book);
                            }
                            break;
                        case 7:
                            exitLibraryApp = true;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
                    break;
                case 3:
                boolean exitQueueApp = false;
                while (!exitQueueApp) {
                    System.out.println("\n===== Queue Menu =====");
                    System.out.println("1. Add person to queue");
                    System.out.println("2. Show current queue");
                    System.out.println("3. Count people by priority");
                    System.out.println("4. Exit");
                    System.out.print("\nSelect an option: ");
        
                    choice = integerInput(scanner);
        
                    switch (choice) {
                        case 1:
                            System.out.println("Enter last name:");
                            String lastName = scanner.next();
                            
                            System.out.println("Enter first name:");
                            String firstName = scanner.next();
        
                            System.out.println("Enter middle name:");
                            String middleName = scanner.next();
        
                            System.out.println("Enter city:");
                            String city = scanner.next();
        
                            System.out.println("Enter street:");
                            String street = scanner.next();
        
                            System.out.println("Enter house number:");
                            String houseNumber = scanner.next();
        
                            System.out.println("Enter flat number:");
                            int flatNumber = integerInput(scanner);
        
                            System.out.println("Enter priority (1 = highest, 10 = lowest):");
                            int priority = integerInput(scanner);
        
                            AddressValue address = new AddressValue(city, street, houseNumber, flatNumber);
                            QueuePerson person = new QueuePerson(lastName, firstName, middleName, address, priority);
                            queue.add(person);
        
                            System.out.println("Person added to the queue.");
                            break;
        
                        case 2:
                            System.out.println("\nCurrent Queue");
                            for (QueuePerson personInQueue : queue.getQueue()) {
                                System.out.println(personInQueue);
                            }
                            break;
        
                        case 3:
                            HashMap<Integer, Integer> priorityCounts = queue.countByPriority();
                            System.out.println("\nPeople by Priority:");
                            for (Integer peoplePriority : priorityCounts.keySet()) {
                                System.out.println("Priority " + peoplePriority + ": " + priorityCounts.get(peoplePriority) + " people");
                            }
                        
                            break;
        
                        case 4:
                            exitQueueApp= true;
                            break;
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }
                }
                    break;
                case 4:
                boolean exitFileViewerApp = false;
                while (!exitFileViewerApp) {
                    System.out.println("\n===== File Viewer Menu =====");
                    System.out.println("1. View All Files");
                    System.out.println("2. Check if a File Exists");
                    System.out.println("3. Add a New File");
                    System.out.println("4. Exit");
                    System.out.print("Select an option: ");
        
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    switch (choice) {
                        case 1:
                            System.out.println("\nList of Files");
                            for (String fileName : file.viewFiles().keySet()) {
                                System.out.println("File: " + fileName  + file.viewFiles().get(fileName));
                            }
                            break;
        
                        case 2:
                            System.out.print("Enter the file name to check: ");
                            String fileName = scanner.nextLine();
                            if (file.isFileExists(fileName)) {
                                System.out.println("File " + fileName + " exists.");
                            } else {
                                System.out.println("File " + fileName + " does not exist.");
                            }
                            break;
        
                        case 3:
                            System.out.print("Enter the new file name: ");
                            String newFileName = scanner.nextLine();
                            System.out.print("Enter the file path: ");
                            String filePath = scanner.nextLine();
                            System.out.print("Enter a description for the file: ");
                            String description = scanner.nextLine();
                            file.addFile(newFileName, filePath, description);
                            System.out.println("File " + newFileName + " added successfully.");
                            break;
        
                        case 4:
                            exitFileViewerApp = true;
                            break;
        
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                }
                break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
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

}
