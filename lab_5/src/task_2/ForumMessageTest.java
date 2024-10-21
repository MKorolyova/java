package task_2;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ForumMessageTest {

    @Test
    public void testCreation() {
        String expected = "Luke";
        ForumMessage message = new ForumMessage("Luke", "Topic", "Text");
        String author = message.getAuthor();
        assertEquals(expected, author);
    }

    @Test
    public void testEditMessage() {
        String expected = "New Text";
        ForumMessage message = new ForumMessage("Kate", "Topic", "Old text");
        message.editMessage("New Text");
        String changedText = message.getText();
        assertEquals(expected, changedText);
    }
}