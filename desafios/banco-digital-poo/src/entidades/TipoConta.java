package entidades;

public enum TipoConta {
    CONTA_CORRENTE ("Conta Corrente", 1),
    CONTA_POUPANCA ("Conta Poupança", 2);

    private String nome;
    private int numero;

    TipoConta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
