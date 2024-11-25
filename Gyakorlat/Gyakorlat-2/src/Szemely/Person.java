package Szemely;

import java.util.Calendar;

public class Person {
    public String name;
    public String email;
    public int yearOfBirth;

    public int howOldAreYou() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - yearOfBirth;
    }
}
