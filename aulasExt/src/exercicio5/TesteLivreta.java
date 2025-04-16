package exercicio5;

public class TesteLivreta {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Marcos", 24, "M");
        p[1] = new Pessoa("Maria", 18, "F");

        l[0] = new Livro("Pinoquio", "Gepeto", 100, p[1]);
        l[1] = new Livro("Senhor dos aneis", "Mark", 500, p[0]);
        l[2] = new Livro("1984", "George Orwell", 255, null);



        l[0].abrir();
        l[0].folhear(34);
        l[0].avancarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());
        System.out.println(p[0]);
    }
}
