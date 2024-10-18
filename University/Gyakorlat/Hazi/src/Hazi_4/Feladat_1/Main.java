package Hazi_4.Feladat_1;

public class Main {
    public static void main(String[] args) {
        Feladat1 f1 = new Feladat1(5, "Albert");

        System.out.println("A " + f1.getSzam() + " szám faktoriálisa: " + f1.getFaktoriális());
        System.out.println("A(z) " + f1.getSzoveg() + " szövegből a(z) '" + f1.getLegnagyobbBetű() + "' áll a legutolsó helyen az ABC-ben.");
    }
}
