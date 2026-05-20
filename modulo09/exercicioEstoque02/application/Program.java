package modulo09.exercicioEstoque02.application;

import java.util.Locale;
import java.util.Scanner;
import modulo09.exercicioEstoque02.entities.Product;

public class Program {  

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);        

        //Utilizar um construtor evita que um objeto seja criado com atibutos vazios ou nulos
        //Os dados são pedidos primeiro
        System.out.print("Nome do Produto: ");
        String name = sc.next();
        System.out.print("Valor do Produto: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        int quantity = sc.nextInt();

        //Depois que os dados são inseridos que o objeto é instanciado já com os dados preenchidos
        Product produto = new Product(name, price, quantity); //os nomes das variaveis são preenchidos como parametros no objeto e os dados são enviados para o construtor

        System.out.println(produto);

        System.out.print("Adicionar produtos: ");
        quantity = sc.nextInt();
        produto.addProducts(quantity);
        
        System.out.println("Produto Atualizado:" + produto);        

        System.out.print("Remover produtos: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);

        System.out.println("Produto Atualizado:" + produto);

        sc.close();
    }
}
