package Calculator;

public class MyTestCalculator {
    // UnitTest

    public static void testAdd() {
        Calculator c = new Calculator();

        int result1 = c.add(5, 3);
        assert result1 == 8 : "Hiba: 5+3 nem 8";

        int result2 = c.add(5, -3);
        assert result2 == 2 : "Hiba: 5+(-3) nem 2";
    }

    public static void testMultiply() {
        Calculator c = new Calculator();

        int result1 = c.multiply(5, 8);
        assert result1 == 40 : "Hiba: 5*8 nem 40";

        int result2 = c.multiply(-2, 5);
        assert result2 == -10 : "Hiba: (-2)*5 nem -10";

        int result3 = c.multiply(0, 5);
        assert result3 == 0 : "Hiba: 0*5 nem 0";

        int result4 = c.multiply(-7, -8);
        assert result4 == 56 : "Hiba: (-7)*(-8) nem 56";
    }

    public static void testDivide() {
        Calculator c = new Calculator();

        int result1 = c.divide(24, 2);
        assert result1 == 12 : "Hiba: 24/2 nem 12";

        int result2 = c.divide(-20, 2);
        assert result2 == -10 : "Hiba: (-20)/2 nem -10";

        int result3 = c.divide(0, 5);
        assert result3 == 0 : "Hiba: 0/5 nem 0";

        try {
            int result4 = c.divide(-7, -2);
            assert false: "Hiba! (-7)/(-2) nem 4";
        } catch (ArithmeticException e) {
            System.out.println("Kivétel kidova: " + e.getMessage());
        }

        int result5 = c.divide(-8, -2);
        assert result5 == 4 : "Hiba: (-8)/(-2) nem 4";
    }

    public static void main(String[] args) {
        testAdd();
        testMultiply();
        testDivide();
    }
}
