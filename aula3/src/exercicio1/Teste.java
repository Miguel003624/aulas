package exercicio1;

public class Teste {
    public static void main(String[] args) {
        Telefone[] t = new Telefone[2];
        Contato c1 = new Contato("Roberta", t[0], t[1]);
        t [0] = new Telefone("2234-1250");
        t [1] = new Telefone("2237-1350");

        Endereco e1 = new Endereco("Rua Fonseca Ramos", "Centro", "181", new Cidade("Petrópolis", new Estado("Rio de Janeiro", "RJ")));

        System.out.println(e1);
        System.out.println(c1);
    }
}
