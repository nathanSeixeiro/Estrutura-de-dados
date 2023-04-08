/*
 * 5. Leia um vetor de 10 posic¸oes. Contar e escrever quantos valores pares ele possui.
 */

 import java.util.Random;
public class Exercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[10];

        int contaPares = 0; 

        // adicionando ao vetor, verificando se é par e imprimindo no mesmo laço
        System.out.println("vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(1000); // preenchendo o vetor com numeros de 0 a 999
            if (vetor[i] % 2 == 0) contaPares++; // verificando se é par (se a divisão por 2 não possuir resto, é par)
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nQuantidade de pares no vetor: " + contaPares);
    }
}
