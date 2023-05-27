package contas;

import excecoes.ContaInativaException;
import excecoes.SaldoInsuficienteException;
import excecoes.SaldoPendenteException;

public interface iConta {
    void depositar(int valor) throws ContaInativaException, NullPointerException;

    void sacar(int valor) throws ContaInativaException, SaldoInsuficienteException, NullPointerException;

    void transferir(int valor, Conta destino) throws ContaInativaException, SaldoInsuficienteException, NullPointerException;

    void imprimirExtrato() throws ContaInativaException, NullPointerException;

    void inativarConta() throws ContaInativaException, NullPointerException, UnsupportedOperationException, SaldoPendenteException;
}
