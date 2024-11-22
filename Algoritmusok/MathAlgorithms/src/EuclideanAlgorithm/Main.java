package EuclideanAlgorithm;

public class Main {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;

        System.out.println("Calculating GCD of " + a + " and " + b);

        // EuclideanAlgorithm example
        EuclideanAlgorithm euclideanAlgorithm = new EuclideanAlgorithm();
        int result = euclideanAlgorithm.gcd(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}