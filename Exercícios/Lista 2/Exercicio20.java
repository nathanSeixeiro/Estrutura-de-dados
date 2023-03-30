/* 
 * Escreva um programa que leia numeros inteiros no intervalo [0,50] e os armazene em um
 * vetor com 10 posicoes. Preencha um segundo vetor apenas com os numeros ımpares
 * do primeiro vetor. Imprima os dois vetores, 2 elementos por linha.
 */
import java.util.Random;

public class Exercicio20{
    public static void main(String[] args) {

        int[] vetor = new int[51];
        Random rand = new Random(); // o vetor sera prenchido de forma randomica

        int ParesNoVetor = 0; // indicar quantos numeros pares há nesse primeiro vetor

        // preenche o vetor e conta a quantidade de numeros pares
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(101);
            if (vetor[i] % 2 == 0) ParesNoVetor++;
        }

        // vetor criado com base na quantidade de numeros pares
        int[] vetorPares = new int[ParesNoVetor];
        
        /*
        j serve para controlar os índices na inserção de valores no vetorPares
        */ 
        int j = 0; 

        // inserindo os valores pares no vetorPares
        for (int i = 0; i < vetor.length; i++) {            
            if (vetor[i] % 2 == 0) {
                vetorPares[j] = vetor[i];
                j++;
            }               
        }

        // Exibindo valores
        for (int i = 0; i < vetor.length; i++) {
            // por questões de estetica, vou aplicar um espaço adicional caso um valor da primeira coluna for
            // menor que 10, pois quando houver apenas um dígito o valor da segunda coluna ficará desalinhado
            if (i < vetorPares.length) {
                if (vetor[i] < 10) System.out.println(vetor[i] + "  " + vetorPares[i]);
                else System.out.println(vetor[i] + " " + vetorPares[i]);
                // dessa forma as duas colunas ficam alinhadas
            }
            else System.out.println(vetor[i]);            
        }
    }
}