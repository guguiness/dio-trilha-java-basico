import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String nomeAgencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Por favor, informe as seguintes informações: ");

        System.out.print("Número da conta: ");
        numeroConta = Integer.parseInt(scan.nextLine());
        System.out.print("Nome completo: ");
        nomeCliente = scan.nextLine();
        System.out.print("Nome da agência: ");
        nomeAgencia = scan.nextLine();
        System.out.print("Saldo da conta: ");
        saldoConta = Double.parseDouble(scan.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é " +
                "%s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, nomeAgencia, numeroConta,
                saldoConta);
    }
}
