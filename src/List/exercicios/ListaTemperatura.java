package List.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListaTemperatura {
    public static void main(String[] args) {

        List<Double> temp = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        boolean running = true;
        int next = 0;
        String confirmacao = "";

        System.out.println("\nDiga quantas temperaturas deseja informar de x meses (partindo de janeiro): ");
        next = s.nextInt();

        while (running) {
            System.out.println("Digite [Y]/[N] para continuar inserindo as temperaturas");
            confirmacao = s.next();

            if (confirmacao.equalsIgnoreCase("n")) {
                System.out.println("Encerrando...");
                running = false;

                for (Double temperaturas : temp) {
                    if (temperaturas > MediaTemperatura(temp)) {
                        System.out.println("Média das temperaturas: " + MediaTemperatura(temp));
                        System.out.println("Temperaturas acima da média: " + temperaturas);

                        int index = temp.indexOf(temperaturas);
                        switch (index) {
                            case 0:
                                System.out.println((index + 1) + " - JANEIRO: " + temperaturas + " oC");
                                break;
                            case 1:
                                System.out.println((index + 1) + " - FEVEREIRO: " + temperaturas + " oC");
                                break;
                            case 2:
                                System.out.println((index + 1) + " - MARÇO: " + temperaturas + " oC");
                                break;
                            case 3:
                                System.out.println((index + 1) + " - ABRIL: " + temperaturas + " oC");
                                break;
                            case 4:
                                System.out.println((index + 1) + " - MAIO: " + temperaturas + " oC");
                                break;
                            case 5:
                                System.out.println((index + 1) + " - JUNHO: " + temperaturas + " oC");
                                break;
                            case 6:
                                System.out.println((index + 1) + " - JULHO: " + temperaturas + " oC");
                                break;
                            case 7:
                                System.out.println((index + 1) + " - AGOSTO: " + temperaturas + " oC");
                                break;
                            case 8:
                                System.out.println((index + 1) + " - SETEMBRO: " + temperaturas + " oC");
                                break;
                            case 9:
                                System.out.println((index + 1) + " - OUTUBRO: " + temperaturas + " oC");
                                break;
                            case 10:
                                System.out.println((index + 1) + " - NOVEMBRO: " + temperaturas + " oC");
                                break;
                            case 11:
                                System.out.println((index + 1) + " - DEZEMBRO: " + temperaturas + " oC");
                                break;
                            default:
                                break;
                        }
                    }
                }
            } else {
                for (int i = 0; i < next; i++) {
                    System.out.println("Informe a " + (i + 1) + " Temperatura: ");
                    temp.add(s.nextDouble());
                }
            }
        }
    }

    public static Double MediaTemperatura(List<Double> lista) {

        Iterator<Double> iterator = lista.iterator();
        int soma = 0;
        double media = 0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        return media = soma / lista.size();
    }
}
