package Csaszar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Csaszar_List {
    public static void main(String[] args) {
        // Csaszar[] t = new Csaszar[30];
        List<Csaszar> lista = new ArrayList<>(); // Lista készítése Csaszar osztályokra

        Scanner scanner = new Scanner(System.in);

        int index = 0;
        String nev; // A beolvasott neve
        int datum; // A beolvasott születési éve

        while ((datum = scanner.nextInt()) != 0) {
            nev = scanner.next();
            // t[index++] = new Csaszar(nev, datum);
            lista.add(new Csaszar(nev, datum)); // Hozzáadás a listához
        }

        // Csaszar min = t[0];
        Csaszar min = lista.get(0); // A legkisebb születési évvel rendelkező Csaszar kiválasztása a listából

        for (int i = 1; i < lista.size(); i++) { // size: visszaadja a lista elemeinek számát
            if (lista.get(i).getBirthOfYear() < min.getBirthOfYear()) { // összehasonlítjuk a lista i-edik elem
                // születési évét a minimum születési évével
                min = lista.get(i); // Ha a kiválasztott Csaszar születési éve kisebb, akkor átírja a legkisebbnek a
                // kiválasztottát
            }
        }

        // for (int i = 0; i < index; i++) {
        // if (t[i].getBirthOfYear() < min.getBirthOfYear()) {
        // min = t[i];
        // }
        // }

        System.out.println(min);

        System.out.println("A császárok listája:");

        for (Csaszar i : lista) {
            System.out.println(i);
        }

        scanner.close();
    }
}
