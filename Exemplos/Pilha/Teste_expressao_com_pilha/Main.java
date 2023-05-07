package Teste_expressao_com_pilha;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String expressao = JOptionPane.showInputDialog("Digite sua expressão");
        pilha p = new pilha(expressao.length());

        boolean exprCorreta = true;
        for (int i = 0; i < expressao.length() && exprCorreta; i++) {
            if (expressao.charAt(i) == '(') {
                p.push(expressao.charAt(i));
            } else {
                if (p.isEmpty()) {
                    exprCorreta = false;
                } else {
                    p.pop();
                }
            }
        }
        if (exprCorreta && p.isEmpty()) JOptionPane.showMessageDialog(null, "Expressão correta", "Resultado da análise", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, "Expressão incorreta", "Resultado da análise", JOptionPane.WARNING_MESSAGE);

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