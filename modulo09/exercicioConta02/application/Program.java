package modulo09.exercicioConta02.application;

import java.util.Locale;
import java.util.Scanner;
import modulo09.exercicioConta02.entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;        

        System.out.print("Enter the account number: ");
        int number = sc.nextInt();        
        
        System.out.print("Enter the holder name: ");
        sc.nextLine();
        String holder = sc.nextLine();        

        System.out.print("Do you want to do a initial deposit (y/n)? ");
        char initial = sc.next().charAt(0);

        if (initial == 'y') {
            System.out.print("Initial Deposit Value US$: ");
            double initialDeposit = sc.nextDouble();
            account = new Account( number,  holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);

        

        System.out.println();
        System.out.print("Enter a deposit Value US$: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println();
        System.out.println("Updated Data:");
        System.out.println(account);


        System.out.println();
        System.out.print("Enter a withdraw Value US$: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated Data:");
        System.out.println(account);     
        

        sc.close();
    }
}
