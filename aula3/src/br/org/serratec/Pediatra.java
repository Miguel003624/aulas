package br.org.serratec;

public class Pediatra extends Medico{
    private String especializacao;

    public Pediatra(String crm, Double salario, String nome, String especializacao) {
        super(crm, salario, nome);
        this.especializacao = especializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "especializacao: " + especializacao;
    }

    public String getEspecializacao() {
        return  especializacao;
    }

    @Override
    public Double calcularSalario() {
        return salario = salario + salario * 1.15;
    }

}
