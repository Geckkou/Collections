package Set.exercicios;

import java.util.*;

public class ArcoIrisi {
    public static void main(String[] args) {
        Set<String> arco = new LinkedHashSet<>(Arrays.asList("Vemelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

        for (String iris: arco) {
            System.out.println(iris.toString());
        }

        System.out.println("\nQuantidade de cores do arco-íris: " + arco.size());

        System.out.println("\nCores em ordem alfabética: ");
        Set<String> arco1 = new TreeSet<>(arco);
        System.out.println(arco1);

        System.out.println("\nCores na ordem inversa da inserção: ");
        Set<String> arco2 = new LinkedHashSet<>(arco);
        List<String> inverseColors = new ArrayList<>(arco2);
        Collections.reverse(inverseColors);
        System.out.println(inverseColors.toString());

        System.out.println("\nCores que começam com a letra - V -");
        for (String cores: arco) {
            if(cores.startsWith("V")) System.out.println(cores);
        }

        System.out.println("\nRemovendo todas as cores que não começam com -V- : ");
        System.out.println(arco.toString());
        Iterator<String> iterator = arco.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if(!next.startsWith("V")) iterator.remove();
        }
        System.out.println(arco.toString());

        System.out.println("\nLimpando o conjunto: ");
        System.out.println(arco.toString());
        arco.clear();
        System.out.println(arco.toString());

        System.out.println("\nVerificando se está vazio: " + arco.isEmpty());


    }
}
