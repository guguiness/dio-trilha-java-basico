package edu.dio.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;      // Casting

        // Variável
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // Constante
        final double VALOR_DE_PI = 3.14;
    }
}