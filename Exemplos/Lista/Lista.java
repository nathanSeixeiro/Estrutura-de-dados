public class Lista {
    
    private No firstNo;

    public No getfirstNo() {
        return firstNo;
    }

    public void setfirstNo(No firstNo) {
        this.firstNo = firstNo;
    }

    public boolean isEmpty() {
        return firstNo == null;
    }

    @Override 
    public String toString(){
        String aux = "list: ";
        if (isEmpty()) {
            aux += "empty";
        }else{
            No runner = firstNo;
            while(runner != null){
                aux += runner.getConteudo() + " ";
                runner = runner.getProximoNo();
            }
            aux += "\\\\";
        }
        return aux;
    }

    public void insert(int info) {
        No newNo = new No(info);
        if (!this.isEmpty()) {
            newNo.setProximoNo(firstNo);
        }
        setfirstNo(newNo);
    }

    public void insertEnd(int info){
        No newNo = new No(info);
        if (isEmpty()) {
            setfirstNo(newNo);
        }else{
            No runner = firstNo;
            while (runner.getProximoNo() != null) {
                runner = runner.getProximoNo();
            }
            runner.setProximoNo(newNo);
        }
    }

    public int remove() {
        int aux = firstNo.getConteudo();
        firstNo = firstNo.getProximoNo();
        return aux;
    }

    public int removeEnd() {
        int aux = firstNo.getConteudo();
        if (firstNo.getProximoNo() == null) {            
            setfirstNo(null);
            return aux;
        }

        No runner = firstNo;

        while (runner.getProximoNo().getProximoNo() != null) {
            runner = runner.getProximoNo();            
        }

        aux = runner.getProximoNo().getConteudo();
        runner.setProximoNo(null);
        return aux;

    }
}


