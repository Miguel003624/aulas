package br.com.serratec;

public interface Tributos extends Taxas, ImpostoRenda {
    public Double calcularICMS();
}
