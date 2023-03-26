
public class Pessoa {
    private int anoNasc;
    private String nome;
    private Pessoa bff;

    public Pessoa (int anoNasc, String nome){
        this.nome = nome;
        this.anoNasc = anoNasc;
    }

    public String getNome(){ 
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoNasc(){
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }

    public Pessoa getBff() {
        return bff;
    }

    public void setBff(Pessoa bff) {
        this.bff = bff;
    }

    public String toString(){
        String s = "Pessoa: nome: " + nome + ", ano de nascimento: " + anoNasc + ", melhor amigo: ";
        if(bff != null && bff.getNome() != null){
            s = s + bff.getNome() + " ]";
        }else{
            s = s + "ainda não tem nenhum amigo";
        }

        return s;
    }
}