package org.serratec.exercicios;

public class ExemploVarArgs {

    public static void main(String[] args) {
        int total = somar(10, 24, 45, 32);
        int total2 = somar2(12, 12, 56, 61, 145);
        System.out.println("Total: " + total);
        System.out.println("Total2: " + total2);
    }
    //VarArgs
    public static int somar(int... numeros) {
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        return soma;
    }

    public static int somar2(int numero, int... numeros) {
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        return soma * numero;
    }
}
