package modulo10.ExercicioPropostoMatriz01;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas: ");
        int l = sc.nextInt();
        System.out.print("Colunas: ");
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++) {
            for(int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Pesquisar número: ");
        int num = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == num) {
                    System.out.println("Position: " + i + ", " + j);

                    if (j > 0) { //Se a coluna atual for maior que "0"
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) { // Se a linha atual for maior que 0
                        System.out.println("UP: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) { //Se a coluna atual for menor que o tamanho da linha -1
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) { //Se a linha atual for menor que a quantidade de linhas -1
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
