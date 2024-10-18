package Hazi_2.Feladat_1;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont(5, 10);
        Pont p2 = new Pont(10, 15);
        Pont p3 = new Pont(15, 20);
        Pont p4 = new Pont(20, 25);

        p1.setY(p1.getY() + 5);
        p2.setY(p2.getY() + 5);
        p3.setX(p3.getX() - 3.4);
        p4.setX(p4.getX() - 3.4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
