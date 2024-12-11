import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class start {
    private String rootDirectory;

    public void StaticHtmlImageGallery(String rootDirectory) {
        this.rootDirectory = rootDirectory;
    }

    public void processDirectory(File directory) {
        if (directory == null || !directory.exists()) return;

        File[] files = directory.listFiles();
        if (files == null) return;

        List<String> imageFiles = new ArrayList<>();
        List<File> subDirectories = new ArrayList<>();

        for (File file : files) {
            if (file.isDirectory()) {
                subDirectories.add(file);
            } else if (FileUtils.isImageFile(file.getName())) {
                imageFiles.add(file.getName());
            }
        }

        HtmlGenerator.generateIndexHtml(directory, imageFiles, subDirectories, rootDirectory);

        for (File subDir : subDirectories) {
            processDirectory(subDir);
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Adj meg egy elérési utat!");
            System.exit(1);
        }

        String rootDirectory = args[0];
        File rootDir = new File(rootDirectory);

        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("A mappa nem létezik");
            System.exit(1);
        }

        StaticHtmlImageGallery gallery = new StaticHtmlImageGallery(rootDirectory);
        gallery.processDirectory(rootDir);
    }
}
