package org.serratec.ex1;

public final class Fisioterapia extends Faculdade implements Eventos {

    public Fisioterapia(String nome, String nomeFaculdade, int bloco) {
        super(nome, nomeFaculdade, bloco);
    }

    @Override
    public String matrizCurricular() {
        return "";
    }


    @Override
    public String programacao() {
        return "";
    }

    @Override
    public void conteudoEventos() {

    }

    @Override
    public void fazerMatricula() {
        super.fazerMatricula();
    }
}
