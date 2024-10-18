public class Rectangle {
    private int side_a, side_b;

    public Rectangle(int a, int b) {
        this.side_a = a;
        this.side_b = b;
    }

    public int getA() {
        return this.side_a;
    }

    public int getB() {
        return this.side_b;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: a: %d, b: %d", this.side_a, this.side_b);
    }

    // Osztálymetódus: magához az osztályhoz tartozik, kapcsolódik hozzá a static kulcsszó
}
