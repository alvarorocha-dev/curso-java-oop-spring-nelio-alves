package modulo10.ExercicioPensionato01.application;

import java.util.Locale;
import java.util.Scanner;
import modulo10.ExercicioPensionato01.entities.Rent;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vetPessoas = new Rent[10]; //cria o vetor com apenas 10 posições. O total de quartos da pensão

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt(); //quantos hospedes serão cadastrados
        
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.err.println("Rent #" + i);
            System.out.print(i + "º Hóspede Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print(i + "º Hóspede E-mail: ");
            String email = sc.next();           
            System.out.print(i + "º Hóspede Quarto: ");
            int room = sc.nextInt();   //captura o numero do quarto         
            vetPessoas[room] = new Rent(name, email); //determina que a posição selecionada no numero do quarto (room) sera a posição do elemento no vetor "vetPessoas"            
        }
        
        System.out.println();
        System.out.println("Quartos Alugados:");
        for (int i = 0; i < vetPessoas.length; i++) {
            if (vetPessoas[i] != null) { //se o conteudo naposição "i" for diferente de "null" (nulo)
                System.out.println(i + ": " + vetPessoas[i]); //imprime a posição "i" + o conteudo do vetor na posição "i"
            }
        }
        sc.close();        
    }    
}