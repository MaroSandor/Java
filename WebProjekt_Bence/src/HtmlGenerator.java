import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlGenerator {
    public static void generateIndexHtml(File directory, List<String> imageFiles, List<File> subDirectories, String rootDirectory) {
        String indexPath = new File(directory, "index.html").getAbsolutePath();
        StringBuilder htmlContent = new StringBuilder();

        htmlContent
                .append("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n")
                .append("<meta charset=\"UTF-8\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("<title>").append(directory.getName()).append("</title>\n")
                .append("<style>\nbody { font-family: Arial, sans-serif; margin: 20px; }\n")
                .append(".gallery a { display: block; margin: 5px 0; }\n</style>\n</head>\n<body>\n");

        // **Frissítés**: Most mindig a gyökér könyvtárból generáljuk a Start Page hivatkozást relatív úton.
        String relativeStartPagePath = PathUtils.getRelativePath(directory, new File(rootDirectory)); // **Ez az új rész**
        htmlContent
                .append("<a href=\"").append(relativeStartPagePath)
                .append("/index.html\" ><h2>Start Page</a></h2>\n")
                .append("<hr style=\"border: 1px solid black; margin: 10px 0;\">\n");

        htmlContent.append("<h2>Directories:</h2>\n<ul>\n");

        File parentDir = directory.getParentFile();
        if (parentDir != null && new File(parentDir, "index.html").exists()) {
            String parentIndexPath = PathUtils.getRelativePath(directory, new File(parentDir, "index.html"));
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
            generateImageHtml(directory, imageFile, imageFiles, imageFile);
        }
    }

    public static void generateImageHtml(File directory, String imageFile, List<String> imageFiles, String rootDirectory) {
        String imagePath = new File(directory, imageFile).getAbsolutePath();
        String htmlFileName = imagePath.replaceFirst("\\.[^.]+$", ".html");
        int currentIndex = imageFiles.indexOf(imageFile);

        String prevImage = currentIndex > 0 ? imageFiles.get(currentIndex - 1).replaceFirst("\\..+$", ".html") : null;
        String nextImage = currentIndex < imageFiles.size() - 1
                ? imageFiles.get(currentIndex + 1).replaceFirst("\\..+$", ".html")
                : null;

        String rootIndexPath = PathUtils.getRelativePath(directory, new File(rootDirectory)); // Frissítve a relatív elérési
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
                    + PathUtils.getRelativePath(directory, new File(directory, imageFile)) + "\" alt=\"" + imageFile
                    + "\" style=\"max-width: 80%; height: auto;\"></a>\n";
        } else {
            htmlContent += "<img src=\"" + PathUtils.getRelativePath(directory, new File(directory, imageFile)) + "\" alt=\""
                    + imageFile + "\" style=\"max-width: 80%; height: auto;\">\n";
        }

        htmlContent += "</body>\n</html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFileName))) {
            writer.write(htmlContent);
        } catch (IOException e) {
            System.out.println("Hiba a fájl írása közben!");
        }
    }
}
