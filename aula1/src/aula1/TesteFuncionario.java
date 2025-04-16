package aula1;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Amarildo", 5000);
		Funcionario f2 = new Funcionario("Alan", 3000);
		Funcionario f3 = new Funcionario("Bruna", 2500);
		
		
		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		System.out.println(f3.getNome());
		System.out.println("Total Geral de funcionários:"+ Funcionario.getContador());
		
		//Variáveis locais
		int a=0;
		if (a == 0) {
			//variável local
			int c = 10;
		}
		
		
	}

}
