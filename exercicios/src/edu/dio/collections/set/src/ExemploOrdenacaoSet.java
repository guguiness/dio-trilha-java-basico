import java.util.*;

public class ExemploOrdenacaoSet {
    /*Dadas as seguintes informações sobre minhas séries favoritas,
    crie um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de episódio);

    Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
    Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
    Série 3 = nome: the office, genero: comédia, tempoEpisodio: 25
    */
    public static void main(String[] args) {
        System.out.println("\n--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
           add(new Serie("got", "fantasia", 60));
           add(new Serie("dark", "drama", 60));
           add(new Serie("the office", "comédia", 25));
        }};
        for(Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("the office", "comédia", 25));
        }};
        for(Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem natural (Tempo de episódio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for(Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhasSeries4.addAll(minhasSeries);
        for(Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public int compareTo(Serie o) {                                                     // importante para o TreeSet
        int tempoEpisodio = Integer.compare(this.tempoEpisodio, o.tempoEpisodio);
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(o.getGenero());
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {
    @Override
    public int compare(Serie o1, Serie o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;

        int genero = o1.getGenero().compareTo(o2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());
    }
}
