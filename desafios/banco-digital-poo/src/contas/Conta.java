package contas;

import entidades.Cliente;
import excecoes.ContaInativaException;
import excecoes.SaldoInsuficienteException;
import excecoes.SaldoPendenteException;

public abstract class Conta implements iConta {
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected boolean ativo;
    protected Cliente titular;

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    protected abstract void ativarContaNova(Conta contaNova);

    protected void ativarContaExistente(Conta contaExistente) throws NullPointerException {
        if(!contaExistente.ativo) {
            contaExistente.setAtivo(true);
        }
    }

    @Override
    public void depositar(double valor) throws ContaInativaException, NullPointerException {
        if(this.ativo) {
            this.saldo += valor;
            System.out.printf("\nOPERAÇÃO: Depósito de %.2f realizado para conta %d\n", valor, this.numero);
            return;
        }
        throw new ContaInativaException();
    }

    @Override
    public void sacar(double valor) throws ContaInativaException, SaldoInsuficienteException, NullPointerException {
        if(this.ativo) {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                System.out.printf("\nOPERAÇÃO: Saque de %.2f realizado da conta %d\n", valor, this.numero);
                return;
            }
            throw new SaldoInsuficienteException();
        }
        throw new ContaInativaException();
    }

    @Override
    public void transferir(double valor, Conta contaDestino) throws ContaInativaException, SaldoInsuficienteException,
            NullPointerException {
        if(this.ativo) {
            if(contaDestino.isAtivo()) {
                if(this.saldo >= valor) {
                    this.sacar(valor);
                    contaDestino.depositar(valor);
                    System.out.printf("\nOPERAÇÃO: Transferência de %.2f realizado da conta %d para a conta %d\n", valor,
                            this.numero, contaDestino.getNumeroConta());
                    return;
                }
                throw new SaldoInsuficienteException();
            }
            throw new ContaInativaException("Conta de destino inativa");
        }
        throw new ContaInativaException("Conta de origem inativa");
    }

    @Override
    public void imprimirExtrato() throws NullPointerException {
        if(this.ativo) {
            System.out.println("Titular: " + this.titular.getNome());
            System.out.println("Agência: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.printf("Saldo: %.2f", this.saldo);
            return;
        }
    }

    @Override
    public void inativarConta() throws ContaInativaException, NullPointerException, SaldoPendenteException {
        if(this.ativo) {
            if(this.saldo == 0) {
                this.ativo = false;
                return;
            }
            throw new SaldoPendenteException("Impossível inativar. A conta ainda possui saldo");
        }
        throw new ContaInativaException();
    }

    public int getAgencia() {
        return  this.agencia;
    }

    public int getNumeroConta() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular=" + titular.getNome() +
                '}';
    }
}
