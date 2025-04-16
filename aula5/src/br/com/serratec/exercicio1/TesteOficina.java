package br.com.serratec.exercicio1;

import java.time.LocalDate;

public class TesteOficina {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Marcos");
        Carro c1 = new Carro("SUV", LocalDate.of(2025, 1, 1), p1, "A");

        c1.trocarOleo();
        c1.revisao();

        System.out.println(c1);
    }
}
