package org.serratec;

import java.util.*;

public class ListaExemplo {
    public static void main(String[] args) {

        List<String> times = new ArrayList<String>();

        times.add("Botafogo");
        times.add("Vasco");
        times.add("Corinthians");
        times.add("Ibis");
        //System.out.println(times.size());
        times.set(2, "G");
        System.out.println("A lista tem botafogo? " + (times.contains("Botafogo")? "Sim" : "nao"));
        System.out.println("ta vazia? " + (times.isEmpty()? "Sim" : "nao"));

        Collections.sort(times);
        for (String time : times) {
            System.out.println(time);
        }

        for (String time : times) {
            System.out.println(time);
        }

        System.out.println(times);


        Aluno a1 = new Aluno("debora", 33, "fasf@gm" );
        Aluno a2 = new Aluno("dadsad", 12, "ads@da" );
        Aluno a3 = new Aluno("vav", 31, "eqwd@gm" );

        //Imutavel
        List<Aluno> alunos = Arrays.asList(a1, a2);

        alunos.set(0, a3);


        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("****************of***************");
        List<Aluno> alunosOf = List.of(a1, a2);

        System.out.println(alunosOf);
    }
}
