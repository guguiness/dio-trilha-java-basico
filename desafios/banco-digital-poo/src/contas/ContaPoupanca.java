package contas;

import entidades.Banco;
import entidades.Cliente;
import excecoes.ContaInativaException;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente titular) {
        super(titular);
        for(ContaPoupanca contaExistente : Banco.getListaContaPoupanca()) {
            if(contaExistente.titular.equals(this.titular)) {
                ativarContaExistente(contaExistente);
                return;
            }
        }
        ativarContaNova(this);
    }

    @Override
    protected void ativarContaNova(Conta conta) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = ++Conta.SEQUENCIAL;
        this.ativo = true;
        Banco.adicionarContaPoupanca(this);
    }

    @Override
    public void imprimirExtrato() throws ContaInativaException, NullPointerException {
        System.out.println("=== Extrato - Conta Poupança ===");
        super.imprimirExtrato();
    }
}
