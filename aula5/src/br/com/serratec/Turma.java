package br.com.serratec;

public class Turma {
    private String curso;
    private PeriodoCurso periodoCurso;

    public Turma(String curso, PeriodoCurso periodoCurso) {
        this.curso = curso;
        this.periodoCurso = periodoCurso;
    }


    @Override
    public String toString() {
        return "Turma{" +
                "curso='" + curso + '\'' +
                ", periodoCurso=" + periodoCurso +
                '}';
    }

    public String getCurso() {
        return curso;
    }

    public PeriodoCurso getPeriodoCurso() {
        return periodoCurso;
    }
}
