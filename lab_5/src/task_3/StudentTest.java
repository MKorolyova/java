package task_3;
import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StudentTest {

    @Test
    public void testStudentCreation() {
        String expectedName = "Alice";
        int expectedCourse = 1;
        String expectedId = "S001";
        Student student = new Student("Alice", 1, "S001");
        String name = student.getName();
        int course = student.getCourse();
        String id = student.getId();
        assertEquals(expectedCourse, course);
        assertEquals(expectedName, name);
        assertEquals(expectedId, id);
    }

    @Test
    public void testGraduateStudentCreation() {
        String expectedName = "Ann";
        int expectedCourse = 3;
        String expectedId = "S004";
        String expectedTopic = "AI";
        GraduateStudent student = new GraduateStudent("Ann", 3, "S004","AI");
        String name = student.getName();
        int course = student.getCourse();
        String id = student.getId();
        String topic = student.getThesisTopic();  
        assertEquals(expectedCourse, course);
        assertEquals(expectedName, name);
        assertEquals(expectedId, id);
        assertEquals(expectedTopic, topic);
    }
}