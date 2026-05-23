package modulo09.exercicioConta02.entities;

public class Account {
    

    private int number;
    private String holder;
    private double balance;
    private double tax = 5.0;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }
    
    /* public void setNumber(int number) {
        this.number = number;
    }*/

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    /* public void setBalance(double balance) {
        this.balance = balance;
    }*/

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= (amount + tax);
    }

    public String toString() {
        return "Number Account: "
        + number
        + " - Holder: "
        + holder
        + ". Balance US$: "
        + String.format("%.2f", balance);
    }
}
