import java.util.Scanner;

public class Funcoes01 {    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(); 
        
        int higher = max(a, b, c); //cria a variavel "higher" e chama a função "max" com "a", "b" e "c" como parâmetros

        showResult(higher); //Chama a função para exibir o resultado. Com o conteúdo de "higher" armazenado como parâmetro

        sc.close();     
    }

    //======> Função para Encontrar o Maior dos 3 valores
    //=== A função recebe a tipagem das variáveis. São usados "ints" para resultados inteiros
    public static int max(int x, int y, int z) { //cria a função "max" com os valores de "a", "b" e "c" ocupando os 3 parâmetros entre parênteses.

        int aux = Math.max(Math.max(x, y), z); //variável "aux" armazena o resultado do maior entre os 3 valores

        return aux; //retorna o valor de "aux"
    }

    //======> Função para exibir a resposta
    public static void showResult(int value) { //cria a função "showResult" com o valor de "higher" ocupando o paâmetro entre parênteses
        System.out.println("Higher: " + value);
    }
}
