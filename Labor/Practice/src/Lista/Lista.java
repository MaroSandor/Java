package Lista;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("alma");
        lista.add("körte"); // <- Ekkor a körte eltolódik 1 index-szel.
        lista.add(1, "szilva"); // Beszúrás az 1-es indexre.

        for (String elem : lista) {
            System.out.println(elem);
        }

        System.out.println(lista);
    }
}
