package map;

import java.util.*;

public class ExemploHashMap {
    public static void main(String[] args) {

        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("Gol",14.4);
           put("Uno",15.6);
           put("Mobi",16.1);
           put("HB20",14.5);
           put("Kwid",15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do Uno: " + carrosPopulares.get("Uno"));

        System.out.println("\nExiba os modelos: ");
        Set<String> models = carrosPopulares.keySet();
        System.out.println(models);

        System.out.println("\nExiba os consumos dos carros: ");
        System.out.println(carrosPopulares.values());

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        
        String modeloEficiente = "";
        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(consumoEficiente))  {
                modeloEficiente = entry.getKey();
                System.out.println("Modelo mais Eficiente: " + modeloEficiente + " - " + consumoEficiente);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma+= iterator.next();
        }

        System.out.println("Soma : " + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println("\nRemova os modelos com consumo igual a 15,6 km/l");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        System.out.println(carrosPopulares);

        while (iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nApague o dicionário de carros: ");
        System.out.println(carrosPopulares);
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
