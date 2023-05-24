package edu.dio.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione 7 notas nela:");
        List<Double> notas = new ArrayList<>();
        notas.add(6.0);
        notas.add(8.5);
        notas.add(9.1);
        notas.add(4.6);
        notas.add(7.4);
        notas.add(5.5);
        notas.add(8.9);
        System.out.println(notas);
        linha();
        System.out.println("Exiba a posição da nota 5.5: " + notas.indexOf(5.5));
        linha();
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        linha();
        System.out.println("Substitua a nota 6.0 pela nota 5.0:");
        notas.set(notas.indexOf(6d), 5d);
        System.out.println(notas);
        linha();
        System.out.println("Confira se a nota 6.0 está na lista: " + notas.contains(6d));
        linha();
        System.out.println("Exiba as notas na ordem em que foram informadas:" + notas);
        linha();
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        linha();
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        linha();
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        linha();
        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator1 = notas.iterator();
        Double soma = 0d;
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            soma += next;
        }
        System.out.println(soma);
        linha();
        System.out.println("Exiba a média dos valores: " + (soma/notas.size()));
        linha();
        System.out.println("Remova a nota 4.6: ");
        notas.remove(4.6d);
        System.out.println(notas);
        linha();
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);
        linha();
        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) notas.remove(next);
        }
        System.out.println(notas);
        linha();
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        linha();
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }

    public static void linha() {
        System.out.println("------------------------------");
    }
}
