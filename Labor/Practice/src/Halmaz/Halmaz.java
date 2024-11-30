package Halmaz;

import java.util.HashSet;
import java.util.Set;

public class Halmaz {
    public static void main(String[] args) {
        Set<Integer> halmaz = new HashSet<>();

        halmaz.add(1);
        halmaz.add(2);
        halmaz.add(3);
        halmaz.add(1); // Duplikált elem, nem kerül be.

        System.out.println(halmaz); // [1, 2, 3] (a sorrend nem garantált)

        for (Integer elem : halmaz) {
            System.out.println(elem);
        }
    }
}
