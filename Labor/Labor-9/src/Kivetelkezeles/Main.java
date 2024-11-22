package Kivetelkezeles;

import Kivetelkezeles.kivetel.HibasIranyException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Lift> liftek = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("input.txt")); Formatter formatter = new Formatter(new File("output1.txt"))) {

            int liftekSzama = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < liftekSzama; i++) {
                liftek.add(new Lift(Integer.parseInt(scanner.nextLine())));
            }

            while (scanner.hasNextLine()) {
                String sor = scanner.nextLine();
                String[] tmp = sor.split(";");
                int index = Integer.parseInt(tmp[0]) - 1;

                try {
                    if (tmp[1].equals("fel")) {
                        liftek.get(index).felfele();
                    } else {
                        liftek.get(index).lefele();
                    }
                } catch (HibasIranyException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println(liftek.get(index));

                formatter.format("A lift %s, A lift aktuális emelete: %d\n", liftek.get(index), liftek.get(index).getAktualisEmelet());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
