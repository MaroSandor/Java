package Szemely;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Anna";
        p1.email = "anna@hello.com";
        p1.yearOfBirth = 1990;

        System.out.println(p1.howOldAreYou());
    }
}
