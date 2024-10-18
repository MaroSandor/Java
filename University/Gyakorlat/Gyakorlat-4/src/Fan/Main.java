package Fan;

public class Main {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.setColor("red");
        f.setSpeed(Fan.MEDIUM);
        f.setOn(true);

        Fan f2 = new Fan();
        f2.setOn(true);

        Fan f3 = new Fan();
        f3.setColor("red");
        f3.setSpeed(Fan.MEDIUM);
        f3.setOn(true);

        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("Egyenlő-e a két ventillátor: " + f.equals(f2));
        System.out.println("Egyenlő-e a két ventillátor: " + f.equals(f3));
    }
}
