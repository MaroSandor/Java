package KonyvtarRendszer;

import java.util.Random;

public class KolcsonozhetoKonyv extends Konyv implements Kolcsonozheto {
    private double kolcsonzesiDij;

    public KolcsonozhetoKonyv(String cim, String szerzo, int kiadasEve, double kolcsonzesiDij) {
        super(cim, szerzo, kiadasEve);
        this.kolcsonzesiDij = kolcsonzesiDij;
    }

    @Override
    public void kolcsonoz() throws KolcsonzesiHibaException {
        Random rand = new Random();
        if (rand.nextInt(100) < 20) { // 20% chance of failure
            throw new KolcsonzesiHibaException("A kölcsönzés sikertelen: " + getCim());
        } else {
            System.out.println("A könyv kölcsönzése sikeres: " + getCim());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; Kolcsonzesi dij: " + kolcsonzesiDij;
    }
}