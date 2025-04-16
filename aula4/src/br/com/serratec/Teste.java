package br.com.serratec;

public class Teste {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Ana");
        Casa c1 = new Casa("Bauneario", 200000., p1, true);


        System.out.println("Valor do Itbi:" + c1.calcularITBI() );
        System.out.println(c1);
    }
}
