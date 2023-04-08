import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 11. Faca um programa que preencha um vetor com 10 numeros reais, calcule e mostre a
 * quantidade de numeros negativos e a soma dos numeros positivos desse vetor. 
 */

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetor = new double[10];
        int quantidadeNegativos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < vetor.length; i++) {
            // tratamento de exceção para que o codigo não encerre caso o usuario digite '.'
            // ao inves de ',' na insersão de numeros decimais
            while (true) {
                try {                    
                    System.out.print("Digite um valor real: ");
                    vetor[i] = scan.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, use ',' nos numeros decimais");
                    scan.nextLine();
                }
            }
            if (vetor[i] < 0) quantidadeNegativos++;
            else somaPositivos += vetor[i];           
        }

        System.out.println("\nQuantidade de negativos: " + quantidadeNegativos);
        System.out.println("soma dos positivos: " + somaPositivos);        

        scan.close();
    }
}
