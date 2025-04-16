package exercicio8;

public class Peixe extends Animal {
    private String corEscama;

    public Peixe(Double peso, Integer idade, Integer membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }

    public String getCorEscama() {
        return corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo minhoca!");
    }

    @Override
    public void emitirSom() {
        System.out.println("blub");
    }

    public void soltarBolha() {
        System.out.println("bolha soltada");
    }


}
