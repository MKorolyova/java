package task_4;
import static org.junit.Assert.*;
import org.junit.Test;

public class BookTest {

    @Test
    public void testBookCreation() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1, 218);
        assertEquals("The Great Gatsby", book.getTitle());
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
        assertEquals(1925, book.getYear());
        assertEquals(1, book.getEdition());
        assertEquals(218, book.getPages());
    }

    @Test
    public void testBookEquals() {
        Book book1 = new Book("1984", "George Orwell", 1949, 1, 328);
        Book book2 = new Book("1984", "George Orwell", 1949, 1, 328);
        assertEquals(book1, book2);
    }

    @Test
    public void testBookNotEquals() {
        Book book1 = new Book("1984", "George Orwell", 1949, 1, 328);
        Book book2 = new Book("Brave New World", "Aldous Huxley", 1932, 1, 311);
        assertNotEquals(book1, book2);
    }

    @Test
    public void testBookHashCode() {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 1, 281);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 1, 281);
        assertEquals(book1.hashCode(), book2.hashCode());
    }


    @Test
    public void testLibraryBookCreation() {
        LibraryBook libraryBook = new LibraryBook("The Hobbit", "J.R.R. Tolkien", 1937, 1, 310, "INV001", "Alice");
        
        assertEquals("The Hobbit", libraryBook.getTitle());
        assertEquals("J.R.R. Tolkien", libraryBook.getAuthor());
        assertEquals(1937, libraryBook.getYear());
        assertEquals(1, libraryBook.getEdition());
        assertEquals(310, libraryBook.getPages());
        assertEquals("INV001", libraryBook.getInventoryNumber());
        assertEquals("Alice", libraryBook.getTakenBy());
    }

    @Test
    public void testLibraryBookEquals() {
        LibraryBook book1 = new LibraryBook("Moby Dick", "Herman Melville", 1851, 1, 585, "INV002", "Bob");
        LibraryBook book2 = new LibraryBook("Moby Dick", "Herman Melville", 1851, 1, 585, "INV002", "Bob");
        assertEquals(book1, book2);
    }

    @Test
    public void testLibraryBookNotEquals() {
        LibraryBook book1 = new LibraryBook("War and Peace", "Leo Tolstoy", 1869, 1, 1225, "INV003", "Charlie");
        LibraryBook book2 = new LibraryBook("War and Peace", "Leo Tolstoy", 1869, 1, 1225, "INV004", "David");
        assertNotEquals(book1, book2);
    }

    @Test
    public void testLibraryBookHashCode() {
        LibraryBook book1 = new LibraryBook("The Catcher in the Rye", "J.D. Salinger", 1951, 1, 277, "INV005", "Eve");
        LibraryBook book2 = new LibraryBook("The Catcher in the Rye", "J.D. Salinger", 1951, 1, 277, "INV005", "Eve");
        assertEquals(book1.hashCode(), book2.hashCode());
    }

}
