package aula1;

public class Medico {
	int crm;
	String nome;
	double salario;
	double valorConsulta;
	static int totalMedicos = 0;
	
	public Medico(int crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		totalMedicos ++;
	}
	
	public double pagamentoDinheiro() {
		return valorConsulta;
		
	}
	
	public double pagamentoPlano() {
		return valorConsulta * 0.7;
		
	}
}

