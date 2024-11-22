package StringUtils;

public class StringUtils {

    // Visszaadja a karakter előfordulásának számát a sztringben
    public static int countCharOccurrences(String input, char ch) {
        if (input == null) {
            throw new IllegalArgumentException("A bemeneti sztring nem lehet null.");
        }

        int count = 0;
//        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
