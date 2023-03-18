import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Pessoa p1;
        Pessoa p2 ;

        
        System.out.println("insira seu ano de nascimento:");
        int anoNasc = scan.nextInt();
        
        System.out.println("insira seu nome:");
        String nome = scan.next();
        
        System.out.println("Insira o nome do seu melhor amigo:");
        String bff = (scan.next()); 
        
        p1 = new Pessoa(anoNasc, nome);
        p2 = new Pessoa(anoNasc, bff);
         
        System.out.println();
        System.out.println(p1.getNome() + " e " + p2.getNome());
        scan.close();
    }
}