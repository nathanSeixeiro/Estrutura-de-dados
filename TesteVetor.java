import java.util.Scanner;

public class TesteVetor {
    static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        
        int n;
        do{
    		System.out.print("Qual o tamanho do vetor?");
            n = scan.nextInt();
        } while(n < 0);

        int[] vet = new int[n];
        
        lerVetor(vet);
        mostrarVetor(vet);

        int op; 
        do {
        	op = 0;
	        System.out.println();
	        System.out.println("esolha uma opção \n1- calcaular a soma dos items do vetor \n2- calcular a média dos valores do vetor \n3- encontrar o maior valor do vetor \n4- encontrar o menor valor do vetor \n5- Verificar quantos valores estão a acima da média");
	        op = scan.nextInt();
	        
	        switch(op) {
	        case 1: 
	        	int soma = soma(vet);
	        	System.out.println("\nValor da soma dos itens do vetor: " + soma);
	        	
	        	break;
	        case 2:
	        	double media = media(vet);
	        	System.out.println("\nValor da média dos itens do vetor: " + media);
	        	break;
	        case 3:
	        	int maiorValor = maiorValor(vet);
	        	System.out.println("\nMaior valor encontrado no vetor: " + maiorValor);
	        	break;
	        case 4:
	        	int menorValor = menorValor(vet);
	        	System.out.println("\nMenor valor encontrado no vetor: " + menorValor);
	        	break;
	        case 5: 
	        	int acimaDaMedia = acimaDaMedia(vet);
	        	System.out.println(acimaDaMedia + " valores acima da media");
	        	
	        }
        } while(op < 6);
        
       System.out.println("Finish program");
           
        scan.close();
	}

    public static void lerVetor(int[] vetor) {	    
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite o elemento "+i+": ");
			vetor[i] = scan.nextInt();
		}
	}

    public static void mostrarVetor(int[] vetor) {
        System.out.println("vetor:");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static int soma(int[] vetor) {
    	int soma = vetor[0];
    	for(int i = 1; i < vetor.length; i++) {
    		soma += vetor[i];
    	}
    	return soma;
    }
    
    public static double media(int[] vetor) {
    	int soma = soma(vetor);
    	int media = soma / vetor.length;
    	return media;
    }

    public static int maiorValor(int[] vetor) {
    	int maiorValor = vetor[0];
    	for(int i = 1; i < vetor.length; i++) {
    		if(vetor[i] > maiorValor) {
    			maiorValor = vetor[i];
    		}
    	}
    	return maiorValor;
    }
    
    public static int menorValor(int[] vetor) {
    	int menorValor = vetor[0];
    	for(int i = 1; i < vetor.length; i++) {
    		if(vetor[i] < menorValor) {
    			menorValor = vetor[i];
    		}
    	}
    	return menorValor;
    }
   
    public static int acimaDaMedia(int[] vetor) {
    	double media = media(vetor);
    	int acima = 0;    	
    	for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] > media) {
				acima++;
			}
		}
       	return acima;
    }
}