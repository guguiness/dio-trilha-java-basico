package edu.dio.repeticaoearrays.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        System.out.print("Digite um número: ");
        numero = scan.nextInt();
        for(int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println(numero + "! =  " + fatorial);
    }
}
