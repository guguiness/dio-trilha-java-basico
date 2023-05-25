package equipamentos;

import objetos.Musica;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private float versao;

    public IPhone(float versao) {
        this.versao = versao;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando...");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    public float getVersao() {
        return versao;
    }
}
