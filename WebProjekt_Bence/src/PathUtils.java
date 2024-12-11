import java.io.File;

public class PathUtils {
    public static String getRelativePath(File from, File to) {
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
}
