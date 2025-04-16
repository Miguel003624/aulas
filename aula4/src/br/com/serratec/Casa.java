package br.com.serratec;

public class Casa extends Imovel {
    private Boolean garagem;

    public Casa(String local, Double valor, Proprietario proprietario, Boolean garagem) {
        super(local, valor, proprietario);
        this.garagem = garagem;
    }

    @Override
    public String toString() {
        return super.toString() + "Casa{" +
                "garagem=" + (garagem ? "Sim" : "Não") +
                '}';
    }

    public Boolean getGaragem() {
        return garagem;
    }
}
