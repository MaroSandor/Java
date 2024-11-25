package Hello;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("world");
        System.out.println("aa");
        System.out.println("bb");
        System.out.println();

        int big = 100_000; // Az aláhúzás megengedett az Integer típusú változókban, átláthatóbb vele az egész szám értéke

        long n = 2_147_483_648L;

        float pi = 3.14f;

        boolean ok = true;

        System.out.println(ok);

        //int z;
        // System.out.println(z);

        // Referencia: tulajdonképpen egy mutató!

        // A referencia típusú operátorokhoz memóriát kell allokálni, erre a new operátort használjuk.
        // Automatikusan menedzseli a dinamikusan lefoglalt tárterületet.
        // A Java ún. collage collectorral rendelkezik.
        // A futtató referenciaszámlálást végez. Folyamatosan figyeli, hogy egy dinamikusan lefoglalt tárterületre (ált. objektum) hány db referencia mutat.
        // Ha a referenciák száma lecsökken 0-ra, akkor az azt jelenti, hogy arra a memóriaterületre senki sem mutat, vagyis az a memóriaterület elérhetetlenné vált.
    }
}
