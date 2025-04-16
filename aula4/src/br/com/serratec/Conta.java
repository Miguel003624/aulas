package br.com.serratec;

public interface Conta {
    public static final Double TAXAS = 10.;
    //nao precisa

    public Boolean saque(Double valor);
    public void deposito(Double valor);



}
