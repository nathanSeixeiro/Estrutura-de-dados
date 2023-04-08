import java.util.Random;

/*
 * 7. Escreva um programa que leia 10 numeros inteiros e os armazene em um vetor. Imprima
 * o vetor, o maior elemento e a posicao que ele se encontra.
 */

public class Exercicio7 {
   public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[10];
        int maior;

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
            System.out.print(vetor[i] + " ");
        }

        maior = vetor[0];
        int posicaoMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            // comparação para achar o maior numero do vetor e armazenas sua posição
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;  
            }
        }

        System.out.println(String.format("\n%d é o maior número e se enconta na posição %d do vetor", maior, posicaoMaior));
    }
} 
