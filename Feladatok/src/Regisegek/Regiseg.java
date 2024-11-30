package Regisegek;

public class Regiseg {
    private String nev;
    private String kategoria;
    private int beszerzesiAr;
    private int eladasiAr;

    public Regiseg(String nev, String kategoria, int beszerzesiAr, int eladasiAr) {
        this.nev = nev;
        this.kategoria = kategoria;
        this.beszerzesiAr = beszerzesiAr;
        this.eladasiAr = eladasiAr;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getBeszerzesiAr() {
        return beszerzesiAr;
    }

    public void setBeszerzesiAr(int beszerzesiAr) {
        this.beszerzesiAr = beszerzesiAr;
    }

    public int getEladasiAr() {
        return eladasiAr;
    }

    public void setEladasiAr(int eladasiAr) {
        this.eladasiAr = eladasiAr;
    }

    @Override
    public String toString() {
        return "Regiseg{" + "nev='" + nev + '\'' + ", kategoria='" + kategoria + '\'' + ", beszerzesiAr=" + beszerzesiAr + ", eladasiAr=" + eladasiAr + '}';
    }
}
