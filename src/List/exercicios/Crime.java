package List.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        System.out.println("\nResponda as seguintes perguntas: [Y]/[N]");
        Perguntas();
    }

    public static void Perguntas(){
        List<String> respostas = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("1."+" Telefonou para vítima?");
        respostas.add(input.next());

        System.out.println("2."+" Esteve no local do crime?");
        respostas.add(input.next());

        System.out.println("3."+" Mora perto da vítima?");
        respostas.add(input.next());

        System.out.println("4."+" Devia para a vítima?");
        respostas.add(input.next());

        System.out.println("5."+" Já trabalhou com a vítima?");
        respostas.add(input.next());

        IA(respostas);
    }

    public static void IA(List<String> lista){
        List<String> positive = new ArrayList<>();

        for (String respostas: lista) {
            if(respostas.equalsIgnoreCase("y")){
                positive.add(respostas);
            }
        }

        if(positive.size() == 2){
            System.out.println("Pessoa Suspeita");
        } else if(positive.size() >= 3 && positive.size() <= 4){
            System.out.println("Pessoa pode ser Cúmplice");
        } else if (positive.size() == 5) {
            System.out.println("Pessoa é a Assassino(a)");
        } else {
            System.out.println("Pessoa é Inocente");
        }
    }
}
