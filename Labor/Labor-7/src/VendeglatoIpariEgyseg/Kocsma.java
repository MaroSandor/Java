package VendeglatoIpariEgyseg;

import java.util.Arrays;

public class Kocsma extends VendeglatoIpariEgyseg implements Comparable<Kocsma> { // az `implements Comparable<Kocsma>` pluszba lett hozzáírva (kiegészítés 11.07. gyakorlat)
    private final String[] sorlap;

    public Kocsma(String nev, int ferohelyekSzama, String[] sorlap) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Kocsma: " + super.toString() + ", sorlap=" + Arrays.toString(sorlap);
    }

    @Override
    public int hashCode() { // halmazhoz szükséges !!
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(sorlap);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Kocsma k))
            return false;

        return super.getName().equals(k.getName()) && super.getFerohelyekSzama() == k.getFerohelyekSzama();
    }

    @Override
    public int compareTo(Kocsma o) {
        if (this.sorlap.length == o.getSorlap().length) {
            if (super.getFerohelyekSzama() == o.getFerohelyekSzama()) {
                return super.getName().compareTo(o.getName());
            } else {
                return Integer.compare(super.getFerohelyekSzama(), o.getFerohelyekSzama());
            }
        } else {
            int h1 = this.sorlap.length;
            int h2 = o.getSorlap().length;

            return Integer.compare(h1, h2);
        }
    }
}
