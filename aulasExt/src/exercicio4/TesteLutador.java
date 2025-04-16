package exercicio4;

public class TesteLutador {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[5];
        l[0] = new Lutador("Pretty Boy",
                "França", 31, 1.75, 68.9,
                11, 3, 1);

        l[1] = new Lutador("Putscript",
                "Brasil" , 29, 1.68, 57.8,
                14, 2 ,3);

        l[2] = new Lutador("Snapshadow" ,
                "EUA", 35, 1.65, 80.9,
                12, 2, 1);

        l[3] = new Lutador("Dead code",
                "Austrália", 28, 1.93, 81.6,
                13, 0, 2);

        l[4] = new Lutador("Samuel Rodrigues",
                "Brasil", 33, 1.80, 84.5,
                15, 0, 0);

        Luta UCN = new Luta(l[2], l[3]);
        UCN.marcarLuta();
        UCN.lutar();



    }
}
