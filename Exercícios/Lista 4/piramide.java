import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		String tipo = scan.next();
		
		
		char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] ABC = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		int controlador = 1;
		int controladorVetor = 0;
		
		switch(tipo) {
		case "minusculas" :					
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= 25; j++) {
					if (j <= 25 - controlador) {
						System.out.print(".");
					} else {
						String str = "";
						for (int k = 0; k <= controladorVetor ; k++) {
							str += abc[k];
							j++;
						}
						System.out.print(str);
						controladorVetor++;
						
					}
				}
				System.out.println();
				controlador++;			
			}
			break;
			
		case "maiusculas":
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= 25; j++) {
					if (j <= 25 - controlador) {
						System.out.print(".");
					} else {
						String str = "";
						for (int k = 0; k <= controladorVetor ; k++) {
							str += ABC[k];
							j++;
						}
						System.out.print(str);
						controladorVetor++;						
					}
				}
				System.out.println();
				controlador++;			
			}
			break;
		}		
		scan.close();
	}
}
