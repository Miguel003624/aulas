package org.serratec.ex2;

public class Teste {
    public static void main(String[] args) {


        String palavra = null;
        try {
            String caixalAlta = palavra.toUpperCase();
            System.out.println(caixalAlta);
        } catch (NullPointerException n) {
            System.out.println("burro");
        }
    }
}
