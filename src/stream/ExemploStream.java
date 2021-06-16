package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1" , "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream()
                .forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("\nPegue os números pares e maiores  que 2 e coloque em uma lista: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nMostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\nRemova os valores ímpares: ");
        List<Integer> impares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        impares.removeIf(i -> i % 2 != 0);
        System.out.println(impares);

        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam? ");
        long unics = numerosAleatorios.stream()
                .distinct()
                .count();
        System.out.println("Quantidade de números únicos: " + unics);

        System.out.print("\nMostre o menor valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .min()
                .ifPresent(System.out::println);

        System.out.print("\nMostre o maior valor da lista: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        System.out.println("\nPegue apenas os números ímpares e some: ");
        List<Integer> somaImpares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = somaImpares.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Soma dos valores impares: " + sum);



        System.out.println("\nMostre a lista na ordem númerica: ");
        List<String> ordemNatural = numerosAleatorios.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("Ordem: " + ordemNatural);


        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Map<Boolean, List<Integer>> multiplos = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println("Múltiplos: " + multiplos);
    }
}
