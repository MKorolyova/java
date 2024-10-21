package task_3;
import java.util.Objects;

/**
 * Клас, представляющий аспіранта, який успадковує характеристики студента
 * і додає інформацію про тему диплома.
 */
public class GraduateStudent extends Student {
    private String thesisTopic;

    /**
     * Конструктор для створення об'єкта GraduateStudent.
     *
     * @param name       ім'я аспіранта
     * @param course     курс, на якому навчається аспірант
     * @param id         унікальний ідентифікатор аспіранта
     * @param thesisTopic тема диплома аспіранта
     */
    public GraduateStudent(String name, int course, String id, String thesisTopic) {
        super(name, course, id);
        this.thesisTopic = thesisTopic;
    }

    /**
     * Отримує тему диплома аспіранта.
     *
     * @return тема диплома
     */
    public String getThesisTopic() {
        return thesisTopic;
    }

    /**
     * Виводить інформацію про аспіранта на консоль,
     * включаючи інформацію про тему диплома.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Тема диплома: %s%n", thesisTopic);
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

        GraduateStudent student = (GraduateStudent) obj;

        return thesisTopic.equals(student.thesisTopic) && super.equals(obj);
    }

    /**
     * Повертає хеш-код об'єкта GraduateStudent.
     *
     * @return хеш-код аспіранта
     */
    @Override
    public int hashCode() {
        return Objects.hash(thesisTopic, super.hashCode());
    }
}
