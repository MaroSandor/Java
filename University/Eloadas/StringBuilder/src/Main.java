public class Main {
    public static void main(String[] args) {
        String s = "";

        // for (int i = 1; i <= 20; i++) {
        // s += String.valueOf(i);${}
        // }

        // System.out.println(s);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 1000000; i++) {
            sb.append(i);
        }

        String result = sb.toString();

        System.out.println(result.length());
    }
}