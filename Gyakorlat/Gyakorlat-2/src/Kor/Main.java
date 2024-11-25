package Kor;

public class Main {
    static double terulet(double r) {
        return r * r * Math.PI;
    }

    static double kerulet(double r) {
        return 2 * r * Math.PI;
    }

    public static void main(String[] args) {
        double r = 2.7;

        double ker = kerulet(r);
        double ter = terulet(r);

        System.out.println("A kör kerülete: " + ker);
        System.out.println("A kör területe: " + ter);
    }
}
