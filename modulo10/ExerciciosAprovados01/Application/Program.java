package modulo10.ExerciciosAprovados01.Application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExerciciosAprovados01.entities.Aluno;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int n = sc.nextInt();

     //   sc.next();

        Aluno[] vetNome = new Aluno[n];
        Aluno[] vetNota01 = new Aluno[n];
        Aluno[] vetNota02 = new Aluno[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome do " + (i + 1) + "º aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();            
            System.out.print("Nota 1º Bimestre do " + (i + 1) + "º aluno: ");
            double nota01 = sc.nextDouble();
            System.out.print("Nota 2º Bimestre do " + (i + 1) + "º aluno: ");
            double nota02 = sc.nextDouble();
            vetNome[i] = new Aluno(nome, nota01, nota02);
            vetNota01[i] = new Aluno(nome, nota01, nota02);
            vetNota02[i] = new Aluno(nome, nota01, nota02);
        }
        
        System.out.println();
        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {     
            double media = (vetNota01[i].getNota01() + vetNota02[i].getNota02()) / 2;      
            if (media >= 6.0) {
                System.out.println(vetNome[i].getName());
            }
        }
        sc.close();
    }    
}