package org.serratec.exercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Map<String, Veiculo> mapaVeiculo = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("1) Adicionar veiculo");
            System.out.println("2) Buscar pela placa");
            System.out.println("3) Listar veiculos");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Placa: ");
                    String placa = sc.next();
                    System.out.println("Marca: ");
                    String marca = sc.next();
                    System.out.println("Modelo ");
                    String modelo = sc.next();
                    System.out.println("Ano: ");
                    int ano = sc.nextInt();

                    Veiculo veiculo = new Veiculo(marca, modelo, ano);

                    mapaVeiculo.put(placa, veiculo);
                    break;

                case 2:
                    System.out.println("Insira a placa: ");
                    String placaBuscar = sc.next();

                    Veiculo veiculoEncontrado = mapaVeiculo.get(placaBuscar);
                    if (veiculoEncontrado != null) {
                        System.out.println("Veiculo encontrado: " + veiculoEncontrado);
                    } else {
                        System.out.println("Veiculo não encontrado para a placa: " + placaBuscar);
                    }
                    break;

                case 3:
                    for (Map.Entry<String, Veiculo> tudo : mapaVeiculo.entrySet()) {
                        System.out.println("Placa: " + tudo);
                    }
                    break;

                default:
                    System.out.println("Opcao invalida!");

                sc.close();
            }
        } while (opcao != 0);

    }
}
