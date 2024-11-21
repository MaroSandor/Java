package Airplane;

public class Airplane {
    private int seatNumber;
    private String type;
    private double maxSpeed;

    public Airplane(int seatNumber, String type, double maxSpeed) {
        this.seatNumber = seatNumber;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Airplane{" + "seatNumber=" + seatNumber + ", type='" + type + '\'' + ", maxSpeed=" + maxSpeed + '}';
    }
}
