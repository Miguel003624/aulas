package org.serratec.ex1;

public final class Direito extends Faculdade implements Eventos, Oab {
    private int tempoDuracao;

    public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
        super(nome, nomeFaculdade, bloco);
        this.tempoDuracao = tempoDuracao;
    }

    @Override
    public String toString() {
        return "Direito{" +
                "tempoDuracao=" + tempoDuracao +
                '}';
    }

    @Override
    public String matrizCurricular() {
        return "";
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }



    @Override
    public String programacao() {
        return "";
    }

    @Override
    public void conteudoEventos() {

    }

    @Override
    public Boolean realizarProva() {
        return null;
    }

    @Override
    public void fazerMatricula() {
        super.fazerMatricula();
    }
}
