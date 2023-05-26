package contas;

public interface iConta {
    boolean depositar(int valor);

    boolean sacar(int valor);

    boolean transferir(int valor, Conta destino);

    void imprimirExtrato();
}
