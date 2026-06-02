package modulo10.ExercicioTotalVetores01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioTotalVetores01.entities.Number;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de numeros em cada vetor: ");
        int n = sc.nextInt();

        Number[] vetorA = new Number[n];
        Number[] vetorB = new Number[n];
        Number[] vetorC = new Number[n];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print((i+ 1) + "º numero do Vetor A: ");
            int numero = sc.nextInt();
            vetorA[i] = new Number(numero);
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print((i+ 1) + "º numero do Vetor B: ");
            int numero = sc.nextInt();
            vetorB[i] = new Number(numero);
        }

        System.out.println();
        System.out.println("Vetor Resultante:");

        for (int i = 0; i < vetorC.length; i++) {
            int numero = vetorA[i].getNumber() + vetorB[i].getNumber(); 
            vetorC[i] = new Number(numero);
            System.out.println(vetorC[i].getNumber());
        }
        
        sc.close();
    }
    
}
