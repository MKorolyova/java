package task_2;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Клас, що представляє повідомлення на форумі,
 * включаючи автора, тему, текст, дату створення та дату редагування.
 */
public class ForumMessage {
    private String author;
    private String topic;
    private String text;
    private LocalDateTime createdAt;
    private LocalDateTime editedAt;

    /**
     * Конструктор для створення об'єкта ForumMessage.
     *
     * @param author автор повідомлення
     * @param topic  тема повідомлення
     * @param text   текст повідомлення
     */
    public ForumMessage(String author, String topic, String text) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.createdAt = LocalDateTime.now();
        this.editedAt = createdAt;
    }

    /**
     * Отримує автора повідомлення.
     *
     * @return автор повідомлення
     */
    public String getAuthor() {
        return author;
    } 

    /**
     * Отримує тему повідомлення.
     *
     * @return тема повідомлення
     */
    public String getTopic() {
        return topic;
    } 

    /**
     * Отримує текст повідомлення.
     *
     * @return текст повідомлення
     */
    public String getText() {
        return text;
    } 

    /**
     * Отримує дату створення повідомлення.
     *
     * @return дата створення
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Отримує дату редагування повідомлення.
     *
     * @return дата редагування
     */
    public LocalDateTime getEditedAt() {
        return editedAt;
    }

    /**
     * Редагує текст повідомлення та оновлює дату редагування.
     *
     * @param newText новий текст повідомлення
     */
    public void editMessage(String newText) {
        this.text = newText;
        this.editedAt = LocalDateTime.now();
    }

    /**
     * Повертає строкове представлення об'єкта ForumMessage.
     *
     * @return строкове представлення повідомлення
     */
    @Override
    public String toString() {
        return String.format("Author: %s\n Topic: %s\n Text: %s\n Created at: %s\n Edited at: %s\n",
                author, topic, text, createdAt, editedAt);
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

        ForumMessage forum = (ForumMessage) obj;

        return author.equals(forum.author) &&
               topic.equals(forum.topic) &&
               text.equals(forum.text) &&
               createdAt.isEqual(forum.createdAt) &&
               editedAt.isEqual(forum.editedAt);
    }

    /**
     * Повертає хеш-код об'єкта ForumMessage.
     *
     * @return хеш-код повідомлення
     */
    @Override
    public int hashCode() {
        return Objects.hash(author, topic, text, createdAt, editedAt);
    }
}
