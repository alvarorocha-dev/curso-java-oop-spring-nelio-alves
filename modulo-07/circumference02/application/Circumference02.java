package circumference02.application;

import java.util.Locale;
import java.util.Scanner;
import circumference02.util.Calculator;

public class Circumference02 {    
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.err.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf( "Circumference: %.2f\n", c);
        System.out.printf( "Volume: %.2f\n", v);
        System.out.printf( "PI Value: %.2f\n", calc.PI);
        sc.close();
    }    
}
