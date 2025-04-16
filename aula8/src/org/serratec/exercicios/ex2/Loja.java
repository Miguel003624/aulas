package org.serratec.exercicios.ex2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nomeLoja;
    private List<Animal> animais;

    public Loja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("👍");
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }

    public void adotarAnimal(int index) {
        if (index < 0 || index >= animais.size()) {
            throw new AnimalException("animal nao encontrado");
        }
        Animal animalAdotado = animais.remove(index);
        System.out.println("👍");
    }


}
