package main;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import entidades.Banco;
import entidades.Cliente;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Banco banco1 = new Banco("ByteBank");
        Cliente juninho = new Cliente("Junior Mendes", "12345678911");
        Cliente fabiana = new Cliente("Fabiana Carvalho", "22123403811");

        Conta conta1 = new ContaCorrente(juninho);
        Conta conta2 = new ContaPoupanca(fabiana);

        System.out.println("Conta do Juninho");
        System.out.println("Titular: " + conta1.getTitular().getNome());
        System.out.println("Agência: " + conta1.getAgencia());
        System.out.println("Número: " + conta1.getNumeroConta());

        System.out.println();

        System.out.println("Conta da Fabi");
        System.out.println("Titular: " + conta2.getTitular().getNome());
        System.out.println("Agência: " + conta2.getAgencia());
        System.out.println("Número: " + conta2.getNumeroConta());

        System.out.println();

        System.out.println("Lista de contas do banco");
        System.out.println("Corrente:");
        for (Conta next : Banco.getListaContaCorrente()) {
            System.out.println("- Conta: " + next.getNumeroConta() + ", Titular: " + next.getTitular().getNome());
        }
        System.out.println();
        System.out.println("Poupança:");
        for (Conta next : Banco.getListaContaCorrente()) {
            System.out.println("- Conta: " + next.getNumeroConta() + ", Titular: " + next.getTitular().getNome());
        }
    }
}
