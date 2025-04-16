package exercicio2;

public class TestaLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Marco Antônio", "Cisco CCNA", 85.);
        Operacao o1 = new Operacao("venda", l1);

        Livro l2 = new Livro("Kathy Sierra", "Use a cabeca Java", 98.);
        Operacao o2 = new Operacao("empréstimo", l2);

        l1.reajuste(l1.getValor() + l1.getValor() * 6 / 100);

        o2.emprestarLivro();
        o1.venderLivro();

        System.out.println(o1);
        System.out.println(o2);
    }
}
