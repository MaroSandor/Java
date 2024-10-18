package Hazi_3.Feladat_2;

public class Orarend {
    private String dayOfWeek; // a hét egyes napjainak (hétfő - péntek) tárolására alkalmas változó
    private Ora[] lessons; // az Ora objektumok tárolására alkalmas tömb
    private int counter; // az órákat számláló egész típusú változó

    public Orarend(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.counter = 0;
        this.lessons = new Ora[12];
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Ora[] getLessons() {
        return lessons;
    }

    public void setLessons(Ora[] lessons) {
        if (lessons.length <= 12) {
            this.lessons = lessons;
            this.counter = lessons.length;
        } else {
            System.out.println("Nem lehet több, mint 12 órát beállítani.");
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public String toString() {
        String result = "Órarend:\n" + dayOfWeek + ": ";

        for (int i = 0; i < counter; i++) {
            result += "\n" + lessons[i].toString();
        }

        return result;
    }

    // @Override
    // public String toString() {
    // return "Orarend [dayOfWeek=" + dayOfWeek + ", lessons=" +
    // Arrays.toString(lessons) + ", counter=" + counter
    // + "]";
    // }

    public boolean oratHozzaad(Ora newLesson) {
        if (this.counter >= 12) {
            System.out.println("Nincs hely több órának az órarendben.");
            return false;
        }

        for (int i = 0; i < this.counter; i++) {
            if (this.lessons[i].getStartTime() == newLesson.getStartTime()) {
                System.out.println("Már van óra ebben az időpontban: " + newLesson.getStartTime());
                return false;
            }
        }

        this.lessons[this.counter++] = newLesson;
        return true;
    }
}
