package exercicio7;

public class Bolsista extends Aluno{
    private Double bolsa;

    public Bolsista(String nome, Integer idade, String sexo, int matricula, String curso, Double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa=" + bolsa +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public Double getBolsa() {
        return bolsa;
    }

    public void renovarBolsa() {

    }

    @Override
    public void pagarMensalidade() {
        System.out.println();
    }
}
