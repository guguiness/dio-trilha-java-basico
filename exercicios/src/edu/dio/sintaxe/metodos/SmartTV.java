package edu.dio.sintaxe.metodos;


public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        this.volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
}
