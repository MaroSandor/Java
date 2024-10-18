package Hazi_2.Feladat_3;

public class Main {
    public static void main(String[] args) {
        LinearEquation le1 = new LinearEquation(1, 2, 3, 4, 5, 6);
        LinearEquation le2 = new LinearEquation(2, 3, 2, 3, 2, 1);
        LinearEquation le3 = new LinearEquation(10, 4, 3, 8, 4, 4);

        System.out.println(
                le1.isSolvable()
                        ? String.format("1. egyenletrendszer megoldásai: X: %s, Y: %s", le1.getX(), le1.getY())
                        : "The equation has no solution.");

        System.out.println(
                le2.isSolvable()
                        ? String.format("2. egyenletrendszer megoldásai: X: %s, Y: %s", le2.getX(), le2.getY())
                        : "The equation has no solution.");

        System.out.println(
                le3.isSolvable()
                        ? String.format("3. egyenletrendszer megoldásai: X: %s, Y: %s", le3.getX(), le3.getY())
                        : "The equation has no solution.");
    }
}
