package org.serratec.exemplos;

import java.time.*;

public class TesteInstant {
    public static void main(String[] args) {
        Instant dataHoje = Instant.now();
        System.out.println(dataHoje);

        Instant dataNova = Instant.parse("2025-04-16T01:00:00Z");

        LocalDateTime data2 = LocalDateTime.ofInstant(dataNova, ZoneId.systemDefault());
        System.out.println(data2);
    }
}
