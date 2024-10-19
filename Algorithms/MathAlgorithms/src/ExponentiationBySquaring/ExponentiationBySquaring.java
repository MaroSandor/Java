package ExponentiationBySquaring;

public class ExponentiationBySquaring {
    public long power(long base, long exponent) {
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        return powerRecursive(base, exponent);
    }

    private long powerRecursive(long base, long exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent % 2 == 0) {
            return powerRecursive(base * base, exponent / 2);
        } else {
            return base * powerRecursive(base * base, (exponent - 1) / 2);
        }
    }
}