package org.serratec.exercicio2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClienteTeste {
    public static void main(String[] args) {
        String[][] clientes = { { "123", "Marcos","m@gmail.com" }, { "143", "Carla","c@gmail.com" }, {"125", "Amarildo","a@gmail.com" }};

        Map<String, String[]> mapaClientes = new HashMap<>();

        for (String[] cliente : clientes) {
            mapaClientes.put(cliente[0], new String[] { cliente[1], cliente[2] });
        }

        for (Map.Entry<String, String[]> entry : mapaClientes.entrySet()) {
            String chave = entry.getKey();
            String[] valor = entry.getValue();
            System.out.println("ID: " + chave + ", Nome: " + valor[0] + ", Email: " + valor[1]);
        }
    }
}
