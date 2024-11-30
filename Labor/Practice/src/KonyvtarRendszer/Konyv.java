package KonyvtarRendszer;

public class Konyv implements Comparable<Konyv> {
    private String cim;
    private String szerzo;
    private int kiadasEve;

    public Konyv(String cim, String szerzo, int kiadasEve) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.kiadasEve = kiadasEve;
    }

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public int getKiadasEve() {
        return kiadasEve;
    }

    @Override
    public String toString() {
        return "Konyv{" + "cim='" + cim + '\'' + ", szerzo='" + szerzo + '\'' + ", kiadasEve=" + kiadasEve + '}';
    }

    @Override
    public int compareTo(Konyv o) {
        return Integer.compare(this.kiadasEve, o.kiadasEve);
    }
}
