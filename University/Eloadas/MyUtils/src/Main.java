public class Main {
    public static void main(String[] args) {
        int result = Math.max(3, 7);
        System.out.println(result);

        String nev = "Anna";

        System.out.println(nev);

        MyUtils utils = new MyUtils();

        System.out.println(MyUtils.duplaz(6)); // res: 12
        System.out.println(MyUtils.strlen("asda")); // res: 4
    }
}
