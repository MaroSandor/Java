package Account;

import java.util.Date;

public class Account {
    // - jel a diagramban private láthatóság, + jel a diagramban public láthatóság
    private int id;
    private double balance;
    private Date dateCreated;
    private static double Rate = 5;

    //    public Account(int id, double balance, double Rate, Date dateCreated) {
    //        this.id = id;
    //        this.balance = balance;
    //        this.Rate = Rate;
    //        this.dateCreated = dateCreated;
    //    }

    public Account() {
        this.id = 0;
        this.dateCreated = new Date();
        this.balance = 0;
        Account.Rate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return Rate;
    }

    public void setRate(double Rate) {
        Account.Rate = Rate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public static double getMonthlyRate() {
        return Account.Rate / 12;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        this.balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
    }
}