package entidades;

import contas.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private static List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public static void adicionarConta(Conta novaConta) {
        contas.add(novaConta);
    }

    public static List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
