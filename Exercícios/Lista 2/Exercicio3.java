/*
 * 3.Faca um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
 * coluna de cada elemento. Em seguida, imprima na tela a matriz.
 */

public class Exercicio3 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenchimento da matriz com o produto da linha e coluna
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (i + 1) * (j + 1); // Produto da linha e coluna
            }
        }

        // Impressão da matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}