import java.util.Random;

public class SubstituicaoValorVetor {
    public static void main(String[] args) {
        Random rand = new Random();
        int PositivoOuNegativo = 0;        
        int[] vet = new int[10];

        for (int i = 0; i < vet.length; i++) {
            PositivoOuNegativo = rand.nextInt(2);
            if (PositivoOuNegativo == 0) {
                vet[i] = (rand.nextInt(10) + 1) * -1; 
            } else {
                vet[i] = rand.nextInt(10) + 1;
            }

            if (vet[i] < 0) vet[i] = 0;
        }

        for (int i = 0; i < vet.length; i++) {
              System.out.print(vet[i] + " ");  
        }
    }
}