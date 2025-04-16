package br.com.serratec;

public class PessoaEstadoCivil {
    private String nome;
   private EstadoCivil estadoCivil;

    public PessoaEstadoCivil(String nome, EstadoCivil estadoCivil) {
        this.nome = nome;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "PessoaEstadoCivil{" +
                "nome='" + nome + '\'' +
                ", estadoCivil=" + estadoCivil +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
