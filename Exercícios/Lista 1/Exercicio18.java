import java.util.Random;
import java.util.Scanner;

/*
 * 18. Faca um programa que leia um vetor de 10 numeros. Leia um numero x. Conte os
 * multiplos de um numero inteiro x num vetor e mostre-os na tela.
*/

public class Exercicio18 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nDigite um numero: ");
        int x = scan.nextInt();
        int contadorMultiplos = 0;

        // Para contar a quantidade de multiplos, temos que conferir se é possivel dividir o valor
        // no vetor por x (isto é, sem gerar resto), se essa divisão não gerar resto significa que o numero
        // é um múltiplo de x        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % x == 0) {
                contadorMultiplos++;
            }
        }

        System.out.println("Multiplos de x no vetor: " + contadorMultiplos);

        scan.close();
    }
}
