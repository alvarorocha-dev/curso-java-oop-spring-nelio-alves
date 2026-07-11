package modulo10.ExercicioMediaAlturas02.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioMediaAlturas02.entities.Pessoa;

public class Program {
    public static void main(String[] args) {        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Nome da " + (i+1) + "ª pessoa: ");
            String nome = sc.next();
            System.out.print("Idade da " + (i+1) + "ª pessoa: ");
            int idade = sc.nextInt();
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade,altura);
        }

        double totalAlturas = 0.0;
        double menorAltura = pessoas[0].getAltura();
        double maiorAltura = pessoas[0].getAltura();
        String pessoaMaisAlta = pessoas[0].getNome();
        String pessoaMaisBaixa = pessoas[0].getNome();
        int pessoasMenos16 = 0;

        for (int i = 0; i < pessoas.length; i++) {
            totalAlturas += pessoas[i].getAltura();

            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
                pessoaMaisBaixa = pessoas[i].getNome();
            }

            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
                pessoaMaisAlta = pessoas[i].getNome();
            }

            if (pessoas[i].getIdade() < 16) {
                pessoasMenos16++;
            }
        }

        double mediaAlturas = totalAlturas / pessoas.length;
        double porcentagemMenor16 = ((double)pessoasMenos16 / (double)pessoas.length) * 100;

        System.out.println("\n < --------------------------- > \n");

        System.out.printf("Altura Média: %.2f. \n", mediaAlturas);
        System.out.printf("Pessoa mais alta: %s com %.2f cm. \n", pessoaMaisAlta, maiorAltura );
        System.out.printf("Pessoa mais baixa: %s com %.2f cm. \n", pessoaMaisBaixa, menorAltura );
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%. \n", porcentagemMenor16 );       

        sc.close();
    }    
}