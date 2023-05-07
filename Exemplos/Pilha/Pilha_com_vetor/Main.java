package Pilha_com_vetor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        PilhaVetor p = new PilhaVetor();
        do {
            if (rand.nextInt(2) == 0) {
                if (!p.isFull()) 
                p.push(rand.nextInt(10));
            }
            else if (!p.isEmpty()) {
                System.out.println(p.pop() + " foi desempilhada");
            }
            System.out.println(p);
        } while (!p.isEmpty());
    }
}

class PilhaVetor {
    private int topo;
    private int[] dados;

    public PilhaVetor() {
        this(10);
    }

    public PilhaVetor (int tamanho) {
        topo = 0; // por clareza
        dados = new int[tamanho];
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public boolean isFull() {
        return topo == dados.length;
    }

    public int peek() {
        return dados [topo -1];
    }

    public void push(int conteudo) {
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
        if (isEmpty()) str += "Empty";
        else {
            for (int i = topo-1; i >= 0; i--) {
                str += dados[i] + " -> ";                
            }
            str += "//";
        }
        return str;
    }
}