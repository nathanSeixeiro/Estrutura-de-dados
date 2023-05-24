import java.util.Scanner;

/*
 * Leia uma matriz 5 x 5. Leia tambem um valor ´ X. O programa devera fazer uma busca
 * desse valor na matriz e, ao final, escrever a localizac¸ao (linha e coluna) ou uma mensagem de “nao encontrado”.
 */

public class Exercicio5 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        // Leitura da matriz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Leitura do valor a ser buscado
        System.out.println("Digite o valor a ser buscado:");
        int valorBuscado = scanner.nextInt();

        // Busca do valor na matriz
        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valorBuscado) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                    break;
                }
            }
        }

        // Impressão da localização ou mensagem de não encontrado
        if (encontrado) {
            System.out.println("Valor encontrado na matriz.");
            System.out.println("Localização: Linha " + (linhaEncontrada + 1) + ", Coluna " + (colunaEncontrada + 1));
        } else {
            System.out.println("Valor não encontrado na matriz.");
        }
    }
}