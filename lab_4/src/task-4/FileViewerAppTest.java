import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class FileViewerAppTest {
    @Test
    public void isFileExistsChecker() {
        boolean expected = true;
        FileViewerApp test = new FileViewerApp();
    boolean answer = test.isFileExists("example1.txt");
    assertEquals(expected, answer);
    }
    
    @Test
    public void addFileChecker() {
        HashMap<String, TextFile>expected = new HashMap<String, TextFile>();
        
        expected.put("example1.txt", new TextFile("/user/files/", "Description for example1"));
        expected.put("example2.txt", new TextFile("/user/files/", "Description for example2"));
        expected.put("example3.txt", new TextFile("/user/docs/", "Description for example3"));
        expected.put("example4.txt", new TextFile("/user/docs/", "Description for example4"));
        expected.put("example5.txt", new TextFile("/user/files/", "Description for example5"));
        expected.put("example6.txt", new TextFile("/user/files/", "Description for example6"));


    FileViewerApp test = new FileViewerApp();
    test.addFile("example6.txt", "/user/files/", "Description for example6");
    HashMap<String, TextFile> answer = test.viewFiles();
    assertEquals(expected, answer);
    }

}
