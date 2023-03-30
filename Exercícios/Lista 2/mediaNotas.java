/*
 * 10. Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
 * e imprima a média geral
 */

import java.util.Random;

public class mediaNotas {
    public static void main(String [] args) {
        Random rand = new Random();

        int[] notas = new int[15];

        // usando a classe Random para gerar as notas
        for (int i = 0; i < notas.length; i++) {
            // o codigo abaixo atribui randomicamente um valor 
            // de 0 a 10 para cada índice do vetor
            notas[i] = rand.nextInt(10); 
        }
        // soma e exibição dos valores no mesmo vetor
        int soma = 0;
        System.out.println("notas dos alunos: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
            soma += notas[i];
        }
        // pular uma linha
        System.out.println();

        // atribuindo a resposta a uma String
        String resposta = "Média de nota dos alunos: " + soma/notas.length;
        
        // Exibindo a resposta 
        System.out.println(resposta);
    }
}