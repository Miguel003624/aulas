package exercicio2;

public class Livro {
    private String autor;
    private String titulo;
    protected double valor;

    public Livro(String autor, String titulo, double valor) {
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", valor=" + valor +
                '}';
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getValor() {
        return valor;
    }

    public void reajuste(double valor) {
        this.valor = valor;
    }
}
