package modulo10.ExerciciosDadosPessoas01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExerciciosDadosPessoas01.entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão registradas? ");
        int n = sc.nextInt();

        Pessoa[] vetAltura = new Pessoa[n];
        Pessoa[] vetGenero = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+ 1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            System.out.print("Gênero da " + (i+ 1) + "ª pessoa (m/f): ");
            char genero = sc.next().charAt(0);
            vetAltura[i] = new Pessoa(altura, genero);
            vetGenero[i] = new Pessoa(altura, genero);
        }

        double maiorAltura = vetAltura[0].getAltura();
        double menorAltura = vetAltura[0].getAltura();
        double totalAlturaMulheres = 0.0;
        double mediaAlturaMulheres;
        int quantMulheres = 0;
        int quantHomens = 0;

        for (int i = 0; i < n; i++) {
            if (vetAltura[i].getAltura() > maiorAltura) {
                maiorAltura = vetAltura[i].getAltura();
            }

            if (vetAltura[i].getAltura() < menorAltura) {
                menorAltura = vetAltura[i].getAltura();
            }

            if (vetGenero[i].getGenero() == 'f') {
                totalAlturaMulheres += vetAltura[i].getAltura();
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
