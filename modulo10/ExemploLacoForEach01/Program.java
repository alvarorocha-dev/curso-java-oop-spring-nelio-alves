package modulo10.ExemploLacoForEach01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (String nome : vect) { //para cada "nome" do tipo "String" no vetor "vect"
            System.out.println(nome); //imprima "nome"
        }

        sc.close();
    }
}
