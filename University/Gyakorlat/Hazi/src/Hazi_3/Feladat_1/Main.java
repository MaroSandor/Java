package Hazi_3.Feladat_1;

public class Main {
    public static boolean isConsecutiveFour(int[] values) {
        if (values == null || values.length < 4) {
            return false;
        }

        int counter = 1; // Kezdjük 1-ről, mert legalább 2 elem kell a sorozathoz.

        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                counter = 1; // Ha eltér az elem, akkor visszaállítjuk 1-re.
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers1 = { 10, 10, 10 };
        int[] arrayOfNumbers2 = { 10, 10, 10, 10 };
        int[] arrayOfNumbers3 = { 10, 10, 10, 14 };
        int[] arrayOfNumbers4 = { 10, 10, 10, 14, 22, 22, 22, 22, 34 };

        System.out.println("1. tömb eredménye: " + isConsecutiveFour(arrayOfNumbers1));
        System.out.println("2. tömb eredménye: " + isConsecutiveFour(arrayOfNumbers2));
        System.out.println("3. tömb eredménye: " + isConsecutiveFour(arrayOfNumbers3));
        System.out.println("4. tömb eredménye: " + isConsecutiveFour(arrayOfNumbers4));
    }
}