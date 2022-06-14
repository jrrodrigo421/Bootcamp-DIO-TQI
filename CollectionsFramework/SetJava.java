import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {
    public static void main(String[] args) {
        System.out.println("Crie um conjunt e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8d, 9d, 0.0, 2.6, 4.2, 1.0));
        System.out.println(notas.toString());
        System.out.println("Confira se a nota 1.0 esta no conjunto: \n" + notas.contains(1.0));
        System.out.println("\n\n");
        System.out.println("Exiba a menor nota: \n" + Collections.min(notas));
        System.out.println("Exiba a maior nota: \n" + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir a soma de valores: \n");
        System.out.println(soma);

        System.out.println("Exibir media das notas: " + (soma/notas.size()));
        System.out.println(notas);
        System.out.println("remova a nota 0.0: " + notas.remove(0.0));
        System.out.println(notas);
        System.out.println("Remova as notas menores que 7 e exiba na lista: \n");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next > 7 ) iterator2.remove();            
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas de acordo com a ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(5d);
        notas2.add(213456d);
        notas2.add(30d);
        System.out.println(notas2);
        System.out.println();
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Ordem Crescente: ");
        System.out.println(notas3);
        System.out.println("Apague todo conjunto: ");
        notas.clear();
        System.out.println("Confira se notas esta vazio: " + notas.isEmpty());
        System.out.println("Confira se notas esta vazio: " + notas2.isEmpty());



    }
}
