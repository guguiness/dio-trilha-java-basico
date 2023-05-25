package interacao;

import equipamentos.AparelhoTelefonico;
import equipamentos.IPhone;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;
import objetos.Musica;

public class Testador {
    public static void main(String[] args) {
        IPhone iphone1 = new IPhone(1.0f);
        iphone1.adicionarNovaAba();
        iphone1.ligar();
        iphone1.tocar();

        System.out.println("-------------------");

        Musica br = new Musica("Bohemian Rhapsody", "Queen");
        ReprodutorMusical iphone2 = new IPhone();
        iphone2.selecionarMusica(br);
//        iphone2.adicionarNovaAba();   ERRO!

        System.out.println("-------------------");

        NavegadorInternet iphone3 = new IPhone();
        iphone3.adicionarNovaAba();
//        iphone3.pausar();             ERRO!

        System.out.println("-------------------");

        AparelhoTelefonico iphone4 = new IPhone();
        iphone4.ligar();
//        iphone4.tocar();              ERRO|
    }
}
