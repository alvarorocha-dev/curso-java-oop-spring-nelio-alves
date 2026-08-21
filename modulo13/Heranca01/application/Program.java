package modulo13.Heranca01.application;


import modulo13.Heranca01.entities.BusinessAccount;
import modulo13.Heranca01.entities.SavingsAccount;
import modulo13.Heranca01.entities.Account;

public class Program {
    public static void main(String[] args) {        

        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bacc =  new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCasting - atirbui um objeto de uma subclasse para uma superclasse. "Account" é uma superclasse. "BusinessAccount" e "SavingsAccount" são subclasses de "Account"

        Account acc1 = bacc;
        Account acc2 =  new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNcasting - Converte objetos da superclasse para uma subclasse.

        BusinessAccount acc4 = (BusinessAccount)acc2; //O compilador não aceita o Downscasting automaticamente. É necessário fazer o downcasting declarando a subclasse entre parenteses.

        acc4.loan(100.0); //Fazer o downcasting para uma "BusinessAccount" habilita o processo de empréstimo na conta

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        //Uma "SavingsAccount" não pode ser  convertida para "BusinessAccount" por ambas serem subclasses de uma superclasse. Esse erro não aparece no compilador, exibe apenas na tela de execução

        if(acc3 instanceof BusinessAccount) { //verifica se a conta é da subclasse "Business"
            BusinessAccount acc5 = (BusinessAccount)acc3; //faz o casting para um nova conta "Business"
            acc5.loan(200); //realiza um emprestimo de 200
            System.out.println("Loan!"); //Imprime que foi realizado um emprestimo
        }

        if (acc3 instanceof SavingsAccount) { //verifica se a conta é da subclasse "Saving"
            SavingsAccount acc5 = (SavingsAccount)acc3; //Faz o casting para uma nova conta "Saving"
            acc5.updateBalance(); //Atualiza o saldo
            System.out.println("Update!"); //Imprime na tela que a conta foi atualizada
        }





    
    
    
    }
    
}
