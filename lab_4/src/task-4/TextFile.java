public class TextFile {
    private String filePath; 
    private String description; 

    public TextFile(String filePath, String description) {
        this.filePath = filePath;
        this.description = description;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "\n Path: " + filePath + "\n Description: " + description;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        TextFile file = (TextFile) obj;

        return 
        this.filePath.equals(file.filePath) &&
        this.description.equals(file.description);
    }
}
