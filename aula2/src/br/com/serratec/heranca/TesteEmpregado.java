package br.com.serratec.heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		//Polimorfismo (nao usado)
		Gerente gerente = new Gerente("Carlos", "C@gmail.com", "2222", 5500., 10);
		Diretor diretor = new Diretor("Marcos", "m@gmail.com", "233", "ADM", 9000.);
		
		
		System.out.println(gerente.getNome() + "-"+ gerente.getEmail());
		System.out.println(gerente.getNumEmpregadosGerenciados());
		
		gerente.aumentarSalario(10.);
		diretor.aumentarSalario(10.);
		
		System.out.println("Novo Salário:" + gerente.getSalario());
		System.out.println("Novo Salário:" + diretor.getSalario());
		
		System.out.println(gerente);          //da na mesma
		System.out.println(diretor.toString());
	}

	

}
