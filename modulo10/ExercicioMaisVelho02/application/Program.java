package modulo10.ExercicioMaisVelho02.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioMaisVelho02.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();

        Pessoa[] vetPessoa = new Pessoa[n];

        for (int i = 0; i < vetPessoa.length; i++) {
            System.out.print("Nome da " + (i + 1) + "ª pessoa: ");
            String nome = sc.next();            
            System.out.print("Idade da " + (i + 1) + "ª pessoa: ");
            int idade = sc.nextInt();
            vetPessoa[i] = new Pessoa(nome, idade);
            }

        int maiorIdade = 0;
        int posicaoMaiorIdade = 0;

        for (int i = 0; i < vetPessoa.length; i++) {
            if (vetPessoa[i].getAge() > maiorIdade) {
                maiorIdade = vetPessoa[i].getAge();
                posicaoMaiorIdade = i;
            }
        }

        System.out.println();
        System.out.println("Pessoa mais velha: " + vetPessoa[posicaoMaiorIdade].getName() + " com " + maiorIdade + " anos.");

        sc.close();
    }    
}