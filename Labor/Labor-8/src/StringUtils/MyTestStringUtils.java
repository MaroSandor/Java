package StringUtils;

public class MyTestStringUtils {
    public static void testCountCharOccurencesCharacterExists() {
        String input = "Hello";
        String input2 = "Szilva";

        char ch = 'l';
        char ch2 = 'l';

        int result = StringUtils.countCharOccurrences(input, ch);
        int result2 = StringUtils.countCharOccurrences(input2, ch2);

        assert result == 2: "A karakter előfordulásának a száma nem megfelelő";
        assert result2 == 1: "A karakter előfordulásának a száma nem megfelelő";
    }

    public static void testCountCharOccurencesCaseSensitive() {
        String input = "Hello";
        char ch = 'h';

        int result = StringUtils.countCharOccurrences(input, ch);

        assert result == 0: "A karakterek kis- és nagybetű különbségét figyelembe kell venni.";
    }

    public static void main(String[] args) {
        testCountCharOccurencesCharacterExists();
        testCountCharOccurencesCaseSensitive();
    }
}
