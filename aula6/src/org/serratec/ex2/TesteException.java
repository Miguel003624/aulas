package org.serratec.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException {
    public static void main(String[] args) {


        try {
            System.out.println("resultado: " + divisao(10, 0));
            FileReader fileReader = new FileReader("c\temp\teste");
        } catch (FileNotFoundException e) {
            System.out.println("Burro!");
            e.printStackTrace();
        }

        finally {
            System.out.println("Finalizando...");
        }
    }
    public static int divisao(int a, int b) throws ArithmeticException {
//        if (b == 0) {
//            throw new ArithmeticException("Burro!");
//        }
//        return a / b;
        return a / b;
    }
}
