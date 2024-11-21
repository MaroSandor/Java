package Account;

public class Main {
    public static void main(String[] args) {
        System.out.println(Account.getRate());
        Account bankAccount_1 = new Account();
        Account bankAccount_2 = new Account(1, 2000);

        System.out.println(bankAccount_1);
        System.out.println(bankAccount_2);

        bankAccount_2.deposit(300);

        System.out.println(bankAccount_2);
    }
}