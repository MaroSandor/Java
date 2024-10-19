package ExponentiationBySquaring;

public class Main {
    public static void main(String[] args) {
        long base = 2;
        long exponent = 10;

        System.out.println("Base: " + base + ", Exponent: " + exponent);

        // Exponentiation by Squaring example
        ExponentiationBySquaring expBySquaring = new ExponentiationBySquaring();
        long result = expBySquaring.power(base, exponent);

        System.out.println("Result of " + base + "^" + exponent + " using Exponentiation by Squaring: " + result);
    }
}