package org.serratec.exemplos;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class TesteLocalDate {
    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now();
        System.out.println(dataHoje);
        LocalDate dataManuel = LocalDate.of(2025, 4, 12);
        System.out.println(dataManuel);

        Locale locale = new Locale("pt", "BR");
        System.out.println(dataManuel.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));

        LocalTime hora = LocalTime.now();
        System.out.println(hora.plusHours(3));

        LocalDate dataNascimento = LocalDate.of(2005, 7, 8);

        Period periodo = Period.between(dataNascimento, dataHoje);
        System.out.println(periodo.getYears() + " " + periodo.getMonths() + " " + periodo.getDays());

        LocalDateTime datahora = LocalDateTime.now();

        System.out.println(datahora);

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(dataHoje.format(formatarData));
    }
}
