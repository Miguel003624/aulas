package org.serratec.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;
        do {
            System.out.println("BIBLIOTECA");
            System.out.println("1) Adicionar Livro");
            System.out.println("2) Listar livros");
            System.out.println("3) Pesquisar livros por faixa de preço");
            System.out.println("4) Calcular o total em dinheiro em livros");
            System.out.println("0) Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("Preco: ");
                    Double preco = sc.nextDouble();
                    try {
                        Livro livro = new Livro(titulo, autor, preco);
                        biblioteca.adicionar(livro);
                        System.out.println("Livro adicionado com sucesso");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    biblioteca.listar();
                    break;
                case 3:
                    System.out.println("Preco minimo: ");
                    Double min = sc.nextDouble();
                    System.out.println("Preco Maximo: ");
                    Double max = sc.nextDouble();
                    int encontrados = biblioteca.pesquisarFaixaDePreco(min, max);
                    System.out.println("Total de livros encontrados: " + encontrados);
                    break;
                case 4:
                    System.out.println("Total em R$: %.2f\n" + biblioteca.calcularTotalLivros());
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
