package Characters;

import java.util.Scanner;

public class Main {
    public static int process(String heights) {
        int result = 0;

        for (int i = 0; i < heights.length() - 1; i++) {
            int currentHeight = Character.getNumericValue(heights.charAt(i));
            int nextHeight = Character.getNumericValue(heights.charAt(i + 1));

            result += Math.abs(currentHeight - nextHeight);
        }

        return result;
    }

    public static void main(String[] args) {
        // boolean értékekkel tér vissza
        System.out.println(Character.isAlphabetic('c'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('a'));

        // átalakítja a karaktert nagy-/kisbetűssé
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        // visszaadja az Int típusát a megadott karakternek, pl. 4 -> 4, c -> 12
        System.out.println(Character.getNumericValue('c'));

        // Felhőkarcolós feladat
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(process(input));
    }
}
