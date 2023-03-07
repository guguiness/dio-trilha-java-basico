package edu.dio.repeticaoearrays.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        int[] inteiros = new int[20];
        Random random = new Random();
        
        for(int i = 0; i < inteiros.length; i++) {
            inteiros[i] = random.nextInt(101);
        }

        System.out.print("\nNúmeros aleatórios: ");
        for(int inteiro : inteiros) {
            System.out.print(inteiro + " ");
        }

        System.out.print("\nAntecessor do números aleatórios: ");
        for(int inteiro : inteiros) {
            System.out.print((inteiro - 1) + " ");
        }

        System.out.print("\nSucessores do números aleatórios: ");
        for(int inteiro : inteiros) {
            System.out.print((inteiro + 1) + " ");
        }
    }
}
