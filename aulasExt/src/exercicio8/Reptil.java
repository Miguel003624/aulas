package exercicio8;

public class Reptil extends Animal{
    private String corEscama;

    public Reptil(Double peso, Integer idade, Integer membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return "Reptil{" +
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
        System.out.println("rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo mosca!");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil!");
    }
}
