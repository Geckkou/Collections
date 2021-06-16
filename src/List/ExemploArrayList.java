package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione sete notas: ");

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());


        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma/ notas.size()));

        System.out.println("\nRemova a nota 0: ");
        System.out.println(notas.toString());
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("\nRemova a nota na posição 0: ");
        System.out.println(notas.toString());
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("\nApague toda a lista:");
        notas.clear();
        System.out.println(notas.toString());

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

    }
}
