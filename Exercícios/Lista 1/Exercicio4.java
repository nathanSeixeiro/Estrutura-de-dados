/*
 * 4. Faça um programa que leia um vetor de 8 posiçõoes e, em seguida,
 * leia tambem dois valores X e Y quaisquer correspondentes a duas 
 * posições no vetor. Ao final seu programa devera escrever a soma dos 
 * valores encontrados nas respectivas posições X e Y.
 */

 import java.util.Random;
 import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[8];

        // preenchendo o vetor randomicamente com numeros de zero a mil
        System.out.println("vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(1000);
            System.out.print(vetor[i] + " " );
        }

        int x = 0, y = 0;

        do {
        System.out.println("(X e Y precisam estar no conjunto de índices do vetor)");
        System.out.print("\nDigite X: ");
        x = scan.nextInt();
        System.out.print("\nDigite Y: ");
        x = scan.nextInt();
        } while((x < 0 || x > 7) && (y < 0 || y > 7));

        System.out.println("Soma dos indices selecionados: " + (vetor[x] + vetor[y]));

        scan.close();
    }
}
