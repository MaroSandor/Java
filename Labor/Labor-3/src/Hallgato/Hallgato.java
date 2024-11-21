package Hallgato;

public class Hallgato {
    private String nev;
    private String nkod;
    private double atlag;
    private int evfolyam;

    public Hallgato(String nev, String nkod, double atlag, int evfolyam) {
        this.nev = nev;
        this.nkod = nkod;
        this.atlag = atlag;
        this.evfolyam = evfolyam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNkod() {
        return nkod;
    }

    public void setNkod(String nkod) {
        this.nkod = nkod;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }

    @Override
    public String toString() {
        return "Hallgato{" + "nev=" + nev + ", nkod=" + nkod + ", atlag=" + atlag + ", evfolyam=" + evfolyam + '}';
    }

    void koszon() {
        System.out.println("Csa-csumi-csa!");
    }

    void koszon(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Csa-csumi-csa!");
        }
    }
}