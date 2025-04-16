package org.serratec.ex1;

public final class EnsinoMedio extends ColegioAplicacao {
    private int numeroAlunos;

    public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
        super(nome, nomeCoordenador);
        this.numeroAlunos = numeroAlunos;
    }

    @Override
    public void fazerMatricula() {

    }

    @Override
    public void reuniaodePais() {

    }
}
