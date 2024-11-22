package ModularInverse;

public class Main {
    public static void main(String[] args) {
        int a = 3, m = 11;

        ModularInverse modularInverse = new ModularInverse();
        int result = modularInverse.modInverse(a, m);

        System.out.println("Modular inverse of " + a + " under modulo " + m + " is: " + result);
    }
}