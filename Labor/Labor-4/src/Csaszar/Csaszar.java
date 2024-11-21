package Csaszar;

public class Csaszar {
    private String name;
    private int age;

    public Csaszar(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthOfYear() {
        return age;
    }

    public void setBirthOfYear(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.age + ')';
    }
}
