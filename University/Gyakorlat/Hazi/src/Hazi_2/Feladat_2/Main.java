package Hazi_2.Feladat_2;

public class Main {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("1. sokszög területe: " + rp1.getArea() + ", kerülete: " + rp1.getPerimeter());
        System.out.println("2. sokszög területe: " + rp2.getArea() + ", kerülete: " + rp2.getPerimeter());
        System.out.println("3. sokszög területe: " + rp3.getArea() + ", kerülete: " + rp3.getPerimeter());
    }
}
