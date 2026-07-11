import java.util.Locale;
import java.util.Scanner;

public class ExemploMatrizes01 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("MAtriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++)  {
            for( int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Percorre apenas a diagonal principal (onde linha == coluna)
        // Economiza processamento: O(N) em vez de O(N²)
        System.out.println("Main Diagonal: ");
        for (int i = 0; i < n; i++)  {            
                System.out.print(mat[i][i] + " | ");                       
        }

        System.out.println();

       int contadorN = 0;

       for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] < 0) {
                contadorN++;
            }
        }
       }

       System.out.println("Negative numbers: " + contadorN);      

        sc.close();
    }
}
