package org.serratec.exercicio1;

import java.util.HashMap;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("RJ", "Rio de janeiro");
        mapa.put("SP", "Sao Paulo");
        mapa.put("MG", "Minas Gerais");

        for (String sigla : mapa.keySet()) {
            System.out.println(sigla);
        }

        for (String nome : mapa.values()) {
            System.out.println(nome);
        }

        for (Map.Entry<String, String> tudo : mapa.entrySet()) {
            System.out.println(tudo);
        }
    }

}
