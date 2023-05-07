class No {

    private int conteudo;
    private No refproxNo;


    public No() {       
        this.refproxNo = null;
    }

    public No(int conteudo) {
        this.conteudo = conteudo;
    }

    public No (int conteudo, No no) {
        this.conteudo = conteudo;
        this.refproxNo = no;
    }

    public int getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return refproxNo;
    }

    public void setProximoNo(No proxNo) {
        this.refproxNo = proxNo;
    }

    
}
