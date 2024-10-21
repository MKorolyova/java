package task_3;
import java.util.Objects;

/**
 * Клас, представляющий студента с его именем, курсом и идентификатором.
 */
public class Student {
    private String name;
    private int course;
    private String id;

    /**
     * Конструктор для створення об'єкта Student.
     *
     * @param name   ім'я студента
     * @param course курс, на якому навчається студент
     * @param id     унікальний ідентифікатор студента
     */
    public Student(String name, int course, String id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    /**
     * Отримує курс студента.
     *
     * @return курс студента
     */
    public int getCourse() {
        return course;
    }

    /**
     * Отримує ідентифікатор студента.
     *
     * @return ідентифікатор студента
     */
    public String getId() {
        return id;
    }

    /**
     * Отримує ім'я студента.
     *
     * @return ім'я студента
     */
    public String getName() {
        return name;
    }
    
    /**
     * Виводить інформацію про студента на консоль.
     */
    public void printInfo() {
        System.out.printf("Name: %s, Course: %d, ID: %s%n", name, course, id);
    }

    /**
     * Повертає рядкове представлення об'єкта Student.
     *
     * @return рядкове представлення студента
     */
    @Override
    public String toString() {
        return String.format("Name: %s\n Course: %d\n ID: %s\n", name, course, id);
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

        Student student = (Student) obj;

        return name.equals(student.name) &&
               course == student.course &&
               id.equals(student.id);
    }

    /**
     * Повертає хеш-код об'єкта Student.
     *
     * @return хеш-код студента
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, course, id);
    }
}
