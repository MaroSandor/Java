package Airplane;

import java.util.Arrays;

public class Airport {
    private final Airplane[] airplanes;
    private int counter = 0;

    public Airport(int size) {
        this.airplanes = new Airplane[size];
    }

    public void addAirplane(Airplane airplane) {
        if (counter < airplanes.length) {
            airplanes[counter] = airplane;
            counter++;
        } else {
            System.out.println("A repülőtér megtelt.");
            System.out.println("Nem tudjuk fogadni a következő repülőgépet: " + airplanes.toString());
        }
    }

    @Override
    public String toString() {
        return "Repuloter{" + "repulok=" + Arrays.toString(airplanes) + ", szamlalo=" + counter + '}';
    }
}
