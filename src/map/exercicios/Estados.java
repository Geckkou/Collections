package map.exercicios;

import java.util.*;

public class Estados {
    public static void main(String[] args) {

        Map<String, Double> estadosPop = new HashMap<>(){{
            put("PE",9616.621);
            put("AL",3351.543);
            put("CE",9187.103);
            put("RN",3534.265);
        }};
        System.out.println(estadosPop);

        System.out.println("\nSubstitur a população: " + estadosPop.put("RN", 3534.165));

        System.out.println("\nPB está no dicionário ?: " + estadosPop.containsKey("PB"));
        estadosPop.put("PB",4039.277);

        System.out.println("\nPopulação de PE: " + estadosPop.get("PE"));

        System.out.println("\nOrdem informada: ");
        Map<String, Double> estadosOrde = new LinkedHashMap<>(){{
            put("PE",9616.621);
            put("AL",3351.543);
            put("CE",9187.103);
            put("RN",3534.265);
            put("PB",4039.277);
        }};
        System.out.println(estadosOrde);

        System.out.println("\nOrdem alfabética: ");
        Map<String, Double> estadosAlfabe = new TreeMap<>(estadosPop);
        System.out.println(estadosAlfabe);

        System.out.println("\nMenor população e quantidade: ");
        Double min = Collections.min(estadosPop.values());
        Set<Map.Entry<String, Double>> entries = estadosPop.entrySet();

        String menorQnt = "";
        for (Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(min)){
                menorQnt = entry.getKey();
                System.out.println("Estado com menor população: " + menorQnt + " - " + min);
            }
        }

        System.out.println("\nMaior população e quantidade: ");
        Double max = Collections.max(estadosPop.values());
        Set<Map.Entry<String, Double>> entries1 = estadosPop.entrySet();

        String maiorQnt = "";
        for (Map.Entry<String, Double> entry: entries1) {
            if(entry.getValue().equals(max)){
                maiorQnt = entry.getKey();
                System.out.println("Estado com maior população: " + maiorQnt + " - " + max);
            }
        }

        System.out.println("\nSoma das populações: ");
        Iterator<Double> iterator = estadosPop.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("Soma: " + soma);

        System.out.println("\nMédia da população: " + (soma/estadosPop.size()));

        System.out.println("Removendo estados com populção menor que 4.000.000");
        System.out.println(estadosPop);

        Iterator<Double> iterator1 = estadosPop.values().iterator();

        while (iterator1.hasNext()){
            if(iterator1.next() < 4000.000) iterator1.remove();
        }
        System.out.println(estadosPop);

        System.out.println("\nApagando todos os estados: ");
        System.out.println(estadosPop);
        estadosPop.clear();
        System.out.println(estadosPop);

        System.out.println("\nEstá vazio ? " + estadosPop.isEmpty());

    }
}
