/* Fac¸a um vetor de tamanho 50 preenchido com o seguinte valor: 
* (i+ 5 ∗ i)%(i+ 1), sendo i a posição do elemento no vetor. 
* Em seguida imprima o vetor na tela.
*/

public class Exercicio19{
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println();
    }
}