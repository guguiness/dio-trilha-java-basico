package entidades;

public class Cliente {
    private String nome;
    private String cpf_cnpj;

    public Cliente(String nome, String cpf_cnpj) {
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf_cnpj='" + cpf_cnpj + '\'' +
                '}';
    }
}
