package modulo10.ExemploListas01;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>(); 
         //Listas não aceitam tipos primitivos (int, double, etc) apenas wrapper class (Integer, Double, etc)

         list.add("Maria"); //adidicona um elemento à lista
         list.add("Alex");
         list.add("Bob");
         list.add("Ana");
         list.add("Legolas");
         list.add("Galadriel");
         list.add("Leandro");
         list.add("Luna");
         list.add("Boromir");
         list.add("Pandora");
         list.add("Laura");

         list.size(); //apresenta quantidade de elementos na lista
         System.out.println("Quantidade de elementos da lista: " + list.size());

         System.out.println("Lista Original");
         for (String nome: list) {
            System.out.println(nome);
         }

         System.out.println("<--------------------------->");
         list.add(2, "Marco"); //adiciona "Marco" na posição "2" da lista e "empurra" o restante para as posições seguintes         
         System.out.println("Adiciona Marco na posição 2");
         for (String nome: list) {
            System.out.println(nome);
         }

         System.out.println("<--------------------------->");
         list.remove(1); //remove o elemento na posição "1"
         System.out.println("Removido elemento na posição 1 da lista:");
         for (String nome: list) {
            System.out.println(nome);
         }

         System.out.println("<--------------------------->");
         list.remove("Ana");
         System.out.println("Ana Removida da lista");
         for (String nome: list) {
            System.out.println(nome);
         }


         System.out.println("<--------------------------->");
         list.removeIf(nome -> nome.charAt(0) == 'M'); //Remove oe nomes que o primeiro caractere é igual a "M". Funciona como um "for each"

         System.out.println("Removido nomes começados pela letra 'M'");
         for (String nome: list) {
            System.out.println(nome);
         }

         System.out.println("<--------------------------->");
         System.out.println("Index of Bob: " + list.indexOf("Bob"));
         //Mostra a posição de "Bob" na lista
         System.out.println("Index of Marco: " + list.indexOf("Marco"));
         //Exibe "-1" quando um elemento não é encontrado na lista

         System.out.println("<--------------------------->");
         System.out.println("Cria uma lista apenas com os nomes começados pela letra L");
         List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'L').collect(Collectors.toList());

         for (String nome: result) {
            System.out.println(nome);
         }

         System.out.println("<--------------------------->");
         System.out.println("Primeiro nome da lista que começa com a letra B: ");
         String nameB = list.stream().filter(nome -> nome.charAt(0) == 'B').findFirst().orElse(null);
         System.out.println(nameB);

        sc.close();
    }
}
