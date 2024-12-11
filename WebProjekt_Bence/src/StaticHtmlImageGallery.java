import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StaticHtmlImageGallery {

    private String rootDirectory;

    public StaticHtmlImageGallery(String rootDirectory) {
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
            } else if (isImageFile(file.getName())) {
                imageFiles.add(file.getName());
            }
        }

        generateIndexHtml(directory, imageFiles, subDirectories);

        for (File subDir : subDirectories) {
            processDirectory(subDir);
        }
    }

    public boolean isImageFile(String fileName) {
        String lowerCaseFileName = fileName.toLowerCase();
        return lowerCaseFileName.endsWith(".png") ||
                lowerCaseFileName.endsWith(".jpg") ||
                lowerCaseFileName.endsWith(".jpeg") ||
                lowerCaseFileName.endsWith(".gif");
    }

    public void generateIndexHtml(File directory, List<String> imageFiles, List<File> subDirectories) {
        String indexPath = new File(directory, "index.html").getAbsolutePath();
        StringBuilder htmlContent = new StringBuilder();

        htmlContent
                .append("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n")
                .append("<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("<title>").append(directory.getName()).append("</title>\n")
                .append("<style>\nbody { font-family: Arial, sans-serif; margin: 20px; }\n")
                .append(".gallery a { display: block; margin: 5px 0; }\n</style>\n</head>\n<body>\n");

        // **Frissítés**: Most mindig a gyökér könyvtárból generáljuk a Start Page hivatkozást relatív úton.
        String relativeStartPagePath = getRelativePath(directory, new File(rootDirectory)); // **Ez az új rész**
        htmlContent
                .append("<a href=\"").append(relativeStartPagePath)
                .append("/index.html\" ><h2>Start Page</a></h2>\n")
                .append("<hr style=\"border: 1px solid black; margin: 10px 0;\">\n");

        htmlContent.append("<h2>Directories:</h2>\n<ul>\n");

        File parentDir = directory.getParentFile();
        if (parentDir != null && new File(parentDir, "index.html").exists()) {
            String parentIndexPath = getRelativePath(directory, new File(parentDir, "index.html"));
            htmlContent
                    .append("<a href=\"").append(parentIndexPath)
                    .append("\" \"><b><<</b></a>\n");
        }

        for (File subDir : subDirectories) {
            htmlContent
                    .append("<li><a href=\"").append(subDir.getName()).append("/index.html\">")
                    .append(subDir.getName()).append("</a></li>\n");
        }

        htmlContent.append("</ul>\n").append("<hr style=\"border: 1px solid black; margin: 10px 0;\">\n").append("<h2>Images:</h2>\n<ul>\n");

        for (String imageFile : imageFiles) {
            htmlContent
                    .append("<li><a href=\"").append(imageFile.replaceFirst("\\..+$", ".html")).append("\">")
                    .append(imageFile).append("</a></li>\n");
        }

        htmlContent.append("</ul>\n</body>\n</html>");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(indexPath))) {
            writer.write(htmlContent.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String imageFile : imageFiles) {
            generateImageHtml(directory, imageFile, imageFiles);
        }
    }
    public void generateImageHtml(File directory, String imageFile, List<String> imageFiles) {
        String imagePath = new File(directory, imageFile).getAbsolutePath();
        String htmlFileName = imagePath.replaceFirst("\\.[^.]+$", ".html");
        int currentIndex = imageFiles.indexOf(imageFile);

        String prevImage = currentIndex > 0 ? imageFiles.get(currentIndex - 1).replaceFirst("\\..+$", ".html") : null;
        String nextImage = currentIndex < imageFiles.size() - 1
                ? imageFiles.get(currentIndex + 1).replaceFirst("\\..+$", ".html")
                : null;

        String rootIndexPath = getRelativePath(directory, new File(rootDirectory)); // Frissítve a relatív elérési
                                                                                    // útvonalhoz

        String htmlContent = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Viewing """ + imageFile + "</title>\n" +
                "                            </head>\n<body>\n" +

                ("<a href=\"" + rootIndexPath + "/index.html\" class=\"nav-link\"><h2>Start Page</a></h2>\n") +
                ("<hr style=\"border: 1px solid black; margin: 20px 0;\">\n");

        htmlContent += """
                <a href="index.html" class="nav-link">^^</a>
                <div class="nav-buttons">
                """;

        // Előző kép
        if (prevImage != null) {
            htmlContent += "<a href=\"" + prevImage + "\" class=\"nav-link\"><<</a>\n";
        } else {
            htmlContent += "<a href=\"#\" class=\"nav-link\"><<</a>\n";
        }

        // Kép neve
        htmlContent += "<span class=\"image-name\"> " + imageFile + "</span>\n";

        // Következő kép
        if (nextImage != null) {
            htmlContent += "<a href=\"" + nextImage + "\" class=\"nav-link\">>></a>\n";
        } else {
            htmlContent += "<a href=\"#\"class=\"nav-link\">>></a>\n";
        }

        htmlContent += "</div>\n";

        if (nextImage != null) {
            htmlContent += "<a href=\"" + nextImage + "\"><img src=\""
                    + getRelativePath(directory, new File(directory, imageFile)) + "\" alt=\"" + imageFile
                    + "\" style=\"max-width: 80%; height: auto;\"></a>\n";
        } else {
            htmlContent += "<img src=\"" + getRelativePath(directory, new File(directory, imageFile)) + "\" alt=\""
                    + imageFile + "\" style=\"max-width: 80%; height: auto;\">\n";
        }

        htmlContent += "</body>\n</html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFileName))) {
            writer.write(htmlContent);
        } catch (IOException e) {
            System.out.println("Hiba a fájl írása közben!");
        }
    }


    public String getRelativePath(File from, File to) {
        // Először a két fájl elérési útjának teljes elérési útjait vesszük
        String fromPath = from.getAbsolutePath();
        String toPath = to.getAbsolutePath();

        // Ha az 'from' fájl ugyanabban a könyvtárban van, akkor egyszerűen a fájl nevét adjuk vissza
        if (fromPath.equals(toPath)) {
            return ".";
        }

        // Megoldás: Távolságok keresése
        String[] fromParts = fromPath.split(File.separator);
        String[] toParts = toPath.split(File.separator);

        // Közös szakasz megtalálása
        int commonLength = 0;
        for (int i = 0; i < Math.min(fromParts.length, toParts.length); i++) {
            if (fromParts[i].equals(toParts[i])) {
                commonLength++;
            } else {
                break;
            }
        }

        // Számoljuk ki a felfelé lépéseket (..)
        StringBuilder relativePath = new StringBuilder();
        for (int i = fromParts.length - 1; i >= commonLength; i--) {
            relativePath.append("..").append(File.separator);
        }

        // Adjuk hozzá a cél könyvtárat
        for (int i = commonLength; i < toParts.length; i++) {
            relativePath.append(toParts[i]).append(File.separator);
        }

        // Töröljük az utolsó File.separator-t
        if (relativePath.length() > 0) {
            relativePath.setLength(relativePath.length() - 1);
        }

        return relativePath.toString();
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