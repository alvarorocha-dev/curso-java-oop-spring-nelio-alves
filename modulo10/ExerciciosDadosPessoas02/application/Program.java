package modulo10.ExerciciosDadosPessoas02.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExerciciosDadosPessoas02.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão registradas? ");
        int n = sc.nextInt();

        Pessoa[] vetPessoa = new Pessoa[n];        

        for (int i = 0; i < vetPessoa.length; i++) {
            System.out.print("Altura da " + (i+ 1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Gênero da " + (i+ 1) + "ª pessoa (m/f): ");
            char genero = sc.next().charAt(0);
            vetPessoa[i] = new Pessoa(altura, genero);           
        }

        double maiorAltura = vetPessoa[0].getAltura();
        double menorAltura = vetPessoa[0].getAltura();
        double totalAlturaMulheres = 0.0;
        double mediaAlturaMulheres;
        int quantMulheres = 0;
        int quantHomens = 0;

        for (int i = 0; i < vetPessoa.length; i++) {
            if (vetPessoa[i].getAltura() > maiorAltura) {
                maiorAltura = vetPessoa[i].getAltura();
            }

            if (vetPessoa[i].getAltura() < menorAltura) {
                menorAltura = vetPessoa[i].getAltura();
            }

            if (vetPessoa[i].getGenero() == 'f') {
                totalAlturaMulheres += vetPessoa[i].getAltura();
                quantMulheres++;
            } else {
                quantHomens++;
            }
        }

        mediaAlturaMulheres = totalAlturaMulheres / (double)quantMulheres;

        System.out.println();
        System.out.printf("Menor Altura: %.2f\n", menorAltura);
        System.out.printf("Maior Altura: %.2f\n", maiorAltura);
        System.out.printf("Média de  Altura das mulheres: %.2f\n", mediaAlturaMulheres);
        System.out.println("Quantidade de homens: " + quantHomens);

        sc.close();
    }    
}
