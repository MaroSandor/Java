package Exception;

public class TestException {
    public static void main(String[] args) {

        try {
            int a = 4 / 0;
            System.out.println("egy");
            int[] t = new int[] {1, 3, 5};
            System.out.println("kettő");
            System.out.println(t[3]);
            int b = Integer.parseInt("ketto");
            System.out.println("három");
        } catch (ArithmeticException e) {

        } catch (IndexOutOfBoundsException e) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // int a = 4 / 0;

        // int t[] = new int[] {1, 3, 5};

        // System.out.println(t[3]);

        // try {
        //     System.out.println(t[3]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index out of bounds");
        // }

        // int b = Integer.parseInt("ketto");

        // try {
        //     System.out.println(b);
        // } catch (NumberFormatException e) {
        //     System.out.println("Number format exception");
        // }
    }
}
