package task_4;
import java.util.Objects;

/**
 * Клас, що представляє бібліотечну книгу, яка успадковує характеристики книги 
 * та додає інформацію про інвентарний номер і хто її взяв.
 */
public class LibraryBook extends Book {
    private String inventoryNumber;
    private String takenBy;

    /**
     * Конструктор для створення об'єкта LibraryBook.
     *
     * @param title           заголовок книги
     * @param author          автор книги
     * @param year            рік видання книги
     * @param edition         номер видання
     * @param pages           кількість сторінок у книзі
     * @param inventoryNumber  інвентарний номер книги
     * @param takenBy         ім'я особи, яка взяла книгу
     */
    public LibraryBook(String title, String author, int year, int edition, int pages, 
                       String inventoryNumber, String takenBy) {
        super(title, author, year, edition, pages);
        this.inventoryNumber = inventoryNumber;
        this.takenBy = takenBy;
    }

    /**
     * Отримує ім'я особи, яка взяла книгу.
     *
     * @return ім'я особи, яка взяла книгу
     */
    public String getTakenBy() {
        return takenBy;
    }

    /**
     * Отримує інвентарний номер книги.
     *
     * @return інвентарний номер
     */
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    /**
     * Виводить інформацію про бібліотечну книгу на консоль,
     * включаючи інвентарний номер та інформацію про те, хто її взяв.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Inventory number: %s, Taken by: %s%n", 
                          inventoryNumber, takenBy);
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

        LibraryBook book = (LibraryBook) obj;

        return inventoryNumber.equals(book.inventoryNumber) &&
               takenBy.equals(book.takenBy);
    }

    /**
     * Повертає хеш-код об'єкта LibraryBook.
     *
     * @return хеш-код бібліотечної книги
     */
    @Override
    public int hashCode() {
        return Objects.hash(inventoryNumber, takenBy);
    }
}
