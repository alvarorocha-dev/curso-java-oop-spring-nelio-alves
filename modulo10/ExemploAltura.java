package modulo10;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAltura {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pessoas: ");
        int pessoas = sc.nextInt();

        double[] alturas = new double [pessoas];

        double totalAlturas = 0.0;

        for (int i = 0; i < pessoas; i++) {
            System.out.println("Altura:");
            alturas[i] = sc.nextDouble();
            totalAlturas += alturas[i];
           
        }

        double mediaAlturas = totalAlturas / pessoas;

        System.out.printf("Média das alturas: %.2f\n", mediaAlturas);

        sc.close();
    }
}
