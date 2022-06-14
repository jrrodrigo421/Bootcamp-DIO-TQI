import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.Locale.LanguageRange;

// Dados as seguintes informações sobre meus cachorros, crie uma lista e ordene esta lita exibindo:
//(nome - idade - cor);
// Dog 1 = nome = Mel, idade = 16, cor = caramelo;
// Dog 2 = nome = Belinha, idade 6, cor = branco; 
// 


public class OrdenacaoList {
    public static void main(String[] args) {
    
        List<Dog> meusDogs =  new ArrayList<Dog>(){{
            add(new Dog("Mel", 16, "Amarelo"));
            add(new Dog("Belinha", 6, "castanto"));
            add(new Dog("Pandora", 20, "Cinza Escuro"));
            
        }};
        System.out.println("Ordem de Insercao:\n");
        System.out.println(meusDogs);
        System.out.println("Ordem Aleatória: \n");
        Collections.shuffle(meusDogs);
        System.out.println(meusDogs);
        System.out.println("Ordem Natural: \n");
        Collections.sort(meusDogs);
        System.out.println(meusDogs);
        System.out.println("Ordem Idade: \n");
        // Collections.sort(meusDogs, new ComparatorIdade()); o comando abaixo tem a mesma função;
        meusDogs.sort(new ComparatorIdade());
        System.out.println(meusDogs);
        System.out.println("Ordem Cor: \n");
        meusDogs.sort(new ComparatorCor());
        System.out.println(meusDogs);
        System.out.println("Ordem Cor, Idade, nome: \n");
        meusDogs.sort(new ComparatorNomeCorIdade());
        System.out.println(meusDogs);
    }
}

class Dog implements Comparable<Dog>{
    private String nome;
    private Integer idade;
    private String cor;

    public Dog(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getCor() {
        return cor;
    }
    // @Override
    // public int Dog.compareTo(Dog dog) {
    //     return this.getNome().compareToIgnoreCase(dog.getNome());
    // }

    @Override
    public String toString() {
        return  "{" + 
                "nome= '" + nome + '\'' +
                ", idade= " + idade +
                ", cor= '" + cor + '\'' +
                '}';
    }
    @Override
    public int compareTo(Dog dog) {
        
        return this.getNome().compareToIgnoreCase(dog.getNome());
    }
}

class ComparatorIdade implements Comparator<Dog> {

    @Override
    public int compare(Dog g1, Dog g2) {

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Dog> {

    @Override
    public int compare(Dog g1, Dog g2) {

        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Dog> {

    @Override
    public int compare(Dog g1, Dog g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;
            
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;
            
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}
