package aula1;

public class TestaMedico {
	public static void main(String[] args) {
		Medico m1 = new Medico(12345, "Ana Maria", 0, 250);

		
		Medico m2 = new Medico(456789, "Antônio", 0, 300 );

		System.out.println("Pagamentos do médico 1, Dinheiro: " + m1.pagamentoDinheiro() + ". Plano de saúde: " + m1.pagamentoPlano());
		System.out.println("Pagamentos do médico 2, Dinheiro: " + m2.pagamentoDinheiro() + ". Plano de saúde: " + m2.pagamentoPlano());
		System.out.println("Dados do médico 1, Nome: " + m1.nome +  ", Crm: " + m1.crm + ", Salário: " + m1.salario + ", Valor da consulta: " + m1.valorConsulta  );
		System.out.println("Dados do médico 2, Nome: " + m2.nome +  ", Crm: " + m2.crm + ", Salário: " + m2.salario + ", Valor da consulta: " + m2.valorConsulta  );
		System.out.println("Total de médicos: " + Medico.totalMedicos);
	}
}
