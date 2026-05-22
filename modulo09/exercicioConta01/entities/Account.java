package modulo09.exercicioConta01.entities;

public class Account {    

    private int number;
    private String holder;
    private double balance;
    private double tax = 5.0; //taxa de retirada
    

    //Sobracarga de construtores para situações com campos difrentes preenchidos em cada entrada
    //Construtor para quando a conta for criada sem saldo. O saldo sera preenchido automaticamente com 0
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

     //Construtor para quando a conta for criada com saldo inicial
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //executa o método de depósito (deposit) usando o parâmetro "initialDeposit" como valor
    }

    //==========> Getters and Setters (Captura e altera dados cadastrados)
    public int getNumber() {
        return number;
    }

    /* Retirado para não permitir que o número da conta seja alterado
    public void setNumber(int number) {
        this.number = number;
    }
     */

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    /* Retirado para permitir que o saldo na conta seja alterado exclusivamente pelas opções de retirada e depósito na conta
    public void setBalance(double balance) {
        this.balance = balance;
    }
    */

    //==========> Métodos para retirada e depósito
    //Método para depósito
    public void deposit(double amount) {
        balance += amount; //não necessita do "this" por não ter o "balance" no parametro do método
    }

    //Método para retirada
    public void withdraw(double amount) {
        balance -= (amount + tax);
    }


    //==========> String para exibição dos dados da conta

    public String toString() {
        return "Account "
        + number
        + ", Holder: "
        + holder
        + ", Balance: US$: "
        + String.format("%.2f", balance)        ;
    }

}
