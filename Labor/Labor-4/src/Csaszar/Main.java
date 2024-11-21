package Csaszar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Csaszar[] t = new Csaszar[30];

        Scanner scanner = new Scanner(System.in);

        int index = 0;
        String name; // A beolvasott neve
        int age; // A beolvasott születési éve

        // Módosított while ciklus, hogy az inputot "0" bevitelnél befejezze
        while (true) {
            name = scanner.next().trim();
            if (name.isBlank()) {
                break;
            }
            age = Integer.parseInt(scanner.next().trim());
            t[index++] = new Csaszar(name, age);
        }

        // Minimum keresése a tömbben
        Csaszar min = t[0];

        for (int i = 1; i < index; i++) {
            if (t[i].getBirthOfYear() < min.getBirthOfYear()) {
                min = t[i];
            }
        }

        System.out.println("A legkorábban született császár: " + min);

        scanner.close();
    }
}
