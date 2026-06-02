package modulo10.ExercicioNumerosPares01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioNumerosPares01.entities.Number;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados? ");
        int n = sc.nextInt();

        Number[] numeros = new Number[n];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            int numero = sc.nextInt();
            numeros[i] = new Number(numero);
        }

        int quantidadePares = 0;

        System.err.println();
        System.out.println("Números Pares:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i].getNumber() % 2 == 0) {
                quantidadePares ++;
                System.out.print(numeros[i].getNumber() + " ");
            }
        }

        System.err.println();
        System.out.println();
        System.err.println("Quantidade de pares: " + quantidadePares);

        sc.close();
    }
    
}
