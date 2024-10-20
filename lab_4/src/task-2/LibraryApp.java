import java.util.*;

public class LibraryApp {
    private HashMap<Integer, Book> catalog = new HashMap<Integer, Book>();

    public LibraryApp(){
        catalog.put(1, new Book("1984", "George", "Orwell", 1949, "Secker & Warburg", 19.99f));
        catalog.put(2, new Book("Brave New World", "Aldous", "Huxley", 1932, "Chatto & Windus", 15.99f));
        catalog.put(3, new Book("The Great Gatsby", "F. Scott", "Fitzgerald", 1925, "Charles Scribner's Sons", 10.99f));
        catalog.put(4, new Book("To Kill a Mockingbird", "Harper", "Lee", 1960, "J.B. Lippincott & Co.", 12.99f));
        catalog.put(5, new Book("Moby-Dick", "Herman", "Melville", 1851, "Harper & Brothers", 18.49f));
        catalog.put(6, new Book("Pride and Prejudice", "Jane", "Austen", 1813, "T. Egerton", 9.99f));
        catalog.put(7, new Book("The Catcher in the Rye", "J.D.", "Salinger", 1951, "Little, Brown and Company", 14.50f));
        catalog.put(8, new Book("War and Peace", "Leo", "Tolstoy", 1869, "The Russian Messenger", 25.00f));
        catalog.put(9, new Book("Crime and Punishment", "Fyodor", "Dostoevsky", 1866, "The Russian Messenger", 20.00f));
        catalog.put(10, new Book("The Hobbit", "J.R.R.", "Tolkien", 1937, "George Allen & Unwin", 22.50f));

    }



    public HashMap<Integer, Book> getCatalog(){
        return catalog;
    }

    public void addBook(int key, String title, String authorFirstName, String authorSecondName, int publicationYear, String publisher, float price){
        catalog.put(key, new Book(title, authorFirstName, authorSecondName, publicationYear, publisher, price));
    }

    public Book delBook(int key){
        Book deletedBook = catalog.get(key);
        catalog.remove(key);
        return deletedBook;
    }

    public ArrayList<Book> compairPublicationYear(){
        ArrayList<Book> sortedCatalog = new ArrayList<Book>(catalog.values());
        sortedCatalog.sort(new publicationYearComparator());
        return sortedCatalog;
    }

    public ArrayList<Book> compairTitle(){
        ArrayList<Book> sortedCatalog = new ArrayList<Book>(catalog.values());
        sortedCatalog.sort(new titleComparator());
        return sortedCatalog;
    }

    public ArrayList<Book> compairPrice(){
        ArrayList<Book> sortedCatalog = new ArrayList<Book>(catalog.values());
        sortedCatalog.sort(new priceComparator());
        return sortedCatalog;
    }

}

class titleComparator implements Comparator <Book> { 
    @Override 
    public int compare (Book b1, Book b2) { 
        return b1.getTitle().compareTo(b2.getTitle());
    } 
} 

class publicationYearComparator implements Comparator <Book> { 
    @Override 
    public int compare (Book b1, Book b2) { 
        if (b1.getPublicationYear() == b2.getPublicationYear()) {return 0;} 
        else if (b1.getPublicationYear() < b2.getPublicationYear()) {return -1;} 
        else {return 1;} 
    } 
} 

class priceComparator implements Comparator <Book> { 
    @Override 
    public int compare (Book b1, Book b2) { 
        if (b1.getPrice() == b2.getPrice()) {return 0;} 
        else if (b1.getPrice() < b2.getPrice()) {return -1;} 
        else {return 1;} 
    } 
} 