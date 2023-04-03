/*
 * 1. Fac¸a um programa que possua um vetor denominado A que armazene 6 numeros inteiros. 
 * O programa deve executar os seguintes passos:
 * 
 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.  
 * (b) Armazene em uma variavel inteira (simples) a soma entre os valores das posicoes A[0], A[1] e A[5] 
 * do vetor e mostre na tela esta soma.
 * (c) Modifique o vetor na posicao 4, atribuindo a esta posicao o valor 100.
 * (d) Mostre na tela cada valor do vetor A, um em cada linha.

 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[6]; // criação do vetor denominado A

        /* Passo a. A inserção dos valores do exercicio sera feita pelo usuario por motivos de simplificação
        já que o código também funciona com outros valores inteiros. */
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite um valor: " );
            A[i] = scan.nextInt();
        }

        // Passo B
        int soma = A[0] + A[1] + A[5];
        System.out.println("\nSoma dos índices 0, 1 e 5 do vetor A: " + soma + "\n");

        // Passo c
        A[4] = 100;
        
        // Passo D
        System.out.println("vetor:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        // fechar o scanner é questão de boa prática
        scan.close();
    }
}
