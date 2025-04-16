package exercicio1;

public class TesteAtleta {
    public static void main(String[] args) {
        Pais[] p = new Pais[2];
        p[0] = new Pais("Brasil");
        p[1] = new Pais("EUA");

        Atleta[] a = new Atleta[3];
        a[0] = new Atleta("Anderson Silva", 98., p[0]);
        a[1] = new Atleta("Jon Jone", 59., p[1]);
        a[2] = new Atleta("Vitor Belfort", 110., p[0]);

        System.out.println("O atleta " + a[0].getNome() + a[0].verificaSituacao());
        System.out.println("O atleta " + a[1].getNome() + a[1].verificaSituacao());
        System.out.println("O atleta " + a[2].getNome() + a[2].verificaSituacao());

        int totalParticipantes = 0;

        for (Atleta atleta : a) {
            String situacao = atleta.verificaSituacao();
            if (situacao.equals(" participará")) {
                totalParticipantes++;
            }
        }

        System.out.println(totalParticipantes);
    }
}
