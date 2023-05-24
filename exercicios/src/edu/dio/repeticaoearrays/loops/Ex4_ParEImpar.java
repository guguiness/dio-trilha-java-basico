package edu.dio.repeticaoearrays.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdPares = 0;
        int qtdImpares = 0;
        int numero;

        do {
            System.out.print("Digite um número inteiro (0 para terminar): ");
            numero = scan.nextInt();

            if(numero != 0)
                if(numero % 2 == 0)
                    qtdPares++;
                else
                    qtdImpares++;
        } while(numero != 0);

        System.out.println("\nQuantidade de pares: " + qtdPares);
        System.out.println("Quantidade de ímpares: " + qtdImpares);
        System.out.println("\n----- FIM DO PROGRAMA -----");
    }
}
