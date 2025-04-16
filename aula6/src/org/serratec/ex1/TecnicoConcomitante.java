package org.serratec.ex1;

public final class TecnicoConcomitante extends ColegioAplicacao {
    private String nomeCurso;

    public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
        super(nome, nomeCoordenador);
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    @Override
    public void fazerMatricula() {

    }

    @Override
    public void reuniaodePais() {

    }
}
