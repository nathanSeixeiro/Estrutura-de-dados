import java.util.Scanner;

public class radar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int limite = scan.nextInt();
		
		if (limite <= 300 && limite > 0) {
			if (limite <= 107) {
				System.out.println(limite + 7);
			} else {
				double permitido = limite + (limite * 0.07);
                limite = (int) Math.round(permitido);
				System.out.println(limite);
			}
			scan.close();
		}
	}
	

}
