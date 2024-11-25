package Teglalap;

public class Main {
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(10, 5);

        System.out.println("t1 kerülete: " + t1.kerulet());
        System.out.println("t1 területe: " + t1.terulet());

        // Teglalap(a: ..., b: ...)
        System.out.println(t1);

        Teglalap t2 = new Teglalap(2 * t1.getA(), 2 * t1.getB());

        System.out.println("t2 kerülete: " + t2.kerulet());
        System.out.println("t2 területe: " + t2.terulet());

        System.out.println(t2);
    }
}
