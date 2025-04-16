package br.com.serratec;

public class TesteConta2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Hugo", 1000.);

        try {
            cc.investimento(1000.);
        } catch (ContaCorrenteException e) {
            throw new RuntimeException(e);
        }
    }
}
