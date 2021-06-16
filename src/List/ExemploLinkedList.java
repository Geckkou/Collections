package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("\nCrie uma lista chamada notas2" +
                " e coloque todos os elementos da List ArrayList nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: " + notas2.peek());
        System.out.println(notas2.toString());

        System.out.println("\nMostre a primeira nota da nova litsa removendo-o: " + notas2.removeFirst());
        System.out.println(notas2.toString());
    }
}
