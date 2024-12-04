import java.util.List;

public class Directory {
    private String dirName;
    private String dirPath;
    private List<Image> images;
    private List<Directory> subDirectories;

    public Directory(String dirName, String dirPath, List<Image> images, List<Directory> subDirectories) {
        this.dirName = dirName;
        this.dirPath = dirPath;
        this.images = images;
        this.subDirectories = subDirectories;
    }

    public String getDirName() {
        return dirName;
    }

    public String getDirPath() {
        return dirPath;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Directory> getSubDirectories() {
        return subDirectories;
    }

    public void addImage (Image image) {
        this.images.add(image);
    }

    public void addSubDirectories(Directory dir) {
        this.subDirectories.add(dir);
    }
}
