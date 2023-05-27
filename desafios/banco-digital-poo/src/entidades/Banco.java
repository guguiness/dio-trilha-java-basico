package entidades;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private static List<ContaCorrente> listaContaCorrente;
    private static List<ContaPoupanca> listaContaPoupanca;

    public Banco(String nome) {
        this.nome = nome;
        listaContaCorrente = new ArrayList<>();
        listaContaPoupanca = new ArrayList<>();
    }

    public static void adicionarContaCorrente(ContaCorrente novaConta) {
        listaContaCorrente.add(novaConta);
    }

    public static void adicionarContaPoupanca(ContaPoupanca novaConta) {
        listaContaPoupanca.add(novaConta);
    }

    public static List<ContaCorrente> getListaContaCorrente() {
        return listaContaCorrente;
    }

    public static void setListaContaCorrente(List<ContaCorrente> listaContaCorrente) {
        Banco.listaContaCorrente = listaContaCorrente;
    }

    public static List<ContaPoupanca> getListaContaPoupanca() {
        return listaContaPoupanca;
    }

    public static void setListaContaPoupanca(List<ContaPoupanca> listaContaPoupanca) {
        Banco.listaContaPoupanca = listaContaPoupanca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
