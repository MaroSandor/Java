package Hazi_4.Feladat_3;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hiba! Adj meg egy számsorozatot!");
            return;
        }

        int sum = 0;
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < args[0].toCharArray().length; i++) {
            int number = Integer.parseInt(String.valueOf(args[0].toCharArray()[i]));

            sum += number;
            if (number < minNum) {
                minNum = number;
            }

            if (number > maxNum) {
                maxNum = number;
            }
        }

        System.out.println(sum);
        System.out.println(minNum);
        System.out.println(maxNum);
    }
}