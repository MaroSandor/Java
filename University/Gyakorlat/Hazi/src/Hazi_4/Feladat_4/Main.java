package Hazi_4.Feladat_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the input file name as a command line argument.");
            return;
        }

        String filename = args[0];
        List<PumpkinPattern> patterns = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 4) {
                    String name = parts[0];
                    String theme = parts[1];
                    int popularity = Integer.parseInt(parts[2]);
                    int cuts = Integer.parseInt(parts[3]);
                    patterns.add(new PumpkinPattern(name, theme, popularity, cuts));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        patterns.sort((p1, p2) -> {
            if (p2.popularity != p1.popularity) {
                return Integer.compare(p2.popularity, p1.popularity);
            } else if (p1.cuts != p2.cuts) {
                return Integer.compare(p1.cuts, p2.cuts);
            } else {
                return p1.name.compareTo(p2.name);
            }
        });

        for (PumpkinPattern pattern : patterns) {
            System.out.println(pattern);
        }
    }
}