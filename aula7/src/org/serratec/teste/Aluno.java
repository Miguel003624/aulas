package org.serratec.teste;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Aluno a[] = new Aluno[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {

            String nome = sc.nextLine();

            int idade = sc.nextInt();

            String email = sc.nextLine();

            //a[i] = new Aluno(nome, idade, email);

        } sc.close();
    }

   // for(int i = 0; i < a.lenght; i++) {
        //System.out.println(a[i]);
    }
//}
