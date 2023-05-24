import java.util.Scanner;

/*
 * Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao acima da diagonal principal.
 */

public class Exercicio8 {

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

        // Cálculo da soma dos elementos acima da diagonal principal
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        // Impressão da soma
        System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);
    }
}