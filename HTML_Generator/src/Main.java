import java.io.File;

public class Main {
    // Rekurziv könyvtárbejárás: ha a "fájl" egy könyvtár, akkor újra meghivjuk a függvényt
    public static void traverseFolderRecursively(File directory) {
        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Üres könyvtár!");
            throw new AssertionError();
        }

        for (File file : files) {
            if (file.isDirectory()) {
                traverseFolderRecursively(file);
            } else if (isImage(file)) {
                System.out.println(file);
            } else {
                System.out.println("Hiba: A " + file.getName() + " fájl nem támogatott formátumú!");
            }
        }
    }

    // Fájlvizsgálat: megvizsgálja, hogy a mappában található fájl megfelel-e a követelménynek (jpg, jpeg, png, gif)
    public static boolean isImage(File file) {
        String fileName = file.getName().toLowerCase();
        return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".gif");
    }

    public static void generateImageHTML(File file) {

    }

    public static void generateIndexHTML(File dir) {

    }

    public static void main(String[] args) {
        // Paraméter vizsgálat
        if (args.length < 1) {
            System.out.println("Hiba: Nem adtál meg elérési utat!");
            return;
        } else if (args.length > 1) {
            System.out.println("Hiba: Túl sok paraméter adtál meg!");
            return;
        }

        // Megadott elérési út
        String root = args[0];
        File rootDir = new File(root);

        // Mappa vizsgálat
        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("Hiba: Az adott elérési út nem egy érvényes könyvtár.");
            return;
        }

        // Mappa bejárása
        System.out.println("Könyvtár bejárása: " + rootDir.getAbsolutePath());
        traverseFolderRecursively(rootDir);
    }
}
