package map;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {

        System.out.println("\nExiba o dicionário ordenado pelo modelo");
        Map<String, Double> carrosPopulares = new TreeMap<>(){{
            put("Gol",14.4);
            put("Uno",15.6);
            put("Mobi",16.1);
            put("HB20",14.5);
            put("Kwid",15.6);
        }};
        System.out.println(carrosPopulares.toString());
    }
}
