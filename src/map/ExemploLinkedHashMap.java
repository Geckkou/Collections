package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHashMap {
    public static void main(String[] args) {

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");

        Map<String, Double> carrosPopulares = new LinkedHashMap<>(){{
            put("Gol",14.4);
            put("Uno",15.6);
            put("Mobi",16.1);
            put("HB20",14.5);
            put("Kwid",15.6);
        }};
        System.out.println(carrosPopulares.toString());
    }
}
