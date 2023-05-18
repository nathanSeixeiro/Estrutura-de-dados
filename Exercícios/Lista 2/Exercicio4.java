import java.util.Scanner;

/*
 * 4.Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
 * elementos. Escreva ao final a matriz obtida
 */

public class Exercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Leitura da matriz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Impressão da matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Localizacao do maior valor
        int maiorValor = matriz[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        // Impressão da localizacao do maior valor
        System.out.println("Localização do maior valor:");
        System.out.println("Linha: " + (linhaMaior + 1));
        System.out.println("Coluna: " + (colunaMaior + 1));
    }
}