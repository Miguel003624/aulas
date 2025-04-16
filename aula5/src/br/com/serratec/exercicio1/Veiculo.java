package br.com.serratec.exercicio1;

import java.time.LocalDate;

public class Veiculo implements Oficina{
    protected String modelo;
    protected Double valorCobrado;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
        valorCobrado = 0.;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", valorCobrado=" + valorCobrado +
                ", dataConserto=" + dataConserto +
                ", proprietario=" + proprietario +
                '}';
    }

    public Double getValorCobrado() {
        return valorCobrado;
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
