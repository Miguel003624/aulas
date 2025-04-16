package exercicio8;

public class Ave extends Animal {
    private String corPena;

    public Ave(Double peso, Integer idade, Integer membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "corPena='" + corPena + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                '}';
    }

    public String getCorPena() {
        return corPena;
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo grao");
    }

    @Override
    public void emitirSom() {
        System.out.println("piando");
    }

    public void fazerNinho() {
        System.out.println("fazendo ninho");
    }


}
