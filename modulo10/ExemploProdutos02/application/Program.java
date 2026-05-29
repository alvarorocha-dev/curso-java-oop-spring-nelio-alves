package modulo10.ExemploProdutos02.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExemploProdutos02.entities.Product;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de produtos: ");
        int n = sc.nextInt();

        Product[] produto = new Product[n];

        for (int i = 0; i < produto.length; i++) {
            System.out.print("Nome do " + (i + 1) +"º produto: ");
            String name = sc.next();
            System.out.print("Valor do " + (i + 1) +"º produto: ");
            double price = sc.nextDouble();
            produto[i] = new Product(name, price); //instancia um novo produto
        }

        double sum = 0.0;

        for (int i = 0; i < produto.length; i++) {
            sum += produto[i].getPrice();
        }

        double media = sum / n;

        System.out.printf("Média dos produtos: %.2f\n", media);

        sc.close();
    }    
}
