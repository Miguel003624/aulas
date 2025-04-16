package br.com.serratec.exercicio1;

public enum TipoServico {
    OLEO(100.), LAVAGEM(50.), REVISAO(200.);

    private Double valorPorServico;

    TipoServico(Double valorPorServico) {
        this.valorPorServico = valorPorServico;
    }

    public Double getValorPorServico() {
        return valorPorServico;
    }
}
