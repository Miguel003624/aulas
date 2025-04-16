package exercicio2;

import static java.lang.Math.round;

public class Operacao extends Livro implements Livraria {
    private String tipo;
    private double valorOperacao;
    private Livro livro;

    public Operacao(String tipo, Livro livro) {
        super(null, null, 0);
        this.tipo = tipo;
        this.livro = livro;
    }

    public Operacao(String autor, String titulo, double valor) {
        super(autor, titulo, valor);
    }

    @Override
    public String toString() {
        return "Operacao{" +
                "tipo='" + tipo + '\'' +
                ", valorOperacao=" + String.format("%.3f", valorOperacao) +
                ", livro=" + livro +
                '}';
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return round(valorOperacao);
    }

    @Override
    public void emprestarLivro() {
        valorOperacao = ((2 * livro.getValor()) / 100) + taxaEmprestimo;

    }

    @Override
    public void venderLivro() {
        valorOperacao = livro.getValor() + ((livro.getValor() * 9) / 100);

    }
}
