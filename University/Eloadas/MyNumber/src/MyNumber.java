public class MyNumber {
    private int szam;

    public MyNumber(int value) {
        this.szam = value;
    }

    public MyNumber add(int number) {
        this.szam += number;
        return this;
    }

    public MyNumber multiply(int number) {
        this.szam += number;
        return this;
    }

    public int value() {
        return this.szam;
    }
}
