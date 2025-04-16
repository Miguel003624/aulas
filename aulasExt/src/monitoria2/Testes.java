package monitoria2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
//        try {
//            int resultado = 10 / 0;
//            System.out.println(resultado);
//
//        } catch (ArithmeticException e) {
//            System.out.println("burro! " + e.getMessage());
//        }
//        finally {
//            System.out.println("finalizando");
//        }
//        try {
//            File arquivo = new File("balbalba.png");
//            Scanner leitor = new Scanner(arquivo);
//            while (leitor.hasNextLine()) {
//                System.out.println(leitor.hasNextLine());
//            }
//            leitor.close();
//
//        } catch (FileNotFoundException ex) {
//            System.out.println("nao tem" + ex);
//
        try {

            int[] numeros = {1, 2, 3, 4, 5};
            System.out.println(numeros[5]);
            int resultado = numeros[3] / 0;

            System.out.println(resultado);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro :" + ex);

        } catch (ArithmeticException ex) {
            System.out.println("Erro :" + ex);
        }
    }
}

