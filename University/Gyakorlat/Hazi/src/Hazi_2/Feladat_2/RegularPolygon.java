package Hazi_2.Feladat_2;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x;
    private double y;

    public RegularPolygon() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        // return ((Math.pow(side, 2) * Math.sqrt(3)) / 4) * side;
        return (1.0 / 4.0) * this.n * Math.pow(this.side, 2) * (1 / Math.tan(Math.toRadians(180.0 / this.n)));
    }

    @Override
    public String toString() {
        return "Sokszög paraméterei: [n=" + n + ", side=" + side + ", x=" + x + ", y=" + y + "]";
    }
}