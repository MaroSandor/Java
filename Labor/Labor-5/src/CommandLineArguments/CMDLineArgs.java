package CommandLineArguments;

public class CMDLineArgs {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Adjono meg legalább 2 paramérert.");
            System.exit(0);
        }

        // Az első argumentum a szó:
        String word = args[0];
        StringBuilder charSet = new StringBuilder();

        for (int i = 1; i < args.length; i++) {
            if (charSet.indexOf(args[i]) == -1) { // ha még nincs benne
                charSet.append(args[i]);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char character : word.toCharArray()) {
            if (charSet.indexOf(String.valueOf(character)) != -1) {
                result.append(character).append(character);
            } else {
                result.append(character);
            }
        }

        // System.out.println(charSet);
        System.out.println(result);
    }
}
