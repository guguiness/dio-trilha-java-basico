package edu.dio.repeticaoearrays.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numeros = new int[4][4];

        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = random.nextInt(10);
            }
        }

        // for(int i = 0; i < numeros.length; i++) {
        //     for(int j = 0; j < numeros[i].length; j++) {
        //         System.out.print(numeros[i][j] + " ");
        //     }
        //     System.out.print("\n");
        // }

        System.out.println("Matriz: ");
        for(int[] linha : numeros) {
            for(int elementoDaColuna : linha) {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.print("\n");
        }
    }
}
