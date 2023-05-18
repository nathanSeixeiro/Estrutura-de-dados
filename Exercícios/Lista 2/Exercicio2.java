/*
 * 2.Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
 * elementos. Escreva ao final a matriz obtida
 */

public class Exercicio2 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Preenchimento da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Preenche a diagonal principal com 1
                } else {
                    matriz[i][j] = 0; // Preenche os demais elementos com 0
                }
            }
        }

        // Impressão da matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
