package Konyvtar;

import java.util.*;
import java.io.*;

public class Konyvtar implements KonyvRaktar {
    Set<Konyvtar> konyvtarak = new HashSet<>();

    public static void hozzaadKonyv(Konyv konyv) {
        Random rnd = new Random();

        try {
            int valoszinuseg = rnd.nextInt(100) - 1;

            if (valoszinuseg < 5) {
                throw new Exception("Hiba történt a rendszerben");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void torolKonyv(String ISBN) {

    }

    @Override
    public void fajlbolBeolvas(String fajlNev) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fajlNev))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts[0].equalsIgnoreCase("Fikcio")) {
                    hozzaadKonyv(new Fikcio(parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), parts[5]));
                } else if (parts[0].equalsIgnoreCase("Szakirodalom")) {
                    hozzaadKonyv(new Szakirodalom(parts[1], parts[2], parts[3], Integer.parseInt(parts[4]), parts[5]));
                }
            }
        } catch (IOException | Exception e) {
            System.out.println("Hiba történt a fájl beolvasása során: " + e.getMessage());
        }
    }

    @Override
    public void fajlbaIr(String fajlNev) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fajlNev))) {
            for (Konyv konyv : konyvek) {
                writer.write(konyv.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Hiba történt a fájl írása során: " + e.getMessage());
        }
    }
}
