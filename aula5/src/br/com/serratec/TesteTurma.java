package br.com.serratec;

public class TesteTurma {
    public static void main(String[] args) {
        Turma t1 = new Turma("Pedagogia", PeriodoCurso.INTEGRAL);

        System.out.println("Curso: " + t1.getCurso());
        System.out.println("Dias: " + t1.getPeriodoCurso().getDias());
        System.out.println("Valor: " + t1.getPeriodoCurso().getValor());
    }
}
