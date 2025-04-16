package testes;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {

//        int contador = 1;
//
//        while (contador <= 50) {
//            System.out.println(contador);
//            contador++;
//        }


        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome ou s para sair: ");
        nome = sc.nextLine();
        while (!nome.equals("s")) {
            System.out.println("Bem vindo " + nome);
            System.out.println("Digite seu nome ou s para sair: ");
            nome = sc.nextLine();
        }

    }
}
