package main;

import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import entidades.Banco;
import entidades.Cliente;
import entidades.TipoConta;
import excecoes.ContaInativaException;
import excecoes.SaldoInsuficienteException;
import excecoes.SaldoPendenteException;

public class App {
    public static void main(String[] args) {
        Banco banco1 = new Banco("ByteBank");
        Cliente juninho = new Cliente("Junior Mendes", "12345678911");
        Cliente fabiana = new Cliente("Fabiana Carvalho", "22123403811");
        Cliente carlos = new Cliente("Carlos Almeida", "15485298742");

        Conta conta1 = new ContaCorrente(juninho);

        try {
            conta1.depositar(300.00);
            conta1.sacar(20.00);
            conta1.imprimirExtrato();
        } catch(ContaInativaException e) {
            System.out.println("Impossível realizar. Conta inativa");
        } catch(SaldoInsuficienteException e) {
            System.out.println("Impossível realizar. Saldo insuficiente");
        }

        System.out.println("\n");
        Conta conta2 = new ContaPoupanca(fabiana);
        try {
            conta2.depositar(500.00);
            conta2.imprimirExtrato();
        } catch(ContaInativaException e) {
            System.out.println("Impossível realizar. Conta inativa");
        }

        System.out.println("\n");
        Conta conta3 = new ContaCorrente(carlos);
        try {
            conta3.inativarConta();
            conta3.imprimirExtrato();
        } catch(ContaInativaException e) {
            System.out.println("Impossível realizar. Conta inativa");
        } catch(SaldoPendenteException e) {
            System.out.println("Impossível realizar. Ainda há saldo na conta. Retire-o antes de inativar");
        }

        try {
            conta1.transferir(20d, conta3);
        } catch(ContaInativaException e) {
            Conta contaInativa;
            contaInativa = (conta1.isAtivo()) ? conta3 : conta1;
            System.out.println("Impossível realizar. Conta " + contaInativa.getNumeroConta() +" inativa");
        } catch(SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("\n");
        System.out.println("Lista de contas do banco");
        System.out.println("Corrente:");
        banco1.imprimirListaContas(TipoConta.CONTA_CORRENTE);
        System.out.println();
        System.out.println("Poupança:");
        banco1.imprimirListaContas(TipoConta.CONTA_POUPANCA);
    }
}
