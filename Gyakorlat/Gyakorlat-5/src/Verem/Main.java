package Verem;

public class Main
{
    public static void main(String[] args)
    {
        Verem v = new Verem();
        System.out.println(v.ures());
        v.betesz(1);
        v.betesz(4);
        v.betesz(5);
        System.out.println(v);
        System.out.println(v.meret());
        System.out.println(v.ures());
    }
}

