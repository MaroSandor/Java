package VendeglatoIpariEgyseg;

import java.util.Arrays;

public class Etterem extends VendeglatoIpariEgyseg {
    private final String[] etlap;

    public Etterem(String nev, int ferohelyekSzama, String[] etlap) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Etterem(" + super.getName() + ") " +  "- etlap=" + Arrays.toString(etlap);
    }
}
