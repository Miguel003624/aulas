package aula1;

public class Aula1 {
	public static void main(String[] args) {
		int valor;
		String[] nomes = { "Azul", "Amarelo", "Laranja", "Preto" };

		System.out.println("Aula 1");

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Preto")) {
				continue;
			}
		System.err.println(nomes[i]);
		}
	}
}
