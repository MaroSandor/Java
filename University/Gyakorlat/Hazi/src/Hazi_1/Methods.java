package Hazi_1;

import java.util.Arrays;

public class Methods {
    // 1. feladat: 3 egész szám rendezése növekvő sorrendbe
    // első megoldás: tömb nélkül
    public static void ascendingOrder(int a, int b, int c) {
        // itt vizsgálom, hogy a feltételt (növekvő-e)
        if (a < b && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a < c && c < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b < a && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b < a && b < c) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (c < a && a < b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }

    // második megoldás: tömb használatával (Arrays osztály használatával)
    public static int[] ascendingOrderByArray(int a, int b, int c) {
        int[] numbers = {a, b, c};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        return numbers;
    }

    // 2. feladat: 3 valós szám minimuma és 3 valós szám abszolútértékeinek maximuma
    public static int[] minMaxOfNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};

        return numbers;
    }

    public static void main(String[] args) {
        ascendingOrder(1, 2, 3);
        System.out.println("");
        ascendingOrderByArray(1, 2, 3);
        System.out.println("");

        for (int i = 0; i < minMaxOfNumbers(2, 4, 6).length; i++) {
            System.out.println(minMaxOfNumbers(2, 4, 6)[i]);
        }

        System.out.println("");
    }
}
