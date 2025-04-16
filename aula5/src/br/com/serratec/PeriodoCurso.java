package br.com.serratec;

public enum PeriodoCurso {
    INTEGRAL("ter e qui", 40, 2000.),
    NOTURNO("sex", 80, 3000.),
    TARDE("seg e qua", 20 ,500.);

    private String dias;
    private Integer cargaHorarioa;
    private Double valor;

    PeriodoCurso(String dias, Integer cargaHorarioa, Double valor) {
        this.dias = dias;
        this.cargaHorarioa = cargaHorarioa;
        this.valor = valor;
    }

    public String getDias() {
        return dias;
    }

    public Integer getCargaHorarioa() {
        return cargaHorarioa;
    }

    public Double getValor() {
        return valor;
    }

    //Construtor do enum é para definir a ordem dos atributos


}
