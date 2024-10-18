package Hazi_2.Feladat_4;

public class Rectangle {
    public double width = 1.0;
    public double height = 1.0;

    public Rectangle() {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * ( this.width * this.height );
    }

    @Override
    public String toString() {
        return "Téglalap " + "szélesség = " + width + " cm, magasság = " + height + " cm, terület = " + getArea() +  " cm², kerület = " + getPerimeter() + " cm";
    }
}
