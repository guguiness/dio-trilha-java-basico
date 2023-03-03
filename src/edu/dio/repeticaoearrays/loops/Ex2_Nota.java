package edu.dio.repeticaoearrays.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nota = -1;
        boolean invalido = true;

        while(invalido) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            if(nota >= 0 && nota <= 10){
                invalido = false;
                break;
            }

            System.out.println("Nota inválida. Tente novamente.\n");
        }

        System.out.println("\n----- FIM DO PROGRAMA -----");
    }
}
