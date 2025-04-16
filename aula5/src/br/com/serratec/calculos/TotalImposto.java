package br.com.serratec.calculos;

import br.com.serratec.Tributos;

public class TotalImposto {
    private Double totalGeral = 0.0;

    public Double getTotalGeral() {
        return totalGeral;
    }

    public void calcularTotalGeralTributos(Tributos tributos) {
        totalGeral += tributos.calcularICMS();
        totalGeral += tributos.calcularIR();
        System.out.println("Total geral ICMS: " + tributos.calcularICMS());
        System.out.println("Total geral ICMS: " + tributos.calcularIR());
    }
}
