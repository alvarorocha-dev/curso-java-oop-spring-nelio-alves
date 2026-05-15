package circumference01.application;

import java.util.Locale;
import java.util.Scanner;

public class Circumference01 {

    public static final double PI = 3.14159; //o "final" na declaração determina que o valor armazenado é uma constante e não pode ser alterado. Nomes de Constantes são escritos com maiúsculas e usam "_" para separar as palavras.

    //SALARIO_LIQUIDO, IMPOSTO_DE_RENDA, etc
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf( "Circumference: %.2f\n", c);
        System.out.printf( "Volume: %.2f\n", v);
        System.out.printf( "PI Value: %.2f\n", PI);
        sc.close();
    }

    //O java não permite executar métodos que não sejam estáticos (static) dentro de um método estático. Por isso os dois métodos abaixo tem "static" nas declarações 
    public static double circumference(double radius) { 
        return (2 * PI) * radius;
    }

    public static double volume(double radius) {
        return ((4 * PI) * Math.pow(radius, 3)) / 3;
    }
}
