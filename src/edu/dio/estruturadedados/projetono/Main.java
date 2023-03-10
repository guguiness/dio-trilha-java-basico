package edu.dio.estruturadedados.projetono;

public class Main {
    public static void main(String[] args) {
        No not1 = new No("Conteúdo Nó 1");
        System.out.println(not1);

        No not2 = new No("Conteúdo Nó 2");
        System.out.println(not2);

        System.out.println("--------------------");

        No no1 = new No("Conteúdo Nó 1");
        System.out.println(no1);

        No no2 = new No("Conteúdo Nó 2");
        no1.setProximoNo(no2);
        System.out.println(no1.getProximoNo());

        No no3 = new No("Conteúdo Nó 3");
        no2.setProximoNo(no3);
        System.out.println(no1.getProximoNo().getProximoNo());

        No no4 = new No("Conteúdo Nó 4");
        no3.setProximoNo(no4);
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
