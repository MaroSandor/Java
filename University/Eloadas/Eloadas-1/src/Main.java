public class Main {
    public static void main(String[] args) {
        boolean ok = true;

        int big = 100_000;
        long x = 1234567890;
        float vmi = 6.70f;
        double pi = 3.17;
        String text = "Java 21 fulz";
        // System.out.println("Hello World!");
        System.out.println(big);
        System.out.println(x);
        System.out.println(vmi);
        System.out.println(pi);
        System.out.println(text);
        System.out.println(ok);

        // Referencia: tulajdonképpen egy mutató!

        // A referencia típusú operátorokhoz memóriát kell allokálni, erre a new operátort használjuk.
        // Automatikusan menedzseli a dinamikusan lefoglalt tárterületet.
        // A Java ún. collage collectorral rendelkezik.
        // A futtató referenciaszámlálást végez. Folyamatosan figyeli, hogy egy dinamikusan lefoglalt tárterületre (ált. objektum) hány db referencia mutat.
        // Ha a referenciák száma lecsökken 0-ra, akkor az azt jelenti, hogy arra a memóriaterületre senki sem mutat, vagyis az a memóriaterület elérhetetlenné vált.
    }
}
