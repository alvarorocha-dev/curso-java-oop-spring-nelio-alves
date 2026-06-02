package modulo10.ExercicioAbaixoMedia01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioAbaixoMedia01.entities.Number;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantidade de elementos do vetor: ");
        int n = sc.nextInt();

        Number[] vetor = new Number[n];
        double totalVetor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print((i + 1) + "º Numero: ");
            double numero = sc.nextDouble();
            totalVetor += numero;
            vetor[i] = new Number(numero);
        }

        double mediaVetor = totalVetor / vetor.length;

        System.out.println();
        System.out.printf("Média do vetor: %.3f\n", mediaVetor);

        System.out.println("Elementos abaixo da média:");

        for (int i = 0; i <  vetor.length; i++) {
            if (vetor[i].getNumber() < mediaVetor) {
                System.out.printf("%.1f\n", vetor[i].getNumber());
            }
        }

        sc.close();
    }
    
}
