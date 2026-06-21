package modulo10.ExemploListas02;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {        

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <String> amigos = new ArrayList<>();

        amigos.add("Primeiro");
        amigos.add("Gabriel");
        amigos.add("Samanta");
        amigos.add("Laura");
        amigos.add("Marcelo");
        amigos.add("Ana");
        amigos.add("Jose");
        amigos.add("Lucio");
        amigos.add("Marcio");
        amigos.add("Maria");
        amigos.add("Ana");
        amigos.add("Luciana");
        amigos.add("Último");

        System.out.println("Lista Inicial de amigos:");        
        for (String amigo : amigos) {
            System.out.print(amigo + " | ");
        }

        System.out.println();
        System.out.println("Tamanho da lista: " + amigos.size());
        System.out.println("Posição da Samanta na lista: " + amigos.indexOf("Samanta"));
        System.out.println("Posição do Geronimo na lista: " + amigos.indexOf("Geronimo"));

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Remove o primeiro e o último elemento da lista:");
        amigos.removeFirst();
        amigos.removeLast();

        for(String amigo : amigos) {
            System.out.print(amigo + " | ");
        }

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Adiciona 'Marcos' na posição 3 da lista");
        amigos.add(3, "Marcos");

        for (String amigo :  amigos) {
            System.out.print(amigo + " | ");
        }

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Remove o amigo na posição '1' da lista:");
        amigos.remove(1);         

        for (String amigo : amigos) {
            System.out.print(amigo + " | ");
        }

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Remove a primeira ocorrencia de 'Ana' na lista");
        amigos.remove("Ana");
        
        for (String amigo : amigos) {
            System.out.print(amigo + " | ");
        }

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Remove os nomes que começam com a Letra 'M':");
        amigos.removeIf(amigo -> amigo.charAt(0) == 'M');

        for(String amigo : amigos) {
            System.out.print(amigo + " | ");
        }

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Cria uma lista apenas com os nomes começados pela letra 'L':");

        List <String> listaInicialL = amigos.stream().filter(amigo -> amigo.charAt(0) == 'L').collect(Collectors.toList());

        for(String amigo : listaInicialL) {
            System.out.print(amigo + " | ");
        }

        System.out.println("\n<----------------------------------->\n");

        System.out.println("Seleciona o primeiro nome começado pela letra 'J':");

        String nomeJ = amigos.stream().filter(amigo -> amigo.charAt(0) == 'J').findFirst().orElse(null);

        System.out.println(nomeJ);

        sc.close();
    }
}
