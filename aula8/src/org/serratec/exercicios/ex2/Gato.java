package org.serratec.exercicios.ex2;

public class Gato extends AnimalDeEstimacao {
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
