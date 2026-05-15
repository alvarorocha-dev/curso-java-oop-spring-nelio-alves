package triangulos;

import java.util.Locale;
import java.util.Scanner;
import triangulos.entities.Triangle; //Importa a classe "Triangle"

public class ProblemaTriangulos {
    public static void main(String[] args) {
        
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Triangle x = new Triangle(); //cria um triangulo "x" com a classe "Triangle" como base
       Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble(); //registra o valor inserido no atributo "a" do triângulo "x"
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble(); //registra o valor inserido no atributo "a" do triângulo "y"
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt( p * (p - x.a) * (p - x.b) * (p - x.c));
        double pY = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt( pY * (pY - y.a) * (pY - y.b) * (pY - y.c));

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }

        sc.close();
    }    
}