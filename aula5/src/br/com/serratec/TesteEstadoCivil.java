package br.com.serratec;

public class TesteEstadoCivil {
    public static void main(String[] args) {
        PessoaEstadoCivil p1 = new PessoaEstadoCivil("Carlos", EstadoCivil.DIVORCIADO);

        System.out.println(p1.getNome() + " " + p1.getEstadoCivil().getSigla());
        System.out.println(p1.getNome() + " " + p1.getEstadoCivil().ordinal());

        for (EstadoCivil ec : EstadoCivil.values()) {
            System.out.println(ec);
        }
    }
}
