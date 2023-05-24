import java.util.Scanner;

/*
 * 1.Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
 */

public class Exercicio1 {

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

        // Contagem de valores maiores que 10
        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de valores maiores que 10: " + contador);
    }
}