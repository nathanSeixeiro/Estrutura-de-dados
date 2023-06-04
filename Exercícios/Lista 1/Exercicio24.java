// Faca um programa que leia dez conjuntos de dois valores, o primeiro representando o
// numero do aluno e o segundo representando a sua altura em metros. Encontre o aluno 
// mais baixo e o mais alto. Mostre o numero do aluno mais baixo e do mais alto, juntamente 
// com suas alturas.

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vetor = new double[4];
        int maisBaixo = 0, maisAlto = 0;

        for (int i = 0; i < vetor.length; i+=2) {
            System.out.print("id do aluno: " );
            vetor[i] = scan.nextDouble();
            System.out.println("altura do aluno: ");
            vetor[i+1] = scan.nextDouble();
            
            if (i != 0 && i % 2 != 0 && vetor[i] < maisBaixo) {
                maisBaixo = i;
            } else if (vetor[i] > maisAlto) {
                maisAlto = i;
            }
        }
        
        System.out.println(String.format("O aluno mais baixo possui o id %d e alruta de %.2f", vetor[maisBaixo-1], vetor[maisBaixo]));
        System.out.println(String.format("O aluno mais alto possui o id %d e alruta de %.2f", vetor[maisAlto-1], vetor[maisAlto]));
        scan.close();
    }
}
