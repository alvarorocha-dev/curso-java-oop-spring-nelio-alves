package modulo10.ExercicioMaisVelho01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioMaisVelho01.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();

        Pessoa[] vetorNome = new Pessoa[n];
        Pessoa[] vetorIdade = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome da " + (i + 1) + "ª pessoa: ");
            String nome = sc.next();            
            System.out.print("Idade da " + (i + 1) + "ª pessoa: ");
            int idade = sc.nextInt();
            vetorNome[i] = new Pessoa(nome, idade);
            vetorIdade[i] = new Pessoa(nome, idade);
        }

        int maiorIdade = 0;
        int posicaoMaiorIdade = 0;

        for (int i = 0; i < n; i++) {
            if (vetorIdade[i].getAge() > maiorIdade) {
                maiorIdade = vetorIdade[i].getAge();
                posicaoMaiorIdade = i;
            }
        }

        System.out.println();
        System.out.println("Pessoa mais velha: " + vetorNome[posicaoMaiorIdade].getName() + " com " + maiorIdade + " anos.");

        sc.close();
    }    
}