package Konyvtar;

public class Konyv {
    private String cim;
    private String szerzo;
    private int ISBN;
    private int kiadasiEv;

    public Konyv(String cim, String szerzo, int ISBN, int kiadasiEv) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.ISBN = ISBN;
        this.kiadasiEv = kiadasiEv;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getKiadasiEv() {
        return kiadasiEv;
    }

    public void setKiadasiEv(int kiadasiEv) {
        this.kiadasiEv = kiadasiEv;
    }

    @Override
    public String toString() {
        return "Könyv {" + "cim='" + cim + '\'' + ", szerzo='" + szerzo + '\'' + ", ISBN=" + ISBN + ", kiadasiEv=" + kiadasiEv + '}';
    }
}
