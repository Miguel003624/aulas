package exercicio1;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", true, 50, 0.5f, "Azul");
        c1.destampar();
        c1.status();
		c1.rabiscar();

        Caneta c2 = new Caneta(null, false, 90, 0.7f, "Vermelha");
        System.out.println(c2.getCor());
    }
}
