public class Main {
    public static void main(String[] args) {
        MyNumber n = new MyNumber(5);
        n.add(2).multiply(3);
        System.out.println(n.value());

        // Házi: StringUtils osztály létrehozása -> reverse() metódus létrehozása (megfordítja a kapott szót)
        //                                       -> isPalindrome() metódus létrehozása (visszafelé olvasva is ugyanaz-e a szó)
    }
}
