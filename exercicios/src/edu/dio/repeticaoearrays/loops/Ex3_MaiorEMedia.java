package edu.dio.repeticaoearrays.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        double maior = Double.NaN;
        double soma = 0;
        double media;

        int i = 0;
        do {
            System.out.print("Digite um valor: ");
            num = scan.nextDouble();

            soma += num;
            if(Double.isNaN(maior) || num > maior)
                maior = num;
            i++;
        } while(i < 5);
        
        media = soma / 5;
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Média: " + media);
        System.out.println("\n----- FIM DO PROGRAMA -----");
    }
}
