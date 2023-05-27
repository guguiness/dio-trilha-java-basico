package contas;

import entidades.Banco;
import entidades.Cliente;
import excecoes.ContaInativaException;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente titular) {
        super(titular);
        for(ContaCorrente contaExistente : Banco.getListaContaCorrente()) {
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
        Banco.adicionarContaCorrente(this);
    }

    @Override
    public void imprimirExtrato() throws NullPointerException {
        if(this.ativo) {
            System.out.println("=== Extrato - Conta Corrente ===");
            super.imprimirExtrato();
        }
    }
}
