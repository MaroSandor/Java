package TermekAdatok_Fajlkezeles;

public class Termekek implements Comparable<Termekek> {
    private String nev;
    private double ar;
    private int darab;

    public Termekek(String nev, double ar, int darab) {
        this.nev = nev;
        this.ar = ar;
        this.darab = darab;
    }

    public String getNev() {
        return nev;
    }

    public double getAr() {
        return ar;
    }

    public int getDarab() {
        return darab;
    }

    @Override
    public String toString() {
        return "Termék {" + "ár: " + ar + ", neve: '" + nev + '\'' + ", készlet: " + darab + '}';
    }

    @Override
    public int compareTo(Termekek o) {
        return Integer.parseInt(String.valueOf(this.nev.equals(o.getNev())));
    }
}
