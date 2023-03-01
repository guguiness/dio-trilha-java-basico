package edu.dio.sintaxe.anatomiadeclasses;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String texto = input.nextLine();
        System.out.println("Você digitou \"" + texto + "\"");
    }
}
