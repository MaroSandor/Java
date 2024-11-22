package Kivetelkezeles;

import Kivetelkezeles.kivetel.HibasIranyException;

import java.util.Random;

public class Lift implements Mozog {
    private int emeletekSzama;
    private int aktualisEmelet;

    public Lift(int emeletekSzama) {
        Random rnd = new Random();

        this.emeletekSzama = emeletekSzama;
        this.aktualisEmelet = rnd.nextInt(this.emeletekSzama) + 1;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public int getAktualisEmelet() {
        return aktualisEmelet;
    }

    @Override
    public void lefele() throws HibasIranyException, Exception {
        Random rnd = new Random();

        int hiba = 99;
        int randomSzam = rnd.nextInt();

        if (randomSzam == hiba) {
            throw new Exception("A lift elromlott");
        }

        if (this.aktualisEmelet > 1) {
            this.aktualisEmelet--;
        } else {
            throw new HibasIranyException("Nem lehet lefele menni!", this.aktualisEmelet);
        }
    }

    @Override
    public void felfele() throws HibasIranyException, Exception {
        Random rnd = new Random();

        int hiba = 99;
        int randomSzam = rnd.nextInt();

        if (randomSzam == hiba) {
            throw new Exception("A lift elromlott");
        }

        if (this.aktualisEmelet < this.emeletekSzama) {
            this.aktualisEmelet++;
        } else {
            throw new HibasIranyException("Nem lehet felfelé menni!", this.aktualisEmelet);
        }
    }

    @Override
    public String toString() {
        return "Lift{" + "emeletekSzama=" + emeletekSzama + ", aktualisEmelet=" + aktualisEmelet + '}';
    }
}
