package exercicioAreaRetangulo.application;

import java.util.Locale;
import java.util.Scanner;
import exercicioAreaRetangulo.entities.Rectangle;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle retangulo = new Rectangle();

        System.out.print("Enter the rectangle Width: ");
        retangulo.Width = sc.nextDouble();
        System.out.print("Enter the rectangle Height: ");
        retangulo.Height = sc.nextDouble();

        System.out.println();
        System.out.println("Resultado: " + retangulo);

        sc.close();
    }
}
