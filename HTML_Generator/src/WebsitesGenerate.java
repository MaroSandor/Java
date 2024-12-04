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

        if (RecursiveFolderTraverse.traverseFolderRecursively(rootDir) != null) {
            HTMLGenerator.generateHTML(RecursiveFolderTraverse.traverseFolderRecursively(rootDir), args[0]);
        } else {
            System.err.println("Hiba: A megadott mappa (" + rootDir + ") null értékkel tért vissza.");
            return;
        }
    }
}
