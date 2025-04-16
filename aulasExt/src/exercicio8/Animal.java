package exercicio8;

public abstract class Animal {
    protected Double peso;
    protected Integer idade;
    protected Integer membros;

    public Animal(Double peso, Integer idade, Integer membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }

    public Double getPeso() {
        return peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public Integer getMembros() {
        return membros;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
