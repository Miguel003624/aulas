package org.serratec.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String responsavel;
    private List<Livro> listaLivro;

    public Biblioteca() {
        listaLivro = new ArrayList<>();
    }

    public String getResponsavel() {
        return responsavel;
    }

    public List<Livro> getListaLivro() {
        return listaLivro;
    }

    public void adicionar(Livro livro) {
        listaLivro.add(livro);
    }

    public void listar() {
        for (Livro livros : listaLivro)
            System.out.println(livros);

    }

    public Integer pesquisarFaixaDePreco(Double valorInicial, Double valorFinal) {
        int count = 0;
        for (Livro livro : listaLivro) {
            if (livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
                System.out.println(livro);
                count++;

            }
        }
        return count;
    }

    public Double calcularTotalLivros() {
        Double total = 0.;
        for (Livro livro : listaLivro) {
            total += livro.getPreco();
        }

        return total;
    }
}
