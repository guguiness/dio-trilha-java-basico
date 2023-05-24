public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
    PIAUI ("PI", "Piauí", 13),
    MARANHAO ("MA","Maranhão", 14),
    PARANA ("PR", "Paraná", 16);

    private String nome;
    private String sigla;
    private int codIbge;

    private EstadoBrasileiro(String sigla, String nome, int codIbge) {
        this.sigla = sigla;
        this.nome = nome;
        this.codIbge = codIbge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public int getCodIbge() {
        return codIbge;
    }
}
