package Mesedelutan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hiba. 1 paramétert adj meg!");
        } else {

            String szereplo = args[0];
            List<Mese> mesek = new ArrayList<>();

            try (Scanner scanner = new Scanner(new File("input.txt"))) {
                while (scanner.hasNextLine()) {
                    String sor = scanner.nextLine();
                    String[] reszek = sor.split(":");
                    String cim = reszek[0];
                    List<String> szereplok = Arrays.asList(reszek[1].split(","));

                    mesek.add(new Mese(cim, szereplok));

                    List<Mese> talalatok = new ArrayList<>();

                    for (Mese e : mesek) {
                        if (e.getSzereplok().contains(szereplo)) {
                            talalatok.add(e);
                        }
                    }

                    Collections.sort(talalatok);

                    try (PrintWriter pw = new PrintWriter(new File("output.txt"))) {
                        for (Mese m : talalatok) {
                            pw.printf("%s\n", m.toString());
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
