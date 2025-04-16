package exercicio2;

import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    @Override
    public String toString() {
        return "ContaBanco{" +
                "Conta: " + numConta +
                ", tipo: " + tipo + '\'' +
                ", dono: " + dono + '\'' +
                ", saldo: " + saldo +
                ", status: " + status +
                '}';
    }

    public ContaBanco(int numConta, boolean status, double saldo, String dono, String tipo) {
        this.numConta = numConta;
        this.status = false;
        this.saldo = 0;
        this.dono = dono;
        this.tipo = tipo;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (Objects.equals(t, "CC")) {
            this.setSaldo(50);
        } else if (Objects.equals(t, "CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(double valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito feito com sucesso");
        } else {
            System.out.println("Erro");
        }
    }

    public void sacar(double valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                saldo = saldo - valor;
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal() {
        double valor = 0;
        if (Objects.equals(getTipo(), "CC")) {
            valor = 12;
        } else if (Objects.equals(getTipo(), "CP")) {
            valor = 20;
        }
        if (this.isStatus()) {
            if (saldo > valor) {
                saldo = saldo - valor;
            } else { System.out.println("Saldo insuficiente"); }
        } else { System.out.println("Impossível pagar"); }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
