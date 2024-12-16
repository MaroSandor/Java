package Instanceof;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Object unknown = "Hello";

        checkObject(animal);
        checkObject(dog);
        checkObject(unknown);
    }

    public static void checkObject(Object obj) {
        if (obj instanceof Animal) {
            System.out.println("This is an Animal.");
        } else {
            System.out.println("This is not an Animal.");
        }

        if (obj instanceof Pet) {
            System.out.println("This is a Pet.");
        } else {
            System.out.println("This is not a Pet.");
        }

        if (obj instanceof Dog) {
            System.out.println("This is specifically a Dog.");
        } else {
            System.out.println("This is not a Dog.");
        }

        Object obj2 = "Hello";
        Object obj3 = 1234;
        Object obj4 = true;

        if (obj3 instanceof String) {
            String str = (String) obj2; // Castolás szükséges
            System.out.println(str.toUpperCase());
        }

        if (obj4 instanceof String) {
            String str = (String) obj2; // Castolás szükséges
            System.out.println(str);
        }
    }
}