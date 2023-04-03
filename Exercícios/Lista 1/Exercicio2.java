/*
 * 2. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos.
 */

 import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // criado um vetor para armazenar os 6 valores
        int[] vetor = new int[6];

        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = scan.nextInt();
        }

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        scan.close();
    }
}
