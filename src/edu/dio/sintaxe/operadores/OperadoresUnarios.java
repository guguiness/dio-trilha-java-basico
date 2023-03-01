package edu.dio.sintaxe.operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;

        numero = -numero;      // inverte sinal do valor
        System.out.println(numero);

        numero = -numero;      // alternativa: numero = numero * (-1)
        System.out.println(numero);
    }
}
