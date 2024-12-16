package Vendéglátás;

import java.util.Arrays;

public class Kocsma extends VendeglatoIpariEgyseg{
    private String[] sorlap;

    public Kocsma(String nev, int ferohelyekSzama, String[] sorlap) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Kocsma{" + "sorlap=" + Arrays.toString(sorlap) + '}';
    }
}
