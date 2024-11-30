package FajlKezeles;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<String> szereplok = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String sor;

            while((sor = br.readLine()) != null) {
                // System.out.println(sor);
                String[] reszek = sor.split(":");
                String[] szereplogarda = reszek[1].split(",");

                for (String szereplo : szereplogarda) {
                    szereplok.add(szereplo);
                }

                System.out.println(reszek[0]);

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
                    bw.write(szereplok.toString());
                } catch (IOException ex) {
                    System.out.println("Fájlba irás hiba: " + ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
