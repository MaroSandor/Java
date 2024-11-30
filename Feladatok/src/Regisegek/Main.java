package Regisegek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws HianyosAdatException {
        Set<Regiseg> regisegek = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("regisegek.txt"))) {
            try {
                String sor;

                while((sor = br.readLine()) != null) {
                    String[] reszek = sor.split(",");

                    // System.out.println(Arrays.toString(reszek));
                    // System.out.println(reszek[1]);

                    if (reszek.length != 4) {
                        throw new HianyosAdatException("Hiba. Hiányos sor: " + Arrays.toString(reszek));
                    }

                    regisegek.add(new Regiseg(reszek[0], reszek[1], Integer.parseInt(reszek[2]), Integer.parseInt(reszek[3])));
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(regisegek);
    }
}
