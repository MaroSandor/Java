package Szakacs;

public class Main
{
    public static void main(String[] args)
    {
        Szakacs szakacs = new Szakacs();
        szakacs.keszitSpecialitas();

        System.out.println("---");

        MagyarSzakacs magyar = new MagyarSzakacs();
        // magyar.keszitLeves();
        // magyar.keszitFoetel();
        // magyar.keszitPorkolt();
        magyar.keszitSpecialitas();
    }
}
