package modulo09.exercicioConta01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo09.exercicioConta01.entities.Account;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0); //verifica se a pessoa fara um deposito inicial

        if (response == 'y') { //se responder sim
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble(); //pergunta o valor de deposito incicial
            account = new Account(number, holder, initialDeposit); //inicia o construtor com o campo do deposito inicial armazenando o valor preenchido 
        } else { //senão
            account = new Account(number, holder); //inicia o construtor sem o campo do depósito inicial (será preenchido automaticamente com "0")
        }


        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble(); 
        account.deposit(depositValue); //executa o método de depósito com o "depositValue" como parâmetro

        System.out.println("Updated account data:");
        System.out.println(account);


        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble(); 
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(account);





        




        sc.close();
    }
}
