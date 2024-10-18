package Hazi_4.Feladat_4;

public class PumpkinPattern {
    String name;
    String theme;
    int popularity;
    int cuts;

    public PumpkinPattern(String name, String theme, int popularity, int cuts) {
        this.name = name;
        this.theme = theme;
        this.popularity = popularity;
        this.cuts = cuts;
    }

    @Override
    public String toString() {
        return name + " (" + popularity + "): " + cuts;
    }
}