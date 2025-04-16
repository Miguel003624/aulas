package exercicio1;

public class Atleta implements Olimpiadas {
    private String nome;
    private double peso;
    private String modalidade;
    private Pais pais;
    private int totalParticipantes;

    public Atleta(String nome, double peso, Pais pais) {
        this.nome = nome;
        this.peso = peso;
        this.pais = pais;
        totalParticipantes = 0;

    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", modalidade='" + modalidade + '\'' +
                ", totalParticipantes=" + totalParticipantes +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getTotalParticipantes() {
        return totalParticipantes;
    }

    public void setTotalParticipantes(int totalParticipantes) {
        this.totalParticipantes = totalParticipantes;
    }

    @Override
    public String verificaSituacao() {
        if (getPeso() > 90) {
            setModalidade("peso pesado");
            return " participará";

        } else if (getPeso() >= 60) {
            setModalidade("peso médio");
            return " participará";

        } else return " Não participará";
    }
}
