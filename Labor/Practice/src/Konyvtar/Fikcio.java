package Konyvtar;

public class Fikcio extends Konyv {
    private String mufaj;

    public Fikcio(String cim, String szerzo, int ISBN, int kiadasiEv, String mufaj) {
        super(cim, szerzo, ISBN, kiadasiEv);
        this.mufaj = mufaj;
    }

    public String getMufaj() {
        return mufaj;
    }

    @Override
    public String toString() {
        return "Fikcio{" + "mufaj='" + mufaj + '\'' + '}';
    }
}
