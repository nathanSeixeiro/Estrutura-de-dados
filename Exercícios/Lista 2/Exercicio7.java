/* Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma: ˜
 * A[i][j] = 2i + 7j − 2 se i < j;
 * A[i][j] = 3i
 * 2 − 1 se i = j;
 * A[i][j] = 4i
 * 3 − 5j
 * 2 + 1 se i > j.
 * */

public class Exercicio7 {

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        // Preenchimento da matriz com as fórmulas
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                } else if (i == j) {
                    matriz[i][j] = 3 * i * i - 1;
                } else {
                    matriz[i][j] = 4 * i * i * i - 5 * j * j + 1;
                }
            }
        }

        // Impressão da matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}