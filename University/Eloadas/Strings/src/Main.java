import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // String s = "Java 21";

        // for (char c : s.toCharArray()) {
        // System.out.println(c);
        // }

        List<Integer> szamok = new ArrayList<>();
        szamok.add(2);
        szamok.add(3);
        szamok.add(5);
        System.out.println(szamok);

        // List<Integer> copy = szamok; // Ez így nem másolat hanem egy referencia!!!
        List<Integer> copy = new ArrayList<>(szamok);

        System.out.println(szamok);

        // Egy kollekció az egy olyan objektum, amely más objektumok tárolására szolgál.
        Collections.sort(copy);
        System.out.println(copy);

        Collections.reverse(copy);
        System.out.println(copy);

        Collections.shuffle(copy);
        System.out.println(copy);

        // Java wrapper classes:
        // w3schools

        // Mivel a Java objektumorientált nyelv, nagyon sok helyen osztályt kell
        // megadni, a primitív típust nem fogadja el.
        // Ezért kitalálták az ún. work megoldást; a primitív típust becsomagolták egy
        // osztályba és úgy használjuk.



    }
}
