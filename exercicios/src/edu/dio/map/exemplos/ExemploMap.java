package exemplos;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
    /*
     Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
     modelo = gol - consumo = 14,4km/l
     modelo = uno - consumo = 15,6 km/l
     modelo = mobi - consumo = 16,1 km/l
     modelo = hb20 - consumo = 14,5 km/l
     modelo = kwid - consumo = 15,6 km/l
     */

    //        Map carrosPopulares2020 = new HashMap(); //antes do java 5
    //        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
    //        HashMap<String, Double> carrosPopulares = new HashMap<>();
    //        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol", 14.4);
           put("uno", 15.6);
           put("mobi", 16.1);
           put("hb20", 14.5);
           put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.print("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.print("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.print("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.print("Exiba o modelo mais econômico e seu consumo: [");
        Double consumoMaisEficiente = Collections.max(consumos);
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for(Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + "]");
            }
        }

        System.out.print("Exiba o modelo menos econômico e seu consumo: [" );
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEconomico = "";
        for(Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEconomico += entry.getKey();
                System.out.print(modeloMenosEconomico + " - " + consumoMenosEficiente);
            }
        }
        System.out.println("]");

        System.out.print("Exiba a soma dos consumos: ");
        Double soma = 0d;
        for(Double next : carrosPopulares.values()) {
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.print("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()) {
            Double next = iterator.next();
            if(next.equals(15.6)) iterator.remove();
        }
        System.out.println(carrosPopulares);

        System.out.print("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.print("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
