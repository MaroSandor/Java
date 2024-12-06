import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecursiveFolderTraverse {
    public static Directory traverseFolderRecursively(File path) {
        if (!path.exists() || !path.isDirectory()) {
            System.out.println("Hiba: Az adott elérési út nem egy érvényes könyvtár.");
            return null;
        }

        List<Image> images = new ArrayList<>();
        List<Directory> subDirectories = new ArrayList<>();
        Directory directory = new Directory(path.getName(), path.getAbsolutePath(), images, subDirectories);

        File[] paths = path.listFiles();

        if (paths == null || paths.length == 0) {
            return new Directory(path.getName(), path.getAbsolutePath(), new ArrayList<>(), new ArrayList<>());
        }

        for (File pathName : paths) {
            if (pathName.isDirectory()) {
                Directory subDir = traverseFolderRecursively(pathName);
                subDirectories.add(subDir);
            } else if (isImage(pathName)) {
                Image image = new Image(pathName.getName(), pathName.getAbsolutePath());
                images.add(image);
            } else {
                System.err.println("Nem támogatott fájltípus: " + pathName.getName());
                continue;
            }
        }

        return directory;
    }

    public static boolean isImage(File file) {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif");
    }
}
