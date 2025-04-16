package br.com.serratec;

public class TV {
    private String modelo;
    private Marca marca;

    public TV(String modelo, Marca marca) {
        this.modelo = modelo;
        this.marca = marca;
   }

    @Override
    public String toString() {
        return "TV{" +
                "modelo='" + modelo + '\'' +
                ", marca=" + marca +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public Marca getMarca() {
        return marca;
    }
}
