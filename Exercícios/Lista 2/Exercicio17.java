/*
 * 17 - Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva
 * o n  ́umero de alunos cuja pior nota foi na prova 1, o n  ́umero de alunos cuja pior nota foi
 * na prova 2, e o n  ́umero de alunos cuja pior nota foi na prova 3. Em caso de empate
 * das piores notas de um aluno, o crit  ́erio de desempate  ́e arbitr  ́ario, mas o aluno deve ser
 * contabilizado apenas uma vez
 */

import java.util.Random;

public class Exercicio17 {
    public static void main(String [] args) {
        Random rand = new Random();

        int[][] matriz = new int[10][3];

        // preenchendo e exibindo a matriz no mesmo laço
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // verificando as notas 

        int[] MenorNotaAlunos = new int[3];
        /* 
         * indice 0 -> Aluno 1
         * indice 1 -> Aluno 2
         * indice 2 -> Aluno 3
         */

        /* adicionando o primeiro valor de cada coluna, desta forma eu ja tenho
        um valor inicial para começar a comparar */ 
        MenorNotaAlunos[0] = matriz[0][0];
        MenorNotaAlunos[1] = matriz[0][1];
        MenorNotaAlunos[2] = matriz[0][2];
        /*
         * para comparar eu organizei a matriz de uma forma diferente, é como se eu tivesse
         * "deitado" a matriz, exemplo:
         * Matriz na atribuição com random:
         * 00 01 02
         * 10 11 12
         * 20 21 22
         * 30 31 32
         * 
         * Matriz na comparação:
         * 00 10 20 30
         * 01 11 21 31
         * 02 12 22 32
         * 
         * Dessa forma fica mais facil varrer o vetor para realizar as comparações (no meu ver é claro)
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                /*Comparação dos valores da coluna
                 * como o vetor esta "invertido", é preciso inverter a posição do i e j na atribuição
                 * ao inves de matriz[i][j] usa-se matriz[j][i]
                */
                
                if (MenorNotaAlunos[i] > matriz[j][i]) {
                    MenorNotaAlunos[i] = matriz[j][i];
                }
            }
        }

        // exibindo as menores notas dos alunos
        for (int i = 0; i < MenorNotaAlunos.length; i++) {
            System.out.println("A menor nota do aluno " + (i+1) + " foi " + MenorNotaAlunos[i]);
        }
        
        
    }    
}