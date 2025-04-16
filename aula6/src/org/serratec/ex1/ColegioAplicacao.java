package org.serratec.ex1;

public abstract class ColegioAplicacao extends Universidade {
    protected String nomeCoordenador;

    public ColegioAplicacao(String nome, String nomeCoordenador) {
        super(nome);
        this.nomeCoordenador = nomeCoordenador;
    }

    @Override
    public String toString() {
        return "ColegioAplicacao{" +
                "nomeCoordenador='" + nomeCoordenador + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public abstract void reuniaodePais();
}
