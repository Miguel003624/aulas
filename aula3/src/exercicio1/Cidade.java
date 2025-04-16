package exercicio1;

public class Cidade extends Estado{
    private String nomeCidade;
    private Estado estado;

    public Cidade(String nomeCidade, Estado estado) {
        super(null,null);
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nomeCidade='" + nomeCidade + '\'' +
                ", estado=" + estado +
                '}';
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }
}
