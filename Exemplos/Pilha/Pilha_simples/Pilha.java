public class Pilha {
    
    private No topo;

    public int peek() {
        return topo.getConteudo();
    }

    public No gettopo() {
        return topo;
    }

    public void setTopo(No topo) {
        this.topo = topo;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    @Override 
    public String toString(){
        String aux = "pilha: ";
        if (isEmpty()) {
            aux += "empty";
        }else{
            No runner = topo;
            while(runner != null){
                aux += runner.getConteudo() + "\n";
                runner = runner.getProximoNo();
            }
            aux += "\\\\";
        }
        return aux;
    }

    public void push(int info) {
        No newNo = new No(info);
        if (!this.isEmpty()) {
            newNo.setProximoNo(topo);
        }
        topo = newNo;
    }
    
    public int pop() {
        int aux = topo.getConteudo();
        topo = topo.getProximoNo();
        return aux;
    }    
}


