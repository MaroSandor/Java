package Hazi_4.Feladat_2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        List<Integer> bolhak = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            bolhak.add(i);
        }

        while (scanner.hasNextLine()) {
            String sor = scanner.nextLine().trim();
            if (sor.isEmpty()) {
                continue;
            }
            String[] bolhakStr = sor.split(" ");
            for (String bolhaStr : bolhakStr) {
                int bolha = Integer.parseInt(bolhaStr);
                bolhak.remove(Integer.valueOf(bolha));
            }
        }

        System.out.println(bolhak.size());
        if (!bolhak.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Integer bolha : bolhak) {
                sb.append(bolha).append(" ");
            }
            System.out.println(sb.toString().trim());
        }

        scanner.close();
    }
}