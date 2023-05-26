package contas;

public abstract class Conta implements iConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
    }

    @Override
    public boolean depositar(int valor) {
        this.saldo += valor;
        return true;
    }

    @Override
    public boolean sacar(int valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(int valor, Conta contaDestino) {
        if(this.saldo >= valor && contaDestino.numero <= Conta.SEQUENCIAL) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.agencia);
        System.out.println(this.numero);
        System.out.println(this.saldo);
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
}
