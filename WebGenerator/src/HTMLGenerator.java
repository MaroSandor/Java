import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HTMLGenerator {
    public static void generateImageHTML(Image fileName, String directory, String rootPath, Image previous, Image next) {
        File html = new File(directory, fileName.getHtmlFileName());

        String startPagePath = "../".repeat(directory.replace("\\", "/").split("/").length - rootPath.replace("\\", "/").split("/").length) + "index.html";

        String htmlTemplate = """
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>""" + fileName.getFileName() + """
        </title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 20px;
            }
            a {
                color: blue;
            }
            img {
                max-width: 80%;
                height: auto;
                margin: 20px auto;
            }
        </style>
    </head>
    <body>
        <h1><a href='""" + startPagePath + """
        '>Start Page</a></h1>
        <p><a href='index.html'>^^</a></p>
        <hr />
        <p>
            <a href='""" + (previous != null ? previous.getHtmlFileName() : "#") + """
            '><<</a>
            <strong>""" + fileName.getFileName() + """
            </strong>
            <a href='""" + (next != null ? next.getHtmlFileName() : "#") + """
        '>>></a>
        </p>
        <img src='""" + fileName.getFileName() + """
    '>
    </body>
    </html>
    """;

        try (PrintWriter writer = new PrintWriter(html)) {
            writer.write(htmlTemplate);
        } catch (Exception e) {
            System.err.println("Hiba a HTML generálás közben: " + e.getMessage());
        }
    }

    public static void generateIndexHTML(Directory directory, String rootPath) {
        File html = new File(directory.getDirPath(), "index.html");

        String startPagePath = "../".repeat(directory.getDirPath().replace("\\", "/").split("/").length - rootPath.replace("\\", "/").split("/").length) + "index.html";

        StringBuilder imageLinks = new StringBuilder();
        for (Image image : directory.getImages()) {
            imageLinks.append("<li><a href=\"")
                    .append(image.getHtmlFileName())
                    .append("\">")
                    .append(image.getFileName())
                    .append("</a></li>\n");
        }

        StringBuilder directoryLinks = new StringBuilder();
        for (Directory dir : directory.getSubDirectories()) {
            directoryLinks.append("<li><a href=\"")
                    .append(dir.getDirName())
                    .append("/index.html\">")
                    .append(dir.getDirName())
                    .append("</a></li>\n");
        }

        if (!directory.getDirPath().equals(rootPath)) {
            directoryLinks.insert(0, "<li><a href=\"../index.html\"><<</a></li>\n");
        }

        String htmlTemplate = """
            <!DOCTYPE html>
            <html lang="hu">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>""" + directory.getDirName() + """
                </title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        margin: 20px;
                    }
                    a {
                        color: blue;
                    }
                </style>
            </head>
            <body>
                <h1><a href='""" + startPagePath + """
                '>Start Page</a></h1>
                <hr />
                <h2>Directories:</h2>
                <ul>""" + directoryLinks + """
                </ul>
                <hr />
                <h2>Images:</h2>
                <ul>""" + imageLinks + """
            </ul>
            </body>
            </html>
            """;

        try (PrintWriter writer = new PrintWriter(html)) {
            writer.write(htmlTemplate);
        } catch (Exception e) {
            System.err.println("Hiba az index.html generálása közben: " + e.getMessage());
        }
    }

    public static void generateHTML(Directory directory, String rootPath) {
        generateIndexHTML(directory, rootPath);

        Image previous = null;
        for (int i = 0; i < directory.getImages().size(); i++) {
            Image current = directory.getImages().get(i);
            Image next = (i + 1 < directory.getImages().size()) ? directory.getImages().get(i + 1) : null;

            HTMLGenerator.generateImageHTML(current, directory.getDirPath(), rootPath, previous, next);
            previous = current;
        }

        for (Directory dir : directory.getSubDirectories()) {
            generateHTML(dir, rootPath);
        }
    }
}
