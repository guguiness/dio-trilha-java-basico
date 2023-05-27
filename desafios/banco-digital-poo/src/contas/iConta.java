package contas;

import excecoes.ContaInativaException;
import excecoes.SaldoInsuficienteException;
import excecoes.SaldoPendenteException;

public interface iConta {
    void depositar(double valor) throws ContaInativaException, NullPointerException;

    void sacar(double valor) throws ContaInativaException, SaldoInsuficienteException, NullPointerException;

    void transferir(double valor, Conta destino) throws ContaInativaException, SaldoInsuficienteException,
            NullPointerException;

    void imprimirExtrato() throws ContaInativaException, NullPointerException;

    void inativarConta() throws ContaInativaException, NullPointerException, UnsupportedOperationException, SaldoPendenteException;
}
