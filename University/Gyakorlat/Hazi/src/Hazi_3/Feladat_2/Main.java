package Hazi_3.Feladat_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Add meg a napot: ");
        String dayInput = scanner.nextLine();
        System.out.printf("Add meg hány órát szeretnél hozzáadni a '" + dayInput + "' naphoz: ");
        int numberOfLessons = scanner.nextInt();

        Orarend timetable = new Orarend(dayInput);

        for (int i = 0; i < numberOfLessons; i++) {
            System.out.println("Add meg a(z) " + (i + 1) + ". óra adatait:");

            System.out.print("Óra kódja: ");
            int id = scanner.nextInt();

            System.out.print("Óra neve: ");
            String lessonName = scanner.next();

            System.out.print("Óra kezdési időpontja (pl. 8): ");
            int startTime = scanner.nextInt();

            Ora lesson = new Ora(id, startTime, lessonName);

            boolean success = timetable.oratHozzaad(lesson);

            System.out.println(success ? "Sikeresen hozzáadva: " + lessonName
                    : "Sikertelen hozzáadás: " + lessonName + " (" + startTime + ")");
        }

        System.out.println("\nAz órarend:");
        System.out.println(timetable);

        scanner.close();
    }
}