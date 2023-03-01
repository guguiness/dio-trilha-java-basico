package edu.dio.sintaxe.operadores;

public class OperadorRelacional {
    public static void main(String[] args) {
        String nome1 = "José";
        String nome2 = "José";
        System.out.print("Objetos iguais, conteúdos iguais: ");
        System.out.println(nome1 == nome2);

        String nome3 = "Maria";
        String nome4 = new String("Maria");
        System.out.println("Objetos diferentes, conteúdos iguais: ");
        System.out.println("operador ==  -> " + (nome3 == nome4));
        System.out.println(".equals() -> " + nome3.equals(nome4));
    }
}
