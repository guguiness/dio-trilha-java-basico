package edu.dio.repeticaoearrays.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {2, 6, 8, -1, 15};

        System.out.print("Vetor: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\nVetor invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
