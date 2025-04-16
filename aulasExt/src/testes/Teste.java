package testes;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        Integer idade = sc.nextInt();

        System.out.println("Valor: ");
        Double valor = sc.nextDouble();

        sc.close();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(valor);
    }


}
