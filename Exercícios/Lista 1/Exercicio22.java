import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 22. Ler o nome e o valor de uma determinada mercadoria de uma loja. Sabendo que o
 * desconto para pagamento a vista e de 10% sobre o valor total, calcular o valor a ser
 * pago a vista. Escrever o nome da mercadoria, o valor total, o valor do desconto e o valor
 * a ser pago a vista. 
*/

public class Exercicio22 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da mercadoria");
        String mercadoria = scan.nextLine();
        double preco = 0;

        boolean verificaInput = true;
        while (verificaInput) {
        try{       
        System.out.println("Digite o preço da mercadoria");       
        preco = scan.nextDouble();
        verificaInput = false;
        } catch (InputMismatchException e) {
            System.out.println("Erro, digite novamente");
            scan.next();
        }
        }

        double PrecoComDesconto = preco - (preco * 0.1);

        System.out.println("\nProduto: " + mercadoria);
        System.out.println("Preço: " + preco);
        System.out.println("Desconto: 10%");
        System.out.println("Preço com desconto: " + PrecoComDesconto);

        scan.close();
    }
}


