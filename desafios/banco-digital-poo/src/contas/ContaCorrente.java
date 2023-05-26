package contas;

import entidades.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato - Conta Corrente ===");
        super.imprimirExtrato();
    }
}
