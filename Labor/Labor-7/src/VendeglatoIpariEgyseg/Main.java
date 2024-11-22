package VendeglatoIpariEgyseg;

import java.util.*;

public class Main {
    // 1. megoldás: tömbbel
    public static Kocsma[] adottItaltKinaloKocsma(String ital, VendeglatoIpariEgyseg[] v) {
        int szamlalo = 0;

        for (VendeglatoIpariEgyseg i : v) { // végigmegyünk a VendeglatoIpariEgyseg tömbön
            if (i instanceof Kocsma) { // instanceof <- megvizsgálja az adott dologról (ezesetben i), hogy Kocsma-e
                // nem szükséges nekünk castolni, magától megcsinálja a Java legújabb verziója
                for (String sor : ((Kocsma) i).getSorlap()) { // végigmegyünk a Sörlap tömbön és Stringként kezelem
                    if (sor.equals(ital)) {
                        szamlalo++;
                    }
                }
            }
        }

        Kocsma[] kocsma = new Kocsma[szamlalo];
        // VVV | Felesleges munka a tömb miatt | VVV

        int index = 0;

        for (VendeglatoIpariEgyseg i : v) {
            if (i instanceof Kocsma) {
                for (String sor : ((Kocsma) i).getSorlap()) {
                    if (sor.equals(ital)) {
                        kocsma[index++] = (Kocsma) i;
                    }
                }
            }
        }

        return kocsma;
    }

    // 2. megoldás: listával
    // lista esetén importálni a következőket: List, ArrayList
    public static List<Kocsma> adottItaltKinaloKocsma2(String ital, VendeglatoIpariEgyseg[] v) {
        List<Kocsma> kocsmak = new ArrayList<>();

        for (VendeglatoIpariEgyseg i : v) {
            if (i instanceof Kocsma) {
                for (String sor : ((Kocsma) i).getSorlap()) {
                    if (sor.equals(ital)) {
                        kocsmak.add((Kocsma) i);
                    }
                }
            }
        }

        return kocsmak;
    }

    // 3. megoldás: halmazzal
    // halmaz esetén importálni a következőket: Set, HashSet
    public static Set<Kocsma> adottItaltKinaloKocsma3(String ital, VendeglatoIpariEgyseg[] v) {
        Set<Kocsma> kocsmak = new HashSet<>();

        for (VendeglatoIpariEgyseg i : v) {
            if (i instanceof Kocsma) {
                for (String sor : ((Kocsma) i).getSorlap()) {
                    if (sor.equals(ital)) {
                        kocsmak.add((Kocsma) i);
                    }
                }
            }
        }

        return kocsmak;
    }

    public static void main(String[] args) {
        // ve tömb létrehozása a VendeglatoIpariEgyseghez
        VendeglatoIpariEgyseg [] ve = new VendeglatoIpariEgyseg[7];

        ve[0] = new Etterem("Arany Oroszlán", 75, new String[] {"Bableves", "Kenyér"/*, stb... */});
        ve[1] = new Kocsma("Roncs", 60, new String[] {"Bordodi", "Soproni", "Peroni"});
        ve[2] = new Kocsma("Törik-Szakad", 25, new String[] {"Dreher", "Soproni", "Kőbányai"});
        ve[3] = new Etterem("Campus", 32, new String[] {"Húsleves", "Rizotto"});
        ve[4] = new Kocsma("Mob", 45, new String[] {"Borsodi", "Arany Ászok", "Tuborg"});
        ve[5] = new Kocsma("Pikolo", 80, new String[] {"Tuborg", "Borsodi", "Arany Ászok"});
        ve[6] = new Kocsma("Pikolo", 80, new String[] {"Tuborg", "Borsodi", "Arany Ászok"});

        for (Kocsma k : adottItaltKinaloKocsma3("Borsodi", ve)) {
            System.out.println(k);
        }

        System.out.println(((Kocsma) ve[1]).compareTo(((Kocsma) ve[2])));

        Set<Kocsma> set2 = new TreeSet<>();
        set2.addAll(adottItaltKinaloKocsma2("Borsodi", ve));

        for (Kocsma k : set2) {
            System.out.println(k);
        }
    }
}