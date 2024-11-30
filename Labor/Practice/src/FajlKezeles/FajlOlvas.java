package FajlKezeles;

import java.io.*;

public class FajlOlvas {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String sor;

            while ((sor = reader.readLine()) != null) {
                System.out.println(sor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
