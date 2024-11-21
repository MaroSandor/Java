package Airplane;

import java.util.Scanner;

public class Main {
    public static void calculate(Airplane airplane, double distance) {
        double time = distance / airplane.getMaxSpeed();
        System.out.println("A(z) " + airplane.getType() + " típusú repülőgép " + time + " óra alatt ér a repülőtérhez.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a távolságot a repülőtérig: ");
        int distance = scanner.nextInt();

        Airport airport = new Airport(3);

        Airplane ap1 = new Airplane(455, "Boeing", 1200);
        Airplane ap2 = new Airplane(318, "Airbus", 950);
        Airplane ap3 = new Airplane(10, "Bombardier", 1650);
        Airplane ap4 = new Airplane(1, "F-30 Raptor", 3000);

        calculate(ap1, distance);
        airport.addAirplane(ap1);

        calculate(ap2, distance);
        airport.addAirplane(ap2);

        calculate(ap3, distance);
        airport.addAirplane(ap3);

        calculate(ap4, distance);
        airport.addAirplane(ap4);

        System.out.println(airport);

        scanner.close();
    }
}
