package VendeglatoIpariEgyseg;

public class VendeglatoIpariEgyseg {
    private final String nev;
    private final int ferohelyekSzama;
    private boolean dohanyzo;

    public VendeglatoIpariEgyseg(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getName() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "name='" + nev + '\'' + ", ferohelyekSzama=" + ferohelyekSzama + ", dohanyzo=" + dohanyzo + '}';
    }
}
