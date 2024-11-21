package StringTest;

public class Main {
    public static boolean contains_one(String s, char k) {
        return s.indexOf(k) == s.lastIndexOf(k);
    }

    public static void main(String[] args) {
        String s1 = "Welcome to Aava";
        String s2 = s1;
        String s3 = "Welcome to Java";
        String s4 = "Welcome to Bava";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); //referencia szerint magyarul a memoria teruletet nezi
        System.out.println(s1.equals(s3)); //A tartalmat nezi
        System.out.println(s1.compareTo(s4)); //Az elso eltero betut nezi es megnezi mennyire van az elso string eletero betuje a masodik string eltero betujehez kepest
        System.out.println(s1.charAt(0)); // karakterekre bontja a stringet
        System.out.println(s1.length()); // string hossza
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(contains_one(s1, 'a'));
        System.out.println(contains_one("HaliBbali".toLowerCase(), 'b'));
        System.out.println("HaliBali".indexOf("Bali"));
        System.out.println("  Hali Bali   To  ".trim());
        System.out.println("HaliBali".substring(3));
        System.out.println("HaliBali".substring(2, 6));
        System.out.println("HaliBali".startsWith("Tali"));
        System.out.println("HaliBali".endsWith("Bali"));
        System.out.println("HaliBali".replace('a', 'o'));

        char[] str = s1.toCharArray(); //karaktertombot csinal stringbol
        System.out.println(str);

        for (int i = 0; i < s1.length(); i++) {
            System.out.println((s1.charAt(i)));
        }
    }
}