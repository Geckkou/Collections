package map.exercicios;

import java.util.*;

public class Dado {
    public static void main(String[] args) {

        int lancamentos = 100;

        List<Integer> valores  = new ArrayList<>();
        Random gerador = new Random();

        for(int i = 0; i < lancamentos; i++) {
            int number = gerador.nextInt(6) + 1;
            valores.add(number);
        }

        Map<Integer, Integer> lancamentosVal = new HashMap<>();
        for (Integer result: valores) {
            if(lancamentosVal.containsKey(result))
                lancamentosVal.put(result,(lancamentosVal.get(result) + 1));
            else
                lancamentosVal.put(result, 1);
        }


        System.out.println("\n<==== Playing ====>");
        for(int i = 0; i < 3; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValor" + " Qauntidade de vezes");
        for (Map.Entry<Integer,Integer> entry: lancamentosVal.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
