public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,  5);
        Rectangle r2 = new Rectangle(2 * r1.getA(), 2 * r1.getB());

        System.out.println(r2);
    }
}
