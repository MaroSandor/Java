package Konyvtar;

public class Szakirodalom extends Konyv {
    private String szakterulet;

    public Szakirodalom(String cim, String szerzo, int ISBN, int kiadasiEv, String szakterulet) {
        super(cim, szerzo, ISBN, kiadasiEv);
        this.szakterulet = szakterulet;
    }

    public String getSzakterulet() {
        return szakterulet;
    }

    @Override
    public String toString() {
        return "Szakirodalom{" + "szakterulet='" + szakterulet + '\'' + '}';
    }
}
