import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class InterfaceList {
    public static void main(String[] args) {
        // List<Integer> notas = Arrays.asList(1,2,3,4,5,6,7,8);
        // notas.add(10); Aqui da erro pois a lista nao pode ser mudada
        // System.out.println(notas);
        System.out.println("Crie uma lista e adicione as 7 notas:  ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.0);
        notas.add(9.3);
        notas.add(8.5);
        notas.add(8d);
        notas.add(4d);
        notas.add(5d);
        System.out.println(notas);
        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 8.0: \n" +  "A posicao é: \n " + notas.indexOf(8.0));
        System.out.println("Add na lista a nota 9.7 na posicao 6");
        notas.add(6, 9.7);
        System.out.println(notas);
        System.out.println("Substituir o elemento na sua posicao: ");
        notas.set(7, 8.95);
        System.out.println(notas);
        System.out.println("Confira se a nota 8d esta na lista: \n" + "Ressultado da verificacao: \n" + notas.contains(8d));
        System.out.println("Imprima as notas na ordem em que foram informadas: \n");
        for (Double nota : notas)System.out.println(nota);
        System.out.println("\nExiba a terceira nota adiconada: \n" + notas.get(2));
        System.out.println(notas.toString());
        System.out.println(notas);
        System.out.println("\n\n\n");
        System.out.println("Exiba a menor nota: \n" + Collections.min(notas) );
        System.out.println("Exiba a maior nota: \n" + Collections.max(notas));
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("Exiba a media das notas: \n" + (soma/notas.size()));
        System.out.println("Remova a nota 0:  \n");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("Remova as notas menor que 8: \n");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 8) iterator1.remove(); { 
            }
        }
        System.out.println(notas);
        System.out.println("Apague toda a Lista: " );
        notas.clear();
        System.out.println(notas);
        System.out.println("Verificando se a lista esta vazia:\n" + notas.isEmpty());
    }
}
