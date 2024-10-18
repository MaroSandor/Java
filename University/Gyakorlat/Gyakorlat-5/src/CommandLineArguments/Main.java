// Parancssori paraméterekként egész számsorozatokat kap és eldönti, hogy
// számtani sorozat-e.

package CommandLineArguments;

public class Main {
    public static boolean checkArithmeticSequence(int[] array) {
        if (array.length <= 2) {
            return true;
        }

        int commonDifference = array[1] - array[0];

        for (int i = 2; i < array.length; i++) {
            if (array[i] - array[i - 1] != commonDifference) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for (String i : args) {
            System.out.println(i);
        }

        if (args.length == 0) {
            System.out.println("A tömb nem lehet üres!");

            System.exit(0);
        }

        int[] numbers = new int[args.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        boolean isArithmetic = checkArithmeticSequence(numbers);

        if (isArithmetic) {
            System.out.println("Számtani sorozat");
        } else {
            System.out.println("Nem számtani sorozat!");
        }
    }
}