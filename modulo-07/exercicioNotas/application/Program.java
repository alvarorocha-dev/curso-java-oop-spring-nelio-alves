package exercicioNotas.application;

import java.util.Locale;
import java.util.Scanner;
import exercicioNotas.entities.Student;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();

        System.out.print("Student's name: ");
        aluno.name = sc.nextLine();

        System.out.print("First Quarter Grade: ");
        aluno.quarterOne = sc.nextDouble();
        System.out.print("Second Quarter Grade: ");
        aluno.quarterTwo = sc.nextDouble();
        System.out.print("Third Quarter Grade: ");
        aluno.quarterThree = sc.nextDouble();

        System.out.printf("Final Grade: %.2f\n", aluno.finalGrade());

        if (aluno.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("Missing %.2f points", aluno.missingPoints());
        } else {
            System.out.println("PASS");
        }
        
        sc.close();
    }    
}
