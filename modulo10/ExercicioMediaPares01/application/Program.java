package modulo10.ExercicioMediaPares01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioMediaPares01.entities.Number;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números avaliados: ");
        int n = sc.nextInt();

        Number[] vetor = new Number[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i + 1) + "º Número: ");
            int numero = sc.nextInt();
            vetor[i] = new Number(numero);
        }        

        int quantidadePares = 0;
        int somaPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getNumber() % 2 == 0) {
                quantidadePares ++;
                somaPares += vetor[i].getNumber();
            }
        }

        double mediaPares = (double) somaPares / (double) quantidadePares; 

        System.out.println();

        if (somaPares == 0) {
            System.out.println("Nenhum número par cadastrado.");
        } else {
            System.out.printf("Média dos pares: %.1f\n", mediaPares);
        }

        sc.close();
    }
    
}