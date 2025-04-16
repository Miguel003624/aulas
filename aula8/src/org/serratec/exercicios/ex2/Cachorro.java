package org.serratec.exercicios.ex2;

public class Cachorro extends AnimalDeEstimacao {
    private String raca;

    public Cachorro(String nome, Integer idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + raca + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void Imprimir() {
        super.Imprimir();
    }
}
