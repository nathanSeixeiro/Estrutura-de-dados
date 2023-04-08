import java.util.Random;

/*
 * 8. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos
 * na ordem inversa.
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[6];

        // inserindo e mostrando o vetor no mesmo laço
        System.out.println("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(10); 
            System.out.print(vetor[i] + " ");   
        }
        
        // mostrando o vetor ao contrário
        System.out.println("\nVetor ao coontrario");
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
