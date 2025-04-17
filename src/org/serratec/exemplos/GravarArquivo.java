package org.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo {
    public static void main(String[] args) throws IOException {

        BufferedWriter gravar=null;
        try {
            gravar = new BufferedWriter(new FileWriter("/curso/arquivo.png"));
            gravar.append("oiii\n");
            gravar.append("aula de java");
            gravar.close();

        } catch (IOException e) {
            System.out.println("erro ao gravar arquivo");
            e.printStackTrace();
        }
    }
}
