package Rendezes;

import java.util.*;

class Ember implements Comparable<Ember> {
    String nev;
    int kor;

    Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    @Override
    public int compareTo(Ember o) {
        return Integer.compare(this.kor, o.kor);
    }

    @Override
    public String toString() {
        return nev + " (" + kor + ")";
    }
}

public class ComparablePelda {
    public static void main(String[] args) {
        List<Ember> emberek = new ArrayList<>();
        emberek.add(new Ember("Anna", 25));
        emberek.add(new Ember("Béla", 30));
        emberek.add(new Ember("Cili", 20));

        Collections.sort(emberek);

        for (Ember ember : emberek) {
            System.out.println(ember);
        }
    }
}
