package exercicio6;

public class Funcionario extends Pessoa{
    private String setor;
    private Boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, Boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "setor='" + setor + '\'' +
                ", trabalhando=" + trabalhando +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho() {
        trabalhando =! trabalhando;
    }
}
