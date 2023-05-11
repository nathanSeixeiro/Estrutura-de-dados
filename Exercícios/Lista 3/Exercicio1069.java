/**
* Exercicio 1069 do beecrowd
* @author Luiz Pereira - luiz.pereira67@fatec.sp.gov.br
*/
/*
 * João está trabalhando em uma mina, tentando retirar o máximo que consegue 
 * de diamantes "<>". Ele deve excluir todas as particulas de areia "." do 
 * processo e a cada retirada de diamante, novos diamantes poderão se formar.
 * Se ele tem como uma entrada .<...<<..>>....>....>>>., três diamantes são 
 * formados. O primeiro é retirado de <..>, resultando  .<...<>....>....>>>.
 * Em seguida o segundo diamante é retirado, restando .<.......>....>>>. O 
 * terceiro diamante é então retirado, restando no final .....>>>., sem 
 * possibilidade de extração de novo diamante.
 * 
 * Entrada: 
 * Deve ser lido um valor inteiro N que representa a quantidade de casos de teste.
 * Cada linha a seguir é um caso de teste que contém até 1000 caracteres, incluindo "<,>, ."
 * 
 * Exemplo de entrada:
 * 2
 * <..><.<..>>
 * <<<..<......<<<<....>
 * 
 * Exemplo de saída:
 * 3
 * 1
 */
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1069 {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        String[] expressoes = new String[N];
        
        for (int i = 0; i < expressoes.length; i++) {            
            expressoes[i] = scan.next();         
        }
        for (int i = 0; i < expressoes.length; i++) {
            verificarExpressao(expressoes[i]);
        }       
        scan.close();
    }

    public static void verificarExpressao(String expressao) {
        pilha p = new pilha(expressao.length());
        int contaDiamantes = 0;

        for (int i = 0; i < expressao.length(); i++) {
            if (expressao.charAt(i) == '<') {
                p.push(expressao.charAt(i));
            } else {
                if (expressao.charAt(i) == '>' && !p.isEmpty()){
                    p.pop();
                    contaDiamantes++;
                } 
            }
        }
        System.out.println(contaDiamantes);
    }
 
}

class pilha {
    private int topo;
    private char[] dados;

    public pilha() {
        this(10);
    }

    public pilha(int tamanho) {
        topo = 0; // por clareza
        dados = new char[tamanho];
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public boolean isFull() {
        return topo == dados.length;
    }

    public char peek() {
        return dados[topo - 1];
    }

    public void push(char conteudo) {
        dados[topo] = conteudo;
        topo++;
        // return dados[dados++] = conteudo; alternativa em uma linha
    }

    public int pop() {
        topo--;
        return dados[topo];
        // return dados[--topo]; alternativa em uma linha
    }

    @Override
    public String toString() {
        String str = "pilha: ";
        if (isEmpty())
            str += "Empty";
        else {
            for (int i = topo - 1; i >= 0; i--) {
                str += dados[i] + " -> ";
            }
            str += "//";
        }
        return str;
    }
}