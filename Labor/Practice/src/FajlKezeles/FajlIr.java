package FajlKezeles;

import java.io.*;

public class FajlIr {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pelda.txt"))) {
            writer.write("Ez egy sor a fájlban.");
            writer.newLine();
            writer.write("Ez egy második sor.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

