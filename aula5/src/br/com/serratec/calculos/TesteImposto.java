package br.com.serratec.calculos;

import br.com.serratec.Empresa;
import br.com.serratec.Pessoa;

public class TesteImposto {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 25000.);
        Empresa e1 = new Empresa("XPTO Ltda", 100000.);
        TotalImposto ti = new TotalImposto();

        ti.calcularTotalGeralTributos(p1);
        ti.calcularTotalGeralTributos(e1);
        System.out.println("Total Geral Pago Empresa/Pessoa: " + ti.getTotalGeral());

        //System.out.println("Total pagar pessoa: " + p1.calcularIR());
        //System.out.println("Total pagar empresa: " +e1.calcularIR());
        //System.out.println("Total Pagar icms: " + e1.calcularICMS());
    }
}
