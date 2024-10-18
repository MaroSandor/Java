package MasodfokuEgyenlet;

public class MasodfokuEgyenlet {
    private double a;
    private double b;
    private double c;

    public MasodfokuEgyenlet(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return ((-1 * this.b) + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return ((-1 * this.b) - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        }
    }

    @Override
    public String toString() {
        return this.a + "x^2" + this.b + "x" + this.c;
    }
}
