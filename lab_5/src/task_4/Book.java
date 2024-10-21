package task_4;
import java.util.Objects;

/**
 * Клас, що представляє книгу з її заголовком, автором, роком видання, 
 * виданням і кількістю сторінок.
 */
public class Book {
    private String title;
    private String author;
    private int year;
    private int edition;
    private int pages;

    /**
     * Конструктор для створення об'єкта Book.
     *
     * @param title   заголовок книги
     * @param author  автор книги
     * @param year    рік видання книги
     * @param edition номер видання
     * @param pages   кількість сторінок у книзі
     */
    public Book(String title, String author, int year, int edition, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.edition = edition;
        this.pages = pages;
    }

    /**
     * Отримує автора книги.
     *
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Отримує номер видання книги.
     *
     * @return номер видання
     */
    public int getEdition() {
        return edition;
    }

    /**
     * Отримує кількість сторінок у книзі.
     *
     * @return кількість сторінок
     */
    public int getPages() {
        return pages;
    }

    /**
     * Отримує заголовок книги.
     *
     * @return заголовок книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Отримує рік видання книги.
     *
     * @return рік видання
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Виводить інформацію про книгу на консоль.
     */
    public void printInfo() {
        System.out.printf("Title: %s, Author: %s, Year: %d, Edition: %d, Pages: %d%n", 
                           title, author, year, edition, pages);
    }

    /**
     * Перевіряє, чи дорівнює даний об'єкт іншому об'єкту.
     *
     * @param obj об'єкт для порівняння
     * @return true, якщо об'єкти рівні, інакше false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return title.equals(book.title) &&
               author.equals(book.author) &&
               year == book.year &&
               edition == book.edition &&
               pages == book.pages;
    }

    /**
     * Повертає хеш-код об'єкта Book.
     *
     * @return хеш-код книги
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, edition, pages);
    }
}
