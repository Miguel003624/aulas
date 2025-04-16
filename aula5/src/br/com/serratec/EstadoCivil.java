package br.com.serratec;

public enum EstadoCivil {
    VIUVO('V'), SOLTEIRO('S'), CASADO('C'), DIVORCIADO('D');

    private char sigla;

    EstadoCivil(char sigla) {
        this.sigla = sigla;
    }

    public char getSigla() {
        return sigla;
    }
}
