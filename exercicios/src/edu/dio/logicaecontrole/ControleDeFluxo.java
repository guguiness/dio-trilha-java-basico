package edu.dio.logicaecontrole;

public class ControleDeFluxo {
    public static void main(String[] args) {
        System.out.println("\nNome do Mês: ------------------------------------");
        nomeMes(1);
        nomeMes(2);
        nomeMes(0);

        System.out.println("\nValidação de inteiro: -------------------------");
        int num = 1;
        System.out.println(num + " -> " + validaInteiro(num));
    }

    private static void nomeMes(int numMes) {
        String nomeMes = "";
        boolean ferias = false;

        if(numMes == 1 || numMes == 7 || numMes == 12) {
            ferias = true;
            if(numMes == 1) 
                nomeMes = "Janeiro";
            else if(numMes == 7)
                nomeMes = "Julho";
            else
                nomeMes = "Dezembro";
        } else if(numMes > 1 && numMes < 12) {
            if(numMes == 2)
                nomeMes = "Fevereiro";
            else if(numMes == 3)
                nomeMes = "Março";
            else if(numMes == 4)
                nomeMes = "Abril";
            else if(numMes == 5)
                nomeMes = "Maio";
            else if(numMes == 6)
                nomeMes = "Junho";
            else if(numMes == 8)
                nomeMes = "Agosto";
            else if(numMes == 9)
                nomeMes = "Setembro";
            else if(numMes == 10)
                nomeMes = "Outubro";
            else if(numMes == 11)
                nomeMes = "Novembro";
        } else {
            System.out.println("Mês inválido");
            return;
        }

        System.out.println("Mês " + numMes + " = " + nomeMes);
        if(ferias)
            System.out.println("Férias");
    }

    private static String validaInteiro(int num) {
        String resultado = "";
        switch(num) {
            case 1:
            case 2:
            case 3:
                resultado = "Certo";
                break;
            case 4:
                resultado = "Errado";
                break;
            case 5:
                resultado = "Talvez";
                break;
            default:
                resultado = "Valor indefinido";
                break;
        }

        return resultado;
    }
}
