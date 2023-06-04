import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){

		
			String palindromo = scan.nextLine();
			char[] c;
			char[] palin;
		palindromo = palindromo.toLowerCase();
		
		c = new char[palindromo.length()];
		palin = palindromo.toCharArray();
		
		if (c.length <= 10000) {		
			
        int embranco = 0;
        int z = 0;
        while (z < palin.length) {
            if (Character.isWhitespace(palin[z])) {
                char aux = palin[z];
                for (int k = z; k < palin.length; k++) {
                    if (k == (palin.length -1)) {
                        palin[k] = aux;
                        embranco++;
                    }
                    else palin[k] = palin[k+1];
                }                							
            }
            if (!Character.isWhitespace(palin[z]) || z >= palin.length - embranco) z++;
        }
		
		int j = 0;
		for (int i = palin.length - 1; i >= 0; i--) {
			c[j] = palin[i];
			j++;			
		}		
        int f = 0;
        embranco = 0;
		while (f < palin.length) {
			if (Character.isWhitespace(c[f])) {
				char aux = c[f];
				for (int k = f; k < c.length; k++) {
					if (k == (c.length -1)) {
                        c[k] = aux;
                        embranco++;
                    }
					else c[k] = c[k+1];
				}                							
			}
            if (!Character.isWhitespace(c[f]) || f >= palin.length - embranco) f++;
		}
		
		int qtd = 0;
		
		for (int i = 0; i < palin.length - embranco; i++) {
			if (palin[i] == c[i]) qtd++;
		}
		
		boolean igual = qtd == palin.length - embranco;
		
		if (igual) System.out.println("Parabens, voce encontrou o Palindromo Perdido!");
		else System.out.println("A busca continua, o Palindromo Perdido ainda nao foi encontrado.");		
		
		}
	}
		scan.close();
	}

}
