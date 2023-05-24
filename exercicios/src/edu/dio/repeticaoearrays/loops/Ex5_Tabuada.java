package edu.dio.repeticaoearrays.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Digite o número para calcular sua tabuada: ");
        numero = scan.nextInt();
        for(int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
