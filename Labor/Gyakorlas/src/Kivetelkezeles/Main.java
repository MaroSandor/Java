package Kivetelkezeles;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Add meg az emeletek számát: ");
        int n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            int aktualisEmelet = rnd.nextInt(n - 1) + 1;
            System.out.println("Aktuális emelet: " + aktualisEmelet);
        }
    }
}
