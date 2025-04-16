package org.serratec.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        int opcao;
        do {
            System.out.println("1) Adicionar cliente");
            System.out.println("2) Ver todos os clientes");
            System.out.println("0) Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("ID: ");
                    int id = sc.nextInt();

                    if (id <= 0) {
                        System.out.println("id nao pode ser negativa!");
                        break;
                    }
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Idade: ");
                    Integer idade = sc.nextInt();
                    System.out.println("Telefone: ");
                    String telefone = sc.next();

                    Cliente c = new Cliente(id, nome, idade, telefone);
                    clientes.add(c);

                    break;


                case 2:
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }

                    break;

                case 0:
                    System.out.println("Encerrando...");

                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);
        sc.close();
    }
}
