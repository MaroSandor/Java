package MintaZH;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class TestBefektetesek {
    public static void main(String[] args) {
        Set<Befektetes> halmaz = new HashSet<>(); // halmaz

        try (BufferedReader br = new BufferedReader(new FileReader(new File("befek.txt")))) {
            String sor;
            int sorSzamlalo = 0;

            while ((sor = br.readLine()) != null) {
                String[] reszek = sor.split(",");
                sorSzamlalo++;

                try {
                    if (reszek.length != 3) {
                        throw new HianyosAdatok("A" + sorSzamlalo + ". sor hiányos.");
                    }
                } catch (HianyosAdatok e) {
                    throw new RuntimeException(e);
                }

                double toke = Double.parseDouble(reszek[0]);
                int futamido = Integer.parseInt(reszek[1]);
                double kamat = Double.parseDouble(reszek[2]);

                // folytatni! HÁZI!
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
