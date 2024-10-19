package EuclideanAlgorithm;

public class EuclideanAlgorithm {
    // Method to return GCD of two numbers
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
