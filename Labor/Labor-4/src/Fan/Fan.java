package Fan;

public class Fan {
    public static final int SLOW = 1; // ha nincs megadva a láthatóság, akkor public
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;
    private boolean on  = false;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = Fan.SLOW; // osztályszintű konstans értékre ilyen módon hivatkozunk
        this.color = "blue";
        this.on = false;
        this.radius = 5;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" + "speed=" + speed + ", radius=" + radius + ", color='" + color + '\'' + '}';
        } else {
            return "Fan is off.";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            return false;
        }

        Fan f = (Fan) obj;

        return this.radius == f.getRadius() && this.color.equals(f.getColor());
    }
}
