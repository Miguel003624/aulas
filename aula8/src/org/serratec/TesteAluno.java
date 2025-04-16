package org.serratec;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteAluno {
    public static void main(String[] args) {
        //Set<Aluno> alunos = new HashSet<>();
        Set<Aluno> alunos = new TreeSet<>();
        alunos.add(new Aluno("Marcos", "m@gmail.com", 45));
        alunos.add(new Aluno("Suzana", "s@gmail.com", 12));
        alunos.add(new Aluno("Paula", "P@gmail.com", 51));
        alunos.add(new Aluno("Joao", "j@gmail.com", 32));

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
