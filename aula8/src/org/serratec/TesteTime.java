package org.serratec;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Botafogo!");

        Atleta a1 = new Atleta("Caio", 1.91);
        Atleta a2 = new Atleta("Romario", 1.51);
        Atleta a3 = new Atleta("Marcos", 1.61);

        time.adicionarAtleta(a1, a2, a3);



        System.out.println(time.getAtletas());


    }
}
