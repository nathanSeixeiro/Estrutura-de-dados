import java.util.Scanner;

/* Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posicao das matrizes lidas.*/

public class Exercicio6 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matrizMaior = new int[4][4];

        // Leitura das matrizes
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da primeira matriz:");
        lerMatriz(matriz1, scanner);

        System.out.println("Digite os elementos da segunda matriz:");
        lerMatriz(matriz2, scanner);

        // Construção da matriz com os maiores valores
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizMaior[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
            }
        }

        // Impressão da matriz com os maiores valores
        System.out.println("Matriz com os maiores valores:");
        imprimirMatriz(matrizMaior);
    }

    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}