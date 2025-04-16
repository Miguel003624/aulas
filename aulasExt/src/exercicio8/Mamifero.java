package exercicio8;

public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(Double peso, Integer idade, Integer membros, String corPelo) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }

    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero!");
    }


}
