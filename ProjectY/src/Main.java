import java.io.File;

public class Main {
    public static void main(String[] args) {
        // 1. Ellenőrizzük, hogy van-e parancssori paraméter
        if (args.length == 0) {
            System.out.println("Hiba: Nem adtál meg parancssori paramétert! Kérlek, add meg a könyvtár elérési útját.");
            System.exit(1);
        }

        // 2. Ellenőrizzük, hogy csak egy paramétert kaptunk-e
        if (args.length > 1) {
            System.out.println("Hiba: Túl sok paramétert adtál meg! Csak egyetlen könyvtár elérési útját add meg.");
            System.exit(1);
        }

        // 3. Az útvonal ellenőrzése
        String rootPath = args[0];
        File rootDir = new File(rootPath);

        if (!rootPath.endsWith("/") || !rootPath.endsWith("\\")) {
            System.out.println("Hiba: A megadott útvonal egy fájl: " + rootPath);
            System.exit(1);
        }

        // Ellenőrizzük, hogy az útvonal létezik-e
        if (!rootDir.exists()) {
            System.out.println("Hiba: A megadott útvonal nem létezik: " + rootPath);
            System.exit(1);
        }

        // 4. Ha minden rendben, folytatjuk a program futását
        System.out.println("A megadott gyökérkönyvtár érvényes: " + rootPath);

        // Innen indulhat a további feldolgozás
    }
}
