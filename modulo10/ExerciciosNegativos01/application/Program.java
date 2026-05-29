package modulo10.ExerciciosNegativos01.application;

import java.util.Scanner;
import modulo10.ExerciciosNegativos01.entities.Number;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão avaliados? ");
        int n = sc.nextInt();

        Number[] numeros = new Number[n];

        //Loop que registra os números inseridos no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º Número: ");
            int numero = sc.nextInt();
            numeros[i] = new Number(numero);
        }

        System.out.println();
        System.out.println("Números negativos");

        //Loop que obtem todos os valores do vetor e registra os que são menores que "0"
        for (int i = 0; i < numeros.length; i++) {
            int local = numeros[i].getNumber(); //usa o metodo "getNumber" para capturar o numsero na posição "i" do vetor "numeros"
            if (local < 0) {
                System.out.println(local);
            }
        }

        sc.close();
    }    
}
