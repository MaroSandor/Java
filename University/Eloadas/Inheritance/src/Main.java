public class Main {
    public static void main(String[] args) {
        Szakacs szakacs = new Szakacs();

        szakacs.keszitLeves();
        szakacs.keszitFoetel();
        szakacs.keszitSpecialitas();
        System.out.println("");

        MagyarSzakacs mszakacs = new MagyarSzakacs();
        mszakacs.keszitFoetel();
        mszakacs.keszitPorkolt();
        mszakacs.keszitSpecialitas();
    }
}
