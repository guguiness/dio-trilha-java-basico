package edu.dio.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> listaGatos = new ArrayList<>(){{
            add(new Gato("Januário", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Romeu", 12, "amarelo"));
        }};

        System.out.println("\n--\tOrdem de Inserção\t---");
        System.out.println(listaGatos);

        System.out.println("\n--\tOrdem Aleatória\t---");
        Collections.shuffle(listaGatos);
        System.out.println(listaGatos);

        System.out.println("\n--\tOrdem de Natural (Nome)\t---");
        Collections.sort(listaGatos);
        System.out.println(listaGatos);

        System.out.println("\n--\tOrdem Idade\t---");
        // Collections.sort(listaGatos, new ComparatorIdade());                 alternativa
        listaGatos.sort(new ComparatorIdade());
        System.out.println(listaGatos);

        System.out.println("\n--\tOrdem Cor\t---");
        // Collections.sort(listaGatos, new ComparatorCor());                   alternativa
        listaGatos.sort(new ComparatorCor());
        System.out.println(listaGatos);

        System.out.println("\n--\tOrdem Nome/Cor/Idade\t---");
        // Collections.sort(listaGatos, new ComparatorNomeCorIdade());          alternativa
        listaGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(listaGatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareTo(gato.getNome());
    }
}

// Uso da interface Comparator porque a interface Comparable já foi usada na classe

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
