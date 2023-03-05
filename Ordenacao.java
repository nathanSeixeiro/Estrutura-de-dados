import java.util.Random;
import java.util.Scanner;
import java.util.Date;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[];
        int n;

        do {
            System.out.print("Qual o tamanho do vetor?");
            n = scan.nextInt();

            if (n > 0) {
                vetor = new int[n];

                geradorDeValor(vetor);
                Long inicio = new Date().getTime(); //testando tempo de instanciação 
                // mostrarVetor("Desordenado: ", vetor);
                System.out.println();
                ordenaVetor(vetor);
                Long fim = new Date().getTime(); //testando tempo de instanciação 
                System.out.println("Para o tamanho " + vetor.length + " demorou " + (fim - inicio) + " milissegundos \n");
                // mostrarVetor("Ordenado: ", vetor);
            }else{
                System.out.println("Insira um numero maior que 0");
            }
        } while (n > 0);
        scan.close();
    }

    static void mostrarVetor(String msg, int[] vetor) {
        System.out.println(msg);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[ " + vetor[i] + " ], ");
        }
        System.out.println();
    }

    static void geradorDeValor(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10 * vetor.length);
        }

    }

    static void ordenaVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    // aplicar outros metodos

}