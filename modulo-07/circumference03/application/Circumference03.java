package circumference03.application;

import java.util.Locale;
import java.util.Scanner;
import circumference03.util.Calculator;

public class Circumference03 {    
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Os métodos foram definidos como "static", não há mais necessidade de instanciar o objeto
        //Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); //com métodos "static" é possivel usar métodos independente do objeto. Basta usar o nome da classe
        double v = Calculator.volume(radius);

        System.out.printf( "Circumference: %.2f\n", c);
        System.out.printf( "Volume: %.2f\n", v);
        System.out.printf( "PI Value: %.2f\n", Calculator.PI); //a constante "PI" está como "static", pode ser usada apenas com o nome da classe
        sc.close();
    }    
}
