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
            if (numeros[i].getNumber() < 0) { //utiliza função "getNumber()" para capturar o numero na posição [i] do vetor e verifica se é menor que "0"
                System.out.println(numeros[i].getNumber()); //imprime o valor na posiçao [i] do vetor caso seja verdade
            }
        }
        sc.close();
    }    
}