public class MagyarSzakacs extends Szakacs {
    public void keszitPorkolt() {
        System.out.println("Pörkölt készítése...");
    }

    @Override
    public void keszitSpecialitas() {
        System.out.println("Hortobágyi húsospalacsinta készítése..."); // Szakács specialitása
    }
}
