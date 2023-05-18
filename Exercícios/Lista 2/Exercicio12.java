import java.util.Scanner;

/* Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta */

public class Exercicio12 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        // Leitura da matriz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Cálculo da matriz transposta
        int[][] transposta = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        // Impressão da matriz transposta
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("Matriz transposta:");
        imprimirMatriz(transposta);
    }

    // Função para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}