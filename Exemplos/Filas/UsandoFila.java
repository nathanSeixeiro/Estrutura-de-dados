
import java.util.Random;

public class UsandoFila {
    public static void main (String[] args) {
        Fila fila = new Fila();
        Random rand = new Random();

        do {
            if (rand.nextInt(2) == 0) {
                fila.enfileirar(rand.nextInt(10));
            } else {
                if (!fila.estaVazia())
                System.out.println(fila.desenfileirar()+ " foi atendido");
            }
            System.out.println(fila);
        } while (!fila.estaVazia());


    }
}

class Fila {
    private class No {
        private int conteudo;
        private No proximo;
    
        public No(int conteudo) {
            this.conteudo = conteudo;
        }

        public int getConteudo() {
            return conteudo;
        }
        public void setConteudo(int conteudo) {
            this.conteudo = conteudo;
        }
        public No getProximo() {
            return proximo;
        }
        public void setProximo(No proximo) {
            this.proximo = proximo;
        }

        @Override
        public String toString() {
            String str = "";
            str += "Conteudo[" + this.conteudo + "]";
            return str;
        }
    }

    private No primeiro;
    private No ultimo;
    private int tamanho;

    public No getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    public No getUltimo() {
        return ultimo;
    }
    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void enfileirar (int conteudo) {
        No novoNo = new No(conteudo);
        if (estaVazia()) {
            primeiro = novoNo;            
        }
        else {
            ultimo.setProximo(novoNo);
        }
        tamanho++;
        ultimo = novoNo;
    }

    public int desenfileirar() {
        int i = primeiro.getConteudo();
        
        primeiro = primeiro.getProximo();
        tamanho--;

        if (tamanho == 0) {
            ultimo = null;
        }
        return i;
    }
    public int peek() {
        return primeiro.getConteudo();
    }    
    public boolean estaVazia() {
        return primeiro == null;
    }
    @Override
    public String toString() {
        String s = "Fila:";
        if (estaVazia()) {
            s += "vazia";
        } else {
            No runner = primeiro;
            while (runner != null) {
                s += runner + " -> ";
                runner = runner.getProximo();
            }
            s += "//";
        }
        return s;
    }    
}

