package exercicio2;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(1111, false, 0, "Mario", null);
        c1.abrirConta("CC");
        c1.depositar(100);
        c1.sacar(150);
        c1.fecharConta();

        System.out.println(c1);



        ContaBanco c2 = new ContaBanco(2222, false, 0, "Creusa", null);
        c2.abrirConta("CP");
        c2.depositar(500);
        c2.sacar(100);
        c2.pagarMensal();

        System.out.println(c2);
    }


}
