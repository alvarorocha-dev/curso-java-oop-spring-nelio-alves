package exercicioEstoque.application;

import java.util.Locale;
import java.util.Scanner;
import exercicioEstoque.entities.Product;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(); //cria um novo produto baseado na classe "Product"

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = sc.nextLine(); //registra o contéudo no atributo "name" do produto

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //=====> Exibe os dados cadastrados
        System.out.println();
        System.out.println("Product Data:" + product); 
        
        //=====> Adiciona produtos ao estoque
        System.out.println();
        System.out.print("Enter the number of products to be added in Stock: ");
        int quantity = sc.nextInt(); //cria a variável que armazena a quantidade de produtos a ser adicionada
        product.addProducts(quantity); //executa a função "addProduct" da classe "product". Envia o "quantity" como parâmetro da função

        //=====> Exibe os dados atualizados
        System.out.println();
        System.out.println("Updated Data:" + product); 


        //=====> Remove produtos do estoque
        System.out.print("Enter the quantity of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        //=====> Exibe os dados atualizados
        System.out.println();
        System.out.println("Updated Data:" + product);

        sc.close();
    }
    
}
