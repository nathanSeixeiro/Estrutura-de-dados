import java.util.Random;


/*
 * Faca um programa que receba do usuario dois vetores, A e B, com 10 numeros inteiros
 * cada. Crie um novo vetor denominado C calculando C = A - B. Mostre na tela os dados
 * do vetor C.
 */

public class Exercicio21 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        
        
        for (int i = 0; i < vetorC.length; i++) {
            vetorA[i] = rand.nextInt(100);
            vetorB[i] = rand.nextInt(100);
            vetorC[i] = vetorA[i] - vetorB[i];
        }
        
        System.out.println("Vetor A");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\nVetor B");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor C (Subtrações)");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }
}
