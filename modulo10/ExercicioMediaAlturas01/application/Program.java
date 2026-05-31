package modulo10.ExercicioMediaAlturas01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioMediaAlturas01.entities.Pessoa;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int n = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome da " + (i+1) + "ª pessoa: ");
            String name = sc.next();
            System.out.print("Idade da " + (i+1) + "ª pessoa: ");
            int idade = sc.nextInt();
            System.out.print("Altura da " + (i+1) + "ª pessoa: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(name, idade, altura);
        }

        double somaAlturas, maiorAltura, menorAltura;
        somaAlturas = 0.0;
        maiorAltura = 0.0;
        menorAltura = pessoas[0].getAltura();        
        String maiorAlturaNome = "";        
        String menorAlturaNome = "";
        int menores16Anos = 0;        

        for (int i = 0; i < pessoas.length; i++) {
            double local = pessoas[i].getAltura();
            somaAlturas += local;

            if(pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
                maiorAlturaNome = pessoas[i].getName();
            }

            if(pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
                menorAlturaNome = pessoas[i].getName();
            }

            if(pessoas[i].getIdade() < 16) {
                menores16Anos++;
            }
        }

       double mediaAlturas = somaAlturas / pessoas.length;
       double porcentagemMenor16 = ((double)menores16Anos / (double)pessoas.length) * 100;        

       System.out.println();
       System.out.printf("Média das Alturas: %.2f\n", mediaAlturas);
       System.out.printf("Pessoa mais alta: %s. Maior Altura: %.2f\n", maiorAlturaNome, maiorAltura);
       System.out.printf("Pessoa mais baixa: %s. Menor Altura: %.2f\n", menorAlturaNome, menorAltura);
       System.out.printf("Porcentagem de Pessoas com menos de 16 anos: %.1f\n", porcentagemMenor16);

       sc.close();
    }
}
