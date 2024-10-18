package Hazi_3.Feladat_2;

public class Ora {
    private int id; // id: óra kódja (egész szám),
    private int startTime; // startTime: óra kezdete (8 és 19 közötti egész szám)
    private String name; // name: óra neve (szöveg)

    public Ora(int id, int startTime, String name) {
        this.id = id;

        if (startTime < 8) {
            this.startTime = 8;
        } else if (startTime > 19) {
            this.startTime = 19;
        } else {
            this.startTime = startTime;
        }

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        if (startTime < 8) {
            this.startTime = 8;
        } else if (startTime > 19) {
            this.startTime = 19;
        } else {
            this.startTime = startTime;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Óra neve: " + name + " (kód: " + id + "), kezdés időpontja: " + startTime + ".";
    }

}