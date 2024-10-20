import java.util.HashMap;

public class FileViewerApp {
    private HashMap<String, TextFile> fileList; 
    public FileViewerApp() {
        fileList = new HashMap<>();
        initializeFiles(); 
    }

    private void initializeFiles() {
        fileList.put("example1.txt", new TextFile("/user/files/", "Description for example1"));
        fileList.put("example2.txt", new TextFile("/user/files/", "Description for example2"));
        fileList.put("example3.txt", new TextFile("/user/docs/", "Description for example3"));
        fileList.put("example4.txt", new TextFile("/user/docs/", "Description for example4"));
        fileList.put("example5.txt", new TextFile("/user/files/", "Description for example5"));
    }

    public HashMap<String, TextFile> viewFiles() {
        return fileList;
    }

    public boolean isFileExists(String fileName){
        if (fileList.containsKey(fileName)) {
            return true;
        }
        return false;
    } 

    public void addFile(String fileName, String filePath, String description) {
        fileList.put(fileName, new TextFile(filePath, description));
    }
}
