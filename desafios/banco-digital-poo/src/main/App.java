package main;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import entidades.Banco;
import entidades.Cliente;
import entidades.TipoConta;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Banco banco1 = new Banco("ByteBank");
        Cliente juninho = new Cliente("Junior Mendes", "12345678911");
        Cliente fabiana = new Cliente("Fabiana Carvalho", "22123403811");
        Cliente carlos = new Cliente("Carlos Almeida", "15485298742");

        Conta conta1 = new ContaCorrente(juninho);

        System.out.println("Conta do Juninho");
        System.out.println("Titular: " + conta1.getTitular().getNome());
        System.out.println("Agência: " + conta1.getAgencia());
        System.out.println("Número: " + conta1.getNumeroConta());

        System.out.println();
        Conta conta2 = new ContaPoupanca(fabiana);
        System.out.println("Conta da Fabi");
        System.out.println("Titular: " + conta2.getTitular().getNome());
        System.out.println("Agência: " + conta2.getAgencia());
        System.out.println("Número: " + conta2.getNumeroConta());

        System.out.println();
        Conta conta3 = new ContaCorrente(carlos);
        System.out.println("Conta do Carlos");
        System.out.println("Titular: " + conta3.getTitular().getNome());
        System.out.println("Agência: " + conta3.getAgencia());
        System.out.println("Número: " + conta3.getNumeroConta());

        System.out.println();

        System.out.println("Lista de contas do banco");
        System.out.println("Corrente:");
        banco1.imprimirListaContas(TipoConta.CONTA_CORRENTE);
        System.out.println();
        System.out.println("Poupança:");
        banco1.imprimirListaContas(TipoConta.CONTA_POUPANCA);
    }
}
