package TermekAdatok_Fajlkezeles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception, RuntimeException {
        Set<Termekek> termekek = new HashSet<>();

        try (Scanner sc = new Scanner(new File("termekek.txt"))) {
            String sor;
            int szamlalo = 0;

            while (sc.hasNextLine()) {
                sor = sc.nextLine();

                String[] reszek = sor.split(",");

                try {
                    if (reszek.length != 3) {
                        throw new HianyosAdatokException("A " + szamlalo + ". sor hiányos.");
                    }

                    String nev = reszek[0].trim();

                    if (reszek[1].trim().isEmpty() || reszek[2].trim().isEmpty()) {
                        throw new HianyosAdatokException("A " + szamlalo + ". sor hiányos vagy érvénytelen adatot tartalmaz.");
                    }

                    double ar = Double.parseDouble(reszek[1].trim());
                    int darab = Integer.parseInt(reszek[2].trim());

                    termekek.add(new Termekek(nev, ar, darab));
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        for (Termekek termek : termekek) {
            System.out.println(termek);
        }
    }
}
