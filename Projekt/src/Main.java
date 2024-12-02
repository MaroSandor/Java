import java.io.File;

public class Main {
    public static void traverseDirectory(File dir) {
        // Listázza a könyvtár tartalmát
        File[] files = dir.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Üres könyvtár: " + dir.getAbsolutePath());
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                // Ha mappa, bejárja rekurzívan
                System.out.println("Könyvtár: " + file.getAbsolutePath());
                traverseDirectory(file);
            } else if (isSupportedImage(file)) {
                // Ha kép, kiírja
                System.out.println("Kép: " + file.getAbsolutePath());
            } else {
                // Egyéb fájl
                System.out.println("Egyéb fájl figyelmen kívül hagyva: " + file.getAbsolutePath());
            }
        }
    }

    public static boolean isSupportedImage(File file) {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif");
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Használat: java RecursiveDirectoryWalker <könyvtár elérési út>");
            return;
        }

        File rootDir = new File(args[0]); // args[0] <- megadott elérési út

        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("Hiba: Az adott elérési út nem egy érvényes könyvtár.");
            return;
        }

        System.out.println("Könyvtár bejárása: " + rootDir.getAbsolutePath());
        traverseDirectory(rootDir);
    }
}
