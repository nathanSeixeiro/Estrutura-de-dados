import java.util.Random;

public class PlanteUmaArvore {
    public static void main(String[] args) {
        Random r = new Random();

        ArvoreBinaria arvore = new ArvoreBinaria();

        for (int i = 0; i <=10 ; i++) {
            int n = r.nextInt(100);
            System.out.print(n + " ");
            arvore.insere(n);
        }

        System.out.println("\n" + arvore.emOrdem());
        System.out.println(arvore.emPreOrdem());
    }
}

class ArvoreBinaria {
    private class NoBin {
        private int info;
        private NoBin esq;
        private NoBin dir;

        public NoBin(int info) {
            this.info = info;
        }

        public NoBin getEsq() {
            return esq;
        }

        public void setEsq(NoBin esq) {
            this.esq = esq;
        }

        public NoBin getDir() {
            return dir;
        }

        public void setDir(NoBin dir) {
            this.dir = dir;
        }

        public int getInfo() {
            return info;
        }

        @Override
        public String toString() {
            return "[" + info + "]";
        }        
    }

    private NoBin raiz;

    public void insere (int i) {
        NoBin novo = new NoBin(i);
        if (raiz == null) raiz = novo;
        else insereRec(novo, raiz);
    }

    public void insereRec(NoBin novo, NoBin atual) {
        if (novo.getInfo() <= atual.getInfo()) { // vai para a esquerda
            if (atual.getEsq() == null) atual.setEsq(novo);
            else insereRec(novo, atual.getEsq()); // recursividade
        } else { // vai para a direita
            if (atual.getDir() == null) atual.setDir(novo);
            else insereRec(novo, atual.getDir()); // recursividade            
        }
    }

    public String emOrdem () {
        if (raiz == null) return "Àrvore vazia";
        else {
            return emOrdemRec(raiz);
        }
    }

    public String emOrdemRec(NoBin atual) {
        if (atual != null) return emOrdemRec(atual.getEsq()) + atual + emOrdemRec(atual.getDir());
        return ""; // dentro do if acima possui return então aqui não é necessário o else
    }

    public String emPreOrdem() {
        if (raiz == null) return "Àrvore vazia";
        else {
            return emPreOrdemRec(raiz);
        }
    }

    public String emPreOrdemRec(NoBin atual) {
        if (atual != null) return atual + emPreOrdemRec(atual.getEsq()) + emPreOrdemRec(atual.getDir());
        return "";
    }
}