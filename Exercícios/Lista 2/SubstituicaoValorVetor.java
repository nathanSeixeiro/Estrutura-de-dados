/*
 * 17. Leia um vetor de 10 posições e atribua valor 0 para todos os elementos que possu ́ırem
 * valores negativos.
 */

import java.util.Random;

public class SubstituicaoValorVetor {
    public static void main(String[] args) {
        // Criando um objeto da classe random para gerar os valores
        Random rand = new Random();

        // Criando uma variavel para possibilitar a inserção randomica de numeros negativos
        int PositivoOuNegativo = 0;
        
    
        int[] vet = new int[10];

        /*
         * Explicando:
         * 
         * A classe random gera apenas números positivos, portanto, para atender ao enuncioado, 
         * não faria sentido simplismente preencher os valores atribuindo aos índices do vetor com um 
         * rand.nextLine(); É preciso uma lógica para que numeros negativos entrem no vetor de forma
         * randomica, a variavel PositivoOuNegativo servira justamente para isso
         * 
         * Basicamente a cada loop no laço for a variavel PositivoOuNegativo vai variar entre 0 e 1.
         * Quando essa variavel for 0, o índice do vetor receberá um numero randomico multiplicado por -1,
         * dessa forma, ele se torna negativo. Quando a variavel for 1, o índice do vetor recece um numero 
         * randomica de forma normal (positivo)
         */

        for (int i = 0; i < vet.length; i++) {
            // a cada loop do laço a variavel PositivoOuNegativo varia entre 1 e 0
            PositivoOuNegativo = rand.nextInt(2); // os numeros são gerados a partir do 0, como desejamos
            // que a variavel receba 0 ou 1, passamos 2 como parametro

            if (PositivoOuNegativo == 0) {
                vet[i] = (rand.nextInt(10) + 1) * -1; 
            } else {
                vet[i] = rand.nextInt(10) + 1;
            }
            
            /*
             * Validação da condição proposta no enunciado, se o valor no índice for negativo, esse valor 
             * passa a ser 0
             */
            if (vet[i] < 0) vet[i] = 0;
        }

        // Mostrando o vetor no terminal
        for (int i = 0; i < vet.length; i++) {
              System.out.print(vet[i] + " ");  
        }
    }
}