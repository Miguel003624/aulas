package br.com.serratec.exercicio1;

import java.time.LocalDate;

public class Carro extends Veiculo{
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "categoria='" + categoria + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valorCobrado=" + valorCobrado +
                ", dataConserto=" + dataConserto +
                ", proprietario=" + proprietario +
                '}';
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public void lavarVeiculo() {
        valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public void trocarOleo() {
        valorCobrado += TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public void revisao() {
        valorCobrado += TipoServico.REVISAO.getValorPorServico();
    }
}
