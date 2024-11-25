package Szakacs;

public class MagyarSzakacs extends Szakacs {
    public void keszitPorkolt() {
        System.out.println("porkolt keszitese");
    }

    @Override
    public void keszitSpecialitas() {
        System.out.println("hortobagyi husos palacsinta keszitese");
    }
}