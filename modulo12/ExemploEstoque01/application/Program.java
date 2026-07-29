package modulo12.ExemploEstoque01.application;

import java.util.Locale;
import java.util.Scanner;

import modulo12.ExemploEstoque01.entities.Entrada;
import modulo12.ExemploEstoque01.entities.Estoque;
import modulo12.ExemploEstoque01.entities.Saida;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do estoque: ");
        String nomeEstoque = sc.next();

        Estoque estoque = new Estoque(nomeEstoque);

        System.out.print("Quantas entradas de produtos no estoque? ");
        int n = sc.nextInt();

        System.out.println();

        for(int i = 1; i <= n; i++) {
            System.out.print("Nome do produto " + i + ": ");
            String nomeProduto = sc.next();
            System.out.print("Valor do produto " + i + ": ");
            double valorProduto = sc.nextDouble();
            System.out.print("Quantidade do produto " + i + ": ");
            int quantProduto = sc.nextInt();

            Entrada entrada = new Entrada(nomeProduto, valorProduto, quantProduto);
            estoque.addEntrada(entrada);
        }

        System.out.print("\nRegistrar Saída de Produtos\n");

        System.out.print("Quantas saídas de produtos no estoque? ");
        int m = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= m; i++) {
            System.out.print("Nome do produto " + i + ": ");
            String nomeProduto = sc.next();
            System.out.print("Valor do produto " + i + ": ");
            double valorProduto = sc.nextDouble();
            System.out.print("Quantidade do produto " + i + ": ");
            int quantProduto = sc.nextInt();

            Saida saida = new Saida(nomeProduto, valorProduto, quantProduto);
            estoque.addSaida(saida);
        }

        System.out.print("\n <---- Fechamento do " + estoque.getName() + " -------> \n");

        System.out.println(estoque);

        System.out.println("Valor Total Entradas: " + estoque.balancoEntradas());
        System.out.println("Quantidade Total Entradas: " + estoque.quantEntradas());
        System.out.println("Valor Total Saidas: " + estoque.balancoSaidas());
        System.out.println("Quantidade Total Saidas: " + estoque.quantSaidas());

        sc.close();
    }
    
}
