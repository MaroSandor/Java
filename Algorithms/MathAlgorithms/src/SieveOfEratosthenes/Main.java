package SieveOfEratosthenes;

public class Main {
    public static void main(String[] args) {
        int n = 30;

        System.out.println("Finding all prime numbers up to " + n);

        // Sieve of Eratosthenes example
        SieveOfEratosthenes sieve = new SieveOfEratosthenes();
        sieve.sieve(n);
    }
}
