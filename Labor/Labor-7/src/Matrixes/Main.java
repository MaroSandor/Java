package Matrixes;

import java.util.Random;

public class Main {
    public static boolean is_magic(int [][] t) {
        int etalon = 0;
        int sum = 0;

        // főátló bejárása (és kiszámítása)
        for (int i = 0; i < t.length; i++) {
            etalon += t[i][i];
        }

        // mellékátló bejárása (és kiszámítása)
        for (int i = 0; i < t.length; i++) {
            sum += t[i][t.length - i - 1];
        }

        if (etalon != sum) {
            return false;
        }



        for (int i = 0; i < t.length; i++) {
            sum = 0;
            for (int j = 0; j < t.length; j++) {
                sum += t[i][j];
            }

            if (etalon != sum) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int [][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Random rnd = new Random();
                matrix[i][j] = rnd.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int [][] matrix2 = new int[][] { { 4, 14, 15, 1 }, { 9, 7, 6, 12 }, { 5, 11, 10, 8 }, { 16, 2, 3, 13 } };

        System.out.println(is_magic(matrix2));

    }
}
