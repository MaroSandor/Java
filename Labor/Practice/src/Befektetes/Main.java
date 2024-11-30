package Befektetes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("befektetesek.txt"));) {
            String sor = sc.nextLine();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }
    }
}
