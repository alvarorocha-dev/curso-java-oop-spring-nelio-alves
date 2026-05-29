package modulo10.ExemploProdutos.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExemploProdutos.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        Product[] vect = new Product[n]; //cria um novo vetor "vect" usando o construtor "Product" como base e com "n" posições

        for (int i = 0; i < vect.length; i++) { //utiliza o tamanho do vetor "vect" como base para o for
            String name = sc.next();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); //armazena o conteudo de "name" e "price" na posição "i" do vetor "vect"
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice(); //usa o metodo "getPrice" para acessar o valor do produto na posição "i" do vetor "vect" e acumula na variável "sum"
        }

       double avg = sum / n;
       
       System.out.printf("Average Price: %.2f\n", avg);


        sc.close();
    }
}
