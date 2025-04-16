package br.com.serratec;

//final na classe ta estéril
public class Policial {
    protected String nome;
    //protected final String LOTACAO = "Brasilia";
    protected final String LOTACAO;

    public Policial(String LOTACAO, String nome) {
        this.LOTACAO = LOTACAO;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLOTACAO() {
        return LOTACAO;
    }

    //Não pode ser sobrescrito
    public final void imprimir() {
        System.out.println("Dados do policial!");
    }
}
