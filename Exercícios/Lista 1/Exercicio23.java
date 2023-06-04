// Ler dois conjuntos de numeros reais, armazenando-os em vetores e calcular o produto 
// escalar entre eles. Os conjuntos tem 5 elementos cada. Imprimir os dois conjuntos e o 
// produto escalar, sendo que o produto escalar e dado por:  x1 ∗ y1 + x2 ∗ y2 + ... + xn ∗ yn.

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vet1 = new double[5];
        double[] vet2 = new double[5];
        double produtoEscalar = 0;

        System.out.println("Preencha os dois vetores: ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.print("Vetor1["+i+"]: ");
            vet1[i] = scan.nextInt();
            System.out.print("Vetor2["+i+"]: ");
            vet2[i] = scan.nextInt();

            produtoEscalar += vet1[i] * vet2[i];            
        }

        
        System.out.println("Produto Escalar: " + produtoEscalar );

        scan.close();
    }
}
