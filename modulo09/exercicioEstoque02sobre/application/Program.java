package modulo09.exercicioEstoque02sobre.application;

import java.util.Locale;
import java.util.Scanner;
import modulo09.exercicioEstoque02sobre.entities.Product;

public class Program {  

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);        

        //Também é possivel usar o construtor padrão
        //Product produto = new Product();

        //Os dados são pedidos primeiro
        System.out.print("Nome do Produto: ");
        String name = sc.next();
        System.out.print("Valor do Produto: ");
        double price = sc.nextDouble();
        //A quantidade não será mais obrigatória de ser preenchida no momento da criação do objeto
        //System.out.print("Quantidade no estoque: ");
        //int quantity = sc.nextInt();
        

        Product produto = new Product(name, price); // o quantity não tem necessidade de ser inserido nos parâmetros 

        System.out.println(produto);

        System.out.print("Adicionar produtos: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        
        System.out.println("Produto Atualizado:" + produto);        

        System.out.print("Remover produtos: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println("Produto Atualizado:" + produto);

        sc.close();
    }
}
