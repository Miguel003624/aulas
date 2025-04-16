package org.serratec.exercicios.ex2;

import java.util.Scanner;

public class TesteLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja loja = new Loja("PetShop");
        int opcao;


        try {

            do {
                System.out.println("***********PetShop***********");
                System.out.println("Opções: ");
                System.out.println("1) Cadastrar Cachorro");
                System.out.println("2) Cadastrar Gato");
                System.out.println("3) Listar animais");
                System.out.println("4) Adotar animal");
                System.out.println("0) Sair");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Nome do cachorro: ");
                        String nomeC = sc.next();
                        System.out.println("Idade do cachorro: ");
                        int idadeC = sc.nextInt();
                        System.out.println("Raça do cachorro: ");
                        String racaC = sc.next();
                        loja.adicionarAnimal(new Cachorro(nomeC, idadeC, racaC));
                        break;

                    case 2:
                        System.out.println("Nome do gato: ");
                        String nomeG = sc.next();
                        System.out.println("Idade do gato: ");
                        int idadeG = sc.nextInt();
                        System.out.println("Cor do gato: ");
                        String corG = sc.next();
                        loja.adicionarAnimal(new Gato(nomeG, idadeG, corG));
                        break;

                    case 3:
                        System.out.println("Lista de animais: ");
                        loja.listarAnimais();
                        break;

                    case 4:
                        System.out.println("Adotar animal por indice: ");
                        int index = sc.nextInt();
                        loja.adotarAnimal(index);
                        break;

                    default:
                        System.out.println("Opcao Invalida");
                }
            } while (opcao != 0);
            sc.close();

        } catch (AnimalException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
