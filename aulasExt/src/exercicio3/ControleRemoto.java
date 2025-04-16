package exercicio3;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {

        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
    } else {
            System.out.println("erro");
        }
}

@Override
public void fecharMenu() {
    System.out.println("Fechando Menu...");
}

@Override
public void maisVolume() {
    if (this.isLigado()) {
        setVolume(this.getVolume() + 1);
    }
}

@Override
public void menosVolume() {
    if (this.isLigado()) {
        setVolume(this.getVolume() - 1);
    }
}

@Override
public void ligarMudo() {
    if (this.isLigado() && this.getVolume() > 0) {
        setVolume(0);
    }
}

@Override
public void desligarMudo() {
    if (this.isLigado() && this.getVolume() == 0) {
        this.setVolume(50);
    }
}

@Override
public void play() {
    if (this.isLigado() && !(this.isTocando())) {
        setTocando(true);
    }
}

@Override
public void pause() {
    if (this.isLigado() && (this.isTocando())) {
        setTocando(false);
    }
}
}
