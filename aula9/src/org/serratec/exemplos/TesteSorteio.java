package org.serratec.exemplos;

public class TesteSorteio {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 23);
        Aluno a2 = new Aluno("Marcos", 24);
        Aluno a3 = new Aluno("Jo", 31);
        Aluno a4 = new Aluno("Muca", 51);

        Sorteio<Aluno> sortear = new Sorteio<>();

        sortear.adicionarVarios(a1, a2, a3);
        sortear.adicionar(a4);


        System.out.println("Aluno sorteado: " + sortear.sorteio());

        Sorteio<Integer> sortear2 = new Sorteio<>();

        sortear2.adicionarVarios(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("Numero sorteado: " + sortear2.sorteio());

    }
}
