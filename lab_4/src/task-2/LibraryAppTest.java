import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class LibraryAppTest {
    @Test
        public void priceSortChecker() {
            ArrayList<Book> expected = new ArrayList<>();

            expected.add(new Book("Pride and Prejudice", "Jane", "Austen", 1813, "T. Egerton", 9.99f));
            expected.add(new Book("The Great Gatsby", "F. Scott", "Fitzgerald", 1925, "Charles Scribner's Sons", 10.99f));
            expected.add(new Book("To Kill a Mockingbird", "Harper", "Lee", 1960, "J.B. Lippincott & Co.", 12.99f));
            expected.add(new Book("The Catcher in the Rye", "J.D.", "Salinger", 1951, "Little, Brown and Company", 14.50f));
            expected.add(new Book("Brave New World", "Aldous", "Huxley", 1932, "Chatto & Windus", 15.99f));
            expected.add(new Book("Moby-Dick", "Herman", "Melville", 1851, "Harper & Brothers", 18.49f));
            expected.add(new Book("1984", "George", "Orwell", 1949, "Secker & Warburg", 19.99f));
            expected.add(new Book("Crime and Punishment", "Fyodor", "Dostoevsky", 1866, "The Russian Messenger", 20.00f));
            expected.add(new Book("The Hobbit", "J.R.R.", "Tolkien", 1937, "George Allen & Unwin", 22.50f));
            expected.add(new Book("War and Peace", "Leo", "Tolstoy", 1869, "The Russian Messenger", 25.00f));
            

        LibraryApp test = new LibraryApp();
        ArrayList<Book> answer = test.compairPrice();
        assertEquals(expected, answer);
    }

    @Test
    public void titleSortChecker() {
        ArrayList<Book> expected = new ArrayList<>();

        expected.add(new Book("1984", "George", "Orwell", 1949, "Secker & Warburg", 19.99f));
        expected.add(new Book("Brave New World", "Aldous", "Huxley", 1932, "Chatto & Windus", 15.99f));
        expected.add(new Book("Crime and Punishment", "Fyodor", "Dostoevsky", 1866, "The Russian Messenger", 20.00f));
        expected.add(new Book("Moby-Dick", "Herman", "Melville", 1851, "Harper & Brothers", 18.49f));
        expected.add(new Book("Pride and Prejudice", "Jane", "Austen", 1813, "T. Egerton", 9.99f));
        expected.add(new Book("The Catcher in the Rye", "J.D.", "Salinger", 1951, "Little, Brown and Company", 14.50f));
        expected.add(new Book("The Great Gatsby", "F. Scott", "Fitzgerald", 1925, "Charles Scribner's Sons", 10.99f));
        expected.add(new Book("The Hobbit", "J.R.R.", "Tolkien", 1937, "George Allen & Unwin", 22.50f));
        expected.add(new Book("To Kill a Mockingbird", "Harper", "Lee", 1960, "J.B. Lippincott & Co.", 12.99f));
        expected.add(new Book("War and Peace", "Leo", "Tolstoy", 1869, "The Russian Messenger", 25.00f));
        
        LibraryApp test = new LibraryApp();
        ArrayList<Book> answer = test.compairTitle();
        assertEquals(expected, answer);
    }

    @Test
    public void publicationYearSortChecker() {
        ArrayList<Book> expected = new ArrayList<>();

        expected.add(new Book("Pride and Prejudice", "Jane", "Austen", 1813, "T. Egerton", 9.99f));
        expected.add(new Book("Moby-Dick", "Herman", "Melville", 1851, "Harper & Brothers", 18.49f));
        expected.add(new Book("Crime and Punishment", "Fyodor", "Dostoevsky", 1866, "The Russian Messenger", 20.00f));
        expected.add(new Book("War and Peace", "Leo", "Tolstoy", 1869, "The Russian Messenger", 25.00f));
        expected.add(new Book("The Great Gatsby", "F. Scott", "Fitzgerald", 1925, "Charles Scribner's Sons", 10.99f));
        expected.add(new Book("Brave New World", "Aldous", "Huxley", 1932, "Chatto & Windus", 15.99f));
        expected.add(new Book("The Hobbit", "J.R.R.", "Tolkien", 1937, "George Allen & Unwin", 22.50f));
        expected.add(new Book("1984", "George", "Orwell", 1949, "Secker & Warburg", 19.99f));
        expected.add(new Book("The Catcher in the Rye", "J.D.", "Salinger", 1951, "Little, Brown and Company", 14.50f));
        expected.add(new Book("To Kill a Mockingbird", "Harper", "Lee", 1960, "J.B. Lippincott & Co.", 12.99f));

        LibraryApp test = new LibraryApp();
        ArrayList<Book> answer = test.compairPublicationYear();
        assertEquals(expected, answer);
    }

    @Test
    public void addChecker() {
        HashMap<Integer, Book> expected = new HashMap<Integer, Book>();

        expected.put(1, new Book("1984", "George", "Orwell", 1949, "Secker & Warburg", 19.99f));
        expected.put(2, new Book("Brave New World", "Aldous", "Huxley", 1932, "Chatto & Windus", 15.99f));
        expected.put(3, new Book("The Great Gatsby", "F. Scott", "Fitzgerald", 1925, "Charles Scribner's Sons", 10.99f));
        expected.put(4, new Book("To Kill a Mockingbird", "Harper", "Lee", 1960, "J.B. Lippincott & Co.", 12.99f));
        expected.put(5, new Book("Moby-Dick", "Herman", "Melville", 1851, "Harper & Brothers", 18.49f));
        expected.put(6, new Book("Pride and Prejudice", "Jane", "Austen", 1813, "T. Egerton", 9.99f));
        expected.put(7, new Book("The Catcher in the Rye", "J.D.", "Salinger", 1951, "Little, Brown and Company", 14.50f));
        expected.put(8, new Book("War and Peace", "Leo", "Tolstoy", 1869, "The Russian Messenger", 25.00f));
        expected.put(9, new Book("Crime and Punishment", "Fyodor", "Dostoevsky", 1866, "The Russian Messenger", 20.00f));
        expected.put(10, new Book("The Hobbit", "J.R.R.", "Tolkien", 1937, "George Allen & Unwin", 22.50f));

        expected.put(11, new Book("The Picture of Dorian Gray", "Oscar", "Wilde", 1890, "Lippincott's Monthly Magazine", 14.99f));

        LibraryApp test = new LibraryApp();
        test.addBook(11, "The Picture of Dorian Gray", "Oscar", "Wilde", 1890, "Lippincott's Monthly Magazine", 14.99f);
        HashMap<Integer, Book> answer = test.getCatalog();
        assertEquals(expected,  answer);
    }

    @Test
    public void delChecker() {
        HashMap<Integer, Book> expected = new HashMap<Integer, Book>();

        expected.put(1, new Book("1984", "George", "Orwell", 1949, "Secker & Warburg", 19.99f));
        expected.put(2, new Book("Brave New World", "Aldous", "Huxley", 1932, "Chatto & Windus", 15.99f));
        expected.put(3, new Book("The Great Gatsby", "F. Scott", "Fitzgerald", 1925, "Charles Scribner's Sons", 10.99f));
        expected.put(4, new Book("To Kill a Mockingbird", "Harper", "Lee", 1960, "J.B. Lippincott & Co.", 12.99f));
        expected.put(5, new Book("Moby-Dick", "Herman", "Melville", 1851, "Harper & Brothers", 18.49f));
        expected.put(6, new Book("Pride and Prejudice", "Jane", "Austen", 1813, "T. Egerton", 9.99f));
        expected.put(7, new Book("The Catcher in the Rye", "J.D.", "Salinger", 1951, "Little, Brown and Company", 14.50f));
        expected.put(9, new Book("Crime and Punishment", "Fyodor", "Dostoevsky", 1866, "The Russian Messenger", 20.00f));
        expected.put(10, new Book("The Hobbit", "J.R.R.", "Tolkien", 1937, "George Allen & Unwin", 22.50f));

        LibraryApp test = new LibraryApp();
        test.delBook(8);
        HashMap<Integer, Book> answer = test.getCatalog();
        assertEquals(expected,  answer);
    }
}
