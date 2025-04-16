package exercicio1;

import java.util.ArrayList;
import java.util.Arrays;

public class Contato {
    private String nome;
    List<Telefone> Telefone = new ArrayList<>();
    private Endereco endereco;

    public Contato(String nome, Telefone telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco=" + endereco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Telefone getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void mostrarTlefone() {
        System.out.println();
    }
}
