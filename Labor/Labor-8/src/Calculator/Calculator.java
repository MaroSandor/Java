package Calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nem oszthatunk nullával!");
        }
        return a / b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }


}
