package modulo10;

import java.util.Locale;
import java.util.Scanner;

public class ExemploProdutos01 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de produtos: ");
        int n = sc.nextInt();

        String[] produtos = new String[n];
        double[] valores = new double[n];

        double totalProdutos = 0.0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nome do " + (i + 1) + "º produto: ");    
            produtos[i] = sc.next();
            System.out.print("Valor do " + (i + 1) + "º produto: ");    
            valores[i] = sc.nextDouble();
            totalProdutos += valores[i];
        }

        double mediaProdutos = totalProdutos / n;

        System.out.printf("Preço médio: %.2f\n", mediaProdutos);

        sc.close();
    }
}
