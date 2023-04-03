/*
 * 3. Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das
 * componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
 * 10 elementos cada. Imprimir todos os conjuntos.
 */

 import java.util.Scanner;
 import java.lang.Math;

public class Exercicio3 {
    public static void main(String[] args) {            
        Scanner scan = new Scanner(System.in);

        // vetor que vai receber os numeros
        double[] vetorEntrada = new double[10];
        double[] vetorQuadrados = new double[10];

        System.out.println("Preencha o vetor com números reais");
        for (int i = 0; i < vetorEntrada.length; i++) {
            System.out.print("[" + i +"]: ");
            vetorEntrada[i] = scan.nextDouble();            
        }

        // calculando o quadrado de cada índice e armazenando esse valor em outro vetor
        for (int i = 0; i < vetorEntrada.length; i++) {
            vetorQuadrados[i] = Math.pow(vetorEntrada[i], 2); // *
        }

        scan.close();
    }
}


/* 
    * Random é uma classe no java que permite gerar numeros randomicos (aleatórios) 
    
*/