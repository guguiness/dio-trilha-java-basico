package edu.dio.metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        System.out.println("Canal atual: " + smartTV.canal);
        smartTV.mudarCanal(13);
        System.out.println("Canal atual: " + smartTV.canal);

        System.out.println("Volume: " + smartTV.volume);

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);
    }
}
