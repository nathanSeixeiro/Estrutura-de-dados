import java.util.Random;

/*
 * 6. Fac¸a um programa que receba do usuario um vetor com 10 posicoes. Em seguida devera
 * ser impresso o maior e o menor elemento do vetor.
 */ 

public class Exercicio6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[10];

        // prenchendo o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }
        
        // #
        int menor = vetor[0], maior = vetor[0];

        // preenchendo o vetor e comparando no mesmo laço
        System.out.println("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {            
            if (menor > vetor[i]) menor = vetor[i];
            if (vetor[i] > maior) maior = vetor[i];
            System.out.print(vetor[i] + " ");
        }

        // usando string format para imprimir os valores
        System.out.println(String.format("\n Menor numero: %d; Maior numero: %d", menor, maior));
    }
}


/*
  # porque ja estou inicializando com um valor do vetor?
  Bom, isso facilita a comparação na hora de varrer o vetor, pois voce
  ja tem uma referencia de um numero que voce sabe que esta no vetor. Imagina que 
  eu atribua 0 a essa variavel e o menor numero do vetor seja 1, no final a variavel
  continuara sendo 0, e isso esta errado pois nesse caso o menor valor é 1. Se o valor que 
  eu acabei de atribuir abaixo não for o menor, não tem problema pois o vetor ira comparar com
  os demais valores e ele sera substituido
*/
