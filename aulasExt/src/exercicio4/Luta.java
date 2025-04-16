package exercicio4;  //lutador 0..* luta

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }

    @Override
    public String toString() {
        return "Luta{" +
                "desafiado=" + desafiado +
                ", desafiante=" + desafiante +
                ", rounds=" + rounds +
                ", aprovada=" + aprovada +
                '}';
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta() {
        if (Objects.equals(desafiado.getCategoria(), desafiante.getCategoria()) && desafiado != desafiante) {
            this.aprovada = true;

        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            this.desafiado.toString();
            this.desafiante.toString();

            Random random = new Random();
            int vencedor = random.nextInt(3);
            switch (vencedor) {
                case 0:  // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:  // Desafiado venceu
                    System.out.println(this.desafiado + "Venceu!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:  // Desafiante venceu
                    System.out.println(this.desafiante + "Venceu!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }

        } else {
            System.out.println("nao da");
        }
    }
}
