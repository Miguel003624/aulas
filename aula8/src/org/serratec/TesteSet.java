package org.serratec;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
        //nao permite elementos iguais
        //nao mantem a ordem
        //Set<String> times = new HashSet<>();
        //mantem a ordem
        //Set<String> times = new LinkedHashSet<>();
        //Ordena os elementos
        Set<String> times = new TreeSet<>();

        times.add("Botafogo");
        times.add("Botafogo");
        times.add("Botafogo");
        times.add("Botafogo");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Flamengo");

        for (String time : times) {
            System.out.println(time);
        }
    }
}
