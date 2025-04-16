package org.serratec.exercicios.ex2;

public abstract class AnimalDeEstimacao implements Animal{
    protected String nome;
    protected Integer idade;

    public AnimalDeEstimacao(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "AnimalDeEstimacao{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void Imprimir() {

    }
}
