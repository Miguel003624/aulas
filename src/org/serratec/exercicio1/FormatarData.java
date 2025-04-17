package org.serratec.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatarData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter saida = DateTimeFormatter.ofPattern("yyyyMMdd");

        String dataDigitada = sc.nextLine();


        LocalDate data = LocalDate.parse(dataDigitada, entrada);
        String dataNova = data.format(saida);
        System.out.println(dataNova);

        sc.close();
    }
}
