import java.io.File;

public class WebsitesGenerate {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Hiba: Nem adtál meg elérési utat!");
            return;
        } else if (args.length > 1) {
            System.out.println("Hiba: Túl sok paraméter adtál meg!");
            return;
        }

        File rootDir = new File(args[0]);

        if (!rootDir.exists() || !rootDir.isDirectory()) {
            System.out.println("Hiba: Az adott elérési út nem érvényes könyvtár!");
            return;
        }

        Directory dir = RecursiveFolderTraverse.traverseFolderRecursively(rootDir);

        if (dir != null) {
            HTMLGenerator.generateHTML(dir, args[0]);
            System.out.println("A HTML fájlok sikeresen legenerálva!");
        } else {
            System.err.println("Hiba: A megadott mappa (" + rootDir + ") null értékkel tért vissza.");
            return;
        }
    }
}
