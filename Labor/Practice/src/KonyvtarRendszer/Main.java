package KonyvtarRendszer;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static Set<Konyv> beolvasKonyveket(String fajlNev) throws IOException, FileNotFoundException, HibasAdatException {
        Set<Konyv> konyvek = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fajlNev))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(";");

                if (adatok.length < 3) {
                    throw new HibasAdatException("Hiányos adat a sorban: " + sor);
                }

                String cim = adatok[0];
                String szerzo = adatok[1];
                int kiadasEve = Integer.parseInt(adatok[2]);

                if (adatok.length != 5 || !adatok[3].equals("Kolcsonozheto")) {
                    konyvek.add(new Konyv(cim, szerzo, kiadasEve));
                } else {
                    double kolcsonzesiDij = Double.parseDouble(adatok[4]);
                    konyvek.add(new KolcsonozhetoKonyv(cim, szerzo, kiadasEve, kolcsonzesiDij));
                }
            }
            return konyvek;
        }
    }

    public static void irRendezettKonyvekFajlba(Set<Konyv> konyvek, String fajlNev) throws IOException {
        List<Konyv> rendezettKonyvek = konyvek.stream().sorted().toList();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fajlNev))) {
            for (Konyv konyv : rendezettKonyvek) {
                bw.write(konyv.toString());
                bw.newLine();
            }
        }
    }

    public static Konyv keresKonyvet(Set<Konyv> konyvek, String cim) {
        for (Konyv konyv : konyvek) {
            if (konyv.getCim().equalsIgnoreCase(cim)) {
                return konyv;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        try {
            Set<Konyv> konyvek = beolvasKonyveket("konyvek.txt");
            irRendezettKonyvekFajlba(konyvek, "rendezett_konyvek.txt");

            // Parancssori keresés
            if (args.length > 0) {
                String keresettCim = args[0];
                Konyv keresettKonyv = keresKonyvet(konyvek, keresettCim);
                if (keresettKonyv != null) {
                    System.out.println("A keresett könyv megtalálva: " + keresettKonyv);
                } else {
                    System.out.println("A keresett könyv nem található a könyvtárban.");
                }
            }

            // Kölcsönzés teszt
            for (Konyv konyv : konyvek) {
                if (konyv instanceof KolcsonozhetoKonyv) {
                    try {
                        ((KolcsonozhetoKonyv) konyv).kolcsonoz();
                    } catch (KolcsonzesiHibaException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        } catch (IOException | HibasAdatException e) {
            System.err.println("Hiba történt: " + e.getMessage());
        }
    }
}
