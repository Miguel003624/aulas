package org.serratec.exemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
    public static void main(String[] args) {
        TreeMap<Aluno, Integer> mapa2 = new TreeMap<>();
        mapa2.put(new Aluno("Joao", 23), 1);
        mapa2.put(new Aluno("Marcos", 17), 200);
        mapa2.put(new Aluno("Maria", 23), 300);

        System.out.println(mapa2);

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(2, "Eu");
        mapa.put(1, "Jorge");
        mapa.put(3, "Mario");

        System.out.println(mapa);
    }
}
