package Kivetelkezeles;

import java.util.Random;

public class Lift {
    private int emeletekSzama;
    private int aktualisEmelet;

    Random rnd = new Random();

    public Lift(int emeletekSzama) {
        this.emeletekSzama = emeletekSzama;
        this.aktualisEmelet = rnd.nextInt(emeletekSzama - 1) + 1;
    }

    public int getAktualisEmelet() {
        return aktualisEmelet;
    }

    public void setAktualisEmelet(int aktualisEmelet) {
        this.aktualisEmelet = aktualisEmelet;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public void setEmeletekSzama(int emeletekSzama) {
        this.emeletekSzama = emeletekSzama;
    }

    public void lefele() {
        if (this.aktualisEmelet == 1) {
            throw new HibasIranyException("Figyelmeztetés! ");
        }
        this.aktualisEmelet--;
    }

    public void felfele() {
        this.aktualisEmelet++;
    }

    @Override
    public String toString() {
        return "Lift (emeletek száma: " + emeletekSzama + ") -> aktuális emelet: " + aktualisEmelet;
    }
}
