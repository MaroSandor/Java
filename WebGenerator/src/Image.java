public class Image {
    private String fileName;
    private String filePath;

    public Image(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getHtmlFileName() {
        return fileName.substring(0, fileName.lastIndexOf(".")) + ".html";
    }

    @Override
    public String toString() {
        return "Image{" + "fileName='" + fileName + '\'' + ", filePath='" + filePath + '\'' + '}';
    }
}
