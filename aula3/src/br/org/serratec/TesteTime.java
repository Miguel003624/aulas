package br.org.serratec;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Botafogo", "Gragas", new Atleta[11]);
        Atleta atleta1 = new Atleta("Tiquinho Soarez", 35);
        Atleta atleta2 = new Atleta("Matheus", 21);
        Atleta atleta3 = new Atleta("Kurt Cobain", 41);

        time.adicionarAtleta(atleta1);
        time.adicionarAtleta(atleta2);
        time.adicionarAtleta(atleta3);

        time.imprimirElenco();

        System.out.println(time);
    }
}
