package Hazi_3.Feladat_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// ForrestGump feladat

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int days = in.nextInt();

        int[] distances = new int[days];
        for (int i = 0; i < days; i++) {
            distances[i] = in.nextInt();
        }

        int[] speeds = new int[days];
        for (int i = 0; i < days; i++) {
            speeds[i] = in.nextInt();
        }

        List<Integer> mostTimeDays = new ArrayList<Integer>();
        double maxTime = (double) distances[0] / speeds[0];

        for (int i = 1; i < days; i++) {
            double time = (double) distances[i] / speeds[i];

            if (time > maxTime) {
                maxTime = time;
                mostTimeDays.clear();
                mostTimeDays.add(i + 1);
            } else if (time == maxTime) {
                mostTimeDays.add(i + 1);
            }
        }

        for (int day : mostTimeDays) {
            System.out.print(day + " ");
        }

        System.out.println();
    }
}