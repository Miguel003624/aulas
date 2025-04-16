package testes;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {

        System.out.println("Entre com um numero: ");
        try {
            Double num = leNumero();
            System.out.println("voce digitou: " + num);
        } catch (Exception e) {
            System.out.println("entrada invalida");
        }

    }

//usado em metodos, para quem for chamar resolver
    public static Double leNumero() throws Exception {
        Scanner sc = new Scanner(System.in);
        Double num = sc.nextDouble();
        return num;
    }
}
