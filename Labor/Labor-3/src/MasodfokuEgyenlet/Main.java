package MasodfokuEgyenlet;

public class Main {
    public static void main(String[] args) {
        MasodfokuEgyenlet egyenlet_1 = new MasodfokuEgyenlet(2, -4, 5);
        MasodfokuEgyenlet egyenlet_2 = new MasodfokuEgyenlet(2, 2, 2);

        System.out.println("x1=" + egyenlet_1.getRoot1());
        System.out.println("x2=" + egyenlet_1.getRoot2());
        System.out.println(egyenlet_1);

        System.out.println(egyenlet_2);

        // Házi: írjunk bele if utasításokat, úgy hogy a q1 kiírása szép legyen, legyen meg minden előjel, összeadás, stb!
    }
}
