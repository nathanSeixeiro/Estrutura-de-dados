import java.util.Random;

/*
 * Crie um programa que le 6 valores inteiros pares e, em seguida, mostre na tela os valores
 * lidos na ordem inversa.
 */

public class Exercicio9 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] vetor = new int[6];
        int i = 0;

        // adicionando apenas numeros pares ao vetor
        System.out.println("Vetor: ");
        while (i < vetor.length) {
            int auxiliar = rand.nextInt(100);
            // se a variavel for ímpar, o laço se repete sem incrementar o i
            // e assim sucessivamente ate a variavel auxiliar receber um valor par
            if (auxiliar % 2 == 0) {
                vetor[i] = auxiliar;
                System.out.print(vetor[i] + " ");
                i++;                
            }
            // Importante: debugue o codigo para entender melhor seu fincionamento
        }

        System.out.println("\nexibindo o vetor ao contratio: ");
        for (int j = vetor.length-1; j >= 0; j--) {
            System.out.print(vetor[j] + " ");            
        }

    }
}
