package Konyv;

public class Main {
    public static void main(String[] args) {
        // String s = new String("Java");
        Book book1 = new Book();
        book1.title = "Dűne";
        book1.author = "Frank Herbert";
        book1.pages = 412;

        Book book2 = new Book();
        book2.title = "Alapítvány";
        book2.author = "Asimov";
        book2.pages = 255;

        System.out.println("Title: " + book1.title);
        System.out.println("Title: " + book2.title);
    }
}
