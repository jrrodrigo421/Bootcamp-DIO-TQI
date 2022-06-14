import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
// import java.util.HashSet;
import java.util.TreeSet;

/**
 * ExemploOrdenacaoSet
 */

 //Dados os seguintes  informarções  sobre  séries favoritos, 
 //crie um conjunto e ordene este conjunto  exibindo:
 //(nome - genero - tempo de episodio)

 //Serie 1 = nome  BlackList, genero: ação, tempoEpsiodio: 60
 // Serie 2 = nome: StrangerFingers, genero: fantasia, tempoEpisodio: 90
 // Serie 3 = nome: Suits, genero: policial, tempoEpisodio: 50

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Exiba Ordem Aleatória: \n");
        Set<Serie> minhaSeries = new HashSet<Serie>(){{
            add(new Serie("blackList", "acao", 60));
            add(new Serie("stangerFingers", "fantasia", 90));
            add(new Serie("suits", "policial", 50));
        }};

        for (Serie serie : minhaSeries) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio()); 

        // System.out.println(minhaSeries);
        System.out.println("Ordem de insercao: \n");
        Set<Serie> minhaSeries1 = new LinkedHashSet<Serie>(){{
            add(new Serie("blackList", "acao", 60));
            add(new Serie("stangerFingers", "fantasia", 90));
            add(new Serie("suits", "policial", 50));
        }};

        for (Serie serie : minhaSeries1) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio()); 

        System.out.println(minhaSeries1);
        System.out.println("\n");
        System.out.println("Ordem Natural: \n");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhaSeries1);
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " 
        + serie.getGenero() + " - " + serie.getTempoEpisodio()); 
        // System.out.println(minhasSeries2);
    }
}
class Serie implements Comparable<Serie>{
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
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public String toString() {
        return "{" + 
                "nome'" + nome + '\''+
                ", genero='" + genero  + '\''+
                '}';
    }
    @Override
    public boolean equals(Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome, genero, tempoEpisodio);
    }
    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        int genero = this.getGenero().compareTo(serie.getGenero());
        return genero; 
    }
}