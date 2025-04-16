package org.serratec;

public class Teste {
    public static void main(String[] args) {
        try {
            int[] vetor = {10, 20, 30, 40, 50};
            String a = null;
            int c = 10;
            int d = 0;

            System.out.println(a.equals("aula"));
            System.out.println(vetor[0] / d);
            System.out.println(vetor[5] / c);

        } catch (ArithmeticException e) {
            System.out.println("nao da");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nao existe");
        } catch (NullPointerException e) {
            System.out.println("a é null");
        }
    }
}
