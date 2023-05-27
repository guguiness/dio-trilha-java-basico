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
    public void depositar(int valor) throws ContaInativaException, NullPointerException {
        if(this.ativo) {
            this.saldo += valor;
            return;
        }
        throw new ContaInativaException();
    }

    @Override
    public void sacar(int valor) throws ContaInativaException, SaldoInsuficienteException, NullPointerException {
        if(this.ativo) {
            if(this.saldo >= valor) {
                this.saldo -= valor;
                return;
            }
            throw new SaldoInsuficienteException();
        }
        throw new ContaInativaException();
    }

    @Override
    public void transferir(int valor, Conta contaDestino) throws ContaInativaException, SaldoInsuficienteException, NullPointerException {
        if(this.ativo) {
            if(contaDestino.isAtivo()) {
                if(this.saldo >= valor) {
                    this.sacar(valor);
                    contaDestino.depositar(valor);
                    return;
                }
                throw new SaldoInsuficienteException();
            }
            throw new ContaInativaException("Conta de destino inativa");
        }
        throw new ContaInativaException("Conta de origem inativa");
    }

    @Override
    public void imprimirExtrato() throws ContaInativaException, NullPointerException {
        if(this.ativo) {
            System.out.println("Titular: " + this.titular.getNome());
            System.out.println("Agência: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.println("Saldo: " + this.saldo);
            return;
        }
        throw new ContaInativaException();
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
