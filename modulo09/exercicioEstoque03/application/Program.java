package modulo09.exercicioEstoque03.application;

import java.util.Locale;
import java.util.Scanner;
import modulo09.exercicioEstoque03.entities.Product;

public class Program {  

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do Produto: ");
        String name = sc.next();
        System.out.print("Valor do Produto: ");
        double price = sc.nextDouble();       
        
        Product produto = new Product(name, price);        

        System.err.println();
        System.out.println("Dados do produto: " + produto);

        produto.setName("Computer");
        System.out.println("Nome atualizado: " + produto.getName());
        produto.setPrice(1200.00);
        System.out.println("Valor atualizado: " + produto.getPrice());

        System.out.print("Adicionar produtos: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        
        System.out.println("Produto Atualizado: " + produto);        

        System.out.print("Remover produtos: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println("Produto Atualizado: " + produto);

        sc.close();
    }
}
