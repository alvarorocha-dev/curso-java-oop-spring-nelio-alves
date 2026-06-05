package modulo10.ExerciciosAprovados02.Application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExerciciosAprovados02.entities.Aluno;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastrados? ");
        int n = sc.nextInt();

        Aluno[] vetAluno = new Aluno[n];     

        for (int i = 0; i < vetAluno.length; i++) {
            System.out.print("Nome do " + (i + 1) + "º aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();            
            System.out.print("Nota 1º Bimestre do " + (i + 1) + "º aluno: ");
            double nota01 = sc.nextDouble();
            System.out.print("Nota 2º Bimestre do " + (i + 1) + "º aluno: ");
            double nota02 = sc.nextDouble();
            vetAluno[i] = new Aluno(nome, nota01, nota02);
            }
        
        System.out.println();
        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {     
            double media = (vetAluno[i].getNota01() + vetAluno[i].getNota02()) / 2;      
            if (media >= 6.0) {
                System.out.println(vetAluno[i].getName());
            }
        }
        sc.close();
    }    
}