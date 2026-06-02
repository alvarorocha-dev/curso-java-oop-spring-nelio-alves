package modulo10.ExercicioMaiorPosicao01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioMaiorPosicao01.entities.Number;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n  = sc.nextInt();

        Number[] numeros = new Number[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1) +"º Número: ");
            double numero = sc.nextDouble();
            numeros[i] = new Number(numero);
        }

        double maiorValor = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i].getNumber() > maiorValor) {
                maiorValor = numeros[i].getNumber();
                posicaoMaior = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor: %.1f\n", maiorValor);
        System.out.println("Posição do maior valor: " + posicaoMaior);


        sc.close();
    }
    
}
