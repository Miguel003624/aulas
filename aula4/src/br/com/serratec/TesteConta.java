package br.com.serratec;

public class TesteConta {
    public static void main(String[] args) {


        ContaCorrente cc = new ContaCorrente("Mario", 1000.);
        try {
            cc.saque(2000.);
        } catch (ContaCorrenteException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Saldo atual: " + cc.getSaldo());
        }

    }
}
