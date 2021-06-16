package Set.exercicios;

import java.util.*;

public class MainLinguagem {
    public static void main(String[] args) {

        Set<LinguagemFavorita> fav = new LinkedHashSet<>();

        fav.add(new LinguagemFavorita("Java","1991","Intellij"));
        fav.add(new LinguagemFavorita("Kotlin","2017","Android Studio"));
        fav.add(new LinguagemFavorita("JavaScript","1995","WebStorm"));

        System.out.println("\n-- Ordem de Inserção --");
        for (LinguagemFavorita ling: fav) {
            System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());
        }


        System.out.println("\n-- Ordem de Natural (Nome)--");
        Set<LinguagemFavorita> fav2 = new TreeSet<>(fav);
        for (LinguagemFavorita ling: fav2) {
            System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());
        }

        System.out.println("\n-- Ordem IDE --");
        Set<ComparatorIDE> fav3 = new TreeSet<ComparatorIDE>(new ComparatorIDE());
        fav3.add(new ComparatorIDE("Java","1991","Intellij"));
        fav3.add(new ComparatorIDE("Kotlin","2017","Android Studio"));
        fav3.add(new ComparatorIDE("JavaScript","1995","WebStorm"));
        for (LinguagemFavorita ling: fav3) {
            System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());
        }

        System.out.println("\n-- Ordem Ano/Nome --");
        Set<ComparatorAnoNome> fav4 = new TreeSet<ComparatorAnoNome>(new ComparatorAnoNome());
        fav4.add(new ComparatorAnoNome("Java","1991","Intellij"));
        fav4.add(new ComparatorAnoNome("Kotlin","2017","Android Studio"));
        fav4.add(new ComparatorAnoNome("JavaScript","1995","WebStorm"));
        for (LinguagemFavorita ling: fav4) {
            System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());
        }

        System.out.println("\n-- Ordem Ano/Nome/IDE --");
        Set<ComparatorAnoNomeIDE> fav5 = new TreeSet<ComparatorAnoNomeIDE>(new ComparatorAnoNomeIDE());
        fav5.add(new ComparatorAnoNomeIDE("Java","1991","Intellij"));
        fav5.add(new ComparatorAnoNomeIDE("Kotlin","2017","Android Studio"));
        fav5.add(new ComparatorAnoNomeIDE("JavaScript","1995","WebStorm"));
        for (LinguagemFavorita ling: fav5) {
            System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());
        }

    }
}

class ComparatorIDE extends LinguagemFavorita implements Comparator<ComparatorIDE> {

    public ComparatorIDE (){
        super();
    }
    public ComparatorIDE(String nome, String anoDeCriacao, String ide) {
        super(nome, anoDeCriacao, ide);
    }

    @Override
    public int compare(ComparatorIDE i1, ComparatorIDE i2) {
        int ide = i1.getIde().compareToIgnoreCase(i2.getIde());
        if(ide != 0 ) return ide;
        return i1.getAnoDeCriacao().compareToIgnoreCase(i2.getAnoDeCriacao());
    }
}

class ComparatorAnoNome extends LinguagemFavorita implements Comparator<ComparatorAnoNome> {

    public ComparatorAnoNome (){
        super();
    }

    public ComparatorAnoNome(String nome, String anoDeCriacao, String ide) {
        super(nome, anoDeCriacao, ide);
    }

    @Override
    public int compare(ComparatorAnoNome o1, ComparatorAnoNome o2) {
        int ano = o1.getAnoDeCriacao().compareToIgnoreCase(o2.getAnoDeCriacao());
        if(ano != 0 ) return ano;

        return o2.getNome().compareToIgnoreCase(o2.getNome());
    }
}

class ComparatorAnoNomeIDE extends LinguagemFavorita implements Comparator<ComparatorAnoNomeIDE> {

    public ComparatorAnoNomeIDE (){
        super();
    }

    public ComparatorAnoNomeIDE(String nome, String anoDeCriacao, String ide) {
        super(nome, anoDeCriacao, ide);
    }

    @Override
    public int compare(ComparatorAnoNomeIDE o1, ComparatorAnoNomeIDE o2) {
        int ano = o1.getAnoDeCriacao().compareToIgnoreCase(o2.getAnoDeCriacao());
        if(ano != 0 ) return ano;

        int nome = o2.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0 ) return nome;

        return o2.getIde().compareToIgnoreCase(o2.getIde());
    }
}
