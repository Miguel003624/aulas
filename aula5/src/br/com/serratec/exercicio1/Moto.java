package br.com.serratec.exercicio1;

import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindrada) {
        super(modelo, dataConserto, proprietario);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
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
