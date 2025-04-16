package exercicio6;

public class Testes {
    public static void main(String[] args) {

        Aluno p2 = new Aluno("Paulo", 15, "M", 1233, "Letras");
        Professor p3 = new Professor("Julia", 24, "F", "Pedagogia", 4000.);
        Funcionario p4 = new Funcionario("Carlos", 28, "M", "Gandula", true);

        System.out.println(p4);

        p4.mudarTrabalho();

        System.out.println(p4);

    }
}
