package modulo10.ExercicioSomaVetor01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioSomaVetor01.entities.Number;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados? ");
        int n = sc.nextInt();

        Number[] numeros = new Number[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+ 1) + "º número: ");
            double numero = sc.nextDouble();
            numeros[i] = new Number(numero);
        }

        double soma = 0.0;     

        System.out.print("Valores = "); //Exibe o titulo sem pular linhas

        for (int i = 0; i < numeros.length; i++) {
            double local = numeros[i].getNumber();
            soma += local;
            System.out.printf("%.1f ", local); //mostra os valore do loop sem pular linhas           
        }

        double media = soma / numeros.length;

        System.out.println();
        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Média = %.2f\n", media);

        sc.close();
    }
    
}
