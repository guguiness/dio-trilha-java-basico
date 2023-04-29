package edu.dio.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExTemperaturaMedia {
    public static void main(String[] args) {
        List<Double> listaTemperatura = new ArrayList<>() {
            {
                add(22d);
                add(22d);
                add(21d);
                add(16d);
                add(15d);
                add(15d);
            }
        };

        List<String> listaMeses = new ArrayList<>() {
            {
                add("1 - Janeiro");
                add("2 - Fevereiro");
                add("3 - Março");
                add("4 - Abril");
                add("5 - Maio");
                add("6 - Junho");
            }
        };

        Double mediaSemestral = calcularMediaSemestral(listaTemperatura);
        System.out.printf("Média semestral das temperaturas: %.2f\n", mediaSemestral);
        
        System.out.println("Meses com temperatura (ºC) acima da média semestral:");
        Iterator<Double> iterator = listaTemperatura.iterator();
        for(int i = 0; iterator.hasNext(); i++) {
            Double next = iterator.next();
            if(next > mediaSemestral) {
                System.out.println(listaMeses.get(i) + ": " + next);
            }
        }
    }
    

    public static Double calcularMediaSemestral(List<Double> temperaturas) {
        Double soma = 0d;
        Integer contador = 0;
        Double media;

        Iterator<Double> iterator = temperaturas.iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();                  // necessário para contar valores repetidos
            soma += next;
            contador++;
        }

        media = soma / contador;
        return media;
    }
}

