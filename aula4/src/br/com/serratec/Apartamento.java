package br.com.serratec;

public class Apartamento extends Imovel{
    private Integer andar;

    public Apartamento(String local, Double valor, Proprietario proprietario, Integer andar) {
        super(local, valor, proprietario);
        this.andar = andar;
    }

    @Override
    public String toString() {
        return super.toString() + "Apartamento{" +
                "andar=" + andar +
                '}';
    }

    public Integer getAndar() {
        return andar;
    }
}
